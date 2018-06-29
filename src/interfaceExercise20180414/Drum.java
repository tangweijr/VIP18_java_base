package interfaceExercise20180414;

public class Drum extends Percussion {
    @Override
    public String toString() {
        return "Drum";
    }

    @Override
    public void adjust() {
        super.adjust();
        System.out.println("架子鼓的调子一般比较常见");
    }
}
