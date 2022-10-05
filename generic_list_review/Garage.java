public class Garage <T>{
    private T thing;
    public Garage(T n){
        thing = n;
    }
    public void setThing(T in){
        thing = in;
    }
    public T getThing(){
        return thing;
    }
}
