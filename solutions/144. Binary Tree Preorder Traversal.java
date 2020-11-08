        while(!st.isEmpty()){
           
            root = st.pop();
            list.add(root.val);
            
            if(root.right != null){
                st.push(root.right);
            }
            
            if(root.left != null){
                st.push(root.left);
            }
        }
        
        return list; 
    }
}
​
// Recursive approach
​
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
