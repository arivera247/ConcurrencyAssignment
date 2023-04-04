public class RNG {
    public static int createRandomNumber (){
        int max = 10, min = 1;
        int newRandomNumber;

        newRandomNumber = (min + (int)(Math.random() * ((max - min) + 1)));
        return newRandomNumber;
        //FIXED - The random number was not being returned. Typo where "max" was returned.

        //Create unit test to check if the random number is within the range of 1-10.
    }
}

//Reference: https://www.geeksforgeeks.org/generating-random-numbers-in-java/
