import java.util.Comparator;

public class SizeRamComparator implements Comparator <Notebook> {
    @Override
    public int compare(Notebook notebook, Notebook anotherNotebook) {
        return notebook.getSizeRam()-anotherNotebook.getSizeRam();
    }
}
