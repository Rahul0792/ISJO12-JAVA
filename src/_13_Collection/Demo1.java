package _13_Collection;

public class Demo1 {
    public static void main(String[] args) {
        interface Iterator{
            public abstract boolean hasnext();
            public abstract Object next();
        }
        interface Iterable{
            public Iterator iterator();
        }
        class Itr implements Iterator{
            @Override
            public boolean hasnext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        }
        class IterableImpl implements Iterable{
            @Override
            public Iterator iterator() {
                return new Itr();
            }
        }
        IterableImpl impl = new IterableImpl();
        Iterator iterator  = impl.iterator();
        while(iterator.hasnext()){
            System.out.println(iterator.next());
        }
    }
}
