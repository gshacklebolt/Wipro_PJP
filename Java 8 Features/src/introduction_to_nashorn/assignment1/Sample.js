/**
 * Assignment 1: Write a javaScript code which displays the current system date and time.
 * Save the code as Sample.js, invoke it using jjs tool and display the result.
 */

var LocalDateTime=Java.type("java.time.LocalDateTime");
var DateTimeFormatter=Java.type("java.time.format.DateTimeFormatter");

var now=LocalDateTime.now();
var formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");

print(now.format(formatter));