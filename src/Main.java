import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LocalDate oggi = LocalDate.now();
        int rdmDay = random.nextInt(30);
        LocalDate deliveryDay = oggi.plusDays(rdmDay);
        Cliente c1 = new Cliente(011, "mike", 2);
        Cliente c2 = new Cliente(012, "loris", 3);
        Cliente c3 = new Cliente(013, "john", 2);
        Prodotto p1 = new Prodotto(111, "libro1", "Books", 101);
        Prodotto p2 = new Prodotto(112, "libro2", "Baby", 11);
        Prodotto p3 = new Prodotto(113, "libro3", "Books", 150);
        Ordine o1 = new Ordine(222, "ok", oggi, deliveryDay, c1);
        Ordine o2 = new Ordine(222, "no", oggi, deliveryDay, c2);
        Ordine o3 = new Ordine(222,"ok", oggi, deliveryDay, c3);
        List<Prodotto> prodList = new ArrayList<>();
        prodList.add(p1);
        prodList.add(p2);
        prodList.add(p3);
        List<Prodotto> cateBook = prodList.stream().filter(prod -> prod.category == "Books" & prod.price > 100).toList();
        for (int i = 0; i <cateBook.size() ; i++) {
            System.out.println(cateBook.get(i));
        }
        List<Ordine> ordineList=new ArrayList<>();
        ordineList.add(o1);
        ordineList.add(o2);
        ordineList.add(o3);
    }
}
