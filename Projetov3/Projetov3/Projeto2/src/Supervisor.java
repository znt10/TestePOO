
import java.util.Scanner;

public class Supervisor {

    private int senha = 12345;
    Scanner sc = new Scanner(System.in);



    public void criarM(Perfil p){
        p.getMissao().criarMissao(p);
    }



    public String certo(int numeros, Perfil p){
        if(numeros == senha){
            p.setSup(true);
            return "A senha esta certa, acasse permitido";

        }else{
            return "senha errada";
        }
    }

    public void conversa(Perfil p){

            while(true){
            System.out.println("Continuar ou Sair");
            String op = sc.nextLine();
            char primeira = op.toUpperCase().charAt(0);
            switch (primeira) {
                case 'S':
                    System.out.println("Saiu");
                        break;
                case 'C':
                    System.out.println("Quer Fazer Atividades?\nVer sua colocao?");
                    String op1 = sc.nextLine();
                
                    char primeira1 = op1.toUpperCase().charAt(0);
                    if (primeira1 == 'C' || primeira1 == 'V'){
                        p.getMissao().getColecao().cartinhas(p);
                        return;
                    } else if (primeira1 == 'A' || primeira1 == 'F') {
                        //bug quando nao tem missao
                        System.out.println();
                        p.getMissao().fazerMissao(p);
                        p.armazenarcartas();
                        return;
                }return;
                default:
                System.out.println("Opcao invalida");
                    return;


            }
        }
        
        //conversa com supervisor pra conseguir a fazer missao e ganhar boots






    }
}
