


public enum  EnumClass {

    WEST("this is west"),
    NORTH("this is north"),
    EAST("this is east"),
    SOUTH("this is south");


    private String description;

    private EnumClass(String description){
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {



        for (EnumClass enumClass:EnumClass.values()){
            System.out.println(enumClass+" :"+enumClass.getDescription());
        }


//        for (Shrubbery shrubbery : Shrubbery.values()) {
//            System.out.println(shrubbery + "->ordinal: " + shrubbery.ordinal());
//            System.out.println("name(): "+shrubbery.name());
//            System.out.println("valueOf(): "+shrubbery.valueOf(shrubbery.name()));
//            System.out.println("toString(): "+shrubbery.toString());
//        }


//        for (String s : "GROUP GRAWLINE HANGING".split(" ")) {
//
//            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
//
//            System.out.println(shrubbery);
//        }
    }

}
