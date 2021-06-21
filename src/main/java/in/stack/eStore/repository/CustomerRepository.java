package in.stack.eStore.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import in.stack.eStore.model.Customer;
import in.stack.eStore.seed.Inventry;

public class CustomerRepository {

	Inventry in = new Inventry();
	List<Customer> setCustomer = in.setCustomer();
	
	// adding new Customer
	public void saveCustomer(Customer customer) {
		
		setCustomer.add(customer);
		
	}
	
	// Showing all Customer
	public List<Customer> showAllCustomers() {
		
		setCustomer.forEach(c->System.out.println(c.toString()));
		
		return setCustomer;
		
	}
	
	// deleting customer using mobile number
	public void deleteCustomer(String mobile) {
		Stream<Customer> stream = setCustomer.stream().filter(s->s.getMobile().equals(mobile)).sorted();
		List<Customer> collect = stream.collect(Collectors.toList());
		if(!collect.isEmpty())
			setCustomer.removeAll(collect);
	}
	
	
}


//
//public void saveCustomer(Customer customer) {
//	FileOutputStream   fout = null;
//	ObjectOutputStream  oos= null;
//
//    try {
//
//    	fout = new FileOutputStream("c:\\temp\\customer.ser");
//    	 oos = new ObjectOutputStream(fout);
//        oos.writeObject(customer);
//
//        } catch (Exception ex) {
//
//        ex.printStackTrace();
//
//    } finally {
//
//        if (fout != null) {
//            try {
//                fout.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//}
//
//}
//
//public List<Customer> readCustomers(){
//	FileInputStream fis=null;
//	try {
//		fis = new FileInputStream("outputFile");
//	} catch (FileNotFoundException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	ArrayList<Customer> objectsList = new ArrayList<>();
//	boolean cont = true;
//	while (cont) {
//	  try (ObjectInputStream input = new ObjectInputStream(fis)) {
//	    Object obj = input.readObject();
//	    if (obj != null) {
//	      objectsList.add((Customer) obj);
//	    } else {
//	      cont = false;
//	    }
//	  } catch (Exception e) {
//	    // System.out.println(e.printStackTrace());
//	  }
//	}
//	return objectsList;
//}
//
//}