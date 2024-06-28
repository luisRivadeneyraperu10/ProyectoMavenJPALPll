package Interfaces;

import java.util.List;



import model.TblCliente;

public interface ICliente {
	
	//DECLAARMAOS LOS METODOS
	public void RegistrarCliente(TblCliente cliente);
	public void ActualizarCliente(TblCliente cliente);
	public void EliminarCliente(TblCliente cliente);
	public TblCliente BuscarCLiente(TblCliente cliente);
	public List<TblCliente>ListarCliente();
	
} //fin de la estructura....
