/*
 * Binary Converter
 * 
 * Info - This converter first converts the octal to decimal and then the decimal to binary number.
 */
package converter;

public class BinaryConverter
{
	public boolean doBinary(NumberBean binaryBean)
	{
		int octal = binaryBean.getOctal();

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

		//initialising array to store bits
		int[] binary = new int[20];
		int i = 0;

		// logic for decimal to binary
		while (decimal > 0) {
			int r = decimal % 2;
			binary[i++] = r;
			decimal /= 2;
		}

		//printing the conversion answer
		System.out.print("Binary number : ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binary[j]);
		}
		System.out.println();

		//returning true after conversion is completed
		return true;
	}
}
