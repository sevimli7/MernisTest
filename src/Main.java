import java.time.LocalDate;


public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisValidateManager()); 
		Customer sevim=new Customer();
		sevim.setId(1);
		sevim.setFirstName("Sevim");
		sevim.setLastName("Taþ");
		sevim.setDateOfBirth(LocalDate.of(1985,01,01));
		sevim.setNationalityId("00000000");	
		customerManager.Save(sevim);
		
	}
}
