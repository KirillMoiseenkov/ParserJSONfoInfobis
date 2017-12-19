import Model.EndVary;
import Model.Task;
import Parsers.ProjectParser;
import Parsers.TaskParser;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Service {


    List<EndVary> endVaries = new ArrayList<>();

    public Service() throws FileNotFoundException {

        TaskParser taskParser = new TaskParser();
        ProjectParser projectParser = new ProjectParser();

        for(Task t: taskParser.tasks){
                t.fillCustom();
                EndVary endVary = new EndVary();
                endVary.setId(t.getId());
                endVary.setDecription(t.getDecription());
                endVary.setNumber(t.getNumber());
                endVary.setStartTime(t.getStartTime());
                endVary.setDuration(t.getDuration());
                endVary.setTitle(t.getTitle());
                endVary.setStatus(t.getStatus());
                endVary.setCreateDate(t.getCreateDate());
                endVary.setWorkers(t.getWorkers());
                endVary.setCustomData(t.getCustomDataNes());

            endVaries.add(endVary);
//            if(endVary.getCustomData() != null)
        //    System.out.println(endVary.getCustomData().toString());

            System.out.println(endVary.toString().replace("]","").replace("[",""));


            //if(endVary.getWorkers()!=null && endVary.getWorkers().getUsers()!=null) {
               // System.out.println(endVary.getWorkers().toString());
            //}
        }

    }
}