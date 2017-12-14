package Model;

import java.util.List;

public class Task {


    private String number;
    private Owner owner;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }






    @Override
    public String toString() {
        return "Task{" +
                "number='" + number + '\'' +
                '}' + owner.toString();
    }




    private class Owner{

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

}