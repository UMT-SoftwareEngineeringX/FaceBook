package Classes;

public class Accounts {
String coustomer_name;
private int Coustomer_balance;
static int count;
Accounts(){
	coustomer_name=" ";
	Coustomer_balance=0;
	count++;
}
Accounts(String nam,int balance){
	coustomer_name=nam;
	Coustomer_balance=balance;
	count++;
}
public String getCoustomer_name() {
	return coustomer_name;
}
public void setCoustomer_name(String coustomer_name) {
	this.coustomer_name = coustomer_name;
}
public int getCoustomer_balance(){
	return Coustomer_balance;
}
public void setCoustomer_balance(int coustomer_balance) {
	Coustomer_balance = coustomer_balance;
}
public double calculatebalance(){

	if(Coustomer_balance>10000){
		Coustomer_balance=Coustomer_balance-(Coustomer_balance*15)/100;
	}
	return Coustomer_balance;
}
}
