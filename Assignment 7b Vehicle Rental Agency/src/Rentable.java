public interface Rentable {
    double getPricePerDay();

    boolean isAvailable();

    void setAvailable(boolean available);
}
