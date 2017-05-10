
public class CompareNumber {

    public String compare(String answer, String input){
        int a = 0;
        int b = 0;

        //获取input第i个位置的数字，根据这个数字获取到answer中的对应位置
        //如果没有这个位置，也就是=-1，那么answer中不存在这个数字，什么也不做
        //如果有这个位置，则有这个数字，如果该位置与i相同，则有该数字同时位置相同，a++；如果该位置与i不同，则有该数字同时位置不同，b++
        for(int i = 0; i < input.length(); i++){
            int index = answer.indexOf(input.charAt(i));
            if(index != -1){
                if(index == i){
                    ++a;
                }else{
                    ++b;
                }
            }
        }

        return a + "A" + b + "B";
    }
}
