public class ItemsList {

private String items;
private String date;
private double unfinished;
private double estimated;

    public ItemsList (){
        this.items = " ";
        this.date = "";
        this.unfinished = 0;
        this.estimated = 0;
    }
    public ItemsList (String items, String date, double unfinished, double estimated){
        this.items = items;
        this.date = date;
        this.unfinished = unfinished;
        this.estimated = estimated;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getUnfinished() {
        return unfinished;
    }

    public void setUnfinished(double unfinished) {
        this.unfinished = unfinished;
    }

    public double getEstimated() {
        return estimated;
    }

    public void setEstimated(double estimated) {
        this.estimated = estimated;
    }
}
