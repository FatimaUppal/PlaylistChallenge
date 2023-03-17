package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int numOfButtonPresses;
        int upButton = 0;
        int downButton= 0;

        for (int i = startIndex; i < playList.length ; i++) { //checks for number of up button clicks
            if (selection.equals(playList[i])){
                upButton= i;
            }
        }
        for (int j= startIndex; j > 0; j--){ //checks for number clicks of down button
            if (selection.equals(playList[j])){
                downButton= j;
            }
        }

        if (downButton == 0) { //to look through the whole playlist
            downButton = startIndex + playList.length - upButton;
        }
        if (upButton== 0){
            upButton= playList.length - startIndex + downButton;
        }
        if (downButton > upButton){ //to figure out the smallest number of button presses
            numOfButtonPresses = upButton;
        }else {
            numOfButtonPresses= downButton;
        }
        return numOfButtonPresses;
    }
}
