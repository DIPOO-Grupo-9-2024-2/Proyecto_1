package auth;

public class Administrador extends Usuario {
    public Administrador(int id, String nombre, String email, String contraseña) {
        super(id, nombre, email, contraseña, "administrador");
    }

    // Métodos
}
