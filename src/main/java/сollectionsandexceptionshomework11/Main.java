package сollectionsandexceptionshomework11;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Board oak1 = new Board("oak", 1.0f);
        Board oak2 = new Board("oak", 1.5f);
        Board oak3 = new Board("oak", 2.0f);

        Board pine1 = new Board("oak", 2.0f);
        Board pine2 = new Board("pine", 2.5f);
        Board pine3 = new Board("pine", 3.0f);
        Board pine4 = new Board("oak", 1.5f);

        Board maple1 = new Board("oak", 2.0f);
        Board maple2 = new Board("pine", 2.5f);
        Board maple3 = new Board("pine", 3.0f);
        Board maple4 = new Board("oak", 1.0f);

        Set<Board> oakBoards = new HashSet<>();
        oakBoards.add(oak1);
        oakBoards.add(oak2);
        oakBoards.add(oak3);

        Set<Board> pineBoards = Set.of(pine1, pine2, pine3, pine4);

        Set<Board> mapleBoards = Set.of(maple1, maple2, maple3, maple4);


        Uniator.union(oakBoards, pineBoards);

        Uniator.intersect(oakBoards, pineBoards); //якщо приймаємо дві колекції

        Uniator.intersect(oakBoards, pineBoards, mapleBoards); //для множинності колекцій

    }
}
