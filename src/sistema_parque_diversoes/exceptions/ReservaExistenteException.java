package sistema_parque_diversoes.exceptions;

public class ReservaExistenteException extends Exception {

    public ReservaExistenteException(String string) {
        super("Reserva já existe no Repositório");
    }
    
}
