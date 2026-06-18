//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //double sarahidiv=division(suma(20,5),5);
    //int sarahiedad=suma(suma(5,5),5);
    float sarahiedad1=15.5f;
    double sarahiedad2=15.5;
    char sarahichart='w';
    //int sarahinuevo=suma(6,5);
    String sarahinombre="Sarahi Parada Luquin"+5;
    //sarahiedad2=sarahiedad+sarahiedad1;
    //System.out.println(obtenernombreedad(sarahinombre,sarahiedad)+" "+sarahidiv);

    int a=5;
    a=a+5;
    a+=5;
    a*=5;
    String hola="hola";
    hola+=" hola tioxd";
    hola+=5;
    System.out.println("tuedad: "+tuedad(-1));
    System.out.println(clientadminotrabajador("Cliente"));
    System.out.println(wasd('s'));
    System.out.println(obtenernumdelnombre(null));
}

int sumapositivos(int a,int b){
    System.out.println("Suma");
    boolean espositivo=true;
    if (a<0){
        espositivo=false;
    }
    if (b<0){
        espositivo=false;
    }

    return espositivo==true ? a+b : -1;


}
int sumanegativos(int a,int b){
    System.out.println("Suma");
    boolean esnegativo=true;
    if (a>=0){
        esnegativo=false;
    }
    if (b>=0){
        esnegativo=false;
    }
    if (esnegativo==true){
        return a+b;
    }
    else {
        return 1;
    }
}

String obtenernombreedad(String nombre,int edad){
    return nombre+": "+edad;
}

double division(int a, int b){
    System.out.println("Division");
    return a/b;
}

String tuedad (int edad){
    if (edad<=12)
        return "es un niño";
    else if (edad>12 && edad<=18)
        return "es un joven";
    else
        return "es un adulto";
}
String clientadminotrabajador (String rol){
    if (rol.equalsIgnoreCase("cliente"))
        return "Cliente";
    if (rol.equalsIgnoreCase("administrador"))
        return "Administrador";
    if (rol.equalsIgnoreCase("trabajador"))
        return "Trabajador";
    return null;
}

double formulaPerimetro(double d){
      return 3.1416*d;
}

double formulaP (double r){
    return 2*3.1416*r;
}

String wasd (char tecla){
    if (tecla=='w')
        return "Arriba";
    if (tecla=='a')
        return "Izquierda";
    if (tecla=='s')
        return "Abajo";
    if (tecla=='d')
        return "Derecha";
    return null;
}

int obtenernumdelnombre (String nombre){
    if (nombre==null)
        return -1;
    if (nombre.equalsIgnoreCase("Sarahi"))
        return 1;
    return 0;
}