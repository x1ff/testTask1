package bank_products;

import java.math.BigDecimal;

public class BankProductBase {
    private String name;
    private BigDecimal balance;
    private final int	manyCode;

    public BankProductBase(int manyCode) {
        this.manyCode = manyCode;
        this.balance = BigDecimal.valueOf(0.0);
    }
    public void add(BigDecimal sum) {
        this.balance = this.balance.add(sum);
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public int getManyCode() {
        return this.manyCode;
    }

    protected void setBalance(BigDecimal sum) {
        this.balance = sum;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
