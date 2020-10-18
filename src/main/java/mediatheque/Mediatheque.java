package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {

    private List<Item> items = new LinkedList<Item>();

    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem(new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem(new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem(new CD(12, "Sergeant Peppers"));
        mediatheque.printCatalog();
        mediatheque.printOnlyBooks();
        mediatheque.printOnlyCDs();
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void printCatalog() {
        accept((ItemVisitor) new ItemPrinter());
    }

    public void printOnlyBooks() {
        accept((ItemVisitor) new ItemPrinter() {
            public void visit(CD cd) {
            }
        });

    }

    public void printOnlyCDs() {
        accept((ItemVisitor) new ItemPrinter() {
            public void visit(Book b) {
            }
        });

    }

    private void accept(ItemVisitor v) {
        for (Item i : items) {
            i.accept(v);
        }

    }

}
