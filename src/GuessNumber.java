void main(){
    int secretnum=(int)(Math.random()*100+1);
    int number=-1;
    Scanner scanner=new Scanner(System.in);

    do{
        System.out.println("Adivina el número");
        System.out.print("Escribe el número secreto:");
        secretNumber(number=scanner.nextInt(), secretnum);
        System.out.println("\n");
    }while(number!=secretnum);
}

void secretNumber(int number, int secretnum){
    if(number<secretnum){
        System.out.println("Muy bajo");
    }
    else if(number>secretnum) {
        System.out.println("Muy alto");
    }else{
        System.out.println("¡Correcto!");
    }
}