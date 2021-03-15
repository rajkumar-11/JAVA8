public class VoterList
{
static private int voters=0;
int totalVoters;
private static synchronized int Counter()
{
    return ++voters;
}
public void getTotalVoterCount()
{
    totalVoters=Counter();
}

}
