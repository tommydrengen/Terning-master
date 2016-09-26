package terning;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestTerning {

	@Test
	public void test1() {
		Dice lol = new Dice();
		
boolean end1;
int en = 0;
int i = 0;
while(i<60000)
{
			
			switch (lol.roll())
			{
			case 1 : en++;
			break;

			}
			i++;
 }

				if(en>9600 && en<10400) 
				{
					end1 = true;
				}
				else 
				{
					end1 = false;
				}
					System.out.println("en = " + en);
					Assert.assertTrue(end1);
}
	

	@Test
	public void test2() {
		Dice lol = new Dice();
		
boolean end2;
int to = 0;
int i = 0;
while(i<60000)
{
			
			switch (lol.roll())
			{
			case 2 : to++;
			break;

			}
			i++;
 }

				if(to>9600 && to<10400) 
				{
					end2 = true;
				}
				else 
				{
					end2 = false;
				}
					System.out.println("to = " + to);
					Assert.assertTrue(end2);
}
	@Test
	public void test3() {
		Dice lol = new Dice();
		
boolean end3;
int tre = 0;
int i = 0;
while(i<60000)
{
			
			switch (lol.roll())
			{
			case 3 : tre++;
			break;

			}
			i++;
 }

				if(tre>9600 && tre<10400) 
				{
					end3 = true;
				}
				else 
				{
					end3 = false;
				}
					System.out.println("tre = " + tre);
					Assert.assertTrue(end3);
}
	@Test
	public void test4() {
		Dice lol = new Dice();
		
boolean end4;
int fire = 0;
int i = 0;
while(i<60000)
{
			
			switch (lol.roll())
			{
			case 4 : fire++;
			break;

			}
			i++;
 }

				if(fire>9600 && fire<10400) 
				{
					end4 = true;
				}
				else 
				{
					end4 = false;
				}
					System.out.println("fire = " + fire);
					Assert.assertTrue(end4);
}
	@Test
	public void test5() {
		Dice lol = new Dice();
		
boolean end5;
int fem = 0;
int i = 0;
while(i<60000)
{
			
			switch (lol.roll())
			{
			case 5 : fem++;
			break;

			}
			i++;
 }

				if(fem>9600 && fem<10400) 
				{
					end5 = true;
				}
				else 
				{
					end5 = false;
				}
					System.out.println("fem = " + fem);
					Assert.assertTrue(end5);
}
	@Test
	public void test6() {
		Dice lol = new Dice();
		
boolean end6;
int seks = 0;
int i = 0;
while(i<60000)
{
			
			switch (lol.roll())
			{
			case 6 : seks++;
			break;

			}
			i++;
 }

				if(seks>9600 && seks<10400) 
				{
					end6 = true;
				}
				else 
				{
					end6 = false;
				}
					System.out.println("seks = " + seks);
					Assert.assertTrue(end6);
}
}
