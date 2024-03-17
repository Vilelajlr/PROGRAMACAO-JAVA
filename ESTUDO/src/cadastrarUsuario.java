import java.util.ArrayList;

import javax.swing.*;



public class cadastrarUsuario{

    private ArrayList<usuario> usuarios = new ArrayList<usuario>();
    private JTextField email = new JTextField();
    private JPasswordField senha = new JPasswordField();
    private JLabel emailLabel = new JLabel("Email");
    private JLabel senhaLabel = new JLabel("Senha");
    private JButton cadastrar = new JButton("Cadastrar");
    private JButton voltar = new JButton("Voltar");
    private JButton ver = new JButton("Ver");
    private JFrame cadastro = new JFrame("Cadastro");
    private JCheckBox verSenha = new JCheckBox("Ver senha");
    private char[] senhaChar = senha.getPassword();
    private String senhaString = new String(senhaChar);
    

    public void cadastrarUsusario(janelaPrincipal janelaPrincipal){


        cadastro.setSize(800,400);
        cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadastro.setVisible(true);
        cadastro.setLocationRelativeTo(null);
        cadastro.setResizable(false);
        cadastro.setLayout(null);

        emailLabel.setBounds(250, 100, 100, 30);
        email.setBounds(250, 130, 300, 30);
        senhaLabel.setBounds(250, 170, 100, 30);
        senha.setBounds(250, 200, 300, 30);
        cadastrar.setBounds(250, 250, 100, 30);
        voltar.setBounds(360, 250, 100, 30);
        ver.setBounds(470, 250, 100, 30);
        verSenha.setBounds(580, 250, 100, 30);


        cadastro.add(email);
        cadastro.add(senha);
        cadastro.add(emailLabel);
        cadastro.add(senhaLabel);
        cadastro.add(cadastrar);
        cadastro.add(voltar);
        cadastro.add(ver);
        cadastro.add(verSenha);

        cadastrar.addActionListener(e -> {
            
            usuario novoUsuario = new usuario(email.getText(), senhaString);
            usuarios.add(novoUsuario);
            email.setText("");
            senha.setText("");
            JOptionPane.showMessageDialog(null, "Usuario " + novoUsuario.getEmail()+ " cadastrado com sucesso!");
            
        });

        verSenha.addActionListener(e -> {
            verSenha();
        });

        ver.addActionListener(e -> {
            verUsuarios();
        });

        voltar.addActionListener(e -> {
            cadastro.dispose();
            janelaPrincipal.mostrarJanela();
            
            
        });
    }

    public void mostrar(){
        cadastro.setVisible(true);
    }

    public void verSenha(){
        if(verSenha.isSelected()){
            senha.setEchoChar((char)0);
        }else{
            senha.setEchoChar('*');
        }
    }

    public void verUsuarios(){
        if(usuarios.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum usuario cadastrado");
        }else{
        for(usuario usuario : usuarios){
            JOptionPane.showMessageDialog(null, "Email: " + usuario.getEmail());
        }
        }
    }
    
    
}