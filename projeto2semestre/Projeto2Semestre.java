
package projeto2semestre;


public class Projeto2Semestre {

    public static void main(String[] args) {
        AtendimentoUnieuro a = new AtendimentoUnieuro(10); //Iniciando metodos da Classe.
        PrioridadeFila<Integer> f = new PrioridadeFila<>();  //Fila recursiva com prioridade.
        f.fila(7);  //Inserção de valores para exibir a prioridade.
        f.fila(6);
        f.fila(5);
        f.fila(4);
        f.fila(3);
        f.fila(2);
        f.fila(1);
        
        System.out.println(f);//Exibe de acordo com a  prioridade.
       
        a.inserir(0, 8);
        a.inserir(4, null);
        a.inserir(1, 2);
        a.inserir(2, 6);
        a.inserir(3, 11);
        a.inserir(5, 7);//Insere elementos na fila.
        System.out.println(a); //Exibe elementos da fila.
        System.out.println(a.busca(0));//Exibe o elemento buscado.
        a.remover(0);//Remove um elemento da fila
        System.out.println(a);//Exibe a fila após remoção.

}
}
    


