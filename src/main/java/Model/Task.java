package Model;

import java.util.List;
import java.util.Map;

public class Task {


    private String number;
    private WithNestredId owner;
    private String decription;
    private String status;
    private String title;
    private String createDate;
    private String id;
    private WithNestredId project;
    private String startTime;
    private String endTime;

    private Map<Integer, String>  customData;

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
        return decription;
    }
    public void setDecription(String decription) {
        this.decription = decription;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {this.number = number;
    }
    private class WithNestredId{

        private String id;

        public String getId() {
            return id;
        }


        public void setId(String id) {
            this.id = id;


        }

        @Override
        public String toString() {
            return "Owner{" +
                    "id='" + id + '\'' +
                    '}';
        }


    }
    @Override
    public String toString() {

            if(customData != null)
            {
            customData.forEach((i,k) -> System.out.println(customData.get(i)));
            }

        return "Task{" +
                ", id='" + id + '\'' +
                ", createDate='" + createDate + '\'' +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", decription='" + decription + '\'' +
                ", owner=" + owner.toString() +
                ", number='" + number + '\'' +
                '}';
    }

}