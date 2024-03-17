public class login {

    private String usuario;
    private String email;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public login(String usuario, String email) {
        this.setUsuario(usuario);
        this.setEmail(email);


    }
    
}
