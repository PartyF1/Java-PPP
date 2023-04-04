package com.mycompany.ppp;

class Lab1 {
    public static void render(int n, int a, int b) {
        System.out.println("№  Пара  Перерыв");
        int time = 480;
        for (int i = 1; i <= n; i++) {
            int timeAfterPair = time + a;
            String minutesBefore;
            if (time%60 == 0) {
                minutesBefore = "00";
            } else if (time%60 < 10){
                minutesBefore = "0"+time%60;
            } else {
                minutesBefore = Integer.toString(time%60);
            }
            String minutesAfter;
            if (timeAfterPair%60 == 0) {
                minutesAfter = "00";
            } else if (timeAfterPair%60 < 10){
                minutesAfter = "0"+timeAfterPair%60;
            } else {
                minutesAfter = Integer.toString(timeAfterPair%60);
            }
            System.out.println(i +"   " + 
                    Integer.toString(time/60)+":"+minutesBefore + "  " + 
                    Integer.toString(timeAfterPair/60)+":"+minutesAfter
            );
            time = timeAfterPair + b;
        }
    }
}
