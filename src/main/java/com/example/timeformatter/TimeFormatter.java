package com.example.timeformatter;

import java.util.Scanner;

public class TimeFormatter {

    private final static String[] SPOKEN_NUMBERS = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
            "twenty six", "twenty seven", "twenty eight", "twenty nine"
    };

    public String convertIntoWords(int hours, int minutes) {
        if (hours == 0 && minutes == 0) {
            return "midnight";
        } else if (hours == 12 && minutes == 0) {
            return "twelve noon";
        } else if (hours == 12 && minutes == 1) {
            return "one minute past noon";
        } else if (hours == 0 && minutes == 1) {
            return "one minute past midnight";
        } else if (hours == 23 && minutes == 59) {
            return "one minute to midnight";
        } else if (minutes == 0) {
            return spokenNumber(normalizedHour(hours)) + " o'clock";
        } else if (minutes == 1) {
            return "one minute past " + spokenTime(hours);
        } else if (minutes == 59) {
            return "one minute to " + spokenTime(hours + 1);
        } else if (minutes == 15) {
            return "quarter past " + spokenTime(hours);
        } else if (minutes == 30) {
            return "half past " + spokenTime(hours);
        } else if (minutes == 45) {
            return "quarter to " + spokenTime(hours + 1);
        } else if (minutes <= 30) {
            return spokenNumber(minutes) + " minutes past " + spokenTime(hours);
        } else {
            return spokenNumber(60 - minutes) + " minutes to " + spokenTime(hours + 1);
        }
    }

    private String spokenTime(int hours) {
        if (hours == 12) {
            return "noon";
        } else if (hours == 0 || hours == 24) {
            return "midnight";
        }
        return spokenNumber(normalizedHour(hours));
    }

    private int normalizedHour(int hours) {
        return (hours % 12 == 0) ? 12 : hours % 12;
    }

    private String spokenNumber(int number) {
        if (number < 0 || number > 29) return "";
        return SPOKEN_NUMBERS[number];
    }

    // Main method to prompt the user for input and print formatted time
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeFormatter formatter = new TimeFormatter();

        while (true) {
            System.out.println("Enter hours (negative number to quit): ");
            int hours = scanner.nextInt();
            if (hours < 0) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Enter minutes: ");
            int minutes = scanner.nextInt();

            if (minutes < 0 || minutes >= 60) {
                System.out.println("Invalid input for minutes. Please enter a value between 0 and 59.");
                continue;
            }

            // Output the formatted time
            String formattedTime = formatter.convertIntoWords(hours, minutes);
            System.out.println("Formatted time: " + formattedTime);
        }

        scanner.close();
    }
}
