package StackProblems;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); //it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); //it will call CustomStack(int size)
    }


    public boolean push(int item){
        if(this.isFull()){
            //double the array size;
            int[] temp = new int[stack.length * 2];

            //copy all previous items in new data
            for(int i = 0; i < stack.length; i++){
                temp[i] = stack[i];
            }
            stack = temp;
        }
        return super.pushElement(item);
    }
}
