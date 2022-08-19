package com.techelevator;

public class FruitTree {

    private String typeOfFruit;
    private int piecesOfFruitLeft;


    public boolean pickFruit(int numberOfPiecesToRemove) {

        if (piecesOfFruitLeft < numberOfPiecesToRemove) {
            return false;
        }

        this.piecesOfFruitLeft = this.piecesOfFruitLeft - numberOfPiecesToRemove;
        return true;

    }

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public int getPiecesOfFruitLeft(){
        return this.piecesOfFruitLeft;
    }
     public String getTypeOfFruit(){
        return this.typeOfFruit;
     }


}