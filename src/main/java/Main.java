import Model.Task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        JsonReader reader = new JsonReader(new FileReader("Test.json"));
        Gson gson = new Gson();




        Task[] task =  gson.fromJson(reader, Task[].class);

        List<Task> tasks = Arrays.asList(task);

        tasks.forEach(i -> System.out.println(i.toString()));

    }

}