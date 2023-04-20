package obj.objects;

public class CrearUser extends Persona {

    protected String username;
    protected String password;


    public CrearUser(String nombre, String apellido, int edad, String direccion, String email, int telefono, String username, String password) {
        super(nombre, apellido, edad, direccion, email, telefono);
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "CrearUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

