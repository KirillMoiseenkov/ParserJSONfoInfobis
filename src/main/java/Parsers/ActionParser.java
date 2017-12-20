package Parsers;

import Model.Action;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class ActionParser {

        public List<Action> actions;


        public ActionParser() throws FileNotFoundException {

            JsonReader reader = new JsonReader(new FileReader("actions.json"));
            Gson gson = new Gson();
            Action[] actionAr = gson.fromJson(reader, Action[].class);
            actions = Arrays.asList(actionAr);

             //   actions.forEach(action -> System.out.println(action));
        }
}