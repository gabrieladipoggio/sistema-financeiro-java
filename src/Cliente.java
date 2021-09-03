public class Cliente {

    private String nome;
    private String sobrenome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            System.out.println("Nome do cliente inválido");
        } else {
            this.nome = nome;
        }
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}