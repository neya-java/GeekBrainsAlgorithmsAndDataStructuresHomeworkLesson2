import java.util.Comparator;

public class ComparatorSortAll implements Comparator<Notebook> {
    @Override
    public int compare(Notebook notebook, Notebook anotherNotebook) {
        int result = notebook.getPrice() - anotherNotebook.getPrice();
        if (result == 0){
            result = notebook.getSizeRam() - anotherNotebook.getSizeRam();
            if (result == 0) {
                return notebook.getNameManufacturers().compareTo(anotherNotebook.getNameManufacturers());
            } return result;
        }return result;
    }
}
