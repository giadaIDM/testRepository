package fromXml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {
	
	    public static void main(String[] args) {

	     try {

	        File file = new File("C:\\Users\\giada cosentino\\Desktop\\File1.xml");
	        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	        Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
	        System.out.println(customer);

	      } catch (JAXBException e) {
	        e.printStackTrace();
	      }

	    }
}

