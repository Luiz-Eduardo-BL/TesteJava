package sistema_parque_diversoes.beans;

import java.time.LocalDateTime;

public class ReservaHorario {

    private long id;
    private Pessoa pessoa;
    private Atracao atracao;
    private LocalDateTime horarioInicial;
    private LocalDateTime horarioFinal;

    public ReservaHorario(long id, Pessoa pessoa, Atracao atracao,
            LocalDateTime horarioInicial, LocalDateTime horarioFinal) {
        this.id = id;
        this.pessoa = pessoa;
        this.atracao = atracao;
        this.setHorarioInicial(horarioInicial);
        this.setHorarioFinal(horarioFinal);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Atracao getAtracao() {
        return atracao;
    }

    public void setAtracao(Atracao atracao) {
        this.atracao = atracao;
    }

    public LocalDateTime getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(LocalDateTime horarioInicial) {
        // TODO ReservaHorario.setHorarioInicial
        // O horário inicial só deve ser configurado (setado) se for anterior 
        // ao horário final. Se no momento da execução deste método, o horário
        // final ainda for nulo, então configurar este valor sem restrições
        
        this.horarioInicial = horarioInicial;
    }

    public LocalDateTime getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(LocalDateTime horarioFinal) {
        // TODO ReservaHorario.setHorarioFinal
        // O horário final só deve ser configurado (setado) se for posterior 
        // ao horário inicial. Se no momento da execução deste método, o horário
        // inicial ainda for nulo, então configurar este valor sem restrições
        this.horarioFinal = horarioFinal;
    }

}
