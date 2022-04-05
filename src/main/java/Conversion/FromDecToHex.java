package Conversion;

public class FromDecToHex implements Conversion{

    @Override
    public String convert(int number) {
        return Integer.toHexString(number).toUpperCase();
    }
}
