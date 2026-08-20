double account=1000;
Scanner scanner=new Scanner(System.in);

void main(){
    int option=-1;
    Bank renybank=new Bank();

    do{System.out.println("Cajero automático");
        System.out.println("Opciones:\n1)Consultar saldo\n2)Depositar dinero\n3)Retirar dinero\n4)Salir");
        System.out.print("Elija una opción:");
        option= scanner.nextInt();
        System.out.println("\n");

        switch(option){
            case 1:renybank.printAccount();
            break;
            case 2:
                System.out.print("¿Cuánto dinero desea depositar?:");
                renybank.addMoney(scanner.nextDouble());
            break;
            case 3:
                System.out.print("¿Cuánto dinero desea retirar?:");
                renybank.decreaseMoney(scanner.nextDouble());
            break;
        }
    }while (option!=4);
}

void checkMoney(){
    System.out.println("Usted tiene " + account+ " pesos Guardados");
}

void addMoney(){
    System.out.print("¿Cuánto dinero desea depositar?:");
    double money=scanner.nextDouble();
    account=money+account;
}

void decreaseMoney(){
    System.out.print("¿Cuánto dinero desea retirar?:");
    double money= scanner.nextDouble();

    if(money<=account){
        account=account-money;
    }else{
        System.out.println("Error, no tiene suficiente dinero");
    }
}
