//Problem link - https://www.geeksforgeeks.org/tcs-codevita-holes-and-balls/

package Coding;

public class HolesAndBalls {
    public static void main(String[] args)
    {
        int holes[]={20, 15, 10, 5, 25};
        int balles[]={5, 10, 15, 20, 25, 30, 4, 9, 14, 19};
        int flag=0;

        int[] depth= new int[holes.length];
        int[] position= new int[balles.length];
        for(int k=1;k<=holes.length;k++)
        {
            depth[k-1]=k;
        }

        for(int i=0;i<balles.length;i++)
        {
            flag=0;
            for(int j=holes.length-1;j>=0;j--)
            {
                if (balles[i]<=holes[j] && depth[j]>0)
                {
                    position[i]=j+1;
                    depth[j]--;
                    flag=1;
                    break;

                }

            }
            if(flag==0)
            {
                position[i]=0;
            }
        }
        for (int pos:position) {
            System.out.print(pos +" ");        }



    }
}
