public class main{

  public static void main(String[]args){

  
        Lista lista = new Lista();
        System.out.println(lista.estaVazia());
        lista.inserePrimeiro(250);
        lista.inserePrimeiro(95);
        lista.insereUltimo(100);

        lista.mostrar();
        System.out.println("Escolhido foi O: " + lista.getPrimeiro().getProximo().getInfo());
        System.out.println("Busquei o: " + lista.buscar(95));
        lista.mostrar();
    }
}