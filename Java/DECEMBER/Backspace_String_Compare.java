class Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        LinkedList<Character> stack_s = new LinkedList<Character>();
        LinkedList<Character> stack_t = new LinkedList<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !='#') stack_s.add(s.charAt(i));
            else {
                if(!stack_s.isEmpty()) stack_s.removeLast();
            }
            System.out.print(""+stack_s);
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) !='#') stack_t.add(t.charAt(i));
            else {
                if(!stack_t.isEmpty()) stack_t.removeLast();
            }
             System.out.print(""+stack_t);
        }
        System.out.print(""+stack_s.size()+" "+stack_t.size());
        if(stack_s.size() != stack_t.size()) return false;
        Iterator<Character> itr1 = stack_s.iterator();
        Iterator<Character> itr2 = stack_t.iterator();
        while(itr1.hasNext() && itr2.hasNext()){
            if(itr1.next()!=itr2.next()){
                return false;
            }
        }
        return true;
    }
}
