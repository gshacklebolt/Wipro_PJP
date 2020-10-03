package com.tm02_proj01.bean;

public class VideoStore {
	public Video[] store=null;
	
	public void addVideo(String name) {
		Video video=new Video(name);
		int storeSize;
		storeSize=(store!=null)?store.length:0;
		
		Video[] newStore=new Video[storeSize+1];
		if(store!=null  && store.length!=0) {
			System.arraycopy(store, 0,  newStore, 0, storeSize);
		}
		newStore[storeSize]=video;
		store=newStore;
		System.out.printf("Video \"%s\" added successfully.\n",name);
	}
	
	public void doCheckout(String name) {
		if(store!=null && store.length!=0) {
			for(Video video:store) {
				if(name.equals(video.getName())) {
					video.doCheckout();
					System.out.printf("Video \"%s\" checked out successfully.\n",name);
					break;
				}
			}
		}
	}
	
	public void doReturn(String name) {
		if(store!=null && store.length!=0) {
			for(Video video:store) {
				if(name.equals(video.getName())) {
					video.doReturn();
					System.out.printf("Video \"%s\" returned successfully.\n",name);
					break;
				}
			}
		}
	}
	
	public void receiveRating(String name,int rating) {
		if(store!=null && store.length!=0) {
			for(Video video:store) {
				if(name.equals(video.getName())) {
					video.receiveRating(rating);
					System.out.printf("Rating \"%d\" has been mapped to the Video \"%s\".\n",rating,name);
					break;
				}
			}
		}
	}
	
	public void listInventory() {
		if(store==null||store.length==0) {
			System.out.println("No items in store.");
			return;
			
		}
		System.out.println("--------------------------------------------------------");
		System.out.printf("%-15s |       %-15s |       %-8s%n","Video Name","Checkout Status","Rating");
		for(Video video:store) {
			System.out.printf("%-15s |       %-15s |       %-8s%n",video.getName(),video.getCheckout(),video.getRating());
		}
		System.out.println("--------------------------------------------------------");
	}
	
}
