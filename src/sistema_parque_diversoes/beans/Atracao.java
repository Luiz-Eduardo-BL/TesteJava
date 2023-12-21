package sistema_parque_diversoes.beans;

public class Atracao {

    private long id;
    private String descricao;
    private int capacidadeMax;
    private int idadeMinima;

    public Atracao(long id, String descricao, int capacidade, int idadeMinima) {
        this.id = id;
        this.descricao = descricao;
        this.capacidadeMax = capacidade;
        this.idadeMinima = idadeMinima;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

}
