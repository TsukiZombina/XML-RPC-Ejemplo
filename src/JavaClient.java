import java.util.*; 
import org.apache.xmlrpc.*;
 
public class JavaClient { 
	public static void main (String [] args) { 
		try { 
			XmlRpcClient cliente = new XmlRpcClient("http://localhost:80/"); 

			Vector<Integer> params = new Vector<Integer>(); 
			params.addElement(new Integer(2)); 
			params.addElement(new Integer(15)); 

			Object result = cliente.execute("miServidor.suma", params); 

			int suma = ((Integer) result).intValue(); 
			System.out.println("La suma es: "+ suma); 

			Object r = cliente.execute("miServidor.resta", params); 

			int resta = ((Integer) r).intValue(); 
			System.out.println("La resta es: "+ resta); 
		} catch (Exception exception) { 
		System.err.println("JavaClient:"+ exception);
		}
	}
}