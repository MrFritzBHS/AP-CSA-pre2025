class Main {
    public static void main(String[] args) {
        int[] values = {17, 34, 56, 2, 19, 100, 151, 156};

        // call the static methods below to test them
    }

    public static void printOdds(int[] numbers) {


        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 1)
                System.out.println(numbers[i] + " is odd");
        }

        // rewrite as for : each loop below:

    }

    public static int findMax(int[] numbers) {
        int maxSoFar = numbers[0];

        for (int num: numbers)  
        { 
            if (num > maxSoFar) 
            { 
                maxSoFar = num; 
            } 
        } 

        // for each loop to rewrite as for loop below
        return maxSoFar; 
    }

    public static double getAverage(int[] numbers) {

        // index-based for-loop goes here

        // for : each for printing goes here 

        return 0.0;
    }

    public static void printClassRoster() {
        Student julian = new Student("Julian", "Jones", 9);
        Student larisa = new Student("Larisa", "Torres", 10);
        Student amada = new Student("Amada", "Robin", 10);
        Student mikka = new Student("Mikka", "Leads", 9);
        Student jay = new Student("Jay", "Khalil", 10);

        Student[] classroom = {julian, larisa, amada, mikka, jay};

        // index-based for-loop goes here

        // for : each for printing goes here 

    }
}
