public class Matrix
{
    private int matrix[][];
    
    public Matrix(){}
    
    public Matrix(int row, int column)
    {
        matrix = new int[row][column];
    }
    
    //your methods here
    public void read(String input)
    {
        String[] num = input.split(" ");
        String[] next = input.split(" . ");

        try
        {
            for(int i = 0; i < matrix.length(); i++)
            {
                for(int j = 0; j < matrix[i].length; j++)
                {
                    if(matrix[i][j] == num[i])
                        System.out.print("\n");
                    else
                        System.out.print(num[i]);
                }
            }
        }
        catch(ExceptionWrongMatrixValues e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isAlphanumeric(String input)
    {
        if(input.matches("[a-zA-Z]+"))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        String input="1 2 3 . 1 e 3 .";
        Matrix m = new Matrix();
        m.read(input);
    }
}
