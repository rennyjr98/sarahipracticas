void main(){
    int[] listadenumeros=new int[10];
    System.out.println(listadenumeros[9]);
    listadenumeros[0]=0;
    listadenumeros[1]=1;
    listadenumeros[2]=2;
    listadenumeros[3]=3;
    listadenumeros[4]=5;
    listadenumeros[5]=8;
    listadenumeros[6]=4;
    listadenumeros[7]=13;
    listadenumeros[8]=10;
    listadenumeros[9]=67;
    int[] listadenumeros1=new int[10];
    System.out.println(average(listadenumeros1));
    System.out.println(getNumber(11,listadenumeros));
    even(listadenumeros);
    User[] users=new User[5];
    users[0]=new User("id1","masculino",21,"Hernán");
    users[1]=new User("id2","Femenino", 18,"Ana");
    users[2]=new User("id3","Femenino", 19,"Lucia");
    users[3]=new User("id4","Masculino", 23,"José");
    users[4]=new User("id5","Femenino", 28,"María");
    System.out.println(getName("id6", users));
}
float average(int[] listadenumeros){
    int sumOfList=0;
    for(int i=0;i<listadenumeros.length;i++){
        sumOfList+=listadenumeros[i];
        //sumOfList=listadenumeros[i]+sumOfList;
    }
    return (float)sumOfList/listadenumeros.length;
}
int getNumber (int num, int[] listadenumeros){
    for(int i=0;i<listadenumeros.length;i++){
        if(num==listadenumeros[i]){
            return i;
        }
    }return -1;
}
void even(int[] listadenumeros){
    for(int i=0;i<listadenumeros.length;i++){
        if(i%2==0){
            System.out.println(listadenumeros[i]);
        }
    }
}
String getName(String ID, User[] users){
    for(int i=0;i<users.length;i++){
        if(ID.equals(users[i].getID())){
            return users[i].getName();
        }
    }return null;
}