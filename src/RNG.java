public class RNG {
    public static int createRandomNumber (){
        int max = 10, min = 1;
        int newRandomNumber;

        newRandomNumber = (min + (int)(Math.random() * ((max - min) + 1)));
        return newRandomNumber;
        //FIXED - The random number was not being returned. Typo where "max" was returned.
    }
}

//Reference: https://www.geeksforgeeks.org/generating-random-numbers-in-java/
