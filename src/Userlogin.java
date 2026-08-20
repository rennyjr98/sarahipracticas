public class Userlogin {
    public String password;
    public String email;
    public String name;
    public String lastname;
    public boolean isValid;

    public Userlogin(String password, String email, String name, String lastname){
        validateNullField(password, email, name, lastname);
        validatePassword(password);
        validateEmail(email);
        if(isValid){
            this.password=password;
            this.email=email;
            this.name=name;
            this.lastname=lastname;
        }
    }

    private void validateNullField(String password, String email, String name, String lastname){
        if(password==null || email==null || name==null || lastname==null){
            System.out.println("No puede estar vacío");
            isValid=false;
        }
    }

    private void validatePassword (String password) {
        if(password.length()>12){
            System.out.println("La contraseña no debe tener más de 12 carácteres");
            isValid=false;
        }
    }

    private void validateEmail(String email){
        int contador=0;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                contador+=1;
            }
        }
        if(contador>1 || contador==0){
            System.out.println("El correo debe contener un solo @");
            isValid=false;
        }
    }
}
