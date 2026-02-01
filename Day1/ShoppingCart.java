package Day1;
class cart{
    String itemName;
    int qty;
    float price;
    
    double bill(){
        float total= qty * price;
        float finalAmt;
        if(total>=2000){
            finalAmt=total-total*0.15f;
        }else if(total>=1000){
            finalAmt=total-total*0.10f;
        }else{
            finalAmt=total;
        }
        return finalAmt;
    }
}
public class ShoppingCart {
    public static void main(String[] args){
        cart c1=new cart();
        c1.itemName="Laptop";
        c1.qty=1;
        c1.price=2500.0f;
        System.out.println("Final Bill Amount for " + c1.itemName + ": " + c1.bill());

        cart c2=new cart();
        c2.itemName="Headphones";
        c2.qty=2;
        c2.price=600.0f;
        System.out.println("Final Bill Amount for " + c2.itemName + ": " + c2.bill());
    }
}
