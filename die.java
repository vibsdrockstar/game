//A simple dice program in java
import java.util.*;
import java.util.Random;

public class die {
public int die; 
public die(){
	int die=1;
	
	
}
public int rollDie(int die){
	die =(int)(Math.random()* 6) +1;
	return die;
	
}
public void printLine(){
	System.out.println(rollDie(die));
	

}
}
