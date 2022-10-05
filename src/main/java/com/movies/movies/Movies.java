package com.movies.movies;

import java.util.ArrayList;

public class Movies {

    public Movies(int i, String string, String string2, int j, int k) {
    }

    public static ArrayList<Movies> movies = new ArrayList<>();

    public Integer id;
    public String title;
    public String description;
    public Integer year;
    public Integer actors;

    static {
        new Movies(1, "Titanic",
                "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.84 years later, a 100 year-old woman named Rose DeWitt Bukater tells the story to her granddaughter Lizzy Calvert, Brock Lovett, Lewis Bodine, Bobby Buell and Anatoly Mikailavich on the Keldysh about her life set in April 10th 1912, on a ship called Titanic when young Rose boards the departing ship with the upper-class passengers and her mother, Ruth DeWitt Bukater, and her fiancé, Caledon Hockley. Meanwhile, a drifter and artist named Jack Dawson and his best friend Fabrizio De Rossi win third-class tickets to the ship in a game. And she explains the whole story from departure until the death of Titanic on its first and last voyage April 15th, 1912 at 2:20 in the morning.",
                1997, 1);
        new Movies(2, "The Irishman",
                "Hitman Frank Sheeran looks back at the secrets he kept as a loyal member of the Bufalino crime family.",
                2019, 2);
        new Movies(3, "Mamma Mia",
                "Mamma Mia! (promoted as Mamma Mia! The Movie) is a 2008 jukebox musical romantic comedy film directed by Phyllida Lloyd and written by Catherine Johnson, based on her book from the 1999 musical of the same name. The film is based on the songs of pop group ABBA, with additional music composed by ABBA member Benny Andersson. The film features an ensemble cast, including Christine Baranski, Pierce Brosnan, Dominic Cooper, Colin Firth, Amanda Seyfried, Stellan Skarsgård, Meryl Streep, and Julie Walters. The plot follows a young bride-to-be who invites three men to her upcoming wedding, with the possibility that any of them could be her father. The film was an international co-production between Germany, the United Kingdom and the United States, and was co-produced by Playtone and Littlestar Productions.",
                2008, 3);
        new Movies(4, "StepMom",
                "Stepmom is a 1998 American comedy-drama film directed by Chris Columbus and produced by Wendy Finerman, Mark Radcliffe, and Michael Barnathan. The screenplay was written by Gigi Levangie, Jessie Nelson, Steven Rogers, Karen Leigh Hopkins, and Ronald Bass. The film stars Julia Roberts, Susan Sarandon, and Ed Harris, and follows a terminally ill woman dealing with her ex-husband's new lover, who will be their children's stepmother.",
                1998, 4);
    }

    public Movies(Integer id, String title, String description, Integer year, Integer actors) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;

        Movies.movies.add(this);
    }

    public void dispalyInfo() {
        System.out.printf("Movie:%s,Description:%s, Year:%s\n", title, description, year);
    }

}
