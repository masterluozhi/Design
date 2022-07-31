package vistor;

public class ParttimeEmployee implements Employee{
    private String name;
    private Double hourWage;
    private int work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getHourWage() {
        return hourWage;
    }

    public void setHourWage(Double hourWage) {
        this.hourWage = hourWage;
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
