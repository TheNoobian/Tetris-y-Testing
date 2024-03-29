package battle2023.ucp.Entities;

public class pieceT extends PieceBase {


    private int[][] shape = {
        {0, 1, 0},
        {1, 1, 1},
        {0, 0, 0}
    };

    public int[][] getShape() {
        return shape;
    }
    
    // Método para rotar la pieza hacia la izquierda (contrarreloj)
    @Override
    public void rotateRight() {
        int size = shape.length;
        int[][] rotatedShape = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedShape[i][j] = shape[size - 1 - j][i];
            }
        }

        shape = rotatedShape;
    }

    // Método para rotar la pieza hacia la derecha (en el sentido de las agujas del reloj)
    @Override
    public void rotateLeft() {
        int size = shape.length;
        int[][] rotatedShape = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedShape[i][j] = shape[j][size - 1 - i];
            }
        }

        shape = rotatedShape;
    }
}
