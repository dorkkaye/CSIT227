Define the exceptions that are necessary to catch the possible errors that can occur in the class Matrix 

• ExceptionWrongMatrixValues that is thrown in the method read() if the data on the String does not correspond to numeric values, or if the data are not consistent with the form of a matrix (e.g., the rows have different length); 

• ExceptionWrongMatrixDimension that is thrown in the method read() if the data on the String do not correspond to the dimension of the matrix.

The numbers are separated by space. A dot in a string means the next string of text is for the next row.

For example:

Test	
String input="1 2 3 . 1 e 3 .";
Matrix m = new Matrix();
m.read(input);

Result
ExceptionWrongMatrixValues

Test
String input="1 2 3 . 1 2 3 4 5 .";
Matrix m = new Matrix();
m.read(input);

Result
ExceptionWrongMatrixValues

Test
String input="12312345";
Matrix m = new Matrix();
m.read(input);

Result
ExceptionWrongMatrixDimension

Test
String input="1 2 . 3 4 .";
Matrix m = new Matrix();
m.read(input);

Result
1 2
3 4