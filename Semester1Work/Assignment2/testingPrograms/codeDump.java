




while(finishSubListPosition + 1 < (numberOfChromosomes * (chromosomeSize + 1))) {
        binaryOneCount = 0;
        ArrayList<Character> binarySubList = new ArrayList<Character>(binaryList.subList(startSubListPosition, finishSubListPosition+1));
        for (int i = 0; i < binarySubList.size(); i++) {
            char binaryExamineValue = binarySubList.get(i);
            if (binaryExamineValue == '1') {
                binaryOneCount++;
            }
        }
        // offets to deal with
        String binaryOneCountString = Integer.toString(binaryOneCount);

        char binaryOneCountCharacter = binaryOneCountString.charAt(0);
        binaryList.add((finishSubListPosition+1), binaryOneCountCharacter);
        startSubListPosition = finishSubListPosition + 2;
        finishSubListPosition = finishSubListPosition + (chromosomeSize+1);

    }
    String lookAt = "";
    for (int i = 0; i < binarySortList.size(); i++) {
        lookAt = binarySortList.get(i);
        for (int j = 0; j < lookAt.length(); j++) {
            char addToList = lookAt.charAt(j);
            binaryList.add(addToList);
        }

    }
    int startRemoval = ((chromosomeSize+1) * (numberOfChromosomes) - 1);
    while(startRemoval >= chromosomeSize) {

        System.out.print(startRemoval);
        binaryList.remove(startRemoval);
        startRemoval = startRemoval - (chromosomeSize + 1);


    }
    // prints list with fitness values removed
    System.out.print(binaryList);
char value = binaryList.get(j);
            if (value == '1') {
                binaryCount++;
            }
            subStringWithoutRanking = subStringWithoutRanking + value;

        if (subStringWithoutRanking.length() == (chromosomeSize)) {
            String binaryCounttobeadded = Integer.toString(binaryCount);
            subString = binaryCounttobeadded + subStringWithoutRanking;

        binarySortList.add(subString);
        subString = "";
        binaryCount = 0;
        subStringWithoutRanking = "";
    }
    }
for(int j = 0; j < binaryList.size(); j++) {

            char value = binaryList.get(j);
            if (value == '1') {
                binaryCount++;
            }
            subStringWithoutRanking = subStringWithoutRanking + value;


        if (subStringWithoutRanking.length() == (chromosomeSize)) {
            String binaryCounttobeadded = Integer.toString(binaryCount);
            subString = binaryCounttobeadded + subStringWithoutRanking;

        binarySortList.add(subString);
        subString = "";
        binaryCount = 0;
        subStringWithoutRanking = "";
    }

    }
Collections.sort(binarySortList);

    System.out.print(binarySortList);
    ArrayList<String> finalList = new ArrayList<String>();
    subString = "";
    newString = "";
    for (int i = 0; i < binarySortList.size(); i++) {
        subString = binarySortList.get(i);
        int startPointRank = subString.length() - chromosomeSize;
        for (int j = startPointRank; j < subString.length(); j++) {
            char chartobeaddedtonewlist = subString.charAt(j);
            newString = newString + chartobeaddedtonewlist;
        }
        finalList.add(newString);
        newString = "";
        startPointRank = 0;
    }
    System.out.print(finalList);
    String bestSample = finalList.get(numberOfChromosomes-1);
    System.out.print(bestSample);

}

ArrayList<Integer> list = new ArrayList<Integer>();
String targetString = "weasel";
String currentString = "James2";
for (int i = 0; i < targetString.length(); i++) {
    char targetStringCompare = targetString.charAt(i);
    char currentStringCompare = currentString.charAt(i);
    int charoperation = targetStringCompare - currentStringCompare;
    int averageChar = Math.abs(charoperation);
    list.add(averageChar);
}
System.out.println(list);
double total = 0;
for (int j = 0; j < list.size(); j++) {
    total += list.get(j);
    System.out.println(total);
}
double average = total/list.size();

double average = 2454533.4545434325623;
double round = Math.round(average);
String roundString = Double.toString(round);
String averageString = Double.toString(average);
String fitness = "";
for (int i = 0; i < roundString.length(); i++) {
    char addToString = averageString.charAt(i);
    fitness = fitness + addToString;
}
return fitness
ArrayList<Character> list = new ArrayList<Character>();
for (int i = 97; i <= 122; i++) {
    char j = (char)i;
    list.add(j);
}
System.out.print(list);
list.remove(5);
System.out.println(list);
list.add(5, 5);
System.out.println(list);
}
/*
private static ArrayList<Character>() InitaalListGeneration (int chromosomeSize) {
    int max = 126;
    int min = 32;

    int randomchar = (Math.random() * ((max - min) + 1)) + min;
}
*/

public static void main(String[] args) {

    ArrayList<Character> list = new ArrayList<Character>();
    int totalsize = 400;
    int max = 126;
    int min = 31;
    int randomchar = 0;
    int i = 1;
    while (i <= totalsize) {
    randomchar = (int)(Math.random() * ((max - min) + 1)) + min;
    char toBeAdded = (char)randomchar;
    list.add(toBeAdded);
    i++;
}

public static final int chromosomeSize = -1;
public static int numberOfChromosomes;
public static double crossOverProbability;
public static double mutationProbability;
//private ArrayList<Character> initialPopulation;
public static String testing(int number) {
    String comment = "";
    if (number < 0) {
        comment = "That is below zero";
    } else if (number > 0 && number <= 100) {
        comment = "That is above 0";
    } else if (number > 100) {
        comment = "That is above 0 and 100";
    } else {
        comment = "The number is 0";
    }
    return comment;
}
}
/*
        if (IsItBinary() == false) {
            double fitnessdouble = 0;

            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < targetedString.length(); i++) {

                char targetStringCompare = targetedString.charAt(i);
                // finds the character at position i of the current string
                char currentStringCompare = individualGene[i].charAt(i);
                // takes away the the targetstirng character from the final string character
                int charoperation = targetStringCompare - currentStringCompare;
                // makes sure the average value is above 0
                int averageChar = Math.abs(charoperation);
                // adds value to a list to later work out average
                list.add(averageChar);
            }
        }
        */
