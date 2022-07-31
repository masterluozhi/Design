package vistor;

public class FADepartment extends  Department{
    @Override
    public void visit(FulltimeEmployee fulltimeEmployee) {
        Double weeklyMage = fulltimeEmployee.getWeeklyMage();
        int work = fulltimeEmployee.getWork();
        if (work>40) {
            weeklyMage = weeklyMage - (work - 40) + 100;
        }else {
            weeklyMage = weeklyMage - ( 40-work) + 100;
            if (weeklyMage<0){
                weeklyMage=0.0;
            }
        }
        System.out.println("正式员工"+fulltimeEmployee.getName()+"实际工资"+weeklyMage+"元");
    }

    @Override
    public void visit(ParttimeEmployee parttimeEmployee) {
        int work = parttimeEmployee.getWork();
        Double hourWage = parttimeEmployee.getHourWage();
        System.out.println("临员工"+parttimeEmployee.getName()+"实际工资"+parttimeEmployee.getWork()*hourWage+"元");

    }
}
