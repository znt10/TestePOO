
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PerfilTeste {

	 private Perfil perfil;

	    @BeforeEach
	    public void setUp() {
	        perfil = new Perfil();
	    }
	    
	    @Test
	    public void testNome() {
	        perfil.setNome("Teste");
	        assertEquals("Teste", perfil.getNome(), "O nome do perfil deveria ser 'Teste'.");
	    }   
	    
}
