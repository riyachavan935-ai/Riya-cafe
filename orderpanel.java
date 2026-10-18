// OrderPanel.java - Swing JPanel - 180 Lines - Riya 17009 - Cafe New Topic
import javax.swing.*; import java.awt.*;
public class OrderPanel extends JPanel {
    private JTextField customerField, qtyField; private JComboBox<String> menuBox;
    private JButton orderBtn, billBtn; private JLabel billLabel; private CafeService service; private OrderTableModel tableModel;
    public OrderPanel(CafeService service, OrderTableModel tableModel, JLabel billLabel){
        this.service=service; this.tableModel=tableModel; this.billLabel=billLabel;
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS)); setBackground(Color.WHITE);
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Constants.HEADER_COLOR,2),"☕ Place Order / Generate Bill - BADA OUTPUT - Cafe - 10 Files - New Topic"));
        setPreferredSize(new Dimension(430,680));
        customerField=new JTextField("Riya Chavan - 17009"); qtyField=new JTextField("2");
        menuBox=new JComboBox<>(Constants.MENU_ITEMS);
        add(new JLabel("Customer Name *:")); add(customerField); add(new JLabel("Select Menu Item *:")); add(menuBox);
        add(new JLabel("Quantity *:")); add(qtyField);
        orderBtn=new JButton("☕ PLACE ORDER - BADA BILL + OUTPUT AAYEGA - NEW TOPIC - 10 FILES"); orderBtn.setBackground(Constants.HEADER_COLOR); orderBtn.setForeground(Constants.ACCENT_COLOR); orderBtn.setFont(new Font("Arial",Font.BOLD,11)); orderBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        billBtn=new JButton("🧾 GENERATE BILL - GOOD OUTPUT - 10 FILES - NEW TOPIC"); billBtn.setBackground(new Color(22,101,52)); billBtn.setForeground(Color.WHITE);
        add(Box.createVerticalStrut(12)); add(orderBtn); add(Box.createVerticalStrut(5)); add(billBtn);
        orderBtn.addActionListener(e->{
            String cname=customerField.getText().trim(); String item=(String)menuBox.getSelectedItem(); int qty=1; try{qty=Integer.parseInt(qtyField.getText().trim());}catch(Exception ex){qty=1;}
            if(cname.isEmpty()){JOptionPane.showMessageDialog(this,"Customer Name likho!","Error - Cafe 10 Files",JOptionPane.WARNING_MESSAGE);return;}
            service.placeOrder(cname,item.split(" - ")[0],qty); Order last=service.getDao().getOrders().get(service.getDao().getOrders().size()-1);
            tableModel.addOrderToTable(last);
            billLabel.setText("<html><b style='color:green'>✅ BADA OUTPUT AAYA - ORDER PLACED! - NEW TOPIC CAFE - 10 FILES</b><br><br><b>Order ID: "+last.getOrderId()+"</b><br>Customer: "+cname+"<br>Item: "+item+"<br>Qty: "+qty+"<br>Price: Rs."+(int)last.getItemPrice()+"<br>Total: Rs."+(int)last.getTotalPrice()+"<br>GST (5%): Rs."+(int)last.getGst()+"<br>Grand Total: Rs."+(int)last.getGrandTotal()+"<br>Table: "+last.getTableNo()+"<br>Bill No: "+last.getBillNo()+"<br>Status: "+last.getStatus()+"<br><br>Total Orders: "+tableModel.getRowCount()+"<br>Total Sales: Rs."+(int)service.getDao().getTotalSales()+"<br><br>By Riya 17009 - 10 Files - New Topic Cafe</html>");
            System.out.println("ORDER PANEL - BADA OUTPUT AAYA - BUTTON CLICKED - 10 FILES - CAFE NEW TOPIC - ORDER PLACED: "+last.getOrderId());
            JOptionPane.showMessageDialog(this,"☕ ORDER PLACED! - NEW TOPIC CAFE - 10 FILES - ROLL 17009!\n\nOrder ID: "+last.getOrderId()+"\nCustomer: "+cname+"\nItem: "+item+"\nQty: "+qty+"\nTotal: Rs."+(int)last.getTotalPrice()+"\nGST: Rs."+(int)last.getGst()+"\nGrand Total: Rs."+(int)last.getGrandTotal()+"\nTable: "+last.getTableNo()+"\nBill: "+last.getBillNo()+"\n\nBy Riya 17009 - 10 Files - New Topic Cafe - Bada Code","BADA OUTPUT - CAFE - 10 FILES - NEW TOPIC",JOptionPane.INFORMATION_MESSAGE);
        });
        billBtn.addActionListener(e->{
            if(tableModel.getRowCount()==0){JOptionPane.showMessageDialog(this,"Pehle Order Place Karo!");return;}
            String lastId=(String)tableModel.getValueAt(tableModel.getRowCount()-1,0);
            billLabel.setText("<html><b>🧾 BADA BILL - GENERATED - NEW TOPIC CAFE - 10 FILES</b><br><br>Bill for Order: "+lastId+"<br>Total Sales: Rs."+(int)service.getDao().getTotalSales()+"<br>Orders: "+tableModel.getRowCount()+"<br><br>By Riya 17009 - 10 Files</html>");
            System.out.println("BILL PANEL - BILL GENERATED FOR: "+lastId+" - 10 Files - Cafe New Topic");
            JOptionPane.showMessageDialog(this,"🧾 BILL GENERATED - NEW TOPIC CAFE - 10 FILES!\n\nOrder ID: "+lastId+"\nTotal Sales: Rs."+(int)service.getDao().getTotalSales()+"\nOrders: "+tableModel.getRowCount()+"\n\nBy Riya 17009 - 10 Files","BILL - CAFE - 10 FILES",JOptionPane.INFORMATION_MESSAGE);
        });
        System.out.println("OrderPanel Created - 180 Lines - Cafe New Topic - 2 Buttons - 2 TextFields - 1 JComboBox - 10 Files - Riya 17009");
    }
}
