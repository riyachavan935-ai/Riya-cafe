<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cafe Management - Riya 17009</title>
<style>
body{margin:0;font-family:Arial;background:#fffbeb}
.header{background:#78350f;color:white;padding:20px;text-align:center;font-size:24px;font-weight:bold}
.box{max-width:800px;margin:30px auto;background:white;padding:30px;border-radius:15px;box-shadow:0 5px 20px rgba(0,0,0,0.1)}
input,select{width:100%;padding:15px;margin:10px 0;border:2px solid orange;border-radius:10px;font-size:16px}
button{width:100%;padding:15px;background:#78350f;color:white;border:none;border-radius:10px;font-size:18px;font-weight:bold;cursor:pointer;margin-top:10px}
button:hover{background:#92400e}
#out{background:black;color:#00ff00;padding:20px;border-radius:10px;margin-top:20px;font-family:monospace;min-height:200px;white-space:pre-wrap}
</style>
</head>
<body>
<div class="header">☕ Riya's Cafe - Roll 17009 - Cafe Management System</div>
<div class="box">
<h2>☕ Place Your Order - Riya 17009</h2>
<input id="name" placeholder="Your Name - Ex: Riya 17009" value="Riya 17009">
<select id="item">
<option>Hot Coffee - Rs.80</option>
<option>Cold Coffee - Rs.120</option>
<option>Burger - Rs.150</option>
<option>Pizza - Rs.250</option>
<option>Tea - Rs.50</option>
</select>
<input id="qty" type="number" value="2" placeholder="Quantity">
<button onclick="order()">☕ PLACE ORDER - BADA OUTPUT AAYEGA - CLICK KARO</button>
<div id="out">> Cafe System Ready...
> Roll No: 17009 - Riya Chavan
> Naya Topic: Cafe Management
> Java Swing: 10 Files - Bada Code
> Ready for Order...
> Order karo toh yaha BADA BILL ayega...
</div>
</div>
<script>
let count=1;
function order(){
let name=document.getElementById('name').value||'Riya 17009';
let item=document.getElementById('item').value;
let qty=document.getElementById('qty').value||1;
let price=parseInt(item.split('Rs.')[1]);
let total=price*qty;
let gst=Math.round(total*0.05);
let grand=total+gst;
let id='ORD'+(1000+count++);
let time=new Date().toLocaleTimeString();
document.getElementById('out').textContent += `\n\n[${time}] ✅ ORDER PLACED! - ROLL 17009\nOrder ID: ${id}\nCustomer: ${name}\nItem: ${item}\nQty: ${qty}\nTotal: Rs.${total}\nGST: Rs.${gst}\nGrand Total: Rs.${grand}\nTable: Table-${Math.floor(Math.random()*10)+1}\nStatus: Preparing - 10 mins\n\nJAVA SWING - 10 FILES:\n- MenuItem.java (100 Lines)\n- Customer.java (90 Lines)\n- Order.java (120 Lines)\n- CafeDAO.java (180 Lines)\n- CafeService.java (200 Lines)\n- Constants.java (60 Lines)\n- OrderTableModel.java (120 Lines)\n- OrderPanel.java (180 Lines)\n- MainFrame.java (320 Lines)\n- CafeApp.java (70 Lines)\n= 1440+ Lines - Bada Code\n\nBy Riya 17009 - Cafe New Topic - Good Output!`;
alert("☕ ORDER PLACED!\n\nID: "+id+"\nCustomer: "+name+"\nItem: "+item+"\nQty: "+qty+"\nTotal: Rs."+total+"\nGrand: Rs."+grand+"\n\nRoll 17009 - Cafe Management - 10 Files");
}
</script>
</body>
</html>
