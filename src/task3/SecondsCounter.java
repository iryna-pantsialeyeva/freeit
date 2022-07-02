package task3;

/* Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
    А) минут + секунд,
    В) часов + минут + секунд,
    С) дней + часов + минут + секунд,
    D) недель + дней + часов + минут + секунд.
    по аналогии с примером выше */
public class SecondsCounter {

    public static void main(String[] args) {
        int seconds = 4500;
        int secondsInMinute = 60;
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInWeek = 7;

        System.out.println("A) " + seconds / secondsInMinute + " + " + seconds % secondsInMinute);
        System.out.println("B) " + seconds / (secondsInMinute * minutesInHour) + " + " +
                (seconds % (secondsInMinute * minutesInHour) / secondsInMinute) + " + " +
                (seconds % (secondsInMinute * minutesInHour) % secondsInMinute));
        System.out.println("C) " + seconds / (secondsInMinute * minutesInHour * hoursInDay) + " + " +
                (seconds / (secondsInMinute * minutesInHour)) + " + " +
                (seconds % (secondsInMinute * minutesInHour) / secondsInMinute) + " + " +
                (seconds % (secondsInMinute * minutesInHour) % secondsInMinute));
        System.out.println("D) " + seconds / (secondsInMinute * minutesInHour * hoursInDay * daysInWeek) + " + " +
                seconds / (secondsInMinute * minutesInHour * hoursInDay) + " + " +
                (seconds / (secondsInMinute * minutesInHour)) + " + " +
                (seconds % (secondsInMinute * minutesInHour) / secondsInMinute) + " + " +
                (seconds % (secondsInMinute * minutesInHour) % secondsInMinute));
    }

}