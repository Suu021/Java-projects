public class Usuario {
    private String nome, sobrenome, email, senha, gostos, CPF, endereco, CEP;
    private Date nascimento;
    private int cartao;

    public Usuario(String nome, String sobrenome, String email, String senha, String gostos, String cPF, String endereco, String cEP, Date nascimento, int cartao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.gostos = gostos;
        this.CPF = cPF;
        this.endereco = endereco;
        this.CEP = cEP;
        this.nascimento = nascimento;
        this.cartao = cartao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGostos() {
        return gostos;
    }

    public void setGostos(String gostos) {
        this.gostos = gostos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    
}
