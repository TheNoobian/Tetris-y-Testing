package battle2023.ucp.Entities;

public class pieceLLeft extends PieceBase{

    private int[][] shape = {
        {0, 1},
        {0, 1},
        {1, 1}
    };

    public int[][] getShape() {
        return shape;
    }

    // Método para rotar la pieza hacia la izquierda (contrarreloj)
    @Override
    public void rotateLeft() {
        int rows = shape.length;
        int cols = shape[0].length;
        int[][] rotatedShape = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                rotatedShape[i][j] = shape[j][cols - 1 - i];
            }
        }

        shape = rotatedShape;
    }

    // Método para rotar la pieza hacia la derecha (en el sentido de las agujas del reloj)
    @Override
    public void rotateRight() {
        int rows = shape.length;
        int cols = shape[0].length;
        int[][] rotatedShape = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                rotatedShape[i][j] = shape[rows - 1 - j][i];
            }
        }

        shape = rotatedShape;
    }
    
}
