import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaSupervisor extends Janela {

    public void criarJanela(Perfil p) {
     // Criar a janela principal
            JFrame frame = new JFrame("Sistema do Supervisor");
            frame.setSize(600, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Criar painel principal
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(3, 1, 10, 10));


            // Botão para realizar missões
            JButton btnFazerMissao = new JButton("Criar Missão");
            btnFazerMissao.addActionListener(e -> {
                p.getSupervisor().criarM(p);
            });



            // Adicionar botões ao painel
            painel.add(btnFazerMissao);
            frame.add(painel, BorderLayout.CENTER);

        // Tornar a janela visível
        frame.setVisible(true);
    }


}