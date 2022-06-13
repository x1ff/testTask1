package bank_products.unit_tests_class;

import bank_products.unit_tests_class.deposits.Deposit;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BankProductBaseTest {
    @Test
    void addBalanceTest() {
        final double SUM_FOR_ADDITION = 1234.56;
        Deposit deposit = new Deposit(810);
        deposit.addBalance(BigDecimal.valueOf(SUM_FOR_ADDITION));
        assertEquals(0, deposit.getBalance().compareTo(BigDecimal.valueOf(SUM_FOR_ADDITION)));
    }
}