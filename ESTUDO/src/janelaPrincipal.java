import java.awt.event.ActionListener;

import javax.swing.*;

public class janelaPrincipal{

    JFrame principal = new JFrame("Principal");
    JButton Login = new JButton("Entrar");
    JButton Cadastro = new JButton("Cadastrar");
    JButton Limpar = new JButton("Sair");
    JTextField usuario = new JTextField();
    JPasswordField senha = new JPasswordField();
    JLabel usuarioLabel = new JLabel("Usuario");
    JLabel senhaLabel = new JLabel("Senha");
    JLabel titulo = new JLabel("Bem vindo ao sistema de cadastro de alunos");


    public void mostrarJanela(){
        principal.setSize(800,800);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        principal.setResizable(false);
        principal.setLayout(null);

        titulo.setBounds(250, 50, 300, 30);
        usuarioLabel.setBounds(250, 100, 100, 30);
        usuario.setBounds(250, 130, 300, 30);
        senhaLabel.setBounds(250, 170, 100, 30);
        senha.setBounds(250, 200, 300, 30);
        Login.setBounds(250, 250, 80, 30);
        Cadastro.setBounds(340, 250, 120, 30);
        Limpar.setBounds(470, 250, 80, 30);




        principal.add(Login);
        principal.add(Cadastro);
        principal.add(Limpar);
        principal.add(usuario);
        principal.add(senha);
        principal.add(usuarioLabel);
        principal.add(senhaLabel);
        principal.add(titulo);

        Cadastro.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                principal.setVisible(false);
                cadastrarUsusario();
            }
        });

    }

    public void cadastrarUsusario(){
        JFrame cadastro = new JFrame("Cadastro");
        cadastro.setSize(800,800);
        cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadastro.setVisible(true);
        cadastro.setLocationRelativeTo(null);
        cadastro.setResizable(false);
        cadastro.setLayout(null);

        JLabel titulo = new JLabel("Cadastro de Alunos");
        titulo.setBounds(250, 50, 300, 30);
        cadastro.add(titulo);

        JLabel nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(250, 100, 100, 30);
        cadastro.add(nomeLabel);

        JTextField nome = new JTextField();
        nome.setBounds(250, 130, 300, 30);
        cadastro.add(nome);

        JLabel idadeLabel = new JLabel("Idade");
        idadeLabel.setBounds(250, 170, 100, 30);
        cadastro.add(idadeLabel);

        JTextField idade = new JTextField();
        idade.setBounds(250, 200, 300, 30);
        cadastro.add(idade);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(250, 240, 100, 30);
        cadastro.add(emailLabel);

        JTextField email = new JTextField();
        email.setBounds(250, 270, 300, 30);
        cadastro.add(email);

        JButton cadastrar = new JButton("Cadastrar");
        cadastrar.setBounds(250, 320, 120, 30);
        cadastro.add(cadastrar);

        JButton voltar = new JButton("Voltar");
        voltar.setBounds(380, 320, 100, 30);
        cadastro.add(voltar);

        cadastrar.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                cadastrarAlunos aluno = new cadastrarAlunos(nome.getText(), Integer.parseInt(idade.getText()), email.getText());
                cadastro.setVisible(false);
                principal.setVisible(true);
            }
        });

        voltar.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                cadastro.setVisible(false);
                principal.setVisible(true);
            }
        });
    }



    

}
