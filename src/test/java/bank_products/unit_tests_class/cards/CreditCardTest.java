package bank_products.unit_tests_class.cards;

import bank_products.cards.CreditCard;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditCardTest {

    @Test
    void addBalanceToCreditTest() {
        final double SUM_FOR_ADDITION = 1234.56;
        final double PAYMENT_SUM = 20.22;
        CreditCard creditCard = new CreditCard(810, 0.12f);
        creditCard.payment(BigDecimal.valueOf(PAYMENT_SUM));

        creditCard.addBalance(BigDecimal.valueOf(SUM_FOR_ADDITION));

        assertEquals(0, creditCard.getBalance()
                .compareTo(BigDecimal.valueOf(SUM_FOR_ADDITION).subtract(BigDecimal.valueOf(PAYMENT_SUM))
                ));
        assertEquals(0, creditCard.getDebt().compareTo(BigDecimal.valueOf(0)));
    }

    @Test
    void creditPaymentTest() {
        final double PAYMENT_SUM = 0.01;
        final double SUM_FOR_ADDITION = 100.0;
        final double EXPECTED_BALANCE = 99.99;
        CreditCard creditCard = new CreditCard(810, 0.2f);
        creditCard.addBalance(BigDecimal.valueOf(SUM_FOR_ADDITION));
        creditCard.payment(BigDecimal.valueOf(PAYMENT_SUM));
        assertEquals(BigDecimal.valueOf(EXPECTED_BALANCE), creditCard.getBalance());
    }
}