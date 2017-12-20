package Controller;

import Model.EndVary;
import Model.Task;
import Parsers.ActionParser;
import Parsers.ProjectParser;
import Parsers.TaskParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Service {



    List<EndVary> endVaries = new ArrayList<>();


    public Service() throws IOException {

        File file = new File("Allah.txt");
        FileWriter fr = new FileWriter(file);



        TaskParser taskParser = new TaskParser();
        ProjectParser projectParser = new ProjectParser();
        ActionParser actionParser = new ActionParser();

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

            final int[] i = {0};
               actionParser.actions.stream().filter(action -> action.getTask().getId() == Integer.parseInt(t.getId())).forEach(item -> {

                   endVary.addToComments(item.getDescrtiption().replace("\n", " "), i[0]);
                    i[0]++;
               });

            endVary.setCustomData(t.getCustomDataNes());

            endVaries.add(endVary);

            try {
                fr.write((endVary.toString().replace("]", "").replace("[", "")).replace("\n",""));
                fr.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
                fr.close();
            }
            //System.out.println((endVary.toString().replace("]", "").replace("[", "")));


        }
            fr.close();
    }
}