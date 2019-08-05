package hall_characteristics;

public class Seat {
    private SeatType seatType;

    public Seat(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return "Seat " +
                "placeType=" + seatType +
                "\n";
    }
}
