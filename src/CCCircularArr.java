public class CCCircularArr {
    public CCCircularArr() {

        String[] weekDays = { "må", "ti", "on", "to", "fr", "lö", "sö" };

        //Använd addition direkt i index för att räkna ut kommande dagar:
        int today = 3; // torsdag
        System.out.printf("I dag är det %s\n",weekDays[today]);
        System.out.printf("I övermorgon är det %s\n", weekDays[today+2]);
        System.out.printf("Om fem dagar är det %s\n", weekDays[(today+5) % weekDays.length]);
        System.out.printf("Om 20 dagar är det %s\n", weekDays[(today+20) % weekDays.length]);

    }
}
