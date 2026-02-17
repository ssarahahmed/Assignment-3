import java.util.ArrayList;

public class Problem2 {

private Problem1Song[] songs;
private int size;
private int maxSize;

    public Problem2(){
        maxSize = 10;
        size = 0;
        songs = new Problem1Song[maxSize];

    }

    public void addy(Problem1Song p) {
        if (size == maxSize) {
            maxSize = maxSize * 2;
            Problem1Song[] temp = new Problem1Song[maxSize];
            for (int i = 0; i < size; i++) {
                temp[i] = songs[i];
            }
            songs = temp;
        }

        songs[size] = p;
        size++;
    }
        public void removy(int pos){
            for (int i = pos; i < size -1; i++){
                songs[i] = songs[i+1];
            }
            size --;
        }

        public String toString(){
            String result = "";
            for( int i = 0; i < size; i++){
                result = result + songs[i] + "\n";

            }
        return result;
        }

}
