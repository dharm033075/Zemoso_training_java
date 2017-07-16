package Acess_control_and_more_Day_3.assignmentDay3Quest4;

/**
 * Created by zemoso on 16/7/17.
 */
public class TriCycleFactory implements CycleFactories {

    public Cycle1 getCycle(){
           return new TriCycleImplementation();
    }
}
