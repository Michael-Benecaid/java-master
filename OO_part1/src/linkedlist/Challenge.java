package linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Challenge {
	private static ArrayList<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args){
		Album album = new Album("Stormbringer", "Deep Purple");
		album.addSong("Storminger", 4.6);
		album.addSong("Good Boy", 4.2);
		album.addSong("Hola", 4.38);
		album.addSong("Baby", 5.2);
		album.addSong("Coat", 3.8);
		album.addSong("Big Apple", 3.6);
		album.addSong("Das Auto", 4.1);
		album.addSong("Viola", 5.6);
		album.addSong("Mango", 2.9);
		album.addSong("OK, Let's go", 2.8);
		
		albums.add(album);
		
		album = new Album("For those to rock", "DC/AC");
		album.addSong("Ready to dance", 5.22);
		album.addSong("Lose my mind", 4.01);
		album.addSong("Fool woman", 2.91);
		album.addSong("Eggplant", 2.91);
		album.addSong("Too young", 2.91);
		album.addSong("Yeah", 2.91);
		album.addSong("C.O.D", 2.91);
		album.addSong("Night of the knight", 2.91);
		album.addSong("Evil Walks", 2.91);
		
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("Good Boy", playList);
		albums.get(0).addToPlayList("Baby", playList);
		albums.get(0).addToPlayList("Speaking", playList);
		albums.get(0).addToPlayList(6, playList);
		albums.get(1).addToPlayList(5, playList);
		albums.get(1).addToPlayList(1, playList);
		albums.get(1).addToPlayList(6, playList);
		albums.get(1).addToPlayList(26, playList);
		
		play(playList);
	}
	
	private static void play(LinkedList<Song> playList){
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No song in the list");
			return;
		} else {
			System.out.println("Now playing "+ listIterator.next().toString());
			printMenu();
		}
		
		while(!quit){
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action){
			case 0:
				System.out.println("Playlsit complete");
				quit = true;
				break;
			case 1: 
				if(!forward){
					if(listIterator.hasNext()){
						listIterator.next();
					}
					forward= true;
				}
				if(listIterator.hasNext()){
					System.out.println("Now playing "+ listIterator.next());
				} else {
					System.out.println("We have reached the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if(forward){
					if(listIterator.hasPrevious()){
						listIterator.previous();
					}
					forward= false;
				}
				if(listIterator.hasPrevious()){
					System.out.println("Now playing "+ listIterator.previous());
				} else {
					System.out.println("We have reached the start of the playlist");
					forward = true;
				}
				break;
			case 3:
				if(forward){
					if(listIterator.hasPrevious()){
						System.out.println("Now replaying "+ listIterator.previous().toString());
						forward = false;
					} else {
						System.out.println("We are at the start of the playlist");
					}
				} else {
					if(listIterator.hasNext()){
						System.out.println("Now replaying "+ listIterator.next().toString());
						forward = true;
					} else {
						System.out.println("We are at the end of the playlist");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() > 0){
					listIterator.remove();
					if(listIterator.hasNext()){
						System.out.println("Now playing "+listIterator.next().toString());
					} else if(listIterator.hasPrevious()){
						System.out.println("Now playing "+listIterator.previous().toString());
					}
				}
				break;
			}
		}
	}
	
	private static void printMenu(){
		System.out.println("Available Actions: \npress");
		System.out.println("0 - to quit\n"+
		"1 - to play the next song\n"+
		"2 - to play the previos song\n"+
		"3 - to replay the song\n" +
		"4 - list songs in the playlist\n"+
		"5 - print available actions\n"+
		"6 - delete current song from playlist");
	}
	
	private static void printList(LinkedList<Song> playList){
		Iterator<Song> iterator = playList.iterator();
		System.out.println("======================");
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
		System.out.println("======================");
	}
}
