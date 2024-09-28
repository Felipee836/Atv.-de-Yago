public class Lista {
    private No primeiro;

    //construtor
    public Lista() {
        primeiro = null;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    //Está vazio
    public boolean estaVazia() {

        //return primeiro == null;

        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    //coloca primeiro
    public void inserePrimeiro(int valor) {
        No no1 = new No(valor);
        no1.setProximo(primeiro);
        primeiro = no1;
    }

    //mostrar a lista
    public void mostrar() {
        if (estaVazia()) {
            System.out.println("A LISTA ESTÁ VAZIA, REVEJA");
        } else {
            No cursor = primeiro;
            while (cursor != null) {
                System.out.println(cursor.getInfo());
                cursor = cursor.getProximo();
            }
        }

    }

    //colocar no ultimo:
    public void insereUltimo(int valor) {
        if (estaVazia()) {
            inserePrimeiro(valor);
        } else {
            No cursor = primeiro;
            while (cursor.getProximo() != null) {
                cursor = cursor.getProximo();
            }
            No no1 = new No(valor);
            cursor.setProximo(no1);
        }
    }

    //metodo de remoçao
    public boolean removePrimeiro() {

        if (estaVazia()) {
            System.out.println("Lista está vazia, quer remover oque?");
            return false;
        } else {
           
            primeiro = primeiro.getProximo();
            return true;
        }

    }
    public String buscar(int valor) {
        int index = 0;
        No cursor = primeiro;
        while (cursor != null) {
            if (cursor.getInfo() == valor) {
                return "Valor encontrado no nó " + index;
            }
            index++;
            cursor = cursor.getProximo();
        }
        return "Não encontrou. Ele executou " + index + " passos";
    }
}
