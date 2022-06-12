package bank_products.cards;

import bank_products.BankProductBase;

import java.math.BigDecimal;

public abstract class CardBase extends BankProductBase {
    public CardBase(int manyCode) {
        super(manyCode);
    }

    public void minusBalance(BigDecimal sum) {
        setBalance(getBalance().subtract(sum));
    }
}
