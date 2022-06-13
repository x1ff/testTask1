package bank_products.unit_tests_class.deposits;

import bank_products.BankProductBase;

public abstract class DepositBase extends BankProductBase {
    boolean isActive;
    public DepositBase(int manyCode) {
        super(manyCode);
        this.isActive = true;
    }

    /**
     * Закрываем депозит
     */
    public void closeDeposit() {
        this.isActive = false;
    }
}
