package Bank;

public class main {
	public static  void main(String[]args) {
		BankAccounts b= new BankAccounts();
		b.setName("sudha");
		b.setAccoundNumber(1234566);
		b.setBalance(10000);
		System.out.println("Name:"+b.getName());
		System.out.println("AccountNumber:"+b.getAccountNumber());
		System.out.println("Balance:"+b.getBalance());
	}

}
