import java.util.*;
class Entry<K,V>{
	Entry(K key,V value){
		this.key = key;
		this.value = value;
		this.next = null;
	}
	K key;
	V value;
	Entry<K,V> next;
	int getHash(K key) {
		return key.hashCode();
	}
}
class Hashmap<K,V>{
	private int mapSize = 1<<4;
	private Entry<K,V>[] Bucket;
	Hashmap(){
		this.Bucket=new Entry[mapSize];
	}
	void setMapSize(int size) {
		this.mapSize = size;
	}
	int getMapSize() {
		return this.mapSize;
	}
	void put(K key,V value) {
		Entry<K,V> entry = new Entry<K,V>(key, value);
		int index = entry.getHash(key) % getMapSize();
		if(Bucket[index]!=null) {
			Entry<K,V> temp = Bucket[index];
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next = entry;
		} else {
			Bucket[index] = entry;
		}
	}
	V get(K key) {
		Entry<K,V> entry = Bucket[key.hashCode()%getMapSize()];
		while(entry != null) {
			if(entry.key.equals(key)) {
				return entry.value;
			}
			entry = entry.next;
		}
		return null;
	}
}
public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<Integer,Integer> hm = new Hashmap<Integer,Integer>();
		hm.put(1, 12);
		hm.put(2, 22);
		hm.put(5, 32);
		hm.put(13, 2);
		System.out.println(hm.get(2));
		System.out.println(hm.get(5));
		System.out.println(hm.get(6));
	}

}
