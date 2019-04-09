/**
 Represent a pair of values of an arbitrary type,
 for which the compiler helpfully imposes the requirement
 that they be the SAME arbitrary type.
 based on _Core Java_ v10, by Cay Horstmann
 */
public class Pair<Integer>
{
    private Integer first;
    private Integer second;

    public Pair( Integer first, Integer second) {
        this.first =  first;
        this.second = second;
        }

    public Integer getFirst()  { return first; }
    public Integer getSecond() { return second; }
}
