package command.violao;

public class CasaInexistenteException extends RuntimeException {

    private Integer numeroCasa;

    CasaInexistenteException(Integer numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String getMessage() {
        return "A casa de número " + numeroCasa + " não existe.";
    }
}
