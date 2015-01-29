package de.iterator.iterator;

public class NameRepository implements IContainer {
    private String[] names = { "Robert", "John", "Julie", "Lora" };

    public IIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements IIterator {

        int index;

        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
