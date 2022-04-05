/**
 * Написать консольное приложение по конвертации числа из 10-ричной системы
 * счисления в 16-ричную.
 * Формат входных данных: числа от 0 до 10000.
 * Критерий приёмки:
 * 1. Приложение работает, числа конвертируются.
 * 2*. Добавить конвертацию из 10-ой в 2-ую
 * 3*. Добавить конвертацию из 2-ой в 10-ую
 */

import java.util.Scanner;

import Exception.*;

public class Main {

    public static void main(String[] args) throws InvalidInputException, ValidateException {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data(scanner);
        int convertNumber = data.inputData();
        data.selector(convertNumber);
    }
}
