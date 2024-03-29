package battle2023.ucp;

import battle2023.ucp.Entities.pieceDogLeft;
import battle2023.ucp.Entities.pieceDogRight;
import battle2023.ucp.Entities.pieceLLeft;
import battle2023.ucp.Entities.pieceLRight;
import battle2023.ucp.Entities.pieceSquare;
import battle2023.ucp.Entities.pieceStick;
import battle2023.ucp.Entities.pieceT;
import battle2023.ucp.Entities.tablero;


public class Main
{
    public static void main(String[] args) {

        verboard();

    }




    public static void printShape(int[][] shape) {
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                System.out.print(shape[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ProbarRotacionDogPieceLeft(){

        pieceDogLeft dogPieceLeft = new pieceDogLeft();

        System.out.println("Forma de DogLeft");
        printShape(dogPieceLeft.getShape());
        dogPieceLeft.rotateLeft();
        System.out.println("---------ROTAR IZQUIERDA--------");
        printShape(dogPieceLeft.getShape());
        dogPieceLeft.rotateRight();
        System.out.println("-------ROTAR DERECHA(Vuelve al original)---------");
        printShape(dogPieceLeft.getShape());
        dogPieceLeft.rotateRight();
        System.out.println("-------ROTAR DERECHA---------");
        printShape(dogPieceLeft.getShape());
        
    }

    public static void ProbarRotacionDogPieceRight(){

        pieceDogRight dogPieceRight = new pieceDogRight();

        System.out.println("Forma de DogRight");
        printShape(dogPieceRight.getShape());
        dogPieceRight.rotateLeft();
        System.out.println("---------ROTAR IZQUIERDA--------");
        printShape(dogPieceRight.getShape());
        dogPieceRight.rotateRight();
        System.out.println("-------ROTAR DERECHA(Vuelve al original)---------");
        printShape(dogPieceRight.getShape());
        dogPieceRight.rotateRight();
        System.out.println("-------ROTAR DERECHA---------");
        printShape(dogPieceRight.getShape());
        
    }

    public static void ProbarRotacionpieceT(){

        pieceT pieceT = new pieceT();

        System.out.println("Forma de T");
        printShape(pieceT.getShape());
        pieceT.rotateLeft();
        System.out.println("---------ROTAR IZQUIERDA--------");
        printShape(pieceT.getShape());
        pieceT.rotateRight();
        System.out.println("-------ROTAR DERECHA(Vuelve al original)---------");
        printShape(pieceT.getShape());
        pieceT.rotateRight();
        System.out.println("-------ROTAR DERECHA---------");
        printShape(pieceT.getShape());
        
    }

    public static void ProbarRotacionpieceLLeft(){

        pieceLLeft pieceL = new pieceLLeft();

        System.out.println("Forma de L");
        printShape(pieceL.getShape());
        pieceL.rotateLeft();
        System.out.println("---------ROTAR IZQUIERDA--------");
        printShape(pieceL.getShape());
        pieceL.rotateRight();
        System.out.println("-------ROTAR DERECHA(Vuelve al original)---------");
        printShape(pieceL.getShape());
        pieceL.rotateRight();
        System.out.println("-------ROTAR DERECHA---------");
        printShape(pieceL.getShape());
        
    }

    public static void ProbarRotacionpieceLRight(){

        pieceLRight pieceL = new pieceLRight();

        System.out.println("Forma de L");
        printShape(pieceL.getShape());
        pieceL.rotateLeft();
        System.out.println("---------ROTAR IZQUIERDA--------");
        printShape(pieceL.getShape());
        pieceL.rotateRight();
        System.out.println("-------ROTAR DERECHA(Vuelve al original)---------");
        printShape(pieceL.getShape());
        pieceL.rotateRight();
        System.out.println("-------ROTAR DERECHA---------");
        printShape(pieceL.getShape());
        
    }

    public static void ProbarRotacionpieceStick(){

        pieceStick pieceL = new pieceStick();

        System.out.println("Forma de L");
        printShape(pieceL.getShape());
        pieceL.rotateLeft();
        System.out.println("---------ROTAR IZQUIERDA--------");
        printShape(pieceL.getShape());
        pieceL.rotateRight();
        System.out.println("-------ROTAR DERECHA(Vuelve al original)---------");
        printShape(pieceL.getShape());
        pieceL.rotateRight();
        System.out.println("-------ROTAR DERECHA---------");
        printShape(pieceL.getShape());
        
    }


    public static void verboard(){
        int rows = 10;
        int cols = 20;

        // Crear un tablero de 10x20 elementos
        tablero board = new tablero(rows, cols);
        pieceSquare square = new pieceSquare();

        board.colocarpieza(5, 10, square);
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

        // Imprimir el tablero en la consola (opcional)
        //  board.printBoard();
        System.out.println("currentPieceRow: " + board.getCurrentPieceRow());
        System.out.println("currentPieceCol: " + board.getCurrentPieceCol());
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


        System.out.println("--------------------------------------------------");
        board.printBoard();

       // for (int col = 0; col < 100; col++) {
        //    board.tick();
       //     board.printBoard();
        //    System.out.println("---------------------------------------------------");
        //}

        board.printShapeCurrentPiece();

        board.printBoard();







        







    }   

}