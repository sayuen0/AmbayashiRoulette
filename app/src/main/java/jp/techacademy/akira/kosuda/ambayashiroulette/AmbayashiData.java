package jp.techacademy.akira.kosuda.ambayashiroulette;

/**
 * Created by aki on 2018/04/08.
 */

// TODO: 2018/04/08 位置111から再開 
public class AmbayashiData {
    private int number;
    private int addition;
    private String comment;

    public AmbayashiData(int number, int addition, String comment){
        this.number=number;
        this.addition= addition;
        this.comment=comment;
    }

    public int getNumber() {
        return number;
    }
    public int getAddition(){
        return addition;
    }
    public  String getComment(){
        return comment;
    }

}
