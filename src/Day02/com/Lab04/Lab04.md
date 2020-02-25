* You have a Calculator class as given below

```java
	public class Calculator {
		public int add(int num1, int num2) {
			return num1 + num2;
		}
		
		public int subtract(int num1, int num2) {
			return num1 - num2;
		}
		
		public int multiply(int num1, int num2) {
			return num1 * num2;
		}
	}
```


* Create a functional interface called __Calc__ with an abstract method that accepts two arguments and returns an int.

* Create Lab04.java with a **main()** method. 
* In the __main()__ create Lambda expressions for add, subtract and multiply using __Calc__
* Create a new method called __operate(Calc calc)__ in Lab04 and pass your lambdas as arrguments