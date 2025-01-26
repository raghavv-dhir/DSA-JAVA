package StacksAndQueues;

public class DynamicStackMain {
    public static void main(String[] args) throws Exception {
        DynamicStack st = new DynamicStack(5);
        st.push(5);
        st.push(9);
        st.push(10);
        st.push(1);
        st.push(20);
        st.push(34); //Here size will become 10 and all the items will be copied again to new sized array.

        System.out.println("POP: "+st.pop());
        System.out.println("POP: "+st.pop());
        System.out.println("POP: "+st.pop());
        System.out.println("POP: "+st.pop());
        System.out.println("POP: "+st.pop());
        System.out.println("POP: "+st.pop());
    }
}
