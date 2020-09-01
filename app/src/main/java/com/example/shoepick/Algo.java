package com.example.shoepick;
public class Algo{
    //user values
    int uftype;
    int udurab;
    int umat;
    int useruse;
    int usport;
    int uprice;

    double fweight;
    double dweight;
    double mweight;
    double uweight;
    double sweight;

    // default constructor
    public Algo(){
        fweight=1.5;
        dweight=0.5;
        mweight=0.5;
        uweight=2.5;
        sweight=5.0;
    }

    // user modified weight constructor
    public Algo(double fweight, double dweight, double mweight, double uweight, double sweight){
        this.fweight= fweight/10;
        this.dweight= dweight/10;
        this.mweight= mweight/10;
        this.uweight= uweight/10;
        this.sweight= sweight/10;
    }

    public static void main(String[] args){

    }
    //getter and setters
    //sql values are sent here
    /**
     * Foot Types:
     * 0- Low Arch (overpronate)
     * 1- Neutral Arch
     * 2- High Arch (under pronate)
     *
     * Uses:
     * 0- Casual (like walking or daily use)
     * 1- Professional (includes any sport/athletic activity)
     *
     * Sport:
     * 0- Running
     * 1- Tennis
     * 2- Football
     *
     *
     * Durability:
     * 0- Low
     * 1- Medium
     * 2-High
     *
     * Material:
     * 0- Mesh (not waterproof)
     * 1- Non Mesh (we'll consider these to be waterproof)
     */
    public double compute(int ftype, int durab, int mat, int use, int sport, int price){
        double shoeScore=10.0;

        //for foot type
        shoeScore= shoeScore- (double)(Math.abs(ftype-uftype))*(fweight/3);

        //for use
        shoeScore= shoeScore- (double)(Math.abs(use-useruse))*(uweight/2);

        //for durability
        shoeScore= shoeScore- (double)(Math.abs(durab-udurab))*(dweight/2);

        //for material
        shoeScore= shoeScore- (double)(Math.abs(mat-umat))*(mweight/2);

        //for sport
        if(sport!=usport)
            shoeScore= shoeScore- sweight;

        //for price
        if(uprice-price >=0)
            return shoeScore;
        else
            return 0;

    }
}