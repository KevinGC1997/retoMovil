package appExito.models;

public class AppExitoInicio {

    String correo;
    String contrasena;

    public AppExitoInicio(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
}
