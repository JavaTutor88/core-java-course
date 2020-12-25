package com.aspl.introduction;

public class PrimitiveDataTypes {

	byte varByte = 89; // -128 to 127
	short varShort = 6453; // -32768 to 32767
	int varInt = 45454644; // -2,147,483,648 to 2,147,483,647
	long varLong = 948583495348593485l;// (-2E63) to (2E63)-1

	float varFloat = 75454.343434665654f;// 1.4 x 10power-45 and as big as 3.4 x 10power38
	double varDouble = 37483473434.483487384738; // 4.9E-324 to 1.7976931348623157E308

	char varChar = 'a';// 0 to 65535
	boolean varBoolean = true; // true false
//	BigDecimal - used for precise calculations. Will look at it along with wrapper classes.

	public static void main(String[] args) {
		char ch = 'S';
		int x = ch; // Implicit casting
		int y = ch + 4; // will add 4 to numeric value corresponding to the character in ch
		byte b = (byte) ch; // Explicit casting
		char ch2 = (char) y;
		int y2 = 130;
		byte z=(byte)y2;
		System.out.println(z);

		float f1 = 483743.4834387f;
		double d1 = f1; // Implicit casting
		double d2 = 483743.4834387;
		float f2 = (float) d2; // Although same value but explicit casting required;
		char ch3 = (char) 4.0; // Allowed but makes no sense

//		Explicit casting always required when storing decimal number into integer family
		int x2 = (int) f1; // explicit
		f1 = y;
		long l1 = (long) f1; // explicitly required because even though long is 64 bits
//		and float is 32 bits 
		f1 = l1;

		System.out.println('\u00A2');
		System.out.println('\u00A5');
	}

//			byte		1 byte
//			short		2 bytes
//			int			4 bytes
//			long		8 bytes
//			float		4 bytes
//			double		8 bytes
//			char		2 bytes
}
