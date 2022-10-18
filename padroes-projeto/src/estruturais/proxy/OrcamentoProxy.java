package estruturais.proxy;


import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {
    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        super();
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if(valor == null) {
            valor = orcamento.getValor();
        }
        return valor;
    }
}
