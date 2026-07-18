void main(){
    int[] arreglo=new int[10];
    arreglo[0]=5;
    arreglo[1]=5;
    arreglo[5]=5;
    arreglo[3]=5;
    arreglo[0]=2;
    System.out.println(arreglo[0]+" "+arreglo[5]);

    Dog perro1=new Dog();
    Dog perro2=new Dog();
    Dog[] perros=new Dog[5];
    perros[2]=perro1;
    perros[4]=perro1;
    perros[0]=perro1;
    perros[1]=perro2;
    perros[0].name="Max";
    System.out.println(perros[4].name);
    System.out.println(perros[1].name);

    for(int i=0;i<10;i++){
        System.out.println(arreglo[i]);
    }

    for(int i=0;i<5;i++){
        if(perros[i]!=null)
            System.out.println(perros[i].name);
    }

    int[][] matriz1=new int[5][5];
    matriz1[1][3]=8;
    for(int i=0;i<matriz1.length;i++){
        for(int j=0;j<matriz1[0].length;j++){
            System.out.print("["+ matriz1[i][j]+"] ");
        }
        System.out.println();
    }
}

void n(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}