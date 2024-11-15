/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */
public class student{
    String name;
    String year;
    double gpa;
    int id;
    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    
    //new method
    void honorRoll(){
        if(this.gpa > 3.6){
            System.out.println(name + " is a honors roll student.");
        } else{
            System.out.println(name + " is not a honors roll student.");
        }
    }
    
    
    //new method
    void freeLunch(){
        if(this.id == 2345){
            System.out.println("You get a free lunch!!");
        } else{
            System.out.println("You don't get a free lunch :(");
        }
    }

}
