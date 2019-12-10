package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {
    @Test
    public void movePositionHawFigure() {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        logic.add(bishopBlack);
        boolean rst = logic.move(Cell.C1, Cell.G5);
        assertThat(rst, is(true));
    }
    @Test
    public void movePositionHawNotFigure() {
        Logic logic = new Logic();
        boolean rst = logic.move(Cell.C1, Cell.G5);
        assertThat(rst, is(false));
    }
    @Test
    public void moveHawFigure() {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        BishopBlack bishopBlack1 = new BishopBlack(Cell.E3);
        logic.add(bishopBlack);
        logic.add(bishopBlack1);
        boolean rst = logic.move(Cell.C1, Cell.G5);
        assertThat(rst, is(false));
    }
}
