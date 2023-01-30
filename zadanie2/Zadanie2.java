package zadanie2;


public class Zadanie2 {
    public static <T> void print(T[] array){
        for(int i = 0;i< array.length;i++){
            if(i <= array.length-1){
                System.out.println(array[i] + ", ");

            }else {
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args){
        String[] array = {"abc","def","ghj"};
        print(array);
    }
}
