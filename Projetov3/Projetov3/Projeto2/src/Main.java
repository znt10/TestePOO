
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // so ttem  janela depois de criar conta 
        JanelaAluno j = new JanelaAluno();
        JanelaSupervisor j2 = new JanelaSupervisor();
        Perfil p = new Perfil();
        p.criarPerfil();
        if(p.isAlu() == true){
            j.criarJanela(p);
        }
        else if(p.isSup() == true){
            j2.criarJanela(p);
        }
}
}