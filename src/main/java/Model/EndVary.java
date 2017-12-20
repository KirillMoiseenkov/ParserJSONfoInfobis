package Model;

import Parsers.ProjectParser;
import Parsers.TaskParser;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EndVary {

    private List<String> comments;
    private String number = "";
    private String decription = "";
    private String status = "";
    private String title= "";
    private String createDate = "";
    private String id;
//    private String project;
    private String startTime;
    private Workers workers;
    private List<String> customData;
    private String duration;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /*public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }*/

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Workers getWorkers() {
        return workers;
    }

    public void setWorkers(Workers workers) {
        this.workers = workers;
    }

    public List<String> getCustomData() {
        return customData;
    }

    public void setCustomData(List<String> customData) {
        this.customData = customData;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public EndVary() throws FileNotFoundException {

            comments = new ArrayList<>();

    }

    public List<String> getComments() {
        return comments;
    }

    public void addToComments(String comment) {
        if(comment !=null)
        comments.add("|||" + comment);
    }

    private String converter(String forConvert){

        if(forConvert != null)
           return forConvert.replace(",","_");

       return forConvert;
   }


    @Override
    public String toString() {

        if(workers == null)
            workers = new Workers();

        String dur = "";
        if(duration.length() >0)
            dur = String.valueOf(Integer.parseInt(duration) * 1440);




        return
                "\"" +  id.replace(",","_") +
                "-Number-" + number.replace(",","_") +
                        "\",\"" + "AS"+
                        "\",\"" + "AgroSignal"+

                  //      "\",\"" + ""+ //tag
                        "\",\"" + "PlanFix"+
                        "\",\"" +converter(title)  +
                        "\",\"" + createDate.replace(",","_") +
                //        "\",\"" + ""+  //обновлена
                //        "\",\"" + ""+  //завершена - надо спросить
                        "\",\"" + converter(customData.get(2))+  //приоритет
                        "\",\"" + converter(customData.get(3)) +  //50720
                        "\",\"" + status.replace(",","_") +
                        "\"," + workers.toString() +
                    //    "\",\"" + ""+  //оценка
                        ",\"" +converter(decription) + "comments:" + converter(comments.toString()) +
                  //      "\",\"" + ""+  //Планируемый исполнитель
                 //       "\",\"" + ""+  //Планиуруеиая дата начала
                 //       "\",\"" + ""+  //Планиуруеиая дата окончания
                //        "\",\"" + ""+  //ветка
                        "\"," + converter(dur);
                 //       "\",\"" + "0";  //голоса

    }
}