public class cadastrarAlunos {
    private String nome;
    private int idade;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    cadastrarAlunos(String nome, int idade, String email) {
        this.setNome(nome);
        this.setEmail(email);
        this.setIdade(idade);

        String[] nomes = new String[100];
        int[] idades = new int[100];
        String[] emails = new String[100];
        int count = 0;

        nomes[count] = this.getNome();
        idades[count] = this.getIdade();
        emails[count] = this.getEmail();
        count++;
    }
    
}
