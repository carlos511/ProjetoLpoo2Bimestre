
package projeto2semestre;

public class AtendimentoUnieuro <A> {
    int size;
    Object[] atend;
    
    public AtendimentoUnieuro(){
        this(10);
    }
    public boolean vazia(){
        return this.size == 0;
    }
    
    public AtendimentoUnieuro(int capacidade){
        this.atend = new Object[capacidade];
        this.size = 0;
        }
    public boolean inserir(A atendimento){
        if (this.size < this.atend.length){        
    this.atend[this.size] = atendimento;
    this.size++;
       return true;
        }
        return false;
    }
         
        public boolean inserir(int posicao, Object atendimento){

            //Mover todos os elementos
            for (int i=this.size-1; i>=posicao; i--){  //i maior ou igual a posição atual.
                this.atend[i+1] = this.atend[i];
            }
            this.atend[posicao] = atendimento;
            this.size++;
            
            return false;
        }
        
    public int size(){
        return this.size;
    }
        public Object busca(int posicao){
            if(!(posicao >=0 && posicao < size)){
                throw new IllegalArgumentException("Posição invalida");
            }
               return this.atend[posicao];
        
        }
               public void remover(int posicao){
                   if(!(posicao >=0 && posicao < size)){
                throw new IllegalArgumentException("Posição invalida");
               }
                  for(int i=posicao; i<this.size; i++){
        this.atend[i] = this.atend[i+1];
        
                  }
               this.size--;
               }
               
    @Override
    public String toString(){
    StringBuilder s = new StringBuilder();
    s.append("[");
    for (int i=0; i<this.size-1; i++){
        s.append (this.atend[i]);
        s.append (", ");
    }
    if (this.size>0){
        s.append (this.atend[this.size-1]);
    }
    s.append ("]");
        return s.toString();
    }
}



    

    
    
  

