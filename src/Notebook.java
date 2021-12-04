import java.util.UUID;

public class Notebook implements Comparable <Notebook> {
    private final int price;
    private final int sizeRam;
    private final String nameManufacturers;
    UUID serialNumber;

    public Notebook(int price, int sizeRam, String nameManufacturers, UUID serialNumber) {
        this.price = price;
        this.sizeRam = sizeRam;
        this.nameManufacturers = nameManufacturers;
        this.serialNumber = serialNumber;
    }

    public int getSizeRam() {
        return sizeRam;
    }

    public int getPrice() {
        return price;
    }

    public String getNameManufacturers() {
        return nameManufacturers;
    }

    @Override
    public String toString() {
        return "\n" + "Notebook: {" +
                "price=" + price +
                ", sizeRam=" + sizeRam +
                ", nameManufacturers='" + nameManufacturers +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo(Notebook anotherNotebook) {
        int result = this.price - anotherNotebook.price;
        if (result == 0){
            result = this.sizeRam - anotherNotebook.sizeRam;
            if (result == 0) {
                return this.nameManufacturers.compareTo(anotherNotebook.nameManufacturers);
            } return result;
        }return result;
    }

//    @Override
//    public int compareTo(Notebook anotherNotebook) {
//        return this.price - anotherNotebook.price;
//    }


}
