package lessons.lesson12Interfaces;

public class Matrix implements IMatrix{
    private double [][] numbers;// без инициализации т.к. не знаем пока

    public Matrix (int rows, int colomns){
        numbers = new double[rows][colomns];
    }




    @Override
    public int getRows() {
        return numbers.length; // возвращает количесвто строк матрицы
    }

    @Override
    public int getColumns() {
        return numbers[0].length; // количество столбцов матрицы по индексу 0 (индекс строки)
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return numbers[rowIndex][colIndex]; //return this.numbers[rowIndex][colIndex]
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        numbers[rowIndex][colIndex] = value;


    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() { // очень сложный


        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        System.out.println(numbers[getRows()][getColumns()]);
        }


    }

