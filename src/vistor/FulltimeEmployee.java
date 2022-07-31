package vistor;

public class FulltimeEmployee implements Employee{
 private String name;
 private Double weeklyMage;
 private int work;


    public FulltimeEmployee(String name, Double weeklyMage, int work) {
        this.name = name;
        this.weeklyMage = weeklyMage;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeeklyMage() {
        return weeklyMage;
    }

    public void setWeeklyMage(Double weeklyMage) {
        this.weeklyMage = weeklyMage;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }
}
