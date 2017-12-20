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
        return descrtiption;
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