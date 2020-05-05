# Digi-X-Assessment

### Section 1
1.	Choose a front-end language/framework of your choice 
```HTML, CSS and JavaScript will be good choice for front-end programming languages for web application development. Those languages are the most basic building blocks of web programming for creating a responsive web application. With Client-side scripting, it allows to make interactive behaviour for web pages. Also, Bootstrap framework can help to design websites faster and easier since it provides design templates for HTML and CSS. CodeIgniter framework will be used for developing a dynamic web application since it supports MVC.```

2.	Choose a back-end language/framework of your choice 
```PHP programming language for back-end web application development since it’s a simple and faster server-side scripting language. PHP can be used with a database system because of its ability to interact with database systems like MySQL. For me, CodeIgniter is a simple and easy PHP Framework which is built for MVC development.```

3.	Choose a database management system of your choice Explain why you have chosen this stack.
```MySQL is the most famous Relational Database that can store and handle a large amount of data. MySQL provides a high performance, availability and security.```

### Section 2
1.	What is GitHub? 
```GitHub is a Git online repository hosting service that provides access control and collaboration features between developer. It provides built-in control and task-management tools that allows programmers to keep track and share project online like a cloud-based.```

2.	How does GitHub help developers?
```Basically, a team of developers can work together by using the same codebase without making copy or rewriting the code for another. Developers can see what others are working on, review code and view code for previous version of changes.```


### Section 3
1. Write a for loop that prints all the multiples of 3 and 5 up to 100

An ArrayList object called *arrayListNum* that will store strings
```java
ArrayList<Integer> arrayListNum = new ArrayList<Integer>(); 
```

For loop starting from 1 to 100. The If inner loop will check for all the multiples of 3 and 5 up to 100 and add to *arrayListNum* 
```java
for (int i = 1; i <= 100; i++) {
    if (i % 3 == 0 || i % 5 == 0){
        arrayListNum.add(i);
    }
}

```

Print out all element in *arrayListNum*
```java
System.out.println("Results: " + arrayListNum); 
```

2. Write a function that detects whether a string is a palindrome

Get user input and assign string value to *varStr*
```java
Scanner in = new Scanner(System.in);
String varStr = in.nextLine();  
```

While loop repeatly waiting for input, will stop until the input value is nothing and pass the input string to *palindrome* function
```java
while (!varStr.equals("")) {
    palindrome(varStr);
    varStr = in.nextLine();
}
```

Assign integer *n* to returns the number of characters of *varStr*
```java
int n = varStr.length();
```

For loop to reverse the string characters and assign to *varCheck* variable
```java
for(int j = n-1; j >= 0; j--){
    varCheck = varCheck + varStr.charAt(j);
}
```

If Else statement to print the output by comparing *varStr* and *varCheck* using *equalsIgnoreCase()* methods to compare either the string is palindrome or not
```java
if(varStr.equalsIgnoreCase(varCheck)){
    System.out.println("'" + varStr + "' -> True");
}else{
    System.out.println("'" + varStr + "' -> False");
}
```
