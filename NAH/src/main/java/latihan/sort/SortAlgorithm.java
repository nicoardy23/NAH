package latihan.sort;

public class SortAlgorithm {
	StringBuilder sBuild = new StringBuilder();
	
	public String selectionSortASCInt(int[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        int container = 0;

        sBuild.setLength(0);
        //before
//        System.out.println("\n==BEFORE==");
        for (int num:nums)//PROSES LOOPING MERANGKAI ARRAY KE VARIABEL bef
        {
            bef = sBuild.append(num).append(",").toString();//INPUT DATA ARRAY 1 PER 1 
        }

//        System.out.print(bef.substring(0,bef.length()-1));//MENGHILANGKAN TANDA KOMA TERAKHIR, LALU PRINT ISI VARIABEL bef

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz] > nums[j])
                    {
                        initz = j;// INIT PEMBANDING DI OPER DARI INDEX KURSOR KE INDEX ANGKA TERKECIL
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
            
        } //END logic PROCESS
        sBuild.setLength(0);
        //after
//        System.out.println("\n\n==AFTER==");
        for (int num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.println(aft.substring(0,aft.length()-1));
        
        return aft;
    }//end of the procedure selectionSortASCInt
	
	public String bubbleSortASCInt(int[] nums){
        String bef = "";
        String aft = "";
        int loopNext = 0;
        int container = 0;
        
        sBuild.setLength(0);
        //before
//        System.out.println("\n====BEFORE====");
        for (double num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }
//        System.out.print(bef.substring(0,bef.length()-1));
        
        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
                if(nums[j]>nums[loopNext])
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }
        sBuild.setLength(0);
        //after
//        System.out.println("\n\n==AFTER==");
        for (int num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.println(aft.substring(0,aft.length()-1));
        
        return aft;
    }
}
