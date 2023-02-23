package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class P04Songs {
  private String typeList;
  private String name;
  private String time;

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSongs = Integer.parseInt(scanner.nextLine());

        List<P04Songs> songs = new ArrayList<>();

        for (int i = 0; i <numSongs ; i++) {
            String []data = scanner.nextLine().split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];

            P04Songs song = new P04Songs();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);


        }


        String typeList= scanner.nextLine();
        if (typeList.equals("all")){
            for (P04Songs song: songs){
                System.out.println(song.getName());
            }
        }
        else {
            for(P04Songs song:songs){
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }
    }


}


