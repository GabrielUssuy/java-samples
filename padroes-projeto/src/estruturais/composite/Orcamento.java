package estruturais.composite;

import java.math.BigDecimal;
import java.util.List;

public class Orcamento implements Orcavel {

    private BigDecimal valor;
    private List<Orcavel> itens;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }

    public void adicionarItem(Orcavel orcavel) {
        valor = valor.add(orcavel.getValor());
    }
}
