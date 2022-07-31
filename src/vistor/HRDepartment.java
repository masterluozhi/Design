package vistor;

public class HRDepartment extends Department{
    @Override
    public void visit(FulltimeEmployee fulltimeEmployee) {
        int work = fulltimeEmployee.getWork();
        System.out.println("正式员工"+fulltimeEmployee.getName()+"实际工资"+work+"小时");
        if (work>40){
            System.out.println("正式员工"+fulltimeEmployee.getName()+"加班时间"+(40-work)+"小时");
        }else {
            System.out.println("正式员工"+fulltimeEmployee.getName()+"请假时间"+(work-40)+"小时");
        }

    }

    @Override
    public void visit(ParttimeEmployee parttimeEmployee) {
        int work = parttimeEmployee.getWork();
        System.out.println("临时员工"+parttimeEmployee.getName()+"实际工资"+work+"小时");
    }
}
