void main(){
    System.out.println("Bienvenido a Disneyland");
    System.out.println(taquilla(100,2));
    System.out.println(guardiaseguridad(2, 3));
    System.out.println(esperarenfila(3,3));
}
String taquilla (float dinero, int boletos){
     int precioboleto=10;
     int preciototal=precioboleto*boletos;
     if (preciototal>dinero){
         return "No te alcanza bruh";
     }
     else{
         return "Si te alcanza, pagaste "+preciototal+ " Te sobro "+(dinero-preciototal);
     }
}
String guardiaseguridad (int boletos, int personas){
    if (boletos<personas){
        return "No pueden pasar";
    }
    else if (boletos==personas && personas>0){
        return "Pueden pasar";
    }
    else if (boletos==personas){
        if (personas>0)
            return "Pueden pasar";
        return "No pueden pasar";
    }
    else{
        return "jodansexd";
    }
}

boolean esperarenfila (int posicion, int personas){
    boolean puedoentrar=false;
    int posicionreal=posicion;
    int personasreal=personas;
    while (!puedoentrar){
        if (posicionreal==0 && personasreal==0){
            puedoentrar=true;
        }
        else{
            if (posicionreal<0){
                posicionreal=0;
            }
            else{
                posicionreal--;
            }
            if (personasreal<0){
                personasreal=0;
            }
            else{
                personasreal--;
            }
        }
    }
    return puedoentrar;
}

void ultimociclo (){
    boolean bandera=false;
    do{
        bandera=!bandera;
    }while(bandera);
}