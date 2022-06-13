package bank_products.cards;

import bank_products.BankProductBase;

import java.math.BigDecimal;

public abstract class CardBase extends BankProductBase {
    public CardBase(int manyCode) {
        super(manyCode);
    }

    /**
     * Списание - уменьшает баланс
     * @param sum - сумма списания
     */
    public void payment(BigDecimal sum) {
        if (getBalance().compareTo(sum) < 0) {
            throw new IllegalArgumentException("Недостаточно средств");
        } else {
            setBalance(getBalance().subtract(sum));
        }
    }
}
