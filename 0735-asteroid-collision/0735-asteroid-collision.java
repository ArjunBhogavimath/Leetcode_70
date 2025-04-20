class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;
        
        for(int asteroid : asteroids){
            int current = asteroid;

            //avoid collision
            while(!stack.isEmpty() && stack.peek() > 0 && current < 0){
                if(stack.peek() + current < 0){
                    stack.pop();
                }
                else if(stack.peek() + current == 0){
                    stack.pop();
                    current = 0; // we shouldn't add that item
                    break;
                }
                else{
                    current = 0;
                    break;
                }
            }

            if(current != 0){
                stack.push(current);
            }
        }

        // for(int i =0;i<n;i++){
        //     if(stack.isEmpty() || stack.peek() < 0){
        //         stack.push(asteroids[i]);
        //     }
        //     else{
        //          if(asteroids[i] < 0){
        //             if(stack.peek() - Math.abs(asteroids[i]) > 0){
        //                 continue;
        //             }
        //             else{
        //                 stack.pop();
                       
        //             }
             
        //         } 
        //         else{
        //             stack.push(asteroids[i]);
        //         }
        //     }
           
        // }
        int ans[] = new int[stack.size()];
        int index =0;
        for(int num : stack){
            ans[index++] = num;
            System.out.println(num);
        }
        return ans;
    }
}

/**
push the element if the element is positive,
if the element is negative, compare it with stack.peek()
if negtaive is bigger do the stack.pop(), and compare again
if the negtative is smaller then move next

 */