import java.text.SimpleDateFormat;
import java.util.Date;

public class Trade {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yy");
    private int id;
    private String book;
    private double presentValue;
    private Date tradeDate;

    public Trade(int id, String book, double presentValue, Date tradeDate) {
        this.id = id;
        this.book = book;
        this.presentValue = presentValue;
        this.tradeDate = tradeDate;
    }


    public static Trade crateTrade(String line)
    {
        String[] fields = line.split(",");
        Date date = null;
        try {
            date = DATE_FORMAT.parse(fields[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Trade (Integer.parseInt(fields[0]),
                fields[1],
                Double.parseDouble(fields[2]),
                date);
    }

    public int getId() {
        return id;
    }

    public String getBook() {
        return book;
    }

    public double getPresentValue() {
        return presentValue;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", book='" + book + '\'' +
                ", presentValue=" + presentValue +
                ", tradeDate=" + tradeDate +
                '}';
    }

}
