
package mainbareno08;

import java.util.Scanner;

public class receipts {
    
    public void getReceipt(){
        
        Scanner sc = new Scanner(System.in);
        
        String name;
        String name2;
        String prodname;
        String prodname2;
        int qua;
        int price;
        double cash;
        
        System.out.println("---- Receipt ------");
        
        System.out.println("Enter Name: ");
        name = sc.next();
        name2 = sc.next();
        System.out.println("Product Name: ");
        prodname = sc.next();
        prodname2 = sc.next();
        System.out.println("Quality: ");
        qua = sc.nextInt();
        System.out.println("Price: ");
        price = sc.nextInt();
        System.out.println("Cash: ");
        cash = sc.nextDouble();

        System.out.println("-------------------------------------");
        System.out.println("\n---- RECEIPT -----");
        System.out.println("-------------------------------------");
        
        System.out.println("Name: "+name+name2);
        System.out.println("Item: "+prodname+prodname2);
        System.out.println("Quantity: "+qua);
        
        System.out.println("-------------------------------------");
        
        System.out.println("Total Due: "+(qua*price));
        System.out.println("Cash "+cash);
        
        System.out.println("-------------------------------------");
        System.out.println("Change: "+(cash-(qua*price)));
        
    }
    
}
