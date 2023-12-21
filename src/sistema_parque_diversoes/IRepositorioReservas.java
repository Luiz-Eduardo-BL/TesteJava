package sistema_parque_diversoes;

import java.time.LocalDateTime;
import java.util.List;

import sistema_parque_diversoes.beans.Atracao;
import sistema_parque_diversoes.beans.ReservaHorario;
import sistema_parque_diversoes.exceptions.AtracaoInexistenteException;
import sistema_parque_diversoes.exceptions.ReservaExistenteException;
import sistema_parque_diversoes.exceptions.ReservaInesxistenteException;

public interface IRepositorioReservas {
  
  /**
   * Este método adiciona um novo objeto do tipo ReservaHorario no repositório.
   * O método levanta uma exceção se já existir algum objeto no repositório que 
   * tenha o mesmo ID do objeto informado como parâmetro.
   *
   * @param reserva O objeto a ser adicionado no repositório
   * @throws ReservaExistenteException
   */
  void adicionarReserva(ReservaHorario reserva) throws ReservaExistenteException;
  
  /**
   * Este método remove uma reserva do repositório. O método levanta uma exceção
   * se o ID informado como parâmetro não existir no repositório de reservas
   * 
   * @param idReserva O ID da reserva a ser removida
   * @throws ReservaExistenteException
   */
  void removerReserva(long idReserva) throws ReservaInesxistenteException;
  
  /**
   * Consulta a lista completa de reservas e retorna todas as reservas que têm 
   * seu horário de início igual ou maior ao horário de início informado como 
   * parâmetro e têm seu horário fim menor ou igual ao horário fim informado 
   * como parâmetro. A lista retornada deve ser ORDENADA pelo horário inicial 
   * de cada reserva
   * 
   * @param inicio o horário de início da reserva
   * @param fim o horário de fim da reserva
   * @param atracao A atração para a qual se quer consultar as reservas 
   * @return Uma nova lista de objetos do tipo ReservaHorario ordenada pelo
   *         horário inicial de cada reserva.
   */
  List<ReservaHorario> listarReservasPorHorarioOrdenadasPeloHorarioInicial(
          LocalDateTime inicio, LocalDateTime fim, Atracao atracao);
  
  /**
   * Consulta a lista completa de reservas e retorna todas as reservas 
   * associadas a Atração informada como parâmetro. A lista retornada deve ser 
   * ORDENADA pelo nome da Pessoa.
   * 
   * @param atracao A atração para a qual se quer consultar as reservas 
   * @return Uma nova lista de objetos do tipo ReservaHorario ordenada pelo
   *         horário inicial de cada reserva.
   */
  List<ReservaHorario> listarReservasDaAtracaoOrdenadasPeloNomeDaPessoa(
          Atracao atracao);
  
  /**
   * Este método retorna a quantidade de reserva feitas para uma determinada 
   * atração, cujo ID é informado como parâmetro.
   * 
   * @param idAtracao O ID da atração que se deseja saber a quantidade de 
   *        reservas já feitas para ela
   * @return A quantidade de reservas já feitas para aquela atração informada 
   *         como parâmetro
   */
  int qtdDeReservasPorAtracao(long idAtracao) throws AtracaoInexistenteException;
}
