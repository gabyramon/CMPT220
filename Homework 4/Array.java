
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class Array {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :(
       
        int n = myArray.length;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j = i + 1; j < n; j++ ){
                if(myArray[i] == myArray[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count > 1){
                System.out.println(myArray[i] + ": " + count + " times");
            }
        }

    }
}
