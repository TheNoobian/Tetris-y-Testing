package battle2023.ucp.Entities;

public class Tetris {

    public tablero miTablero;
    private clock miClock;

    public Tetris(int rows, int cols) {
        miTablero = new tablero(rows, cols);
        miClock = new clock();
    }


    public void iniciarJuego() {
        int rows = 10;
        int cols = 20;
        miTablero = new tablero(rows, cols);
        miTablero.spawnRandomPiece();
        miTablero.placeRandomPiece();
        // Iniciar el juego llamando a los métodos de tu objeto tablero (miTablero)
        // Por ejemplo, puedes colocar una pieza inicial en el tablero.
        //PieceBase piezaInicial = miTablero.spawnRandomPiece();
       // miTablero.colocarpieza(0, 5, piezaInicial);
       int lastRow = rows - 1;
       for (int col = 0; col < cols; col++) {
        miTablero.setCell(lastRow, col, 2);
    }

        // aca se continua realizando las operaciones de inicializacion del juego según sea necesario.
    }

    public void tick() {
        miTablero.tick();
        miClock.incrementTickCount(); // Incrementa el tickCount en el objeto clock
    }


    public void rotateLeft(){
        miTablero.clearCurrentPiece();
        miTablero.currentPiece.rotateLeft();
        miTablero.placeCurrentPiece();
    }

    public void rotateRight(){
        miTablero.clearCurrentPiece();
        miTablero.currentPiece.rotateRight();
        miTablero.placeCurrentPiece();
    }

    public void state(){
        miTablero.status();
    }

    public int getTickCount() {
        return miClock.getTickCount(); // Delega la obtención de tickCount al objeto clock
    }
    



    
    

}
