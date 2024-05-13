package iota.decl.exception;

public class DeclNotDeclaredException extends RuntimeException {
    public DeclNotDeclaredException( ) {
        super("[ERROR] Json's Decl does not exist");
    }
}
