package build;

public class ActorController {
    public  Actor construst(ActorBuilder actorBuilder){
        Actor actor;
         actorBuilder.buildFace();
         actorBuilder.buildType();
         actorBuilder.buildSex();
         actorBuilder.buildCostume();
         actorBuilder.buildHairstyle();
         actor=actorBuilder.creatActor();
         return  actor;
    };
}
