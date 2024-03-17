import java.awt.event.ActionListener;

import javax.swing.*;

public class janelaPrincipal{

    JFrame principal = new JFrame("Principal");
    JButton Login = new JButton("Entrar");
    JButton Cadastro = new JButton("Cadastrar");
    JButton Sair = new JButton("Sair");
    JButton verAlunos = new JButton("Ver alunos");
    JTextField Nome = new JTextField();
    JTextField Email = new JTextField();
    JLabel usuarioLabel = new JLabel("Usuario");
    JLabel senhaLabel = new JLabel("Senha");
    JLabel titulo = new JLabel("Bem vindo ao sistema! ");
    cadastrarUsuario cadastro = new cadastrarUsuario();
    


    public void mostrarJanela(){
        
        principal.setSize(800,800);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        principal.setResizable(false);
        principal.setLayout(null);

        titulo.setBounds(250, 50, 300, 30);
        usuarioLabel.setBounds(250, 100, 100, 30);
        Nome.setBounds(250, 130, 300, 30);
        senhaLabel.setBounds(250, 170, 100, 30);
        Email.setBounds(250, 200, 300, 30);
        Login.setBounds(250, 250, 80, 30);
        Cadastro.setBounds(340, 250, 120, 30);
        Sair.setBounds(470, 250, 80, 30);
        verAlunos.setBounds(250, 400, 300, 30);



        principal.add(Login);
        principal.add(Cadastro);
        principal.add(Sair);
        principal.add(Nome);
        principal.add(Email);
        principal.add(usuarioLabel);
        principal.add(senhaLabel);
        principal.add(titulo);
        principal.add(verAlunos);

        Cadastro.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                principal.setVisible(false);
                
            }
        });

        verAlunos.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                cadastro.cadastrarUsusario(principal);
               cadastro.verUsuarios();
            }
        });


        Sair.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                System.exit(0);
            }
        });

    }

      

}
