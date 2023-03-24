
class GroceryList {
    ArrayList<GroceryItemOrder> list = new ArrayList<GroceryItemOrder>(10);
    double TC = 0;
    public GroceryList(){}
    public void addItem(GroceryItemOrder it){
        if (list.size() <= 10){
            list.add(it);
        }else{
            System.out.println("Cannot add any  more items");
        }
    }
    public double GetTotalCost(){
        double e = 0;
        for (GroceryItemOrder x: list) {
            e += x.getCost();
        }
        return e;
    }
}
class GroceryItemOrder{
    String Name;
    int Quantity;
    double PricePerUnit;

    public GroceryItemOrder() {
    }

    public GroceryItemOrder(String name, double pricePerUnit) {
        Name = name;
        PricePerUnit = pricePerUnit;
    }

    public double getCost() {
        double Cst = Quantity * PricePerUnit;
        return Cst;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
public class Q6 {
    public static void main(String[] args) {
        GroceryList x= new GroceryList();
        for(int i = 0;i<10;i++){
            Scanner Name = new Scanner(System.in);
            Scanner Quantity = new Scanner(System.in);
            Scanner Price = new Scanner(System.in);
            int Q = Quantity.nextInt();
            double PriceItem;
            GroceryItemOrder it = new GroceryItemOrder(Name.next(),Price.nextDouble());
            it.setQuantity(Q);
            x.addItem(it);
            PriceItem = it.getCost();
            System.out.println(PriceItem);

        }
        double E = 0;
        for ( int i=0;i<x.list.size();i++) {
            E = x.GetTotalCost();
        }
        System.out.println(E);
    }
}



