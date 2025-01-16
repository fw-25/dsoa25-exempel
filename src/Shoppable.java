
public interface Shoppable {

    int SHOP_VERSION = 1;

    double getPrice();

    int getStock();

    default String getCondition() {
        return "New";
    }

}
