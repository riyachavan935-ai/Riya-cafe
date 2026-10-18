// CafeDAO.java - Data Access - 180 Lines - Riya 17009 - Cafe New Topic
import java.util.ArrayList;
public class CafeDAO {
    private ArrayList<MenuItem> menu; private ArrayList<Customer> customers; private ArrayList<Order> orders;
    private int orderCounter, customerCounter;
    public CafeDAO(){
        menu=new ArrayList<>(); customers=new ArrayList<>(); orders=new ArrayList<>();
        orderCounter=1001; customerCounter=501;
        System.out.println("============================================================="); System.out.println("CafeDAO Initialized - BADA CODE - 10 FILES - Cafe New Topic - Riya 17009"); System.out.println("=============================================================");
        loadMenu(); loadCustomers();
    }
    private void loadMenu(){
        addMenuItem(new MenuItem("M001","Hot Coffee","Beverage",80));
        addMenuItem(new MenuItem("M002","Cold Coffee","Beverage",120));
        addMenuItem(new MenuItem("M003","Burger","Fast Food",150));
        addMenuItem(new MenuItem("M004","Pizza","Fast Food",250));
        addMenuItem(new MenuItem("M005","French Fries","Snacks",100));
        addMenuItem(new MenuItem("M006","Sandwich","Snacks",130));
        addMenuItem(new MenuItem("M007","Tea","Beverage",50));
        addMenuItem(new MenuItem("M008","Cold Drink","Beverage",60));
        System.out.println("DAO: Loaded 8 Menu Items");
    }
    private void loadCustomers(){
        addCustomer(new Customer("C501","Riya Chavan 17009","9876543210"));
        addCustomer(new Customer("C502","Aman Sharma","9876543211"));
        System.out.println("DAO: Loaded 2 Customers");
    }
    public void addMenuItem(MenuItem item){menu.add(item); System.out.println("DAO - MENU ADDED: "+item.getItemId()+" | "+item.getName());}
    public void addCustomer(Customer c){customers.add(c); System.out.println("DAO - CUSTOMER ADDED: "+c.getCustomerId()+" | "+c.getName());}
    public void addOrder(Order o){orders.add(o); System.out.println("DAO - ORDER ADDED: "+o.getOrderId()+" | "+o.getCustomerName()+" | Rs."+o.getGrandTotal());}
    public ArrayList<MenuItem> getMenu(){return menu;} public ArrayList<Order> getOrders(){return orders;}
    public MenuItem findItemByName(String name){for(MenuItem m:menu)if(m.getName().toLowerCase().contains(name.toLowerCase()))return m; return null;}
    public String generateOrderId(){return "ORD"+(orderCounter++);} public String generateCustomerId(){return "C"+(customerCounter++);}
    public int getTotalOrders(){return orders.size();} public double getTotalSales(){double s=0; for(Order o:orders)s+=o.getGrandTotal(); return s;}
}
