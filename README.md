The Joseph Android Project
-----
#####What is this all about? 
Android learning good times yay!

####Java Quirks

* Calling a method 

```
String sampleText = "What would Joe do";
int textLength = sampleText.length();
```
First we have a String value that has 17 characters (because white space is included).  

Call the method on the next line using dot notation, using a period after a class or variable name. We can’t just call it like `int textLength = length();` because there is no point of reference for where the `length()` method is defined or what text it should be checking. By chaining it to the `sampleText` String variable, we are saying to use the `length()` method defined by the String class, and to use it on the text data held in the `sampleText` variable.  

In this case the `length()` method calculates a value of 17 and returns it to this code where it was called from. We store the return value in a new int variable named `textLength`.  

* Equals

```
if (name.equals("Bruce Wayne")) {
  isBatman = true;
}
else if (name.equals("Clark Kent")) {
  isSuperman = true;
```
In Java, applying the double-equals to String objects does not compare the actual values of the objects, just whether or not the references are equal, which usually isn’t what we’re looking to compare. Use the `String.equals(String other)` function to compare strings, not the `==` operator.

*  More to come!
