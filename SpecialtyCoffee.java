public class SpecialtyCoffee extends Coffee
{
    private String flavor;

    public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
    {
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    public SpecialtyCoffee(String size, String type, String flavor)
    {
        super(size, false, 1, type);
        this.flavor = flavor;
    }

    public SpecialtyCoffee()
    {
        super();
        flavor = "Vanilla";
    }

    public String toString()
    {
      String s = this.getSize();
      if (this.getIsSkinny())
        s += " skinny";
      return s + " " + this.getIsSkinny() + "-shot " + this.getType() + " with the flavor of " + flavor;
    }


}