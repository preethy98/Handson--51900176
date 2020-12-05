package com.hcl.t13;
public class AccountInfo {
protected  String accName,accNo,bankName;

public void setAccName(String accName) {
	this.accName = accName;
}
public String getAccName() {
	return accName;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public String getAccNo() {
	return accNo;
}

public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getBankName() {
	return bankName;
}
protected void display()
{
	System.out.println("Account Details");
	System.out.println("Account Name :"+this.getAccName()+"\n"+"Account No :"+this.getAccNo()+"\n"+"BankName :"+this.getBankName());
}

}
