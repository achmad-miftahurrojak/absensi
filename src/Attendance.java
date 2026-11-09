public class Attendance {
    private String name;
    private String date;
    private String status;

    public Attendance() {
    }

    public Attendance(String name, String date, String status) {
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public String getStatus() {
        return this.status;
    }
}