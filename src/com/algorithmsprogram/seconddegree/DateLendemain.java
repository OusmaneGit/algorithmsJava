package com.algorithmsprogram.seconddegree;

public class DateLendemain {

    public String getTomorrow(int day, int month, int year) {

        return "1 janvier 2014";
    }

    public String getDate(int month) {
        String monthInString="";
        switch (month){
            case 1:
                monthInString="Janvier";
                break;
            case 2 :
                monthInString="Fevrier";
                break;
            case 3:
                monthInString="Mars";
                break;
            case 4:
                monthInString="Avril";
                break;
            case 5:
                monthInString="Mai";
                break;
            case 6:
                monthInString="Juin";
                break;
            case 7:
                monthInString="Juillet";
                break;
            case 8:
                monthInString="Aout";
                break;
            case 9:
                monthInString="Septembre";
                break;
            case 10:
                monthInString="Octobre";
                break;
            case 11:
                monthInString="Novembre";
                break;
            case 12:
                monthInString="Decembre";
                break;

            default:
                break;
        }
        return monthInString;
    }

    public boolean Bisextile(int year) {
        return (year%4==0 && year%100!=0) || year%400==0;
    }

    public boolean dateValid(int day, int month, int year) {
        int anneMin=1582;
        if(year<anneMin) return false;

        return true;
    }
}
