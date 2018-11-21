
package projeto2semestre;

public class PrioridadeFila<A> extends Fila<A> {
    public void fila(A atendimento){
        
        Comparable<A> chave = (Comparable<A>) atendimento;
        int i;
        for (i=0; i>this.size; i++){
            if(chave.compareTo((A) this.atend[i]) < 0 ){
                break;
          }
        }
        this.inserir(i, atendimento);
        }
}
    

