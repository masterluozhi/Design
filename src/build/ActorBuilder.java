package build;

public abstract  class ActorBuilder {
    public   Actor actor=new Actor();
    public  abstract  void buildType();
    public  abstract  void buildSex();
    public  abstract  void buildFace();
    public  abstract  void buildCostume();
    public  abstract  void buildHairstyle();

    public Actor creatActor(){
        return  actor;
    }
}
