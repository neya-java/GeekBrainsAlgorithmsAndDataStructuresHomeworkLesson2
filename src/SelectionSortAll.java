import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SelectionSortAll {
    public static void sort(ArrayList <Notebook> arrayListNotebook) {
        int minIndex = 0;
        for (int i = 0; i < arrayListNotebook.size() - 1; i++) {

            minIndex = i;

            for (int j = i + 1; j < arrayListNotebook.size(); j++) {
                if (arrayListNotebook.get(j).compareTo(arrayListNotebook.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            if (i == minIndex) {
                continue;
            }

            Notebook temp = arrayListNotebook.get(i);
            arrayListNotebook.set(i, arrayListNotebook.get(minIndex));
            arrayListNotebook.set(minIndex, temp);
        }
    }

    public static void sortLight(ArrayList<Notebook> notebooks){
        Comparator<Notebook> comparator = Comparator.comparing(Notebook::getPrice)
                .thenComparing(Notebook::getSizeRam)
                .thenComparing(Notebook::getNameManufacturers);
        notebooks.sort(comparator);
    }
}