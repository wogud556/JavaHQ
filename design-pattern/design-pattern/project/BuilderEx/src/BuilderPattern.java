public class BuilderPattern {
    public static void main(String[] args){
        PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();

        PersonInfo result = personInfoBuilder
            .setName("name")
            .setAge(20)
            .setFavoriteAnimal("cat")
            .setFavoriteColor("black")
            .setName("JDN")
            .setFavoriteNumber(7)
            .build();
        System.out.println(result.getPersonInfo());
    }
}