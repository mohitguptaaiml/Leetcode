class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i=0 ;i<s.length(); i++)
        {
            int curr = ValueFinder(s.charAt(i));
            if(i < s.length()-1 && curr<(ValueFinder(s.charAt(i+1)))){
                sum = sum - curr;
            }
            else
            {
                sum = sum + curr;
            }
        }

        return sum;


    }  
    
    public int ValueFinder(char ch)
    {
            switch(ch)
            {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                
            }
            return 0;
    }
}

