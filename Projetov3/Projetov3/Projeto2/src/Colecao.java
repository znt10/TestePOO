
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Colecao {
    ArrayList<Carta> cartas = new ArrayList<>();
    private Carta carta;

    public void addCartas(Carta c){
        cartas.add(c);
        this.carta = c;


    }

    public void cartinhas(Perfil p){
            System.out.println("Vc tem essa cartinhas");
            try (BufferedReader br = new BufferedReader(new FileReader(p.getNome()+".txt"))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    System.out.println("\n");
                    System.out.println(linha);
                }
            } catch (IOException e) {
                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            }


    }



    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }
}
