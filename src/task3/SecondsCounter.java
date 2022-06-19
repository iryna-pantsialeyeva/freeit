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
        int secondsInHour = 3600;
        int secondsInMinute = 60;
        int secondsInDay = 86400;
        int secondsInWeek = 604800;
        System.out.println(seconds / secondsInMinute + " + " + seconds % secondsInMinute);
        System.out.println(seconds / secondsInHour + " + " + (seconds % secondsInHour) / secondsInMinute +
                " + " + (seconds % secondsInHour) % secondsInMinute);
        System.out.println(seconds / secondsInDay + " + " + (seconds % secondsInDay / secondsInHour) + " + " +
                ((seconds % secondsInDay % secondsInHour) / secondsInMinute) + " + " + ((seconds % secondsInDay %
                secondsInHour) % secondsInMinute));
        System.out.println(seconds / secondsInWeek + " + " + seconds % secondsInWeek / secondsInDay + " + " +
                (seconds % secondsInWeek % secondsInDay) / secondsInHour + " + " + ((seconds % secondsInWeek %
                secondsInDay) % secondsInHour) / secondsInMinute + " + " + ((seconds % secondsInWeek %
                secondsInDay) % secondsInHour) % secondsInMinute);
    }

}