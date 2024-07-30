class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0;
        for(int i=0,j=0;i<g.length;i++)
        {
            if(j<s.length)
            {
                if(g[i]<=s[j])
                {
                    g[i]-=s[j];
                    
                    cnt++;
                }
                else 
                i--;
                j++;
            }
        }
        
        // for(int i=0;i<g.length;i++)
        // if(g[i]==0)
        // cnt++;
        return cnt;
        
    }
}