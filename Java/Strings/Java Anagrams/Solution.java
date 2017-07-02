    static boolean isAnagram(String a, String b) {
        // Complete the function
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        int a1[]=new int[26];
        int a2[]=new int[26];
        for(int i=0;i<ch1.length;i++){
            a1[Character.getNumericValue(Character.toLowerCase(ch1[i]))-10]++;
        }
        
        for(int i=0;i<ch2.length;i++){
            a2[Character.getNumericValue(Character.toLowerCase(ch2[i]))-10]++;
        }
        if(Arrays.equals(a1,a2))
            return true;    
        else
            return false;
        
    }