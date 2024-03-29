package battle2023.ucp.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class tablero {
    private int[][] board; // Matriz para representar el tablero del Tetris
    private final int rows; // Número de filas del tablero
    private final int cols; // Número de columnas del tablero
    private List<PieceBase> tetrisPieces; // Lista de piezas de Tetris
    private Random random; // Generador de números aleatorios
    public PieceBase currentPiece;
    public PieceBase piecerandom; // Almacena la pieza actual
    public int currentPieceRow;   // Fila actual de la pieza en el tablero
    public int currentPieceCol;   // Columna actual de la pieza en el tablero
    private int perdes = 0;
    private int rowsFilled = 0;

    public tablero(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        board = new int[rows][cols]; // Inicializa el tablero con ceros (casillas vacías)
         
    }


    public PieceBase spawnRandomPiece(){ 
        
     //   tetrisPieces = new ArrayList<>();
      //  tetrisPieces.add(new pieceLLeft().getShape());
      //  tetrisPieces.add(new pieceLRight().getShape());
      //  tetrisPieces.add(new pieceStick().getShape());
       // tetrisPieces.add(new pieceDogLeft().getShape());
       // tetrisPieces.add(new pieceDogRight().getShape());
      //  tetrisPieces.add(new pieceT().getShape());
      //  tetrisPieces.add(new pieceSquare().getShape());
      //  random = new Random();
      //  placeRandomPiece();
        tetrisPieces = new ArrayList<>();
        tetrisPieces.add(new pieceLLeft());
        tetrisPieces.add(new pieceLRight());
        tetrisPieces.add(new pieceDogLeft());
        tetrisPieces.add(new pieceDogRight());
        tetrisPieces.add(new pieceSquare());
        tetrisPieces.add(new pieceT());
        tetrisPieces.add(new pieceStick());

        random = new Random();

        int randomIndex = random.nextInt(tetrisPieces.size());

        return tetrisPieces.get(randomIndex);

    }

    
    // Obtener el número de filas del tablero
    public int getRows() {
        return rows;
    }

    // Obtener el número de columnas del tablero
    public int getCols() {
        return cols;
    }

    public PieceBase getCurrentPiece() {
        return currentPiece;
    }
    
    public int getCurrentPieceRow() {
        return currentPieceRow;
    }
    
    public int getCurrentPieceCol() {
        return currentPieceCol;
    }

    public void setCurrentPieceRow(int row) {
    currentPieceRow = row;
}

public void setCurrentPieceCol(int col) {
    currentPieceCol = col;
}

    public void setCurrentPiece(PieceBase piece) {
        currentPiece = piece;
    }

    // Obtener el contenido de una casilla específica del tablero
    public int getCell(int row, int col) {
        return board[row][col];
    }

    
    // Establecer el contenido de una casilla específica del tablero
    public void setCell(int row, int col, int value) {
        board[row][col] = value;
    }


    // Método para imprimir el tablero en la consola
    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



    public void clearBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0; // Establece la celda como vacía (0)
            }
        }
    }


    public void placeRandomPiece() {
        // Obtén una pieza aleatoria de la lista de piezas de Tetris
        currentPiece = spawnRandomPiece();
    
        // Calcula la posición inicial en la parte superior del tablero
        currentPieceRow = 0;
        currentPieceCol = random.nextInt(cols - currentPiece.getShape()[0].length + 1);
    
        // Coloca la pieza en el tablero
        for (int i = 0; i < currentPiece.getShape().length; i++) {
            for (int j = 0; j < currentPiece.getShape()[i].length; j++) {
                if (currentPiece.getShape()[i][j] == 1) {
                    board[currentPieceRow + i][currentPieceCol + j] = 1;
                }
            }
        }
    }




    public void tick() {
        if (canMoveDown() && perdes == 0 && rowsFilled != 5) {        //Funcion booleana que verifica si la pieza puede seguir bajando
            clearFullRows2();
            clearCurrentPiece();    // Funcion que Borra todos los 1 de la pieza actual, se necesita variables de currentpiece. CurrentPieceRow y CurrentPieceCol
            currentPieceRow++;       // Suma 1 espacio hacia abajo a las Row
            placeCurrentPiece();        // Redibuja la matriz en la siguiente posicion
        } else {
            // Verificar si alguna columna está llena de 1 y borrarla
            //clearFullRows2();
            
            
        
            // Generar una nueva pieza en la parte superior del tablero si todavia no perdiste
            if (perdes == 0 && rowsFilled != 5){
                placeRandomPiece();
            }

        
            // Verificar si el juego ha terminado (no se puede colocar una nueva pieza)
            if (!canMoveDown()) {
                // final del juego,mensaje de game over.
                System.out.println("GAME OVER");
                perdes = 1;
            } 
            }
         }



    private boolean canMoveDown() {

        int[][] error1 = {
            {1, 1, 0},
            {0, 1, 1},
            {0, 0, 0}
        };

        int[][] error2 = {
            {0, 1, 1},
            {1, 1, 0},
            {0, 0, 0}
        };

        int[][] error3 = {
            {0, 1, 0},
            {1, 1, 1},
            {0, 0, 0}
        };
        

        // Itera a través de la matriz de la pieza actual
        for (int i = 0; i < currentPiece.getShape().length; i++) {
            for (int j = 0; j < currentPiece.getShape()[i].length; j++) {
                if (currentPiece.getShape()[i][j] == 1) {
                    int rowToCheck = currentPieceRow + i + 1;
                    int colToCheck = currentPieceCol + j;            
    
                    // Verifica si la pieza ha llegado al fondo del tablero
                    if (rowToCheck >= rows) {
                        return false;
                    }
    
                    // Verifica si hay una colisión con otra pieza en el tablero o si la casilla debajo no está vacía

                    
                    int rowToCheck2 = currentPieceRow;

                    if(areMatricesEqual(currentPiece.getShape(), error3) || areMatricesEqual(currentPiece.getShape(), error2) || areMatricesEqual(currentPiece.getShape(), error1) ){

                        rowToCheck2 = currentPieceRow-1;
                        if(board[rowToCheck2+currentPiece.getShape().length][colToCheck] != 0 || board[rowToCheck2+currentPiece.getShape().length][colToCheck] == 2){
                            return false;
                        }
                        
                    }


                    if (board[rowToCheck2+currentPiece.getShape().length][colToCheck] != 0 || board[rowToCheck2+currentPiece.getShape().length][colToCheck] == 2) {
                        return false;
                    }


                }
            }
            
        }
        
        return true;
    }



    public boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        // Verifica las dimensiones de las matrices
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }
    
        // Compara los elementos de las matrices
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
    
        // Si todas las comparaciones son iguales, las matrices son iguales
        return true;
    }


    




    public void placeCurrentPiece() {
        for (int i = 0; i < currentPiece.getShape().length; i++) {
            for (int j = 0; j < currentPiece.getShape()[i].length; j++) {
                if (currentPiece.getShape()[i][j] == 1) {
                    board[currentPieceRow + i][currentPieceCol + j] = 1;
                }
            }
        }
    }

    public void clearFullRows() {
        int newRow = rows - 1; // Nuevo índice de fila para mover filas hacia abajo

        // Recorre las filas desde la última hasta la primera
        for (int row = rows - 1; row >= 0; row--) {
            boolean isFull = true;
            // Verifica si la fila actual está llena de unos (1s)
            for (int col = 0; col < cols; col++) {
                if (board[row][col] != 1) {
                    isFull = false;
                    break;
                }
            }
    
            if (isFull) {
                // Si la fila está llena, omítela y continúa con la siguiente
                continue;
            }
    
            // Mueve la fila no llena a la nueva posición (abajo)
            for (int col = 0; col < cols; col++) {
                board[newRow][col] = board[row][col];
            }
            newRow--;   // Reduce el índice de la nueva fila
        }
    
        // Llena las filas restantes con ceros
        for (int row = newRow; row >= 0; row--) {
            for (int col = 0; col < cols; col++) {
                board[row][col] = 0;
            }
        }
    }

    public void clearFullRows2() {
        int newRow = rows - 1; // Nuevo índice de fila para mover filas hacia abajo

        // Recorre las filas desde la última hasta la primera
        for (int row = rows - 1; row >= 0; row--) {
            boolean isFull = true;
            // Verifica si la fila actual está llena de unos (1s)
            for (int col = 0; col < cols; col++) {
                if (board[row][col] != 1) {
                    isFull = false;
                    break;
                }
            }

            if (isFull) {
                rowsFilled++; // Incrementa el contador de filas llenas
                // Si se llenan 5 filas, el juego termina
                if (rowsFilled >= 5) {
                    System.out.println("YOU WIN");
                    perdes = 1;
                    return;
                }
                // Si la fila está llena, omítala y continúa con la siguiente
                continue;
            }

            // Mueve la fila no llena a la nueva posición (abajo)
            for (int col = 0; col < cols; col++) {
                board[newRow][col] = board[row][col];
            }
            newRow--; // Reduce el índice de la nueva fila
        }

        // Llena las filas restantes con ceros
        for (int row = newRow; row >= 0; row--) {
            for (int col = 0; col < cols; col++) {
                board[row][col] = 0;
            }
        }
    }



    
    public void clearCurrentPiece() {
        for (int i = 0; i < currentPiece.getShape().length; i++) {
            for (int j = 0; j < currentPiece.getShape()[i].length; j++) {
                if (currentPiece.getShape()[i][j] == 1) {
                    board[currentPieceRow + i][currentPieceCol + j] = 0;
                }
            }
        }
    }




    public void colocarpieza(int row, int col, PieceBase piece){
        for (int i = 0; i < piece.getShape().length; i++) {
            for (int j = 0; j < piece.getShape()[i].length; j++) {
                if (piece.getShape()[i][j] == 1) {
                    board[row + i][col + j] = 1;
                }
        
            }
        }
        currentPiece = piece;      
    }

    public int[][] getShape() {
        int[][] shape = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                shape[i][j] = board[i][j];
            }
        }
        return shape;
    }

    public void printShapeCurrentPiece() {
        for (int i = 0; i < currentPiece.getShape().length; i++) {
            for (int j = 0; j < currentPiece.getShape()[i].length; j++) {
                System.out.print(currentPiece.getShape()[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int status(){

        if (rowsFilled >= 5){
            return 1;
        } else if (perdes == 1){
            return 2;
        } else {
            return 3;
        }



    }







}

