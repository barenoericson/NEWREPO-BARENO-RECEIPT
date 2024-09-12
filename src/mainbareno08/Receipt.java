
package mainbareno08;

public class Receipt {
    String name;
    String name2;
    String prodname;
    String prodname2;
    int qua;
    int price;
    double cash;
    
    public void getAdd(){
        this.name = name;
        this.name2 = name2;
        this.prodname = prodname;
        this.prodname2 = prodname2;
        this.qua = qua;
        this.price = price;
        this.cash = cash;
        
    }
    
    public void getView(String name,String name2,String prodaname,String prodname2,int qua,int price,double cash){
        System.out.println("Name: "+this.name +this.name2);
        System.out.println("Product Name: "+this.prodname + this.prodname2);
        System.out.println("Quality: "+this.qua);
        System.out.println("Price: "+this.price);
        System.out.println("Cash: "+this.cash);
        
    }
}
