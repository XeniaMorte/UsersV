public class EqualsPassExeption extends Exception {
    String massange;
    public EqualsPassExeption (String massange){
        this.massange=massange;
    }

    @Override
    public String toString() {
        return massange;

    }
}
