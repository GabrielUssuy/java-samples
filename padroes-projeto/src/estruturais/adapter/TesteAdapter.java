package estruturais.adapter;


public class TesteAdapter {
    public static void main(String[] args) {
        GeraNotaFiscalAdapter geraNotaFiscalAdapter = new GeraNotaFiscalAdapter();
        geraNotaFiscalAdapter.executa(new PedidoDTO());
    }
}
