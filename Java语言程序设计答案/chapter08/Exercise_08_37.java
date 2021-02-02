package chapter08;

import java.util.Scanner;

public class Exercise_08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] stateAndCapitalName = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" },
                { "Arizona", "Phoenix" }, { "Arkansas", "Little Rock" }, { "California", "Sacramento" },
                { "Colorado", "Denver" }, { "Connecticut", "Hartford" }, { "Delaware", "Dover" },
                { "Florida", "Tallahassee" }, { "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" },
                { "Illinois", "Springfield" }, { "Indiana", "Indianapolis" }, { "Iowa Des", "Moines" },
                { "Kansas", "Topeka" }, { "Kentucky", "Frankfort" }, { "Louisiana", "Baton Rouge" },
                { "Maine", "Augusta" }, { "Maryland", "Annapolis" }, { "Massachusetts", "Boston" },
                { "Michigan", "Lansing" }, { "Minnesota", "Saint Paul" }, { "Mississippi", "Jackson" },
                { "Missouri", "Jefferson City" }, { "Montana", "Helena" }, { "Nebraska", "Lincoln" },
                { "Nevada	", "Carson City" }, { "New Hampshire", "Concord" }, { "New Jersey", "Trenton" },
                { "New Mexico", "Santa Fe" }, { "New York", "Albany" }, { "North Carolina", "Raleigh" },
                { "North Dakota", "Bismarck" }, { "Ohio", "Columbus" }, { "Oklahoma", "Oklahoma City" },
                { "Oregon", "Salem" }, { "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" },
                { "South Carolina", "Columbia" }, { "South Dakota", "Pierre" }, { "Tennessee", "Nashville" },
                { "Texas", "Austin" }, { "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" },
                { "Virginia", "Richmond" }, { "Washington", "Olympia" }, { "West Virginia", "Charleston" },
                { "Wisconsin", "Madison" }, { "Wyoming", "Cheyenne" } };

        System.out.println("The correct count is " + correctNumber(stateAndCapitalName));

        input.close();
    }

    public static int correctNumber(String[][] stateAndCapitalName) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < stateAndCapitalName.length; i++) {
            System.out.print("What is the capital of " + stateAndCapitalName[i][0] + "? ");
            String capitalName = input.nextLine();

            if (stateAndCapitalName[i][1].toLowerCase().equals(capitalName.toLowerCase())) {
                count++;
                System.out.println("Your answer is correct");
            } else {
                System.out.println("The correct answer should be " + stateAndCapitalName[i][1]);
            }
        }

        input.close();

        return count;

    }
}
