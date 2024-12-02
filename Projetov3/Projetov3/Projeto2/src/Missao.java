
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Missao {
    private ArrayList<String> frases = new ArrayList<>();
    private ArrayList<String> nomes = new ArrayList<>();
    Colecao colecao = new Colecao();
    CriarM m = new CriarM();
    private String nomeAt;
    private static Scanner sc = new Scanner(System.in);

    public void criarMissao(Perfil p){
        this.nomeAt = escolherM();

        //verificando o arquivos de ativida
        String nomeArquivo = p.getNome() + "ATA.txt";
        try (FileWriter fw = new FileWriter(nomeArquivo)){
            fw.write(nomeAt);
        } catch (Exception e) {
            System.out.println(e.getMessage());}
        
    }

    private String escolherM(){

        System.out.println("Jogo da Memoria ou Jogo das Cores");
        String escolha = sc.nextLine().trim();
        char escolhaChar = escolha.toUpperCase().charAt(0);
        if(escolhaChar =='M'){
            return "Memoria";
        }else if(escolhaChar =='C'){
            return "Cores";
        }
        return"";
    }

    public void fazerMissao(Perfil p){
        try(BufferedReader br = new BufferedReader(new FileReader(p.getNome()+"ATA.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if(linha.equals("Memoria")){
                    m.jogoDaMemeria();
                    System.out.println();
                }else if(linha.equals("Cores")){
                    m.jogoDeCores();
                    System.out.println();
                }
                ganharBoosters();
                p.armazenarcartas(); }
            } catch (Exception e) {
                System.out.println("ERRO"+ e.getLocalizedMessage());
        }

    }


    public void ganharBoosters(){
        frases.add("Olá!");
        frases.add("Tudo bem?");
        frases.add("Eu preciso de ajuda.");
        frases.add("Eu gosto disso.");
        frases.add("Eu não gosto disso.");
        frases.add("Estou com fome.");
        frases.add("Estou com sede.");
        frases.add("Estou cansado.");
        frases.add("Por favor, espere.");
        frases.add("Obrigado!");

        // Nomes das cartas
        nomes.add("Saudação");
        nomes.add("Pergunta Simples");
        nomes.add("Ajuda");
        nomes.add("Gostar");
        nomes.add("Não Gostar");
        nomes.add("Fome");
        nomes.add("Sede");
        nomes.add("Cansaço");
        nomes.add("Espera");
        nomes.add("Agradecimento");

        Random r = new Random();

        int no = r.nextInt(10);
        Carta carta = new Carta(frases.get(no),nomes.get(no));

        System.out.println("VC ganho a carta "+carta);
        colecao.addCartas(carta);

    }

    public Colecao getColecao() {
        return colecao;
    }

    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }

}
