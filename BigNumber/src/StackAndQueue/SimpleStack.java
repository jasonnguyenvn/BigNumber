/*
 * PROJECT: SimpleStack
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
public class SimpleStack<T> {
    
    GenericNode<T> top;
    private int length = 0;
    
    public int length() {
        return length;
    }
    
    @Override
    public String toString() {
        
        if(top==null)
            return "<EMPTY>";
        
        
        SimpleStack<T> tmp = this.toStack();
        String reStr = "";
        for(GenericNode<T> i=tmp.top; i!=null; i=i.pre)
            reStr += i.info.toString() + ";";
        
        return reStr;

    }
    public void toStack(SimpleStack<T> stackToCopy) {
        if(top==null)
            throw new java.util.EmptyStackException();
        
        stackToCopy.clear();
        for(GenericNode<T> tmp=top; tmp!=null; tmp=tmp.pre)
            stackToCopy.push(tmp.info);
    }
    
    public SimpleStack<T> toStack() {
        if(top==null)
            return null;
        
        SimpleStack<T>  result = new SimpleStack<>();
        for(GenericNode<T> tmp=top; tmp!=null; tmp=tmp.pre)
            result.push(tmp.info);
        
        return result;
    }
    
    public void toQueue(SimpleQueue<T> queueToCopy) {
        if(top==null)
            throw new java.util.EmptyStackException();
        
        queueToCopy.clear();
        for(GenericNode<T> tmp=top; tmp!=null; tmp=tmp.pre)
            queueToCopy.enqueue(tmp.info);
        
    }
    
    
    public SimpleQueue<T> toQueue() {
        if(top==null)
            return null;
        
        SimpleQueue<T> result = new SimpleQueue<>();
        for(GenericNode<T> tmp=top; tmp!=null; tmp=tmp.pre)
            result.enqueue(tmp.info);
        
        return result;
    }
    
    public void clear() {
        top = null;
        length = 0;
    }
    
    public boolean isEmpty() {
        return top==null;
    }
    
    public void push(T el) {
        GenericNode<T> nNode = new GenericNode<>(el);
        
        if(top==null)
            top = nNode;
        else {
            nNode.pre = top;
            top = nNode;
        }
        
        this.length++;
       
        
    }
    
    
    public T pop() {
        if(top==null)
            throw new java.util.EmptyStackException();
        
        T result = top.info;
        top = top.pre;
        this.length--;
        return result;
    }
    
    public T topEl() {
        if(top==null)
            throw new java.util.EmptyStackException();
        
        return top.info;
    }
    
    public void moveElsTo(SimpleStack<T> obj, int noOfEl) {
        if(top==null)
            throw new java.util.EmptyStackException();
        for (int i = 0; i < noOfEl; i++) {
            obj.push(this.pop());
        }
    }
    
    public void moveAllElsTo(SimpleStack<T> obj) {
        if(top==null)
            throw new java.util.EmptyStackException();
        int l = length;
        for (int i=0; i<l; i++) {
            obj.push(this.pop());
        }
    }
    
    public void moveAllElsTo(SimpleQueue<T> obj) {
        if(top==null)
            throw new java.util.EmptyStackException();
        int l = length;
        for (int i=0; i<l; i++) {
            obj.enqueue(this.pop());
        }
    }
    
}
