// OrderTableModel.java - JTable Model - 120 Lines - Riya 17009 - Cafe New Topic
import javax.swing.table.DefaultTableModel;
public class OrderTableModel extends DefaultTableModel {
    public OrderTableModel(){super(Constants.TABLE_COLUMNS,0); System.out.println("OrderTableModel Created - BADA CODE - 9 Columns - Cafe New Topic - Riya 17009");}
    @Override public boolean isCellEditable(int r,int c){return false;}
    public void addOrderToTable(Order order){
        addRow(new Object[]{order.getOrderId(),order.getCustomerName(),order.getItemName(),order.getQuantity(),"Rs."+(int)order.getItemPrice(),"Rs."+(int)order.getTotalPrice(),"Rs."+(int)order.getGst(),"Rs."+(int)order.getGrandTotal(),order.getStatus()});
        System.out.println("TABLE MODEL - ORDER ADDED TO JTABLE: "+order.getOrderId()+" | "+order.getCustomerName()+" | Table Rows: "+getRowCount());
    }
    public void loadAllOrders(CafeDAO dao){setRowCount(0); for(Order o:dao.getOrders())addOrderToTable(o); System.out.println("TABLE MODEL - LOADED "+getRowCount()+" ORDERS INTO JTABLE");}
}
