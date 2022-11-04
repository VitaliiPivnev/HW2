public class HWFirsrLevel {
    public static void main(String[] args) {
        double hoursAsteriksBrewed = 3;
        double hoursObeliskBrewed = hoursAsteriksBrewed/2;
        int correctNumberOfHours = 5;
        double totalBrewed = (hoursAsteriksBrewed + hoursObeliskBrewed);
        boolean readyOrNot = (totalBrewed == correctNumberOfHours);

        System.out.println(readyOrNot);
    }
}
