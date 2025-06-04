class ArraySortRecursion{
    public List<Integer> sortAnArray(List<Integer> array){
        
        if(array.size() <= 0) return array; 

        int elem = array.get(array.size()-1); 
        array.remove(array.size()-1); 
        sortAnArray(array);

        placeElement(array,elem); 
        return array;

    }

    public static void placeElement(List<Integer> list, int element){
            if(list.size() == 0 || list.get(list.size()-1) < element) {
                list.add(element);
                return; 
            }

            int lastElement = list.get(list.size()-1); 
            list.remove(list.size()-1); 
            placeElement(list,element); 
            list.add(lastElement); 

            return; 
    }     
} 