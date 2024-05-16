class Armstrong_num {
    public boolean isArmstrong(int x) {
        int num = x;
        int sum = 0;
        while(x != 0){
            int digit = x % 10;
            x /= 10;
            sum += Math.pow(digit,3);
            System.out.println(digit+" "+x+" "+sum);

        }
                System.out.println(sum+" "+num);

        if(sum == num){
            return true;
        }
        return false;
    }

}