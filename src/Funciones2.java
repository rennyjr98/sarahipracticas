void main () {
    double Farenheit=gradosfarenheit(20);
    double celsius=gradoscelsius(68);
    System.out.println("Programa que convierte grados Celsius a grados Farenheit");
    System.out.println(formatoentero(Farenheit) + "F "+positivonegativo(Farenheit));
    System.out.println("Programa que convierte grados Farenheit a grados Celsius");
    System.out.println(formatoentero(celsius)+"C "+positivonegativo(celsius));
    imprimedigitos(654544324);
    palabraalreves("sarahi");
    System.out.println(aenunapalabra("sarahi"));
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
String positivonegativo (double a){
    if (a>=0){
        return "Es positivo";
    }
    else{
        return "Es negativo";
    }
}
String paroimpar (double a){
    if (a%2==0){
        return "Es par";
    }
    else{
        return "Es impar";
    }
}
String posiciondecarrera (int a ){
    switch (a) {
        case 1:
            return "Eres el primero";
        case 2:
            return "Eres el segundo";
        case 3:
            return "Eres el tercero";
        case 4:
            return "Eres el cuarto";
        case 5:
            return "Eres el quinto";
        default: return "Invalido";
    }
}
void imprimedigitos(double a){
    String numero=convertirnumeroastring(a);
    System.out.println("Numero tiene "+numero.length()+" digitos");
    for (int i=1;i<numero.length();i++){
        System.out.println(numero.charAt(i-1));
    }
}
String convertirnumeroastring (double a){
    return ""+a;
}

void palabraalreves (String palabra){
    for (int i=palabra.length()-1;i>=0;i--){
        System.out.print(palabra.charAt(i));
    }
    System.out.println();
}

int aenunapalabra (String palabra){
    int contador=0;
    for (int i=0;i<palabra.length();i++){
        if (palabra.charAt(i)=='a'){
            if (contador==0){
                System.out.println("Soy cero");
            }
            contador+=1;
        }

        else if (palabra.charAt(i)=='e'){
                contador+=1;
        }
    }
    return contador;
}

