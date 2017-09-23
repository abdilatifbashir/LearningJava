class e10{ 
    public static void main(String[] args){ 
        //main program here... 
        int[] digits={0,0,0,0};
        int multi=0;
        for(int i=0;i<99;i++)
            for(int j=i;j<99;j++)
            {
                if(i%10==0 && j%10==0)continue;
                multi=i*j;
                if(multi/1000==0)continue;
                digits[0]=i/10;digits[1]=i%10;
                digits[2]=j/10;digits[3]=j%10;
                //System.out.println(i+"*"+j+"="+i*j);
                boolean flag=false;
                int a=0;
                for(int l=0;l<4;l++)
                {
                    a=multi%10;
                    flag=false;
                    //System.out.println("digits:"+digits[0]+","+digits[1]+","+digits[2]+","+digits[3]);
                    //System.out.println("a="+a);
                    for(int k=0;k<4;k++)
                    {
                        if(digits[k]==a)
                        {
                            digits[k]=-1;
                            flag=true;
                            break;
                        }
                    }
                    if(!flag)break; 
                    multi/=10;  
                }
                if(!flag)continue;
                else System.out.println(i*j);  
            }
    }
}
