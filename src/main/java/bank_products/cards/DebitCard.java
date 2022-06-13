package bank_products.cards;

public class DebitCard extends CardBase {
    public DebitCard(int manyCode) {
        super(manyCode);
        setName("Дебетовая карта");
    }
}
