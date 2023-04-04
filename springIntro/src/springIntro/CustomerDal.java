package springIntro;

//Musteri icin veri tabani operasyonlarinin yazilacagi nesne (insert,update..)
public class CustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Oracle veri tabanina eklendi");
		
	}
	

}
