package chain_of_responsibility.implement0;

public abstract class Handler {
    private Handler next;

    public Handler(){}

    public void setNext(Handler next){
        this.next = next;
    }

    public Handler getNext(){
        return this.next;
    }

    public abstract void handleRequest(String request);
}
