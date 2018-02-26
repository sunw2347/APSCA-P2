//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		number = 0;
		for(int i = 0; i < roman.length(); i++){
			while(LETTERS[i] == "M"){
				number += 1000;
			}
			while(LETTERS[i] == "CM"){
				number += 900;
			}
			while(LETTERS[i] == "D"){
				number += 500;
			}
			while(LETTERS[i] == "CD"){
				number += 400;
			}
			while(LETTERS[i] == "C"){
				number += 100;
			}
			while(LETTERS[i] == "XC"){
				number += 90;
			}
			while(LETTERS[i] == "L"){
				number += 50;
			}
			while(LETTERS[i] == "XL"){
				number += 40;
			}
			while(LETTERS[i] == "X"){
				number += 10;
			}
			while(LETTERS[i] == "IX"){
				number += 9;
			}
			while(LETTERS[i] == "V"){
				number += 5;
			}
			while(LETTERS[i] == "IV"){
				number += 4;
			}
			while(LETTERS[i] == "I"){
				number += 1;
			}
		}
		return number;
	}
	public String toString()
	{
		roman = "";
		while(number >= 1000) {
			roman += "M";
			number -= 1000;
		}
		while(number >= 900) {
			roman += "CM";
			number -= 900;
		}
		while(number >= 500) {
			roman += "D";
			number -= 500;
		}
		while(number >= 400) {
			roman += "CD";
			number -= 400;
		}
		while(number >= 100) {
			roman += "C";
			number -= 100;
		}
		while(number >= 90) {
			roman += "XC";
			number -= 90;
		}
		while(number >= 50) {
			roman += "L";
			number -= 50;
		}
		while(number >= 40) {
			roman += "XL";
			number -= 40;
		}
		while(number >= 10) {
			roman += "X";
			number -= 10;
		}
		while(number >= 9) {
			roman += "IX";
			number -= 9;
		}
		while(number >= 5) {
			roman += "V";
			number -= 5;
		}
		while(number >= 4) {
			roman += "IV";
			number -= 4;
		}
		while(number >= 1) {
			roman += "I";
			number -= 1;
		}
		return roman + "\n";
	}
}