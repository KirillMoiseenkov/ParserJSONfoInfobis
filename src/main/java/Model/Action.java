package Model;

public class Action {


    public  Action(){
        task = new Task();

    }

    public class Task{

        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return  ""+getId();
        }
    }

        private Task task;
        private String descrtiption;


    public Task getTask() {
        return task;
    }

    public String getDescrtiption() {
        //System.out.println("задача = " + task.getId() + " des = " + descrtiption.replaceAll("[\\x00-\\x1F]", ""));  //.replace("\n", " ").replace("\r",""));
        return descrtiption.replace("\n", " ").replace("\r","");  //.replace("\\n", " ").replace("\\r","")replaceAll("[\\x00-\\x1F]", "");

    }

    public void setDescrtiption(String descrtiption) {
        this.descrtiption = descrtiption;
    }

    @Override
    public String toString() {
        return "Action{" +
                "task=" + task.toString() +
                ", descrtiption='" + descrtiption + '\'' +
                '}';
    }
}