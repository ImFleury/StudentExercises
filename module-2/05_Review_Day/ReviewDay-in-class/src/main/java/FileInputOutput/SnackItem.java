package FileInputOutput;

import java.math.BigDecimal;

public class SnackItem {
    public String vendingMachineKey;
    public String name;
    public BigDecimal price;
    public String snackType;

    @Override
    public String toString() {
        return "SnackItem{" +
                "vendingMachineKey='" + vendingMachineKey + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", snackType='" + snackType + '\'' +
                '}';
    }
}
