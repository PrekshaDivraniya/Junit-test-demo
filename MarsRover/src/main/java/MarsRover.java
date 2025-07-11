public class MarsRover {

    private int x;
    private int y;
    private String[] direction = {"N", "E", "S", "W"} ;
    private int index = 0;

    MarsRover(int x, int y, String direction){
        this.x = x;
        this.y = y;
        switch (direction){
            case "N": index = 0;break;
            case "S": index = 2;break;
            case "E": index = 1;break;
            case "W": index = 3;break;
        }
    }

    public String getPosition(){
        return x + " " + y + " " + direction[index];
    }

    public void execute(String moves){
        for(char move : moves.toCharArray()){
            if(move != 'M' && move != 'R' && move != 'L'){
                System.out.println("Ignored unknown command: " + move);
                continue;
            }
            switch (move){
                case 'M' : move(); break;
                case 'L' : turnLeft(); break;
                case 'R' : turnRight(); break;
            }
        }
    }

    public void move(){
        switch (index){
            case 0 : y++; break;
            case 2 : y--; break;
            case 1 : x++; break;
            case 3 : x--; break;
        }
    }

    public void turnLeft(){
        index = (index + 3) % 4;
    }

    public void turnRight(){
        index = (index + 1) % 4;
    }
}
