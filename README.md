# FizzBuzzESI
Assignment:  Write a program that prints the numbers from 1 to 100.  For numbers containing the digit '3' print "Fizz" instead of the number.  For numbers containing the digit '5' print "Buzz". For numbers containing both digit ‘3’ and digit ‘5’ print “FizzBuzz” or “BuzzFizz” depending on order.

## Solution approach:
- Since the problem statement mentioned we should print a word for numbers which contained the digit 3 and/or 5, my approach was to extract individual digits from the number
- Once the digit is extracted, I wrote a switch statement to check if it is 3 or 5 and append either Fizz or Buzz at the starting position of an empty string builder object
- A special condition for numbers 33 and 55 is to check if the word already contains the word Fizz or Buzz, respectively and not append it again (Assumption: for repeated digits, print the word only once)
- The reason for insertion at the start position of String Builder is to maintain the order of the word -> FizzBuzz for 35 and BuzzFizz for 53
- This string is then returned to the calling function, which checks if the word is empty. If so, it implies the number contains neither digit 3 or 5, and it updates the word to a string value of the current number
- The function then prints the number along with its corresponding word
- The function to print the string is called from the main class which runs a for loop from 1 to 100
- I've included a Thread.sleep() of 100 milliseconds to print the output one number at a time

------

Running code on repl.it : https://repl.it/@Neel_Vijaykumar/FizzBuzz

java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Number 1 -> 1   
Number 2 -> 2   
Number 3 -> Fizz   
Number 4 -> 4   
Number 5 -> Buzz   
Number 6 -> 6   
Number 7 -> 7   
Number 8 -> 8   
Number 9 -> 9   
Number 10 -> 10   
Number 11 -> 11   
Number 12 -> 12   
Number 13 -> Fizz   
Number 14 -> 14   
Number 15 -> Buzz   
Number 16 -> 16   
Number 17 -> 17   
Number 18 -> 18   
Number 19 -> 19   
Number 20 -> 20   
Number 21 -> 21   
Number 22 -> 22   
Number 23 -> Fizz   
Number 24 -> 24   
Number 25 -> Buzz   
Number 26 -> 26   
Number 27 -> 27   
Number 28 -> 28   
Number 29 -> 29   
Number 30 -> Fizz   
Number 31 -> Fizz   
Number 32 -> Fizz   
Number 33 -> Fizz   
Number 34 -> Fizz   
Number 35 -> FizzBuzz   
Number 36 -> Fizz   
Number 37 -> Fizz   
Number 38 -> Fizz   
Number 39 -> Fizz   
Number 40 -> 40   
Number 41 -> 41   
Number 42 -> 42   
Number 43 -> Fizz   
Number 44 -> 44   
Number 45 -> Buzz   
Number 46 -> 46   
Number 47 -> 47   
Number 48 -> 48   
Number 49 -> 49   
Number 50 -> Buzz   
Number 51 -> Buzz   
Number 52 -> Buzz   
Number 53 -> BuzzFizz   
Number 54 -> Buzz   
Number 55 -> Buzz   
Number 56 -> Buzz   
Number 57 -> Buzz   
Number 58 -> Buzz   
Number 59 -> Buzz   
Number 60 -> 60   
Number 61 -> 61   
Number 62 -> 62   
Number 63 -> Fizz   
Number 64 -> 64   
Number 65 -> Buzz   
Number 66 -> 66   
Number 67 -> 67   
Number 68 -> 68   
Number 69 -> 69   
Number 70 -> 70   
Number 71 -> 71   
Number 72 -> 72   
Number 73 -> Fizz   
Number 74 -> 74   
Number 75 -> Buzz   
Number 76 -> 76   
Number 77 -> 77   
Number 78 -> 78   
Number 79 -> 79   
Number 80 -> 80   
Number 81 -> 81   
Number 82 -> 82   
Number 83 -> Fizz   
Number 84 -> 84   
Number 85 -> Buzz   
Number 86 -> 86   
Number 87 -> 87   
Number 88 -> 88   
Number 89 -> 89   
Number 90 -> 90   
Number 91 -> 91   
Number 92 -> 92   
Number 93 -> Fizz   
Number 94 -> 94   
Number 95 -> Buzz   
Number 96 -> 96   
Number 97 -> 97   
Number 98 -> 98   
Number 99 -> 99   
Number 100 -> 100   
