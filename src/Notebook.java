public class Notebook implements Comparable {
    private int price;
    private int sizeRam;
    private String nameManufacturers;

    public Notebook(int price, int sizeRam, String nameManufacturers) {
        this.price = price;
        this.sizeRam = sizeRam;
        this.nameManufacturers = nameManufacturers;
    }

    @Override
    public String toString() {
        return "\n" + "Notebook{" +
                "price=" + price +
                ", sizeRam=" + sizeRam +
                ", nameManufacturers='" + nameManufacturers + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object notebook) {
        return 0;
    }
}
