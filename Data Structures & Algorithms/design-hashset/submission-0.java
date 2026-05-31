class MyHashSet {
    List<Integer> mySet;
    public MyHashSet() {
        mySet = new ArrayList<>();
    }
    
    public void add(int key) {
        if (!mySet.contains(key)) {
            mySet.add(key);
        }
    }
    
    public void remove(int key) {
        if (mySet.isEmpty()) {
            return;
        }
        mySet.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return mySet.contains(Integer.valueOf(key));
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */