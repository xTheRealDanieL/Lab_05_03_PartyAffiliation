public class Main
{
    public static void main(String[] args)
    {
        String party="i";

        System.out.println("Choose your party affiliation (D,R,I,Other)");
        System.out.println("You chose " + party);

        if (party.equalsIgnoreCase("d"))
        {
            System.out.println("You get a Democrat Donkey");
        }
        else if (party.equalsIgnoreCase("r"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (party.equalsIgnoreCase("i"))
        {
            System.out.println("You get an Independent Person");
        }
        else
        {
            System.out.println("Other");
        }
    }
}