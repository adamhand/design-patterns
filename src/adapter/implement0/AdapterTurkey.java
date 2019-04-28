package adapter.implement0;

public class AdapterTurkey implements Duck{
    Turkey turkey;

    public AdapterTurkey(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
