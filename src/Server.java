import org.apache.xmlrpc.*; 

public class Server { 
	public static void main (String [] args) { 
		try { 
			System.out.println("lniciando el servidor XML-RPC..."); 
			
			WebServer server = new WebServer(80); 
			OperacionMatematica op = new OperacionMatematica(); 
			server.addHandler("miServidor", op);
			
			server.start();
			
			System.out.println("lnicio exitoso del Servidor, queda "
                                + "en espera de peticiones del cliente..."); 
		} catch (Exception exception) { 
		System.err.println("Server: " + exception);
		}
	}
}
