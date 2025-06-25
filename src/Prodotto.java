public class Prodotto {
    protected long id;
    protected String name;
    protected String categgory;
    protected double price;

    Prodotto(long id, String name, String categgory, double price){
        this.id=id;
        this.name=name;
        this.categgory=categgory;
        this.price=price;
    }
    @Override
    public String toString(){
        return this.id +" "+this.name+" "+this.categgory+" "+this.price;
    }
}
