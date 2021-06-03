package model;

public class Queue {
    private int total = 0;
    private int head = -1;
    private int tail = -1;
    private Object memo[];
    private int MAX;
    
    public Queue(){
        MAX = 10;
        memo = new Object[MAX];
        total = 0;
        head = -1;
        tail = -1;
    }
    
    public Queue(int qtde){
        MAX = qtde;
        memo = new Object[MAX];
        total = 0;
        head = -1;
        tail = -1;
    }
    
    public boolean isEmpty(){
        return(total == 0);
    }
    
    public boolean isFull(){
        return(total == MAX);
    }
    
    public Object enqueue(Object x){
        if(!isFull() && x != null){
            if(++tail >= MAX){
                tail = 0;
            }
            if(head == -1){
                head = tail;
            }
            memo[tail] = x;
            total++;
            return x;
        }
        else
            return null;
    }
    
    public Object dequeue(){
        if(!isEmpty()){
            Object objeto = memo[head];
            if(++head >= MAX){
                head = 0;
            }
            total--;
            if(total == 0){
                head = -1;
                tail = -1;
            }
            return objeto;
        } else {
            return "Lista vazia!";
        }
    }
    
    public Object peek(){
        if(!isEmpty()){
            return (memo[head]);
        } else {
            return null;
        }
    }
    
    public String toString3(){
        if(!isEmpty()){
            String saida = "";
            int pos = head;
            for(int i = 1; i <= total; i++){
                saida += memo[pos].toString();
                if(i != total){
                    saida += ", ";
                }
                pos++;
                if(pos >= MAX){
                    pos = 0;
                }
            }
            return(saida);
        } else {
            return null;
        }
    }
}