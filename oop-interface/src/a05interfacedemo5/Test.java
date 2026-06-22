package a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        PingPongSporter pingPongSporter = new PingPongSporter("乒乓运动员小白", 29);

        System.out.println(pingPongSporter.getName() + ", " + pingPongSporter.getAge());
        pingPongSporter.study();
        pingPongSporter.speakEnglish();

        line();

        BasketballSporter basketballSporter = new BasketballSporter("篮球运动员坤坤", 25);

        System.out.println(basketballSporter.getName() + ", " + basketballSporter.getAge());
        basketballSporter.study();

        line();

        PingPongCoach pingPongCoach = new PingPongCoach("乒乓球教练小庞", 35);

        System.out.println(pingPongCoach.getName() + ", " + pingPongCoach.getAge());
        pingPongCoach.teach();
        pingPongCoach.speakEnglish();

        line();

        BasketballCoach basketballCoach = new BasketballCoach("篮球教练大坤", 24);

        System.out.println(basketballCoach.getName() + ", " + basketballCoach.getAge());
        basketballCoach.teach();
    }

    public static void line() {
        for (int i = 0; i < 25; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
