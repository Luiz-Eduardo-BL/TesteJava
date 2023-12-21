package sistema_parque_diversoes.exceptions;

public class ReservaInesxistenteException extends Exception {
    
    public ReservaInesxistenteException() {
        super("Reserva não existe no sistema");
    }

}
