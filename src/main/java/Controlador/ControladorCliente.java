package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblClienteImp;
import model.TblCliente;

/**
 * Servlet implementation class ControladorCliente
 */
public class ControladorCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCliente() {
       // super();
        // TODO Auto-generated constructor stub
    } // fin del constructor....

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Controlador Cliente").append(request.getContextPath());
		request.getRequestDispatcher("/ListadoClientes.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//recuperamos la data del formulario 
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String dni = request.getParameter("dni");
		String email = request.getParameter("email");
		String telef = request.getParameter("telefono");
		String sexo = request.getParameter("sexo");
		String nacion = request.getParameter("nacionalidad");
		
		TblCliente cliente=new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		
		
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		cliente.setEmail(email);
		cliente.setTelf(telef);
		cliente.setSexo(sexo);
		cliente.setNacionalidad(nacion);
		
		
		crud.RegistrarCliente(cliente);
		
		//doGet(request, response);
		request.getRequestDispatcher("/ListadoClientes.jsp").forward(request, response);
	}

}
