package org.example.Hard;

 class Card {
    private final String rank;
    private  final int value;

    public Card (String rank, int value) {
        this.rank = rank;
        this.value = value;
    }

     public int getValue() {
         return value;
     }
     @Override
     public  String toString(){
        return rank;
     }
 }
