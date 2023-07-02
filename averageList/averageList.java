class Solution {
    int averageList(ArrayList<Integer> list) {
        // code here
        int sum = 0; int avg = 0;
        for(int i=0; i<list.size(); i++){
            sum = sum + list.get(i);
            avg = sum / list.size();    
        }
        return avg;
    }
}