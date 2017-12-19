package Model;

import java.util.ArrayList;
import java.util.List;

public class Workers {




    public List<Users> users;

    public List<Users> getUsers() {
        return users;
    }



    public Workers(){

        users = new ArrayList<>();

    }

    @Override
    public String toString() {
        return users.toString();
    }

    public class Users{
        private String lastName = "";
        private String name = "";
        private String id = "";

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "\""+
                    lastName +
                    " " + name + "\"";
        }
    }


}


/*

        "workers": {"users": [{
        "lastName": "Коршунов",
        "name": "Андрей",
        "id": 576946
    }]},

   */