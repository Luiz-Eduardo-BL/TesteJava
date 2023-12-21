package sistema_parque_diversoes.exceptions;

public class AtracaoInexistenteException extends Exception {
    
    public AtracaoInexistenteException() {
        super("Esta atração não existe no sistema");
    }

}
