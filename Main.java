class Main {
    public static void main(String args[]) throws InterruptedException{
     for(int i=1; i<=100; i++){
       // Put a delay of 100 milliseconds between each call to print in order
        Thread.sleep(100);
        printFizzBuzz(i);
     }
    }
    
    // Function to print either Fizz, Buzz or FizzBuzz/BuzzFizz or number itself 
    private static void printFizzBuzz(int number){
        String word = getWordFromNumber(number);
        
        // Returned word is blank(i.e., it neither contains digit 3 or 5)
        if(word.equals("")){
          word = Integer.toString(number);
        }
        System.out.println("Number "+number+" -> "+word);
    }
    
    // Get individual digits from number and assign either Fizz or Buzz or combination
    private static String getWordFromNumber(int number){
        StringBuilder word = new StringBuilder();

        // Get individual digits of the number
        while(number>0){
            int digit = number%10;
            switch(digit){
                case 3:{
                  // If word already doesn't contain Fizz, append Fizz at 0th position
                  // For special case of 33
                  if(word.indexOf("Fizz") == -1)
                    word.insert(0, "Fizz");
                  break;
                }
                case 5:{
                  // If word already doesn't contain Buzz, append Buzz at 0th position
                  // For special case of 55
                    if(word.indexOf("Buzz") == -1)
                      word.insert(0, "Buzz");
                    break;
                }
            }
            number = number/10;
        }
        return word.toString();
    }
}