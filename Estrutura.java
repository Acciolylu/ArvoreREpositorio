public class Estrutura {

    private No raiz;
    public void inserir ( int valor){
        inserir(this.raiz, valor);

    }

    public void inserir (No no, int valor){
        if (no != null) {
            if (valor < no.getValor()) {
                if (no.getEsquerda() != null) {
                    inserir(no.getEsquerda(), valor);
        
                }else {
                    no.setEsquerda(new No (valor));
    }
    
}
    if(valor>no.getValor()){
        if(no.getDireta()!= null){
            inserir(no.getDireta(), valor);
        }else{
            no.setDireta(new No(valor));
        }
       

    }

}else{
    this.raiz=new No(valor);

}
    }

    public void preOrdem(){
        preOrdem(this.raiz);
    }

    private void preOrdem(No no){
        if (no != null) {
            System.out.print(no.getValor());
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireta());
    }

}

public void posOrdem() {
		
    posOrdem(this.raiz);
    
}

private void posOrdem(No no) {
    
    if(no != null) {
        
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireta());
        System.out.println(no.getValor());
    
    }
    
}

public void inOrdem() {
    inOrdem(this.raiz);
}

private void inOrdem(No no) {
    
    if(no !=null ) {
        
        inOrdem(no.getEsquerda());
        System.out.println(no.getValor());
        inOrdem(no.getDireta());
        
    }
    
}

public No valorMinimo() {
    
    return valorMinimo(this.raiz);
    
}

private No valorMinimo(No no) {
    
    if(no.getEsquerda()!=null) {
        
        no = valorMinimo(no.getEsquerda());
        
    }
    
    return no;
    
}

public No valorMaximo() {
    
    return valorMaximo(this.raiz);
    
}

private No valorMaximo(No no) {
    
    if(no.getDireta()!=null) {
        
        no = valorMaximo(no.getDireta());
        
    }
    
    return no;
    
}


public void removerMinimo() {
    this.raiz = removerMinimo(this.raiz);
}

private No removerMinimo(No no) {
    if (no == null) return null;
    if (no.getEsquerda() == null) {
        return no.getDireta();
    }
    no.setEsquerda(removerMinimo(no.getEsquerda()));
    return no;
}





}

