// Customer.java - Customer Model - 90 Lines - Riya 17009 - Cafe New Topic
import java.util.Date;
public class Customer {
    private String customerId, name, phone, email, address; private int totalOrders; private double totalSpent; private Date firstVisit;
    public Customer(String customerId, String name, String phone) {
        this.customerId=customerId; this.name=name; this.phone=phone;
        this.email=name.toLowerCase().replace(" ","")+"@gmail.com";
        this.address="Mumbai"; this.totalOrders=0; this.totalSpent=0.0; this.firstVisit=new Date();
        System.out.println("CUSTOMER CREATED: "+customerId+" | "+name+" | "+phone);
    }
    public String getCustomerId(){return customerId;} public String getName(){return name;}
    public String getPhone(){return phone;} public String getEmail(){return email;}
    public int getTotalOrders(){return totalOrders;} public void addOrder(double amount){totalOrders++; totalSpent+=amount;}
    public double getTotalSpent(){return totalSpent;}
}
