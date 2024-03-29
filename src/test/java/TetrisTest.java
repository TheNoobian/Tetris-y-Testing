import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import battle2023.ucp.Entities.Tetris;
import battle2023.ucp.Entities.pieceDogLeft;
import battle2023.ucp.Entities.pieceDogRight;
import battle2023.ucp.Entities.pieceLLeft;
import battle2023.ucp.Entities.pieceLRight;
import battle2023.ucp.Entities.pieceSquare;
import battle2023.ucp.Entities.pieceStick;
import battle2023.ucp.Entities.pieceT;
import battle2023.ucp.Entities.tablero;




public class TetrisTest {


    @Test
        public void existepieceTTest()
    {
        pieceT t = new pieceT();
        assertNotNull(t);
    }

    @Test
        public void existepieceLLeftTest()
    {
        pieceLLeft t = new pieceLLeft();
        assertNotNull(t);
    }
 @Test
        public void existepieceLRightTest()
    {
        pieceLRight t = new pieceLRight();
        assertNotNull(t);
    }
    

    @Test
        public void existepieceSquareTest()
    {
        pieceSquare t = new pieceSquare();
        assertNotNull(t);
    }

    @Test
        public void existepieceDogRightTest()
    {
        pieceDogRight t = new pieceDogRight();
        assertNotNull(t);
    }

  @Test
        public void existepieceDogLeftTest()
    {
        pieceDogLeft t = new pieceDogLeft();
        assertNotNull(t);
    }

     @Test
        public void existepieceStick()
    {
        pieceStick t = new pieceStick();
        assertNotNull(t);
    }
    


    @Test
    public void pieceStickMatrizDibujada() {
        pieceStick piece = new pieceStick();
        int[][] expectedShape = {
            {1},
            {1},
            {1},
            {1}
        };

        int[][] actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {1, 1, 1, 1}
        };

