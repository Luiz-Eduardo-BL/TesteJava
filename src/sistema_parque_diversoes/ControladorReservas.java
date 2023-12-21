package sistema_parque_diversoes;

import java.time.LocalDateTime;
import java.util.Random;

import sistema_parque_diversoes.beans.Atracao;
import sistema_parque_diversoes.beans.Pessoa;
import sistema_parque_diversoes.beans.ReservaHorario;

public class ControladorReservas {
  
  private IRepositorioReservas repositorio;

  public ControladorReservas(IRepositorioReservas repositorio) {
    this.repositorio = repositorio;
  }
  
  /**
   * Este método realiza uma reserva de uma pessoa em uma atração num 
   * determinado horário inicial e final. Este método deverá verificar as 
   * seguintes condições e possivelmente levantar as respectivas exceções:
   * 1) Verificar se todos os parâmetros não são nulos
   * 2) Verificar se a pessoa tem idade mínima suficiente para entrar na atração,
   *    levantando a exceção respectiva
   * 3) Verificar se a atração não está lotada, levantando a exceção respectiva 
   * 4) Tratar as exceções levantadas pelo repositório e, se necessário, 
   *    repassá-las para quem invoca o método
   *    
   * Ao final a execução deste método, um objeto do tipo ReservaHorario deve ser 
   * gerado, com um ID aleatório, e armazenado no repositório de reservas. O ID
   * aleatório pode ser gerado com o comando (new Random()).nextLong()*10000000; 
   * emulando um ID aletório fornecido por um bando de dados, porém do tipo long.
   * 
   * @param p A pessoa que está realizando a reserva
   * @param a A atração que a pessoa deseja reervar
   * @param horarioInicial Horário inicial da reserva
   * @param horarioFinal Horário final da reserva
   */
  public void realizarReserva(Pessoa p, Atracao a, LocalDateTime horarioInicial, 
        LocalDateTime horarioFinal) throws Exception {
    // Verificar se todos os parâmetros não são nulos
    if (p == null || a == null || horarioInicial == null || horarioFinal == null) {
        throw new IllegalArgumentException("Os parâmetros não podem ser nulos.");
    }

    // Verificar se a pessoa tem idade mínima suficiente para entrar na atração
    if (p.getIdade() < a.getIdadeMinima()) {
        throw new Exception("A pessoa não tem idade mínima suficiente para entrar na atração.");
    }

    // Verificar se a atração não está lotada
    if (a.getCapacidadeMax() >= a.getCapacidadeMax()) {
        throw new Exception("A atração está lotada.");
    }

    // Gerar um objeto do tipo ReservaHorario com um ID aleatório
    long id = (new Random()).nextLong() * 10000000;
    ReservaHorario reserva = new ReservaHorario(id, p, a, horarioInicial, horarioFinal);

    // Armazenar a reserva no repositório
    try {
        repositorio.adicionarReserva(reserva);
    } catch (Exception e) {
        // Tratar as exceções levantadas pelo repositório e, se necessário, repassá-las para quem invoca o método
        throw new Exception("Erro ao armazenar a reserva: " + e.getMessage());
    }
}

}
