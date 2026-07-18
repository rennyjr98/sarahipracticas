public class Airplane {
    private String name;
    private int[][] seats;

    public Airplane(String name){
        seats=new int [8][2];
        this.name=name;
    }

    public void assignSeat(int row, int col){
        if(verifySeat(row, col)){
            return;
        }
        if (seats[row][col] == 0) {
            seats[row][col]=1;
        }else{
            System.out.println("not available");
        }
    }

    public void unassignSeat(int row, int col){
        if (verifySeat(row, col)){
            return;
        }
        if(seats[row][col]==1){
            seats[row][col]=0;
        }else{
            System.out.println("seat already empty");
        }
    }

    private boolean verifySeat (int row, int col){
        if(seats.length<row || row<0){
            System.out.println("not exist");
            return true;
        }
        if(seats[0].length<col || col<0) {
            System.out.println("not exist");
            return true;
        }
        return false;
    }

    public void watchSeats (){
        System.out.println();
        for(int i=0;i<seats.length;i++){
            for(int j=0;j<seats[0].length;j++){
                System.out.print("["+ seats[i][j]+ "] ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
