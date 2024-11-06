public class No{


private No direta;
private No esquerda;
private int valor;

public No() {
}

public No(No direta, No esquerda, int valor) {
    this.direta = direta;
    this.esquerda = esquerda;
    this.valor = valor;
}



public No(int valor) {
    this.valor = valor;
}

public No getDireta() {
    return direta;
}

public void setDireta(No direta) {
    this.direta = direta;
}

public No getEsquerda() {
    return esquerda;
}

public void setEsquerda(No esquerda) {
    this.esquerda = esquerda;
}

public int getValor() {
    return valor;
}

public void setValor(int valor) {
    this.valor = valor;
}




}