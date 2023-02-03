package bcci.playing.teams;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceInfo {

 public List<Player> getIndianPlayerList(){
	 List<Player> list = new ArrayList<>();
	 list.add(new Player("Rohit", "Sharma", 36, "B"));
	 list.add(new Player("Virat", "Kohli", 35, "B"));
	 list.add(new Player("Suryakumar", "Yadav", 32, "B"));
	 list.add(new Player("Hardik", "Padya", 28, "A"));
	 
	 return list;
 }
 
 
 public List<Player> getPakistanPlayerList(){
	 List<Player> list = new ArrayList<>();
	 list.add(new Player("Babar", "Azam", 30, "B"));
	 list.add(new Player("Rizawan", "Ahamad", 30, "B"));
	 
	 
	 return list;
 }
 
	
}
