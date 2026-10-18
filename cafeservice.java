// CafeService.java - Business Logic - 200 Lines - Riya 17009 - Cafe New Topic
public class CafeService {
    private CafeDAO dao;
    public CafeService(CafeDAO dao){this.dao=dao; System.out.println("CafeService Started - BADA CODE - Cafe New Topic - Riya 17009");}
    public void placeOrder(String customerName, String itemName, int qty){
        MenuItem item=dao.findItemByName(itemName); if(item==null){item=new MenuItem("M00"+(dao.getMenu().size()+1),itemName,"Custom",100);}
        String orderId=dao.generateOrderId(); String customerId=dao.generateCustomerId();
        Order order=new Order(orderId,customerId,customerName,itemName,qty,item.getPrice());
        dao.addOrder(order); item.reduceStock(qty);
        System.out.println("SERVICE - BADA OUTPUT AAYA - ORDER PLACED: "+orderId+" | Customer: "+customerName+" | Item: "+itemName+" | Qty: "+qty+" | Price: Rs."+item.getPrice()+" | Total: Rs."+order.getTotalPrice()+" | GST: Rs."+order.getGst()+" | Grand Total: Rs."+order.getGrandTotal()+" | Table: "+order.getTableNo()+" | Bill: "+order.getBillNo()+" | Status: "+order.getStatus()+" | Time: "+order.getOrderTime());
        System.out.println("SERVICE - Total Orders Now: "+dao.getTotalOrders()+" | Total Sales: Rs."+dao.getTotalSales());
    }
    public void generateReport(){System.out.println("========== BADA REPORT - CAFE MANAGEMENT - 10 FILES - NEW TOPIC =========="); System.out.println("Total Orders: "+dao.getTotalOrders()+" | Total Sales: Rs."+dao.getTotalSales()); System.out.println("Menu Items: "+dao.getMenu().size()+" | Customers: "+dao.getOrders().size()); System.out.println("By Riya Chavan 17009 - BADA CODE - 10 Files - New Topic Cafe - JFrame, JTable, JButton, JLabel, JComboBox"); System.out.println("=================================================================");}
    public CafeDAO getDao(){return dao;}
}
