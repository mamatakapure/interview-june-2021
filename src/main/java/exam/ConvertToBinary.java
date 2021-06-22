

public class ConvertToBinary {

  public String toBinary( int num) {
    int index=0;
    whhile(num>0)
    {
      binary[index++]=num%2;
             num=num/2;
            }
      for(int i=inedx-1;i>=0;i--)
      {
        System.out.print(binary[i]);
      }
  }
  public static void main(String[]args)
  {
    ConvertToBinary obj=new ConvertToBinary();
    System.out.println("binary representation of 124");
    obj.convertBinary(124);
     System.out.println("\nbinary representation of 124");
    obj.convertBinary(24);
     System.out.println("\nbinary representation of 124");
    obj.convertBinary(12);
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    return "";
  }
}
