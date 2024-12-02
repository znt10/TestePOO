import java.io.*;
import java.util.Scanner;

public class Perfil {
    private String nome;
    Scanner sc = new Scanner(System.in);
    private Missao missao;
    private boolean sup = false;
    private boolean alu = false;
    private Supervisor Supervisor;


    private String nomedoA() {
        System.out.println("Qual nome do Aluno ou Aluna?");
        return this.nome = sc.nextLine();


    }


    public void criarPerfil() {
        this.missao = new Missao();
        nomedoA();
        this.Supervisor = new Supervisor();

        switch (AouS()) {
            case "ALUNO":
                String nomeArquivo = nome + ".txt";
                File arquivo = new File(nomeArquivo);
                alu = true;
                //verificando se o arquivo conta existe
                if (arquivo.exists()) {
                    System.out.println("O " + getNome() + " Conta");
                } else {
                    
                    try (FileWriter fw = new FileWriter(nomeArquivo)) {
                        System.out.println("Perfil criado: " + nomeArquivo);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                
                return;

            case "SUPERVISOR":
                System.out.println("Qual senha?");
                System.out.println(Supervisor.certo(sc.nextInt(),this));
                sc.nextLine();
                return;
                //System.out.println("CRIAR MISSAO");
                
                //switch (CouVouI()){
                  //  case "CRIAR" -> Supervisor.criarM(this);
                    //default -> System.out.println("Opção invalida");
                    
               // }
                
        }


    }

    //private String CouVouI(){
    //String op = sc.nextLine(); 
    //char pri = op.toUpperCase().charAt(0);
        //return switch (pri) {
        //    case 'C' -> "CRIAR";
        //    default -> "";
      //  };
    //}
    public void armazenarcartas() {
        try (BufferedReader br = new BufferedReader(new FileReader(nome+"ATA.txt"))) {
            String linha;
            String nomeArquivo = getNome() + ".txt";

            if((linha = br.readLine()) != null){
                try (FileWriter fw = new FileWriter(nomeArquivo,true)) {
                    fw.write(missao.getColecao().getCarta().toString());
                    fw.write("\n");
                } catch (IOException e) {
                    System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            }}


        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void acessarPerfil() {
    
        System.out.println("O meu nome é " + getNome());
        editarPerfil();
    }

     void editarPerfil() {
        System.out.println("Deseja editar algo?");
        System.out.println("NOME\nSAIR");
        String op = sc.nextLine();

        switch (op.toUpperCase()) {
            case "NOME":
                System.out.println("Mudando o NOME do perfil");
                setNome(sc.nextLine());
                System.out.println("O nome foi alterado para " + getNome());
                break;
            case "SAIR":
                break;
            default:
                System.out.println("Opção inválida.");
                editarPerfil();  // Chama novamente para opção correta
        }
    }

    private String AouS() {
        while (true) {
            System.out.println("Digite ALUNO ou SUPERVISOR:");
            String op = sc.nextLine().toUpperCase();
            if (op.equals("ALUNO") || op.equals("SUPERVISOR")) {
                return op;
            }
            System.out.println("Entrada inválida. Tente novamente.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Missao getMissao() {
        return missao;
    }

    public void setMissao(Missao missao) {
        this.missao = missao;
    }


    public boolean isSup() {
        return sup;
    }


    public void setSup(boolean sup) {
        this.sup = sup;
    }


    public boolean isAlu() {
        return alu;
    }


    public void setAlu(boolean alu) {
        this.alu = alu;
    }


    public Supervisor getSupervisor() {
        return Supervisor;
    }


    public void setSupervisor(Supervisor supervisor) {
        Supervisor = supervisor;
    }
    
    
}