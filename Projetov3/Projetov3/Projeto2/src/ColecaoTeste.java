import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ColecaoTeste {

	@Test
	public void TestAddCartas() {
		
	Colecao colecao = new Colecao();
	Carta carta = new Carta("Carta 1", null);

	colecao.addCartas(carta);
	
	assertFalse(colecao.cartas.isEmpty(), "A coleção deve conter cartas.");
    assertEquals(carta, colecao.getCarta(), "A carta deve ser igual à última adicionada.");
	
	
	}
}
