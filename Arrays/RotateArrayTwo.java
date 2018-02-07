class RotateArrayTwo
{
    void leftRotate(int arr[], int d, int n){
      int i,j,k,temp;
      for(i=0;i<gcd(d, n);i++){
        temp = arr[i];
        j=i;
        while(1!=0){
          k=j+d;
          if(k>=n)
            k=k-n;
          if(k==i)
            break;
          arr[j] = arr[k];
          j=k;
        }
        arr[j] = temp;
      }
    }
    void printArray(int arr[], int size){
      int i;
      for(i=0;i<size;i++)
        System.out.print(arr[i]+" ");
      System.out.println();
    }
    int gcd(int a, int b){
      if(b==0)
        return a;
      else
        return gcd(b, a % b);
    }
    public static void main(String[] args){
      RotateArrayTwo rt = new RotateArrayTwo();
      int arr[] = {1,2,3,4,5,6,7,8,9};
      rt.leftRotate(arr, 2,7);
      rt.printArray(arr, 7);
    }
}
