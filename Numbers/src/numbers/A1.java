/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;



/**
 *
 * @author anonymous
 */
import java.util.Scanner;
class A4{

  public static void main(String[] args){
  float[][] s = new float[3][2];
  Scanner s1 = new Scanner(System.in);

  for(int i = 0; i < 3; i++)
  {

    System.out.println("Enter marks of student : "+(i+1));
    for(int j = 0; j < 2; j++)
	{
          System.out.println("Subject : "+(j+1));
	  s[i][j] = s1.nextFloat();
	}

  }

  for(int i = 0; i < 3; i++)
  {

    System.out.println("Student" + (i+1));

    for(int j = 0; j < 2; j++)
	{
	  System.out.println("Subject" + (j+1) + ":" + s[i][j]);
	}
  }
}
}

