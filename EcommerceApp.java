package javaprgm;
class PaymentGateWay
{
	public void makepayment(String cardNumber,String expirydate,String cvv)
	{
		System.out.println("********Card Details********");
		System.out.println("Card number:"+cardNumber);
		System.out.println("Expiry date:"+expirydate);
		System.out.println("Cvv:"+cvv);
		System.out.println("Details  are entered successfuly");
		System.out.println("Processing payment.....");
		System.out.println("Payment made is successfull");
		
	}
	public void makepayment(String upid)
	{
		System.out.println("********Online Payment********");
		System.out.println("Entered UPID:"+upid);
		System.out.println("Details  are entered successfuly");
		System.out.println("Processing payment.....");
		System.out.println("Payment made is successfull");
		
	}
	public void makepayment(double amount)
	{
		System.out.println("********Cash on Delivery********");
		System.out.println("Amount to be paid"+amount);
	}
}

public class EcommerceApp {
	public static void main(String[] args)
	{
		
	PaymentGateWay pw = new PaymentGateWay();
	pw.makepayment("45287458745","12/10/2025","354");
	pw.makepayment("545456465");
	pw.makepayment(4509);
	}
}

