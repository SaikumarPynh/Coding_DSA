// Given an array of integers temperatures represents the daily temperatures,
//  return an array answer such that answer[i] is the number of days you have 
//  to wait after the ith day to get a warmer temperature. If there is no future day 
//  for which this is possible, keep answer[i] == 0 instead.
class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        for(int i = 0;i<temperatures.length - 1;i++){
            for(int j = i+1;j<temperatures.length;j++){
                if(temperatures[i] < temperatures[j]){
                    arr[i] = j - i;
                      break;
                }
            }
        }
        return arr;
    }
}