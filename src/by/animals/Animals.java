package by.animals;

public abstract class Animals {
        String view; //вид
        String name; // имя
        String age; // возраст
        String colour; //цвет

        public Animals(String view, String name, String age, String colour) {
                this.view = view;
                this.name = name;
                this.age = age;
                this.colour = colour;
        }

        public String getView() {
                return view;
        }

        public String getName() {
                return name;
        }

        public String getAge() {
                return age;
        }

        public String getColour() {
                return colour;
        }

        public abstract void voice(); // голос
}
