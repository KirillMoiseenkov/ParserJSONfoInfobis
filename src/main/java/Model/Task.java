package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task {


    private String number = "";
    private WithNestredId owner;
    private String description ="";
    private String status  = "";
    private String title  = "";
    private String createDate  = "";
    private String id = "";
    private WithNestredId project;
    private String startTime = "";
    private String endTime = "";
    private Workers workers;
    private Map<Integer, String>  customData;
    private List<String> customDataNes;
    private String duration  = "";

    public List<String> getCustomDataNes() {
        return customDataNes;
    }

    public void setCustomDataNes(List<String> customDataNes) {
        this.customDataNes = customDataNes;
    }

    public Workers getWorkers() {
        if(workers !=null)
        return workers;
        else
            return  new Workers();
    }

    public void setWorkers(Workers workers) {
        this.workers = workers;
    }

    public WithNestredId getOwner() {
        return owner;
    }
    public void setOwner(WithNestredId owner) {
        this.owner = owner;
    }
    public WithNestredId getProject() {
        return project;
    }
    public void setProject(WithNestredId project) {
        this.project = project;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
/* public List<Workers> getWorkers() {
        return workers;
    }
    public void setWorkers(List<Workers> workers) {
        this.workers = workers;
    }*/

    public void fillCustom (){
        customDataNes = new ArrayList<>();

        if(customData !=null) {
            customDataNes = new ArrayList<>();
            customDataNes.add(customData.get(50704));
            customDataNes.add(customData.get(49528));
            customDataNes.add(customData.get(50718));
            customDataNes.add(customData.get(50720));

        }else {
            customDataNes.add("");
            customDataNes.add("");
            customDataNes.add("");
            customDataNes.add("");
        }

    }

    public Map<Integer, String> getCustomData() {
        return customData;
    }
    public void setCustomData(Map<Integer, String> customData) {
        this.customData = customData;
    }
    public Map<Integer, String> getContent() {
        return customData;
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
    public String getDecription() {
        return description;
    }
    public void setDecription(String decription) {
        this.description = decription;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {this.number = number;
    }
    private class WithNestredId{

        private String id = "";

        public String getId() {
            return id;
        }


        public void setId(String id) {
            this.id = id;


        }

        @Override
        public String toString() {
            return "\"" +
                    id + "\"";
        }


    }






    @Override
    public String toString() {

            if(customData != null)
            {
            customData.forEach((i, k) -> System.out.println(customData.get(i)));
            }

        if(workers.getUsers()!=null)
        workers.getUsers().forEach(i ->{

            System.out.println(i.toString());


        });

        return "Task{" +
                ", id='" + id + '\'' +
                ", createDate='" + createDate + '\'' +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", decription='" + description + '\'' +
                ", owner=" + owner.toString() +
                ", number='" + number + '\'' +
                '}';
    }

}

