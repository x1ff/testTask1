package bank_products.cards;

import java.math.BigDecimal;

public class CreditCard extends CardBase {

    private float creditRate;
    private boolean isDebt;

    public CreditCard(int manyCode, float creditRate) {
        super(manyCode);
        setName("Кредитная карта");
        this.creditRate = creditRate;
        this.isDebt = false;
    }

    public BigDecimal getDebt() {
        if (getBalance().compareTo(BigDecimal.valueOf(0)) >= 0) {
            return BigDecimal.valueOf(0);
        } else {
            return getBalance().abs();
        }
    }

    public float getCreditRate() {
        return this.creditRate;
    }

    @Override
    public void payment(BigDecimal sum) {
        if( !isDebt && getBalance().compareTo(sum) < 0) {
            isDebt = true;
        }
        setBalance(getBalance().subtract(sum));
    }
}

