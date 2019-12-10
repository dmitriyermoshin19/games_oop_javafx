package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void methodPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell pos = bishopBlack.position();
        assertThat(pos, is(Cell.A1));
    }
    @Test
    public void methodCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure dest = bishopBlack.copy(Cell.B1);
        assertThat(dest.position(), is(Cell.B1));
    }
    @Test
    public void methodWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = bishopBlack.way(Cell.C1, Cell.G5);
        assertThat(steps, is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
    @Test
    public void methodIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean rst = bishopBlack.isDiagonal(Cell.C1, Cell.G5);
        assertThat(rst, is(true));
    }
}