        piece.rotateLeft();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {1, 1, 1, 1}
        };

        piece.rotateRight();
        piece.rotateRight();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }
    }



    @Test
    public void pieceSquareMatrizDibujada() {
        pieceSquare piece = new pieceSquare();
        int[][] expectedShape = {
            {1, 1},
            {1, 1}
        };

        int[][] actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }
    }



    @Test
    public void pieceLRightMatrizDibujada() {
        pieceLRight piece = new pieceLRight();
        int[][] expectedShape = {
            {1, 0},
            {1, 0},
            {1, 1}
        };

        int[][] actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {0, 0, 1},
            {1, 1, 1}
        };
        piece.rotateLeft();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {1, 1, 1},
            {1, 0, 0}
        };
        piece.rotateRight();
        piece.rotateRight();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }
    }



    @Test
    public void pieceLLeftMatrizDibujada() {
        pieceLLeft piece = new pieceLLeft();
        int[][] expectedShape = {
            {0, 1},
            {0, 1},
            {1, 1}
        };

        int[][] actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {1, 1, 1},
            {0, 0, 1}
        };
        piece.rotateLeft();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {1, 0, 0},
            {1, 1, 1}
        };
        piece.rotateRight();
        piece.rotateRight();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }
    }




    @Test
    public void pieceDogRightMatrizDibujada() {
        pieceDogRight piece = new pieceDogRight();
        int[][] expectedShape = {
            {0, 1, 1},
            {1, 1, 0},
            {0, 0, 0}
        };

        int[][] actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {1, 0, 0},
            {1, 1, 0},
            {0, 1, 0}
        };
        piece.rotateLeft();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {0, 1, 0},
            {0, 1, 1},
            {0, 0, 1}
        };
        piece.rotateRight();
        piece.rotateRight();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }
    }




    @Test
    public void pieceDogLefttMatrizDibujada() {
        pieceDogLeft piece = new pieceDogLeft();
        int[][] expectedShape = {
            {1, 1, 0},
            {0, 1, 1},
            {0, 0, 0}
        };

        int[][] actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {0, 1, 0},
            {1, 1, 0},
            {1, 0, 0}
        };
        piece.rotateLeft();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {0, 0, 1},
            {0, 1, 1},
            {0, 1, 0}
        };
        piece.rotateRight();
        piece.rotateRight();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }
    }


    @Test
    public void pieceTMatrizDibujada() {
        pieceT piece = new pieceT();
        int[][] expectedShape = {
            {0, 1, 0},
            {1, 1, 1},
            {0, 0, 0}
        };

        int[][] actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {0, 1, 0},
            {1, 1, 0},
            {0, 1, 0}
        };

        piece.rotateLeft();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        expectedShape = new int[][] {
            {0, 1, 0},
            {0, 1, 1},
            {0, 1, 0}
        };

        piece.rotateRight();
        piece.rotateRight();
        actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }
    }



    @Test
    public void testBoardFormat() {
    int contador = 0;
    tablero board = new tablero(10, 20); // Define las dimensiones del tablero

    for (int i = 0; i < board.getShape().length; i++) {
        for (int j = 0; j < board.getShape()[i].length; j++) {
            if (board.getShape()[i][j] == 0) {
                contador++;
            }
        }
    }
    assertEquals(contador, 200);
    
    }



    @Test
    public void piezaSeMueveYpuede() {
        tablero board = new tablero(10, 20);
        board.spawnRandomPiece();
        board.placeRandomPiece();
        int initialRow = board.getCurrentPieceRow();
        int expectedRow = initialRow + 1; // Esperamos que la pieza se mueva una fila hacia abajo

        board.tick(); // Realiza un "tick" para que la pieza se mueva

        int actualRow = board.getCurrentPieceRow();
        assertEquals(expectedRow, actualRow);
    }


    @Test
    public void piezaNoPuedeMoverse() {

        tablero board = new tablero(10, 20);

        board.spawnRandomPiece();

        board.placeRandomPiece();

        int initialRow = board.getCurrentPieceRow();

        int expectedRow = initialRow + 1; // Esperamos que la pieza se mueva una fila hacia abajo

        board.setCell(expectedRow+1, board.getCurrentPieceCol(), 1); // no podra moverse ya que ponemos un 1 debajo

        //expectedRow = expectedRow - 1;  //restamos 1 a la ExpectedRow porque la matriz no se mueve como en el anterior test

        board.tick(); // Realiza un "tick" para que la pieza se mueva

        expectedRow = 0;

        int actualRow = board.getCurrentPieceRow();
        
        assertEquals(expectedRow, actualRow);
    }


    @Test
    public void seColocaPieza(){
        int contador = 0;
        int rows = 10;
        int cols = 20;
        tablero board = new tablero(rows, cols);
        board.spawnRandomPiece();
        board.placeRandomPiece();

        int [][] boardverificar = board.getShape();

        for (int i = 0; i < boardverificar.length; i++) {
            for (int j = 0; j < boardverificar[i].length; j++) {
                if (boardverificar[i][j] == 1) {
                    contador++;
                }
            }
        }
        
        assertEquals(contador, 4);


    }

    @Test
    public void laPiezaNoSeSobresale(){

        int rows = 10;

        int cols = 20;

        int seCreoUnaNuevaPieza = 0;

        tablero board = new tablero(rows, cols);

        int lastRow = rows - 1; // indice de la ultima fila
        for (int col = 0; col < cols; col++) {
            board.setCell(lastRow, col, 2);
        }

        pieceStick stick = new pieceStick();

        board.colocarpieza(5, 10, stick);

        int posicionDePieza = board.getCurrentPieceRow();
        board.tick();
        int posicionDePieza2 = board.getCurrentPieceRow();

        if (posicionDePieza<posicionDePieza2){
            seCreoUnaNuevaPieza = 1;
        }

        assertEquals(seCreoUnaNuevaPieza, 1);


    }



    @Test
    public void piezaRotaDentroDeTableroSeActualiza(){
        int[][] expectedShape = {
            {1, 1, 1, 1}
        };
        int rows = 10;
        int cols = 20;
        tablero board = new tablero(rows, cols);

        pieceStick stick = new pieceStick();

        board.colocarpieza(3, 10, stick);
        board.clearCurrentPiece();
        board.placeCurrentPiece();

        board.currentPiece.rotateLeft();

        int[][] actualShape = board.currentPiece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }

        
        
    }



    @Test
    public void pieceTMatrizDibujada2() {
        pieceT piece = new pieceT();
        int[][] expectedShape = {
            {0, 1, 0},
            {1, 1, 1},
            {0, 0, 0}
        };

        int[][] actualShape = piece.getShape();
        assertEquals(expectedShape.length, actualShape.length);

        for (int i = 0; i < expectedShape.length; i++) {
            assertEquals(expectedShape[i].length, actualShape[i].length);

            for (int j = 0; j < expectedShape[i].length; j++) {
                assertEquals(expectedShape[i][j], actualShape[i][j]);
            }
        }


    }

    @Test
    public void seBorranLasLineasSiHay1s(){

        int rows = 10;

        int cols = 20;

        tablero board = new tablero(rows, cols);

        pieceSquare square = new pieceSquare();

        board.colocarpieza(5, 10, square);
        assertEquals(board.getCell(5, 10), 1);
        board.colocarpieza(5, 12, square);
        board.colocarpieza(5, 14, square);
        board.colocarpieza(5, 16, square);
        board.colocarpieza(5, 18, square);
        board.colocarpieza(5, 0, square);
        board.colocarpieza(5, 2, square);
        board.colocarpieza(5, 4, square);
        board.colocarpieza(5, 6, square);
        board.colocarpieza(5, 8, square);
        board.clearFullRows2();
        assertEquals(board.getCell(5, 10), 0);
        assertEquals(board.getCell(5, 16), 0);


    }


    @Test
    public void EstadoGanaste(){

        int rows = 10;

        int cols = 20;

        tablero board = new tablero(10, 20);

        int lastRow = rows - 1; // Índice de la última fila

        for (int col = 0; col < cols; col++) {
            board.setCell(lastRow, col, 2);
        }
        for (int col = 0; col < cols; col++) {
            board.setCell(lastRow-1, col, 1);
        }
        for (int col = 0; col < cols; col++) {
            board.setCell(lastRow-2, col, 1);
        }
        for (int col = 0; col < cols; col++) {
            board.setCell(lastRow-3, col, 1);
        }
        for (int col = 0; col < cols; col++) {
            board.setCell(lastRow-4, col, 1);
        }
        for (int col = 0; col < cols; col++) {
            board.setCell(lastRow-5, col, 1);
        }

        board.clearFullRows2();

        int estadoJuego = board.status();

        assertEquals(estadoJuego, 1);

    }


    @Test
    public void EstadoPerdiste(){

        int rows = 10;

        int cols = 20;

        tablero board = new tablero(rows, cols);

        board.spawnRandomPiece();
        board.placeRandomPiece();

        int lastRow = rows - 1;

        for (int col = 0; col < cols; col++) {
            board.setCell(lastRow, col, 2);
        }


        for (int col = 0; col < 100; col++) {
                board.tick();
            }

        
        int estadojuego = board.status();

        assertEquals(estadojuego, 2);

    }


    @Test
    public void EstadoEnJuegoContinua(){

        int rows = 10;

        int cols = 20;

        tablero board = new tablero(rows, cols);

        board.spawnRandomPiece();
        board.placeRandomPiece();

        int lastRow = rows - 1;

        for (int col = 0; col < cols; col++) {
            board.setCell(lastRow, col, 2);
        }

    
        board.tick();

        
        int estadojuego = board.status();

        assertEquals(estadojuego, 3);


    }


    @Test
    public void piezaSeMueveYpuedeNuevo() {

        Tetris Tetris = new Tetris(10, 20);

        Tetris.iniciarJuego();

        int initialRow = Tetris.miTablero.getCurrentPieceRow();
        int expectedRow = initialRow + 1;

        Tetris.tick();

        int actualRow = Tetris.miTablero.getCurrentPieceRow();

        assertEquals(expectedRow, actualRow);

        /*  tablero board = new tablero(10, 20);
        board.spawnRandomPiece();
        board.placeRandomPiece();
        int initialRow = board.getCurrentPieceRow();
        int expectedRow = initialRow + 1; // Esperamos que la pieza se mueva una fila hacia abajo

        board.tick(); // Realiza un "tick" para que la pieza se mueva

        int actualRow = board.getCurrentPieceRow();
        assertEquals(expectedRow, actualRow); */
    }

    @Test
    public void EstadoEnJuegoContinuaNuevo(){

        Tetris Tetris = new Tetris(10, 20);

        Tetris.iniciarJuego();

        Tetris.tick();

        Tetris.state();

        int estadojuego = Tetris.miTablero.status();

        assertEquals(estadojuego, 3);

    }



    @Test
    public void Suma1aClock(){
        Tetris Tetris = new Tetris(10, 20);
        Tetris.iniciarJuego();
        int initialTickCount = Tetris.getTickCount();
        Tetris.tick();
        int newTickCount = Tetris.getTickCount();

        assertEquals(initialTickCount + 1, newTickCount);
    }

















 }






 

























    

    

    








