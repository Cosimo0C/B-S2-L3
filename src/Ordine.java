import java.time.LocalDate;
import java.util.List;

public class Ordine {
    protected long id;
    protected String status;
    protected LocalDate orderDate;
    protected LocalDate deliveryDate;
    protected List<Prodotto> prodotto;
    protected Cliente cliente;
    Ordine(long id, String status, LocalDate orderDate, LocalDate deliveryDate, Cliente cliente){
        this.id=id;
        this.status=status;
        this.orderDate=orderDate;
        this.deliveryDate=deliveryDate;
        this.prodotto=prodotto;
        this.cliente=cliente;
    }
}
