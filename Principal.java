public class Principal {
    public static void main(String[] args) {
        No n = new No();
        No m= new No();
        Estrutura e = new Estrutura();
        e.inserir(4);
        e.inserir(2);
        e.inserir(3);
        e.inserir(1);
        e.inserir(6);
        e.inserir(5);
        e.inserir(7);


        e.inOrdem();
		
		n= e.valorMinimo();
        m= e.valorMaximo();

		
		System.out.println("\n Valor minimo= "+n.getValor());

		System.out.println("\n Valor maximo= "+m.getValor());

    }
}
