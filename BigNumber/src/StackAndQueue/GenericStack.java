/*
 * PROJECT: GenericStack
 * AUTHOR:  Hau Nguyen Viet (Jason)
 * Email:   nvconghau1995@gmail.com
 * (c) 2015 Hau Nguyen Viet.
This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package StackAndQueue;

/**
 *
 * @author Jason
 * @param <T>
 */
public class GenericStack<T extends Comparable<T>>
        extends SimpleStack<T> {
    
    public void toGenericStack(GenericStack<T> stackToCopy) {
        if(top==null)
            throw new java.util.EmptyStackException();
        
        stackToCopy.clear();
        for(GenericNode<T> tmp=top; tmp!=null; tmp=tmp.pre)
            stackToCopy.push(tmp.info);
    }
    
    public GenericStack<T> toGenericStack() {
        if(top==null)
            return null;
        
        GenericStack<T>  result = new GenericStack<>();
        for(GenericNode<T> tmp=top; tmp!=null; tmp=tmp.pre)
            result.push(tmp.info);
        
        return result;
    }
    
    public void ascendingSort() {
        SimpleStack<T> S = this;
        SimpleStack<T> addStack = new SimpleStack<>();
        int cLen = S.length();
        T min = null;
        int minPos = -1;
        while(cLen>0) {
            min = S.topEl();
            minPos = 0;
            for (int i = 0; i < cLen; i++) {
                T sTop = S.pop();
                if(min.compareTo(sTop)>0) {
                    min = sTop;
                    minPos = i;
                }
                addStack.push(sTop);
            }
            
            S.push(min);
            int l = addStack.length();
            cLen = l;
            for (int i = 0; i < l; i++) {
                T popVal = addStack.pop();
                if(i==(l-minPos-1)) {
                    cLen--;
                    continue;
                }
                S.push(popVal);
            }
        
        }
        
        // OLD Version, the stupid one :v :v =))
//        T min = S.getMax(), min = S.getMin();
//        int noOfOrders = 1;
//        while(cLen>0) {
//            for (int i = 0; i < cLen; i++) {
//                T sTop = S.pop();
//                if(sTop.equals(min)||sTop.equals(min)) 
//                    continue;
//                addStack.push(sTop);
//            }
//            
//            T max2 = addStack.getMax();
//            if(S.isEmpty()) {
//                S.push(min);
//                S.push(max2);
//            } else {
//                T tmp =  S.topEl();
//                if(tmp.compareTo(max2)>=0) S.push(max2);
//                else {
//                    S.pop(); 
//                    S.push(max2);
//                    S.push((T) tmp);
//                }
//            }
//            noOfOrders += 1;
//            
//            int Len = addStack.length();
//            for (int j = 0; j < Len; j++) {
//                T top2 = addStack.pop();
//                if(top2.equals(max2) )
//                    continue;
//                S.push(top2);
//            }
//            Len = S.length();
//            cLen = Len - noOfOrders;
//        }
//        S.push(min);
    }
    
    
    
//    public T getMin() {
//        T get= top.info ;
//        T  result =   get;
//        for(GenericNode<T> tmp=top.pre; tmp!=null; tmp=tmp.pre)
//        {  
//           if(result.compareTo(tmp.info)>0)
//               result =  tmp.info;
//        }
//        return  result;
//    }
//    
//    public T getMax() {
//        T get= top.info ;
//        T result =   get;
//        for(GenericNode<T> tmp=top.pre; tmp!=null; tmp=tmp.pre)
//        {  
//           if(result.compareTo(tmp.info)<0)
//               result =  tmp.info;
//        }
//        return result;
//    }
}
