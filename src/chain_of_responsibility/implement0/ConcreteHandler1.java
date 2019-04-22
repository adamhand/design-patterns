package chain_of_responsibility.implement0;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("one")){
            System.out.println("concreteHandler1负责处理请求");
        }else if (getNext() != null){
            getNext().handleRequest(request);
        }else {
            System.out.println("no suitable handler");
        }
    }
}
