void main (){
    /*Scanner scanner=new Scanner(System.in);
    System.out.println("Ingrese su opción");
    String opcion=scanner.next();
    System.out.println("Resultado: "+quieneselganador(opcion));*/
    Persona sarahi=new Persona();
    Persona rene=new Persona(27,"Rene",1.80);
    System.out.println(sarahi);
    System.out.println(rene);

}
String seleccionarOpcion (){
    double seleccion=Math.random();
    if (seleccion>.70){
        return "Papel";
    }
    else if (seleccion>.30){
        return "Piedra";
    }
    else{
        return "Tijera";
    }
}

String quieneselganador (String opcion){
    String opcionmaquina=seleccionarOpcion();
    System.out.println("La máquina escogió: "+opcionmaquina);
    if (opcion.equals("Papel")){
        if (opcionmaquina.equals("Papel")){
            return "Empate";
        }
        else if (opcionmaquina.equals("Tijera")){
            return "Perdiste";
        }
        else{
            return "Ganaste";}
    }
    else if (opcion.equals("Tijera")) {
        if (opcionmaquina.equals("Papel")) {
            return "Ganaste";
        }
        else if (opcionmaquina.equals("Piedra")) {
            return "Perdiste";
        }
        else {
            return "Empate";
        }
    }
    else if (opcion.equals("Piedra")){
        if (opcionmaquina.equals("Papel")){
            return "Perdiste";
        }
        else if (opcionmaquina.equals("Piedra")){
            return "Empate";
        }
        else{
            return "Ganaste";
        }
    }
    return "Tramposo";
}
