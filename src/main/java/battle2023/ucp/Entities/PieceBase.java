package battle2023.ucp.Entities;

import battle2023.ucp.interfaces.iRotator;

public abstract class PieceBase implements iRotator {
    protected int[][] shape;

    public int[][] getShape() {
        return shape;
    }

    public void setShape(int[][] value) {
        shape = value;
    }

    // Declara los métodos abstractos para la rotación
    public abstract void rotateLeft();
    public abstract void rotateRight();
    
}

    

