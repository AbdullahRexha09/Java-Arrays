package Arrays;

public class mostFrequentNumberArrrays {

    public static void main(String[] args) {

        mostFrequentNumber(911112222);
    }
    public static void mostFrequentNumber(int n)
    {
        int [] value = new int[10];
        while(n>0)
        {
            int digit = n%10;
            value[digit]+=1;
            n = n/10;
        }
        int temp = 0;
        for(int i = 0;i<value.length;i++)
        {


            if(value[i]>value[temp])
            {
                temp  = i;
            }
        }
        System.out.print("NUmri me se shpeshti i paraqitur eshte:"+temp);

    }
}
