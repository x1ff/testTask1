package bank_products.unit_tests_class.cards;

import bank_products.cards.CurrencyDebitCard;
import bank_products.cards.DebitCard;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardBaseTest {

    @Test
    void doublePaymentTest() {
        final double PAYMENT_SUM = 0.01;
        final double EXPECTED_SUM = 0.98;
        final double SET_BALANCE_SUM = 1.00;
        CurrencyDebitCard card = new CurrencyDebitCard(130);
        card.addBalance(BigDecimal.valueOf(SET_BALANCE_SUM));
        card.payment(BigDecimal.valueOf(PAYMENT_SUM));
        card.payment(BigDecimal.valueOf(PAYMENT_SUM));
        assertEquals(BigDecimal.valueOf(EXPECTED_SUM), card.getBalance());
    }

    @Test
    void paymentZeroBalanceTest() {
        final double PAYMENT_SUM = 0.01;
        DebitCard debitCard = new DebitCard(810);
        final String EXPECTED_EXCEPTION_MSG = "Недостаточно средств";
        String exceptionMsg = "";
        try {
            debitCard.payment(BigDecimal.valueOf(PAYMENT_SUM));
        } catch (IllegalArgumentException e) {
            exceptionMsg = e.getMessage();
        }
        assertEquals(EXPECTED_EXCEPTION_MSG, exceptionMsg);
        assertEquals(0, BigDecimal.valueOf(0).compareTo(debitCard.getBalance()));
    }
}