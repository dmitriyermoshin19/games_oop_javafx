package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Arrays;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {

        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", source, dest)
            );
        }
        int size = Math.abs(source.x - dest.x);
        Cell[] steps = new Cell[size];
        int deltaX = Integer.compare(dest.x,source.x);
        int deltaY = Integer.compare(dest.y,source.y);
        for (int index = 0; index < size; index++) {
            int newX = source.x + deltaX * (index + 1);
            int newY = source.y + deltaY * (index + 1);
            for (Cell c : Cell.values()) {
                if (newX == c.x && newY == c.y) {
                    steps[index] = c;
                    break;
                }
            }
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(source.x - dest.x) == Math.abs(source.y - dest.y);
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }


    public static void main(String[] args) {
        Cell dest = Cell.C1;
        Cell source = Cell.G5;
        int size = Math.abs(source.x - dest.x);
        Cell[] steps = new Cell[size];
        int deltaX = Integer.compare(dest.x,source.x);
        int deltaY = Integer.compare(dest.y,source.y);
        for (int index = 0; index < size; index++) {
            int newX = source.x + deltaX * (index + 1);
            int newY = source.y + deltaY * (index + 1);
            for (Cell c : Cell.values()) {
                if (newX == c.x && newY == c.y) {
                    steps[index] = c;
                }
            }
        }

            System.out.println(Arrays.toString(steps));

    }
}
