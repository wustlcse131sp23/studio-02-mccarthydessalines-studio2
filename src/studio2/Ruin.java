package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input starting Amount");
		int startAmount = in.nextInt();
		System.out.println("Input starting Odds");
		int winChance = in.nextInt();
		System.out.println("Input Win Limit");
		int winLimit = in.nextInt();
		//System.out.println("Input Number of Days");
		//int totalSimulations = in.nextInt();
		while(startAmount>0 && startAmount<=winLimit)
		{
			if((Math.random()*100)<winChance)
			{
				startAmount++;
				System.out.println("win "+ startAmount);
			}
			else
			{
				startAmount--;
				System.out.println("loss"+ startAmount);
			}
		}
		if(startAmount==0)
		{
			System.out.println("ruin");
		}
		else
		{
			System.out.println("You hit the Win Limit");
		}
	}

}
