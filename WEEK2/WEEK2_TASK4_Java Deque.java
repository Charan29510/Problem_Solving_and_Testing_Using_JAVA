    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int uniq=0;
        HashMap<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                if(deque.size()!=m){
               deque.addLast(num);
               map.put(num,map.getOrDefault(num,0)+1);
                }
                else{
                   
                    int removed=deque.removeFirst();
                    map.put(removed,map.getOrDefault(removed,0)-1);
                    if(map.get(removed)==0){
                        map.remove(removed);
                    }
                    deque.offerLast(num);
                    map.put(num,map.getOrDefault(num,0)+1);
                    
                    if(deque.size()==m){
                         uniq=Math.max(uniq,map.size());
                    }
                }
            }
            System.out.println(uniq);
        }
    }



