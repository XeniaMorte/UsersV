public class WrongPasswordForm extends Exception {
    String massange;
    public WrongPasswordForm (String massange){
        this.massange=massange;
    }

    @Override
    public String toString() {
        return massange;

    }
}
