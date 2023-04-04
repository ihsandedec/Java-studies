package springIntro;

public class Main {

	//Seneryo: Sisteme MySql desteği getirilecek
	
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();

	}

}
