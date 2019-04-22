package chain_of_responsibility.implement0;

public class ConcreteHandler0 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("zero")){
            System.out.println("concreteHandler0负责处理请求");
        }else if (getNext() != null){
            getNext().handleRequest(request);
        }else {
            System.out.println("no suitable handler");
        }
    }
}
