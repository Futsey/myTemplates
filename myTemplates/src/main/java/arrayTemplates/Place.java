package arrayTemplates;

import java.util.Objects;

public class Place {
    private int row;

    private int cell;

    public Place(int row, int cell) {
        this.row = row;
        this.cell = cell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Place place = (Place) o;
        return row == place.row &&
                cell == place.cell;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, cell);
    }

    @Override
    public String toString() {
        return "Place{" +
                "row=" + row +
                ", cell=" + cell +
                '}';
    }
}
