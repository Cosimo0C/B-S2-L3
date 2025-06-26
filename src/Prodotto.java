public class Prodotto {
    protected long id;
    protected String name;
    protected String category;
    protected double price;

    public Prodotto(long id, String name, String category, double price){
        this.id=id;
        this.name=name;
        this.category=category;
        this.price=price;
    }

    @Override
    public String toString(){
        return this.id +" "+this.name+" "+this.category+" "+this.price;
    }
}
