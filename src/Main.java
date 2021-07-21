public class Main {

    public static void main(String[] args) {

        String[][] array = {
                {"NaN", "20", "30", "40"},
                {"50", "60", "70", "80"},
                {"90", "100", "110", "120"},
                {"130", "140", "150", "NaN"},

        };


        try {
            int result = accepted(array, 4);
            System.out.println("Сумма " + result);
        } catch (MyArraySizeException error) {
            System.out.println(error);
        }

    }

    /**
     * @param array
     * @param allowed array allowed size
     * @return integer
     */
    public static int accepted(String[][] array, int allowed) {
        int result = 0;

        if (array.length != allowed)
            throw new MyArraySizeException("Размер вашего массива " + array.length + " необходимый " + allowed, array.length);

        for (int i = 0; i < array.length; i++) {
            String subArray[] = array[i];
            if (subArray.length != allowed)
                throw new MyArraySizeException("Неверный размер внутреннего массива " + subArray.length + " необходимый " + allowed, array.length);

            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException error) {
                    throw new MyArrayDataException("Внутренний элемент массива не может быть преобразован Нашел это " + array[i][j], i, j);
                }
            }
        }
        

        return result;
    }

}
