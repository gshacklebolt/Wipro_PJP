/**
 * Assignment 2: Write a javaScript function which accepts a number and returns true if it 
 * is a prime number else returns false
 */
function checkPrime(num){
	var flag=true;
	for(var i=2;i<=Math.sqrt(num);i++){
		if(num%i==0){
			flag=false;
		}
	}
	return flag;
}