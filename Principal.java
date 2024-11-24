public class Principal {
    public static void main(String[] args) {
        No n = new No();
        No m= new No();
        Estrutura e = new Estrutura();
        e.inserir(4);
        e.inserir(2);
        e.inserir(3);
        e.inserir(23);
        e.inserir(6);
        e.inserir(5);
        e.inserir(7);
        e.inserir(14);
        e.inserir(7);


        e.inOrdem();
        System.out.println("----------------------------");
        e.posOrdem();

        System.out.println("----------------------------");
        e.preOrdem();
		
		n= e.valorMinimo();
        m= e.valorMaximo();

    

		
		System.out.println("\n Valor minimo= "+n.getValor());

		System.out.println("\n Valor maximo= "+m.getValor());

        e.removerMinimo();
        System.out.println("\nÁrvore em ordem após remover o menor valor:");
        e.inOrdem();

             System.out.println("Altura da árvore: "+e.calcularAltura());


    }
}
