package Parsers;

import Model.Projects;
import Model.Task;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;




public class ProjectParser {


    public List<Projects> projectes;

    public ProjectParser() throws FileNotFoundException {
        JsonReader reader = new JsonReader(new FileReader("projectName.json"));
        Gson gson = new Gson();
        Projects[] projectAr = gson.fromJson(reader, Projects[].class);
        projectes = Arrays.asList(projectAr);
        //projectes.forEach(i -> System.out.println(i.toString()));
    }

}