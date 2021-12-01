import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int numberOfLaptops = 100;
        ArrayList<Integer> arrPrice = new ArrayList<>();
        ArrayList<Integer> arrRam = new ArrayList<>();
        ArrayList<String> arrNameNotebook = new ArrayList<>();
        ArrayList<Notebook> arrayListNotebook = new ArrayList<>();

        for (int i = 500; i <= 3000; i+=50) {
            arrPrice.add(i);
        }

        for (int i = 4; i <= 24 ; i+=4) {
            arrRam.add(i);
        }

        arrNameNotebook.add("Lenovo");
        arrNameNotebook.add("Asus");
        arrNameNotebook.add("Mac");
        arrNameNotebook.add("Acer");
        arrNameNotebook.add("Xiaomi");

        System.out.println("Price: " + arrPrice + "\n");
        System.out.println("SizeRam: " + arrRam + "\n");
        System.out.println("NameManufacturers: " + arrNameNotebook + "\n");

//        int lengthArrPrice = arrPrice.size();
//        int lengthArrRam = arrRam.size();
//        int lengthArrNameNotebook = arrNameNotebook.size();

        System.out.println("lengthArrPrice: " + arrPrice.size());
        System.out.println("lengthArrRam: " + arrRam.size());
        System.out.println("lengthArrNameNotebook: " + arrNameNotebook.size());

        for (int i = 0; i < numberOfLaptops ; i++) {
            arrayListNotebook.add(i,
                    new Notebook(arrPrice.get((int)(Math.random() * arrPrice.size())),
                            arrRam.get((int)(Math.random() * arrRam.size())),
                            arrNameNotebook.get((int)(Math.random() * arrNameNotebook.size()))));
        }

        System.out.println(arrayListNotebook);

        Collections.sort(arrayListNotebook);
    }
}
