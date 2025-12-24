class Solution {
    public String majorityFrequencyGroup(String s) {
        int n=s.length();
        boolean[] visited=new boolean[26];
        int maxGroupSize=0;
        int maxFreq=0;
        String result="";
        for(int i=0;i<n;i++)
            {
                char c=s.charAt(i);
                if (visited[c-'a'])
                    continue;
                visited[c-'a']=true;
                int freq=0;
                for(int j=0;j<n;j++)
                    {
                        if(s.charAt(j)==c)
                            freq++;
                        
                    }
                StringBuilder group=new StringBuilder();
                for(int k=0;k<26;k++)
                    {
                        if(!visited[k])
                        {
                            char ch=(char)('a'+k);
                            int count=0;
                            for(int j=0;j<n;j++)
                                {
                                    if(s.charAt(j)==ch)
                                        count++;
                                }
                            if(count ==freq && count>0)
                            {
                                group.append(ch);
                                visited[k]=true;
                            }
                        }
                    }
                    group.append(c);
                if (group.length()>maxGroupSize||(group.length()==maxGroupSize&& freq>maxFreq))
                {
                    maxGroupSize=group.length();
                    maxFreq=freq;
                    result=group.toString();
                }
            }
        return result;
    }
}
    
              