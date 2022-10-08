

class loop {
    public static void main(String args[])
    {
        int size = args.length;
        System.out.println("No of elements : "+size);
        // for (int i=0;i<size;i++)
        // {
        //     System.out.println(args[i]);
        // }
        int i=0;
        float sum =0;
        while(size>i)
        {
            sum  = sum + Float.parseFloat(args[i]) ;
            i++;
        }
        System.out.println("Sum of element is : " +sum);
    }
}
