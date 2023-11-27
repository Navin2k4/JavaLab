class findminmax<T extends Comparable<T>>{
    private T[] array;
    findminmax(T[] array){
        this.array = array;
    }
    public T max(){
        T max = array[0];
        for(T ele :array){
            if(ele.compareTo(max)>0){
                max=ele;
            }
        }
        return max;
    }
    public T min(){
        T min = array[0];
        for(T ele :array){
            if(ele.compareTo(min)<0){
                min=ele;
            }
        }
        return min;
    }   
}
public class MinMaxGen {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        findminmax<Integer> obj = new findminmax<>(arr1);
        System.out.println("Max : "+obj.max());
        System.out.println("Min : "+obj.min());
        
        Double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
        findminmax<Double> obj1 = new findminmax<>(arr2);
        System.out.println("Max : "+obj1.max());
        System.out.println("Min : "+obj1.min());
        
    }
}
