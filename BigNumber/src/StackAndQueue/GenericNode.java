/*
 * PROJECT: GenericNode
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
class GenericNode<T> {
    T info;
    GenericNode next;
    GenericNode pre;
    
    GenericNode() {
        
    }
    
    GenericNode(T el) {
        info = el;
    }
}
