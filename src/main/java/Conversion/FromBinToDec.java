package Conversion;

public class FromBinToDec implements Conversion {
    @Override
    public String convert(int number) {
        String tempValue = String.valueOf(number);
        for (int i = 0; i < tempValue.length(); i++) {
            char c = tempValue.charAt(i);
            if (c - '0' != 1 && c - '0' != 0) {
                return "Ошибка конвертации: значения должны быть только 0 или 1";
            }
        }
        return String.valueOf(Integer.parseInt(tempValue, 2));
    }
}
