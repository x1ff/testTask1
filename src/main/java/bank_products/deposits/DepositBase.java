package bank_products.deposits;

import bank_products.BankProductBase;

public abstract class DepositBase extends BankProductBase {
    boolean isActive;
    public DepositBase(int manyCode) {
        super(manyCode);
        this.isActive = true;
    }

    public void closeDeposit() {
        this.isActive = false;
    }
}
