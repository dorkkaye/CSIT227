public class SetImp implements Set 
{
    private int[] set;
    private int count;

    public SetImp()
    {
        set = new int[MAX];
        count = 0;
    }

    public void add(int e)
    {
        if(!contains(e))
            set[count++] = e;
    }

    private boolean contains(int e)
    {
        boolean found = false;

        for(int i = 0; i < count; i++)
        {
            if(set[i] == e)
            {
                fount = true;
                break;
            }
        }

        return found;
    }

    public void display()
    {
        for(int i = 0; i < count; i++)
            System.out.println(set[i] + " ");
        
        System.out.println();
    }


    //public Set union(Set s);
    //public Set intersection(Set s);
    //public boolean isDisjoint(Set s);
    //public Set difference(Set s);
    //public boolean isElementOf(int e);
    //public int count();
}