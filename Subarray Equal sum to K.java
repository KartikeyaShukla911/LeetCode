//Subarrya Equal sum to K

//Approach 1
public int subarraySum(int[] nums, int k) {
        
        int n = nums.length;
        int i,j;
        int cnt=0;
        for(i=0;i<n;i++)
        {
            int sum=nums[i];
            if(sum==k)
                {
                    cnt++;
                }
            for(j=i+1;j<n;j++)
            {
                sum += nums[j];
                if(sum==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }

// Approach 2
int n = nums.length,low=0,high=0,cnt=0,sum=0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
            
            int remove = sum -k;

            cnt += hm.getOrDefault(remove,0);

            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return cnt;
    }