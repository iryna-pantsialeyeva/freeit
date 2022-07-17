package task8.booktasks.timeline;

/* Задание 24 (Book, Part 2, P. 25). Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе
                                     должен задаваться тремя свойствами: секундами, минутами, часами.
                                     Сделать методы для получения полного количества секунд в объекте, сравнения
                                     двух объектов (метод должен работать аналогично compareTo в строках). Создать
                                     два конструктора: получающий общее количество секунд, и часы, минуты и секунды
                                     по отдельности. Сделать метод для вывода данных.  */

public class Timeline {

    private int hour;
    private int min;
    private int sec;

    public Timeline(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Timeline(int sec) {
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public int calculateSeconds() {
        return (((this.hour * 60) + this.min) * 60 + this.sec);
    }

    public int compareTo(Timeline timeline) {
        int index = this.calculateSeconds() - timeline.calculateSeconds();
        return index;
    }

    public static void print(int index) {
        if (index > 0) {
            System.out.println("timeline1  >  timeline2");
        } else if (index < 0) {
            System.out.println("timeline1  <  timeline2");
        } else {
            System.out.println("timeline1  =  timeline2");
        }
    }
}


