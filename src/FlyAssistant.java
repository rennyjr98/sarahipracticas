void main(){
    int option=-1;
    Scanner scanner=new Scanner(System.in);
    Airplane airplane=new Airplane("avionrene");

    do{
        System.out.println("Bienvenido a nuestro asistente de vuelo, por favor elija una opcion:");
        System.out.println("1) asignar asiento\n2) desagsinar asiento\n0) salir");
        System.out.print("Ingrese su opcion: ");
        option=scanner.nextInt();
        System.out.println("\n\n");

        switch (option){
            case 1:assignSeats(airplane, scanner);
            break;
            case 2:unassignSeats(airplane, scanner);
                break;
        }

        airplane.watchSeats();
    }while(option!=0);
}

void assignSeats(Airplane airplane, Scanner s1){
    System.out.print("Ingrese numero de fila: ");
    int row=s1.nextInt();
    System.out.print("Ingrese el numero de columna: ");
    int col=s1.nextInt();
    airplane.assignSeat(row, col);
}
void unassignSeats(Airplane airplane, Scanner s1){
    System.out.print("Ingrese numero de fila: ");
    int row=s1.nextInt();
    System.out.print("Ingrese el numero de columna: ");
    int col=s1.nextInt();
    airplane.unassignSeat(row, col);
}
