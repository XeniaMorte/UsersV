public class WrongLoginException extends Exception {
    String massange;
    public WrongLoginException (String massange){
        this.massange=massange;
    }

    @Override
    public String toString() {
        return massange;

    }
}
