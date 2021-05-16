
public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService checkService;
	
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		
		this.checkService = checkService;
	}

	@Override
	 public void Save(Customer customer) throws Exception {
		
		
		 if (checkService.CheckIfRealPerson(customer))
	        {
	            super.Save(customer);
	        }
	        else
	        {
	           System.out.println("kiþi doðrulanamadý");
	        }    

	     
	    }

	
}
