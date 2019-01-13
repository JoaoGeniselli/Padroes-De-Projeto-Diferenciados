package command.violao;

public class CordaInexistenteException extends RuntimeException {

    private int numeroCorda;

    CordaInexistenteException(int numeroCorda) {
        this.numeroCorda = numeroCorda;
    }

    @Override
    public String getMessage() {
        return "A corda de número " + numeroCorda + " não existe.";
    }
}
