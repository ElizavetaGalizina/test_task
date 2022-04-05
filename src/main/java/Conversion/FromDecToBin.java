package Conversion;

public class FromDecToBin implements Conversion{
    @Override
    public String convert(int number) {
        return Integer.toBinaryString(number);
    }
}
