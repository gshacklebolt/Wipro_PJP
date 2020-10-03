/**
 * 
 */

var HashMap=Java.type("java.util.HashMap");

var map=new HashMap();
map.put("India", "New Delhi");
map.put("Australia", "Canberra");
map.put("USA", "Washington D.C.");
map.put("England", "London");
map.put("Canada", "Ottowa");

for(var i in  map) {
	print(i+" : "+map[i]);
}