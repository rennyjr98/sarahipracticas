void main () {
    System.out.println("Programa que convierte grados Celsius a grados Farenheit");
    System.out.println(formatoentero(gradosfarenheit(20)) + "F");
    System.out.println("Programa que convierte grados Farenheit a grados Celsius");
    System.out.println(formatoentero(gradoscelsius(68))+"C");
}
double suma (double a, double b){
    return a+b;
}
double resta (double a, double b){
    return a-b;
}
double multiplicacion (double a, double b){
    return a*b;
}
double division (double a, double b){
    return a/b;
}

double gradosfarenheit (double c){
    return suma(multiplicacion(c, 1.8),32);
}
double gradoscelsius (double f){
    return division(resta(f,32),1.8);
}

String formato (double a){
    return "Resultado: "+a;
}

String formatoentero (double a){
    int versionentero=(int)a;
    return "Resultado: "+versionentero;
}