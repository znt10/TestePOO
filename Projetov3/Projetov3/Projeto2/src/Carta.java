public class Carta {

    private String descricao;
    private String nome;
    //imagem da carta


    public Carta(String descricao, String nome) {
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carta" + "{descricao='" + descricao +", nome='" + nome +'}';
    }
}
