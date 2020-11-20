public abstract class Instrument
{
    private String name;

    public Instrument (String name)
    {
        this.name = name;
    }

    public abstract void play();
}