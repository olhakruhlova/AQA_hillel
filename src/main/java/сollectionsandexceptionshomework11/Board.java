package сollectionsandexceptionshomework11;

import java.util.Objects;

public class Board {

    private String kindOfTree;
    private float length;


    Board(String kindOfTree, float length) {
        this.length = length;
        this.kindOfTree = kindOfTree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Float.compare(board.length, length) == 0 && Objects.equals(kindOfTree, board.kindOfTree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kindOfTree, length);
    }

    @Override
    public String toString() {
        return "Board{" +
                "kindOfTree='" + kindOfTree + '\'' +
                ", length=" + length +
                '}';
    }

    public String getKindOfTree() {
        return kindOfTree;
    }

    public float getLength() {
        return length;
    }
}
