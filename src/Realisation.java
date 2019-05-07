public class Realisation {

    public double constValue() {
        ForEmptyLambda forEmptyLambda = () -> 43;
        System.out.printf("Вызов метода 1: Фиксированное значение:");
        return forEmptyLambda.getValue();
    }

    public int secondDegreeOfNumber(int value) {
        ForOneArgLambda forOneArgLambda = (n) -> 7*n;
        System.out.printf("Вызов метода 2: произведение числа 7 на n " + value + " = ");
        return forOneArgLambda.getValue(value);
    }

    public double averageValue(double value1, double value2) {
        ForTwoArgLambda forTwoArgLambda = (a,b) -> (a+b)/2;
        System.out.printf("Вызов метода 3: Среднее значение чисел "+value1+", " + value2+" = ");
        return forTwoArgLambda.getValue(value1,value2);
    }

    public String ratioOfNumbers(double value1, double value2) {
        ForTwoArgsStringLambda ratio = (a,b) -> {
            String result = "";
            if(a>b)
                result = " больше ";
            if(a<b)
                result = " меньше ";
            if(a==b)
                result = " равно ";
            return result;
        };
        System.out.printf("Вызов метода 4: Сравнение чисел :" + value1);
        return ratio.getValue(value1,value2)+value2;
    }
}