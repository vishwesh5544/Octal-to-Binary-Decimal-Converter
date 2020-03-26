/*
 * Decimal Converter
 */

package converter;

public class DecimalConverter
{
	public boolean doDecimal(NumberBean decimalBean)
	{
		int octal = decimalBean.getOctal();

		// variable to store the decimal number
		int decimal = 0;

		// variable to be used in power
		int n = 0;

		// logic for octal to decimal
		while (octal > 0) {
			int temp = octal % 10;
			decimal += temp * Math.pow(8, n);
			octal /= 10;
			n++;
		}

		//printing the answer
		System.out.print("Decimal number : ");
		System.out.print(decimal);
		System.out.println();

		//returning true after conversion is completed
		return true;
	}
}
