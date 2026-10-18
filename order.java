// Order.java - Order Model - 120 Lines - Riya 17009 - Cafe New Topic
import java.util.Date;
public class Order {
    private String orderId, customerId, customerName, itemName, status, orderTime, deliveryTime, paymentMode, tableNo, billNo;
    private int quantity; private double itemPrice, totalPrice, gst, grandTotal; private boolean isPaid;
    public Order(String orderId, String customerId, String customerName, String itemName, int qty, double price) {
        this.orderId=orderId; this.customerId=customerId; this.customerName=customerName;
        this.itemName=itemName; this.quantity=qty; this.itemPrice=price;
        this.totalPrice=price*qty; this.gst=Math.round(totalPrice*0.05); this.grandTotal=totalPrice+gst;
        this.orderTime=new Date().toString(); this.deliveryTime="10-15 mins"; this.status="Order Placed - Preparing";
        this.paymentMode="Cash"; this.tableNo="Table-"+(int)(Math.random()*20+1); this.billNo="BILL-"+orderId;
        this.isPaid=false;
        System.out.println("ORDER CREATED: "+orderId+" | Customer: "+customerName+" | Item: "+itemName+" | Qty: "+qty+" | Total: Rs."+totalPrice+" | Grand: Rs."+grandTotal);
    }
    public String getOrderId(){return orderId;} public String getCustomerName(){return customerName;}
    public String getItemName(){return itemName;} public int getQuantity(){return quantity;}
    public double getItemPrice(){return itemPrice;} public double getTotalPrice(){return totalPrice;}
    public double getGst(){return gst;} public double getGrandTotal(){return grandTotal;}
    public String getStatus(){return status;} public void setStatus(String s){status=s;}
    public String getOrderTime(){return orderTime;} public String getBillNo(){return billNo;}
    public String getTableNo(){return tableNo;}
}
