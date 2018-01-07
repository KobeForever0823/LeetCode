class IsValid {
    public boolean isValid(String s) {
        if (s == "") return true;
        Stack<Character> stack = new Stack<Character>();
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (!stack.empty()) {
                char tmp = stack.peek();
                if (tmp == '(' && c != ')') return false;
                if (tmp == '[' && c != ']') return false;
                if (tmp == '{' && c != '}') return false;
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}