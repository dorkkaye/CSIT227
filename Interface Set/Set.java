class Set implements InterfaceSet
{
    private int[] set;
    private int count;

    public Set()
    {
        set = new int[MAX];
        count = 0;
    }

    public Set(int size)
    {
        this.set = new int[size];
    }

    public void setSet(int[] set)
    {
        this.set = set;
    }

    public void setCount(int count)
    {
        if(count <= MAX)
            this.count = count;
    }
    
    public int[] getSet()
    {
        return set;
    }

    public int getCount()
    {
        return count;
    }

    public void add(int e)
    {
        if(!contains(e) && count < set.length)
            set[count++] = e;
    }

    private boolean contains(int e)
    {
        boolean found = false;

        for(int i = 0; i < count; i++)
        {
            if(set[i] == e)
            {
                found = true;
                break;
            }
        }

        return found;
    }

    public void display()
    {
        for(int i = 0; i < count && i < set.length; i++)
            System.out.println(set[i] + " ");

        System.out.println();
    }

    public int count()
    {
        for(int i = 0; i < set.length; i++)
            count++;

        return count - 10;
    }

    public boolean isElementOf(int e)
    {
        for(int i = 0; i < set.length; i++)
        {
            if(set[i] == e)
                return true;
        }

        return false;
    }

    public int getElement(int index)
    {
        int element = 0;

        for(int i = 0; i < set.length; i++)
        {
            if(i == index)
                element = set[i];
        }

        return element;
    }

    public Set union(Set s)
    {
        Set result = new Set(this.getCount() + s.getCount());
        
        for(int i = 0; i < count; i++)
            result.add(this.set[i]);
        
        for(int j = 0; j < s.getCount(); j++)
            result.add(s.set[j]);

        return result;
    }
}
