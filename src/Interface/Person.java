package Interface;

public class Person implements Footballer, Student { //We have used implement method because if we use extend, in java only one class is allowed to get extended you can't write person extends footballer,student-->If you do this it will give compile time error, to overcome it we use interface instaed of class in student and youtuber and in main method we use implements
    public static void main(String[] args) {
        Person p = new Person();
        p.play();   //So with the use of this person has both
        p.study();  //Play and study --> Play from footballer interface and study from student interface --> This is similar to multiple inheritance you can say! :D

    }

    @Override
    public void play() {
        System.out.println("He is playing");
    }

    @Override
    public void study() {
        System.out.println("He is studying");
    }
}
