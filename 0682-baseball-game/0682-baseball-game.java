class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                st.pop();
            }

            else if (op.equals("D")) {
                st.push(st.peek() * 2);
            }

            else if (op.equals("+")) {
                int top = st.pop();
                int secondTop = st.peek();

                st.push(top);                 // restore
                st.push(top + secondTop);     // new score
            }

            else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while (!st.empty()) {
            sum += st.pop();
        }

        return sum;
    }
}