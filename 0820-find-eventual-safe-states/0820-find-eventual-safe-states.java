enum States{
    kinit,
    kvisiting,
    kvisited,
}
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> arr=new ArrayList<>();
        int n=graph.length;
        States[] state=new States[n];
        for(int i=0;i<n;i++)
        {
            if(!hashcycle(graph,i,state))
            {
                arr.add(i);
            }
        }
        return arr;
    }
    public boolean hashcycle(int[][] graph,int i,States[] state)
    {
        if(state[i]==States.kvisiting)
        {
            return true;
        }
        if(state[i]==States.kvisited)
        {
            return false;
        }
        state[i]=States.kvisiting;
        for(final int v:graph[i])
        if(hashcycle(graph,v,state)){
            return true;
        }
        state[i]=States.kvisited;
        return false;
    }
}