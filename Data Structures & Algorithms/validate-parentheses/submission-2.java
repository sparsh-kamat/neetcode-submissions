class Solution {
    public boolean isValid(String s) {
        char[] str = s.toCharArray();
        if (str.length % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(str[i])) {
                stack.push(str[i]);
            } else {
                if (stack.isEmpty())
                    return false;
                if (map.get(stack.peek()) == str[i]) {
                    stack.pop();
                } else
                    return false;
            }
        }

        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
