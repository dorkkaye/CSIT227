public class Matrix 
{
    private int matrix[][];

    public Matrix(){}

    public Matrix(int row, int column)
    {
        matrix = new int[row][column];
    }

    void read(String input)
    {
        String[] parts = input.split("\\.");

        boolean wrongValue = false;

        for(char c : input.toCharArray())
        {
            if (Character.isLetter(c))
                wrongValue = true;
        }

        try
        {
            if(wrongValue)
                throw new ExceptionWrongMatrixValues();

            if(parts.length != 2)
                throw new ExceptionWrongMatrixDimension();

            String[] x = parts[0].split(" ");
            String[] y = parts[1].substring(1).split(" ");

            if(x.length != y.length)
                throw new ExceptionWrongMatrixValues();

            for(String s : x)
                System.out.printf("%s ", s);
            
            System.out.printf("\n");

            for(String s : y)
                System.out.printf("%s ", s);
        }
        catch (ExceptionWrongMatrixValues e)
        {
            System.out.println(e.getMessage());
        }
        catch (ExceptionWrongMatrixDimension e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void printInput(String[] x, String[] y)
    {
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + " ");

        System.out.print("\n");

        for (int i = 0; i < y.length; i++)
            System.out.print(y[i] + " ");
    }

    public static void main(String[] args)
    {
        String input="1 2 3 . 1 e 3 .";
        Matrix m = new Matrix();
        m.read(input);

        String input1 ="1 2 3 . 1 2 3 4 5 .";
        Matrix m1 = new Matrix();
        m1.read(input1);

        String input2="12312345";
        Matrix m2 = new Matrix();
        m2.read(input2);

        String input3="1 2 . 3 4 .";
        Matrix m3 = new Matrix();
        m3.read(input3);
    }
}