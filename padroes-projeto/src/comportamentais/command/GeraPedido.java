package comportamentais.command;

import java.math.BigDecimal;

public class GeraPedido {
    private int quantidadeDeItens;
    private BigDecimal valorTotal;

    public GeraPedido(int quantidadeDeItens, BigDecimal valorTotal) {
        this.quantidadeDeItens = quantidadeDeItens;
        this.valorTotal = valorTotal;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void executa() {
        Pedido pedido = new Pedido(quantidadeDeItens, valorTotal);
        System.out.println("Salvando pedido no banco");
        System.out.println("Executando alguma outra ação");
    }
}
