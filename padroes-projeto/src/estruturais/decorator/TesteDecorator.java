package estruturais.decorator;

public class TesteDecorator {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Imposto imposto = new ICMS(new ISS(null));
        CalculoImposto calculoImposto = new CalculoImposto();
        calculoImposto.calcular(pedido, imposto);
    }
}
