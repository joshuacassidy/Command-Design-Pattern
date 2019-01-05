public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyItem buyItem = new BuyItem(stock);
        SellItem sellItem = new SellItem(stock);

        Seller seller = new Seller();
        seller.takeOrder(buyItem);
        seller.takeOrder(sellItem);

        seller.placeOrders();


    }

}
