package ch01_20221004;

public class EvenOrOdd {
    String evenOrOdd(int num) {
        String result = "";
        if(num % 2 == 1){
            result = "Odd";
        }else{
            result = "Even";
        }
        return result;
    }
}
