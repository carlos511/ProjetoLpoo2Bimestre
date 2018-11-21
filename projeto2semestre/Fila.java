
package projeto2semestre;

public class Fila <A> extends AtendimentoUnieuro <A> {

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }
    public void fila(A atendimento){
        this.inserir(atendimento);
    
    }
    public A desinfileira(){
        if(this.vazia()){
            return null;
        }
            A AtendimentoRemovido = (A) this.atend[0];
            this.remover(0);
    return AtendimentoRemovido;
    }
}