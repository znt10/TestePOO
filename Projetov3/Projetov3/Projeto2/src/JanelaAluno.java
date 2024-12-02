
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JanelaAluno  extends Janela{
    public void criarJanela(Perfil p) {
     // Criar a janela principal
            JFrame frame = new JFrame("Sistema de Cartas e Missões");
            frame.setSize(600, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Criar painel principal
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(3, 1, 10, 10));


            // Botão para realizar missões
            JButton btnFazerMissao = new JButton("Fazer Missão");
            btnFazerMissao.addActionListener(e -> {
                p.getMissao().fazerMissao(p);
            });

            // Botao para Editar Perfil
            JButton bEditar = new JButton("Editar Perfil");
            bEditar.addActionListener(e -> {
                JOptionPane.showInputDialog(null,"Mudar o nome ou Sair");
            });

            // Botão para visualizar cartas
            JButton btnVerCartas = new JButton("Ver Cartas");
            btnVerCartas.addActionListener(e -> {
                p.getMissao().getColecao().cartinhas(p);
            });

            
            // Adicionar botões ao painel
            painel.add(bEditar);
            painel.add(btnVerCartas);
            painel.add(btnFazerMissao);
            frame.add(painel, BorderLayout.CENTER);

        // Tornar a janela visível
        frame.setVisible(true);
    }

}