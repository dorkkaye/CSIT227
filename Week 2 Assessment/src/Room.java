public class Room
{
    String buildingCode;
    int roomNumber;
    
    public Room(){}
    
    public Room(String b, int r)
    {
        buildingCode = b;
        roomNumber = r;
    }
    //your code
    public void setBuildingCode(String buildingCode)
    {
        this.buildingCode = buildingCode;
    }
    
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }
    
    public String getBuildingCode()
    {
        return buildingCode;
    }
    
    public int getRoomNumber()
    {
        return roomNumber;
    }
    
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        
        sb.append(buildingCode + "-" + roomNumber);
    
        return sb.toString();
    }
}
