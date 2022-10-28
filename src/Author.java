public class Author {
    private String name;
    private String surname;

    public Author(String firstName, String lastName){
        this.name = firstName;
        this.surname = lastName;
    }
    public String toString() {
        return name + " " + surname;
    }
    public boolean equals(Object other){
        if(other == null||this.getClass() != other.getClass()){
            return false;
        }
        if(this == other) {
            return true;
        }
        Author author1  = (Author) other;
        return name.equals(author1.name) && surname.equals(author1.surname);
    }
    public int hashCode(){
        return java.util.Objects.hash(name, surname);
    }
}



