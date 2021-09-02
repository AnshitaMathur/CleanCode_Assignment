public class cleancode {
    static class Number
    {
        int MinNumber;
        int MaxNumber;
    }
    static Number FindNumber (int givenNumberArray[], int arrayLength)
    {
         Number findNumbers = new Number();
        int arrayIndex;
        if (arrayLength == 1)
        {
            findNumbers.MaxNumber = givenNumberArray[0];
            findNumbers.MinNumber = givenNumberArray[0];
            return findNumbers;
        }

        if (givenNumberArray[0] > givenNumberArray[1])
        {
            findNumbers.MaxNumber = givenNumberArray[0];
            findNumbers.MinNumber = givenNumberArray[1];
        }
        else
        {
            findNumbers.MaxNumber = givenNumberArray[0];
            findNumbers.MinNumber = givenNumberArray[1];
        }

        for (arrayIndex = 2; arrayIndex < arrayLength; arrayIndex++)
        {
            if (givenNumberArray[arrayIndex] > findNumbers.MaxNumber)
            {
                findNumbers.MaxNumber = givenNumberArray[arrayIndex];
            }
            else if (givenNumberArray[arrayIndex] < findNumbers.MinNumber)
            {
                findNumbers.MinNumber = givenNumberArray[arrayIndex];
            }
        }

        return findNumbers;
    }

    public static void main(String []args)
    {
        int givenNumberArray[] = {1000, 11, 445, 1, 330, 3000};
        int arrayLength = 6;
        Number findNumbers = FindNumber(givenNumberArray, arrayLength);
        System.out.printf("\n Minimum Number : %d", findNumbers.MinNumber);
        System.out.printf("\n Maximum Number : %d", findNumbers.MaxNumber);
    }
}
