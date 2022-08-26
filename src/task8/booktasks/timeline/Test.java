package task8.booktasks.timeline;

public class Test {

    public static void main(String[] args) {

        Timeline timeline1 = new Timeline(1, 45, 30);
        Timeline timeline2 = new Timeline(125425);
        Timeline.print(timeline1.compareTo(timeline2));
    }
}
