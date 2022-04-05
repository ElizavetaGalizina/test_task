import java.util.Scanner;

import Conversion.*;
import Exception.*;


public class Data {

    final Scanner scanner;

    public Data(Scanner scanner) {
        this.scanner = scanner;
    }

    public int inputData() throws InvalidInputException, ValidateException {
        System.out.println("Введените значение");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (validateInputData(number)) {
                System.out.println("Введеное число: " + number);
                return number;
            } else {
                throw new ValidateException("Ошибка валидации введенного значения");
            }
        } else {
            throw new InvalidInputException("Введенное значение не является числом");
        }
    }

    public void selector(int convertNumber) throws InvalidInputException, ValidateException {
        System.out.println("Выберите способ конвертации: 1) 10->16  2) 10->2  3) 2->10");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (validateSelector(number)) {
                switch (number) {
                    case 1: {
                        System.out.println("Выбранный способ конвертации 10->16");
                        FromDecToHex fromDecToHex = new FromDecToHex();
                        System.out.println("Результат конвертации: " + fromDecToHex.convert(convertNumber));
                        break;
                    }
                    case 2: {
                        System.out.println("Выбранный способ конвертации 10->2");
                        FromDecToBin fromDecToBin = new FromDecToBin();
                        System.out.println("Результат конвертации: " + fromDecToBin.convert(convertNumber));
                        break;
                    }
                    case 3: {
                        System.out.println("Выбранный способ конвертации 2->10");
                        FromBinToDec fromBinToDec = new FromBinToDec();
                        System.out.println("Результат конвертации: " + fromBinToDec.convert(convertNumber));
                    }
                }
            } else {
                throw new ValidateException("Ошибка валидации введенного значения");
            }
        } else {
            throw new InvalidInputException("Введенное значение не является числом");
        }
    }

    public boolean validateInputData(int number) {
        if (number > 10000 || number < 0) {
            return false;
        }
        return true;
    }

    public boolean validateSelector(int number) {
        if (number >= 1 && number <= 3) {
            return true;
        }
        return false;
    }

}
