import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
// CLASS BEGINS, THIS CLASS IS REQUIRED
class PairInt{
	int first, second;
	PairInt(){}
	PairInt(int first, int second){
		this.first=first;
		this.second=second;
	}
}
public class ClosestLocations
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    //reuquirements:
    //N total totalCrates
    //M truckCapacity
    //truck location is (0,0)
    public static List<PairInt> closestLocations(int totalCrates, 
                                   List<PairInt> allLocations, 
                                   int truckCapacity)
	{
        // WRITE YOUR CODE HERE
        long [] distance=new long[totalCrates];
        List<PairInt> res=new ArrayList<PairInt>();
        HashMap<Long, List<PairInt>> map=new HashMap<Long, List<PairInt>>();
        int i=0;
        for(PairInt pair: allLocations){
            distance[i]=pair.first*pair.first+pair.second*pair.second;
            List<PairInt> list=map.getOrDefault(distance[i], new ArrayList<PairInt>());
            list.add(pair);
            map.put(distance[i], list );
            i++;
        }
        Arrays.sort(distance);
        for(i=0; i<truckCapacity;){
            List<PairInt> list=map.get(distance[i]);
            int k=0;
            while(i<truckCapacity && k<list.size()){
                res.add(list.get(k));
                i++;
                k++;
            }
        }
        return res;
    }
    // METHOD SIGNATURE ENDS
    public static void main(String args[]) {
    	PairInt p1=new PairInt(2,4);
    	PairInt p2=new PairInt(3,6);
    	PairInt p3=new PairInt(5,3);
    	PairInt p4=new PairInt(2,7);
    	PairInt p5=new PairInt(1,8);
    	PairInt p6=new PairInt(7,9);
    	List<PairInt> list=new ArrayList<PairInt>();
    	list.add(p1);
    	list.add(p2);
    	list.add(p3);
    	list.add(p4);
    	list.add(p5);
    	list.add(p6);
    	closestLocations(6,list,3);
    }
}
