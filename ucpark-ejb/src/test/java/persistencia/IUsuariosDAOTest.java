package persistencia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import dao.IUsuariosDAO;
import dominio.Usuario;

public class IUsuariosDAOTest {

	IUsuariosDAO uDAO;
	Usuario u1,u2;
	
	@Before
	public void setUp() {
		uDAO = mock(IUsuariosDAO.class);
		u1 = new Usuario();
		u1.setEmail("franlama@gmail.com");
		
		u2 = new Usuario();
		u2.setEmail("franlama@gmail.com");
	}
	
	@Test
	public void crearUsuarioTest() {
		try {
			assertEquals(uDAO.crearUsuario(u1),u1);
		} catch(Exception e) {
			fail();
		}
		
		// a�adimos usuario ya existente
		try {
			assertEquals(uDAO.crearUsuario(u2),null);
		} catch(Exception e) {
			fail();
		}
	}
}
