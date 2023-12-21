package sistema_parque_diversoes.exceptions;

import sistema_parque_diversoes.beans.Atracao;

public class AtracaoLotadaException extends Exception {
    
    private Atracao atracaoLotada;
    
    public AtracaoLotadaException (Atracao atracaoLotada) {
        super(String.format("Esta atração '%s' encontra-se lotada", 
                atracaoLotada != null ? atracaoLotada.getDescricao() : ""));
        this.atracaoLotada = atracaoLotada;
    }

    public Atracao getAtracaoLotada() {
        return atracaoLotada;
    }

}
