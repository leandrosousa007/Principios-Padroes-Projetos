package questao02;

public class Cafeteria {
    public static void main(String[] args) {
        
        // 1. Pedindo um Espresso simples
        Bebida pedido1 = new Espresso();
        System.out.println("Pedido 1: " + pedido1.getDescricao() + " | Custo: R$ " + pedido1.calculaCusto());
        
        // 2. Pedindo um Decaf com Leite e Canela
        Bebida pedido2 = new Decaf();
        pedido2 = new Leite(pedido2);   // Envolve o Decaf com Leite
        pedido2 = new Canela(pedido2);  // Envolve o Decaf com Leite com Canela
        
        System.out.println("Pedido 2: " + pedido2.getDescricao() + " | Custo: R$ " + pedido2.calculaCusto());
        
        // 3. Pedindo um Espresso completo (Leite, Chocolate e Canela)
        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Chocolate(pedido3);
        pedido3 = new Canela(pedido3);
        
        System.out.println("Pedido 3: " + pedido3.getDescricao() + " | Custo: R$ " + pedido3.calculaCusto());
    }
}