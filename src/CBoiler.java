public class CBoiler {
    private boolean empty;
    private boolean boiled;

    private  static CBoiler UniqueInstance;

    // private CBoiler(){}

    // a default constructor
    private CBoiler(){
        empty = true;
        boiled = false;
    }

    public static CBoiler getInstance(){
        if (UniqueInstance == null){
            UniqueInstance = new CBoiler();
        }
        return UniqueInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            // fill the boilder
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            // drain the contents
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()) {
            // boil the contents
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
