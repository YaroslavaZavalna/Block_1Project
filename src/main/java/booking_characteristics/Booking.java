package booking_characteristics;

import booking_characteristics.PaymentStatus;
import movie_characteristics.Movie;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private LocalDate bookDate;
    private PaymentStatus paymentStatus;
    private List<Movie>bookedMovies;
    private static int amountOfBookings = 0;

    public Booking(LocalDate bookDate, PaymentStatus paymentStatus, List<Movie> bookedMovies) {
        this.bookDate = bookDate;
        this.paymentStatus = paymentStatus;
        this.bookedMovies = bookedMovies;
        amountOfBookings+=1;
    }

    public LocalDate getBookDate() {
        return bookDate;
    }

    public void setBookDate(LocalDate bookDate) {
        this.bookDate = bookDate;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public List<Movie> getBookedMovies() {
        return bookedMovies;
    }

    public void setBookedMovies(List<Movie> bookedMovies) {
        this.bookedMovies = bookedMovies;
    }

    public int getAmountOfBookings() {
        return amountOfBookings;
    }

    @Override
    public String toString() {
        return "bookDate=" + bookDate +
                ", paymentStatus=" + paymentStatus +
                ", bookedMovies=" + bookedMovies ;
    }
}
