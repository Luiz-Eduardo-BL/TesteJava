package sistema_parque_diversoes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import sistema_parque_diversoes.beans.Atracao;
import sistema_parque_diversoes.beans.ReservaHorario;
import sistema_parque_diversoes.exceptions.AtracaoInexistenteException;
import sistema_parque_diversoes.exceptions.ReservaExistenteException;
import sistema_parque_diversoes.exceptions.ReservaInesxistenteException;

public class RepositorioReservasArrayList implements IRepositorioReservas {

    List<ReservaHorario> reservas = new ArrayList<>();

    @Override
    public void adicionarReserva(ReservaHorario reserva)
            throws ReservaExistenteException {
        // TODO adicionarReserva
        // Implementar de acordo com descrição da interface

    }

    @Override
    public void removerReserva(long idReserva)
            throws ReservaInesxistenteException {
        // TODO removerReserva
        // Implementar de acordo com descrição da interface

    }

    @Override
    public int qtdDeReservasPorAtracao(long idAtracao)
            throws AtracaoInexistenteException {
        // TODO qtdDeReservasPorAtracao
        // Implementar de acordo com descrição da interface
        return 0;
    }

    @Override
    public List<ReservaHorario> listarReservasPorHorarioOrdenadasPeloHorarioInicial(
            LocalDateTime inicio, LocalDateTime fim, Atracao atracao) {
        // TODO listarReservasPorHorarioOrdenadasPeloNomeDaAtracao
        // Implementar de acordo com descrição da interface
        return null;
    }

    @Override
    public List<ReservaHorario> listarReservasDaAtracaoOrdenadasPeloNomeDaPessoa(
            Atracao atracao) {
        // TODO listarReservasDaAtracaoOrdenadasPeloNomeDaPessoa
        // Implementar de acordo com descrição da interface
        return null;
    }


}
