# Calculator  
<br>

## Program description:   
This program is a simple calculator that can add non-negative integers together.  
It keeps track of the current sum, allows the user to reset the calculator, and prevents  
negative numbers from being added.  

```java
public class Calculator {
private int value;

    public void reset() {
        value = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int i = 0;
        while (i < number) {
            value++;
            i++;
        }
    }

    public int getValue() {
        return value;
    }
}
```
## How the code works:
Copilot generated: The `Calculator` class maintains a private integer variable `value` to store the current sum. The `reset()` method sets this value to 0. The `add()` method takes a positive integer as input and adds it to the current value. If a negative number is passed, it throws an `IllegalArgumentException`. The `getValue()` method returns the current value of the calculator.
<br> 
My modification:  
The Calculator class uses a private integer variable called value to store the current sum.  
The reset() method sets the value to 0, the add() method takes an integer and adds it to the current value.  
if the given number is negative, it throws an IllegalArgumentException.  
The getValue() method returns the calculators current value.  