package edu.gannon.kaneboyna.wargame;

import java.util.Random;

public class PlayingCard {
    private int rank;

    public PlayingCard() {
    }


    public int PlayingCard(int Rank) {
        return rank  = rank ;
    }

    public int getRank() {
        return rank;
    }

    //PlayingCard card1 = PlayingCard.getRandomcard();


    public boolean beats(PlayingCard otherCard) {
        return this.getRank() > otherCard.getRank();
    }


    public String getNameForRank(String format) {
        return String.format(format, rank);
    }


    public static PlayingCard getRandomCard() {
        int randomRank = new Random().nextInt(13) +2;
        return new PlayingCard(randomRank);


    }

}

