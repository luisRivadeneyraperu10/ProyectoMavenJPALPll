package Test;

import Dao.TblClienteImp;
import model.TblCliente;
public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TblCliente cliente = new TblCliente();
		TblClienteImp crud = new TblClienteImp();
		
		cliente.setNombre("Luis");
		cliente.setApellido("Rivadeneyra");
		cliente.setDni("12351245");
		cliente.setEmail("luisito@gmail.com");
		cliente.setSexo("F");
		cliente.setNacionalidad("Venezolano");
		crud.RegistrarCliente(cliente);
	}

}
