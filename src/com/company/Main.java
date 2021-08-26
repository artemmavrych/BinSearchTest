package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
            Integer[] array={5,9,13,18,20,35,80};
            System.out.println(ArrBinSearch.BinSearch(array,18));
    }
}

class ArrBinSearch{
    public static <T extends Number> int BinSearch(T[] inputArray, T searchNubmer) {
        return Binary(inputArray, searchNubmer,0, inputArray.length-1 );
        }
    private static<T extends Number> int Binary(T[] inputArray, T searchNubmer,int start, int end ){
        int startIndex=start;
        int endIndex=end;
        int midIndex = (endIndex+startIndex) / 2;
        if(endIndex==0) return -1;
        if (inputArray[midIndex].doubleValue() > searchNubmer.doubleValue()) {
            endIndex = midIndex;
            return Binary(inputArray, searchNubmer, startIndex, endIndex );

        } else if (inputArray[midIndex].doubleValue() < searchNubmer.doubleValue()) {
            startIndex = midIndex;
            if(startIndex==endIndex) return -1;
            if((endIndex-startIndex)==1) return Binary(inputArray, searchNubmer, endIndex, endIndex);
            return Binary(inputArray, searchNubmer, startIndex, endIndex);
        }
        else if(inputArray[midIndex].doubleValue() == searchNubmer.doubleValue()){
            return midIndex;
        }
        //else
        else return -1;
    }


}
