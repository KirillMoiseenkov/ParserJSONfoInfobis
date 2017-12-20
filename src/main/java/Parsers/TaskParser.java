package Parsers;

import Model.Task;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class TaskParser {

   public   List<Task> tasks;


    public TaskParser() throws FileNotFoundException {
        JsonReader reader = new JsonReader(new FileReader("Test.json"));
        Gson gson = new Gson();


        Task[] taskAr = gson.fromJson(reader, Task[].class);

        tasks = Arrays.asList(taskAr);

     //   tasks.forEach(i -> System.out.println(i.toString()));
    }
}