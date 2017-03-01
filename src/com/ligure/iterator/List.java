package com.ligure.iterator;

/**
 * Created by Administrator on 2017/2/28.
 */
public class List implements Container {
    private Object[] array;
    public List(Object[] array) {
        this.array = array;
    }
    @Override
    public Iterator iterator() {
        return new IteratorImpl();
    }
    public class IteratorImpl implements Iterator {
        private int index;
        private int size;
        public IteratorImpl() {
            size = array.length;
        }

        @Override
        public boolean hasNext() {
            return size > index;
        }
        @Override
        public Object next() {
            if (hasNext()) {
                return array[index++];
            }
            return null;
        }
    }
}
