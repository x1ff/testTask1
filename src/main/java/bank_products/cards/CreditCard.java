package bank_products.cards;

import java.math.BigDecimal;

public class CreditCard extends CardBase{
    public BigDecimal debt;
    public String info;

    public CreditCard(int manyCode, String info) {
        super(manyCode);
        setName("Credit Card");
        this.debt = BigDecimal.valueOf(0);
        this.info = info;
    }

    public BigDecimal getDebt() {
        return this.debt;
    }

    public String getInfo(int stepIndex) {
        return this.info;
    }
}
