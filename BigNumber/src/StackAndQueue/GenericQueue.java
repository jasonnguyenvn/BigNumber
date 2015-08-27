/*
 * PROJECT: GenericQueue
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
public class GenericQueue<T extends Comparable<T>> extends SimpleQueue {
    
    
    public void toGenericStack(GenericStack<T> stackToCopy) {
        if(front==null)
            throw new java.util.EmptyStackException();
        stackToCopy.clear();
        for(GenericNode<T> tmp = front; tmp!=null; tmp=tmp.next)
            stackToCopy.push(tmp.info);
    }
    
    public GenericStack<T> toGenericStack() {
        if(front==null)
             return null;
        GenericStack<T> result = new GenericStack<>();
        
        for(GenericNode<T> tmp = front; tmp!=null; tmp=tmp.next)
            result.push(tmp.info);
        
        return result;
    }
    
    
    
    public void moveAllElsTo(GenericStack<T> obj) {
        if(front==null)
            throw new java.util.EmptyStackException();
        for(GenericNode<T> tmp = front; tmp!=null; tmp=tmp.next) {
            obj.push((T) this.dequeue());
        }
    }
    
    
}
