package bank_products;

import java.math.BigDecimal;

public class BankProductBase {
    private String name;
    private BigDecimal balance;
    private final int moneyCode;

    public BankProductBase(int moneyCode) {
        this.moneyCode = moneyCode;
        this.balance = BigDecimal.valueOf(0.0);
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public int getMoneyCode() {
        return this.moneyCode;
    }

    public void addBalance(BigDecimal sum) {
        this.balance = this.balance.add(sum);
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setBalance(BigDecimal newBalance) {
        this.balance = newBalance;
    }
}
