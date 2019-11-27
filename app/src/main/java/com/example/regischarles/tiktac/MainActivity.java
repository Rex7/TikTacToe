package com.example.regischarles.tiktac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    int  gameOver = 1;

    int player=1;
    int i,j;
   static String[][] array = {
            {"_", "_", "_"},
            {"_", "_", "_"},
            {"_", "_", "_"}

    };
    Button position00,position01,position02,position10,position11,position12,position20,position21,position22,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniliaseButton();



    }
    void iniliaseButton(){
        reset=findViewById(R.id.reset);
        position00=findViewById(R.id.position00);
        position01=findViewById(R.id.position01);
        position02=findViewById(R.id.position02);
        position10=findViewById(R.id.position10);
        position11=findViewById(R.id.position11);
        position12=findViewById(R.id.position12);
        position20=findViewById(R.id.position20);
        position21=findViewById(R.id.position21);
        position22=findViewById(R.id.position22);
        reset.setOnClickListener(this);
        position00.setOnClickListener(this);
        position01.setOnClickListener(this);
        position02.setOnClickListener(this);
        position10.setOnClickListener(this);
        position11.setOnClickListener(this); position12.setOnClickListener(this);
        position21.setOnClickListener(this);
        position22.setOnClickListener(this);
        position20.setOnClickListener(this);





    }
    public  boolean checkGameOver(String[][] array, int player) {
        int count = 0;
        boolean flag = false;

     if(gameOver==1){
         if (player == 1) {
             int i;
             for (int j = 1; j <= 8; j++) {

                 switch (j) {

                     case 1:

                         for (i = 0; i < 3; i++) {
                             if (array[0][i].equals("X")) {
                                 count++;
                             }
                         }
                         if (count == 3) {
                             flag = true;
                         }
                         count=0;
                         break;
                     case 2:
                         for (i = 0; i < 3; i++) {
                             if (array[1][i].equals("X")) {
                                 count++;
                             }
                         }
                         if (count == 3) {
                             flag = true;
                         }
                         count=0;
                         break;
                     case 3:
                         for (i = 0; i < 3; i++) {
                             if (array[2][i].equals("X")) {
                                 count++;
                             }
                         }
                         if (count == 3) {
                             flag = true;
                         }
                         count=0;
                         break;
                     case 4:
                         for (i = 0; i < 3; i++) {
                             if (array[i][0].equals("X")) {
                                 count++;
                             }
                         }
                         if (count == 3) {
                             flag = true;
                         }
                         count=0;
                         break;
                     case 5:
                         for (i = 0; i < 3; i++) {
                             if (array[i][1].equals("X")) {
                                 count++;
                             }
                         }
                         if (count == 3) {
                             flag = true;
                         }
                         count=0;
                         break;
                     case 6:
                         for (i = 0; i < 3; i++) {
                             if (array[i][2].equals("X")) {
                                 count++;
                             }
                         }
                         if (count == 3) {
                             flag = true;
                         }
                         count=0;
                         break;
                     case 7:
                         for (i = 0; i < 3; i++) {
                             if (array[i][i].equals("X")) {
                                 count++;
                             }
                         }
                         if (count == 3) {
                             flag = true;
                         }
                         count=0;
                         break;
                     case 8:
                         int temp = 2;
                         for (i = 0; i < 3; i++) {
                             if (array[i][temp].equals("X")) {
                                 count++;
                             }
                             temp--;
                         }
                         if (count == 3) {
                             flag = true;
                         }
                         count=0;
                         System.out.println("count "+count);
                         break;

                 }
             }
         } else if (player == 2) {
             flag=returnFlag(array, player);
         }
         System.out.println("falg " + flag);

     }
     else if(gameOver==0){
       resetArray();
     }
        return flag;
    }
    public  boolean returnFlag(String array[][],int player){
        int count=0;
        boolean flag=false;
        int i;
        if(gameOver==1){
            for ( int j = 1; j <=8; j++) {
                switch (j) {

                    case 1:

                        for ( i = 0; i < 3; i++) {
                            if (array[0][i].equals("0")) {
                                count++;
                            }
                        }
                        if (count == 3) {
                            flag = true;
                        }
                        count=0;
                        break;
                    case 2:
                        for ( i = 0; i < 3; i++) {
                            if (array[1][i].equals("0")) {
                                count++;
                            }
                        }
                        if (count == 3) {
                            flag = true;
                        }
                        count=0;
                        break;
                    case 3:
                        for ( i = 0; i < 3; i++) {
                            if (array[2][i].equals("0")) {
                                count++;
                            }
                        }
                        if (count == 3) {
                            flag = true;
                        }
                        count=0;
                        break;
                    case 4:
                        for (i = 0; i < 3; i++) {
                            if (array[i][0].equals("0")) {
                                count++;
                            }
                        }
                        if (count == 3) {
                            flag = true;
                        }
                        count=0;
                        break;
                    case 5:
                        for ( i = 0; i < 3; i++) {
                            if (array[i][1].equals("0")) {
                                count++;
                            }
                        }
                        if (count == 3) {
                            flag = true;
                        }
                        count=0;
                        break;
                    case 6:
                        for (i = 0; i < 3; i++) {
                            if (array[i][2].equals("0")) {
                                count++;
                            }
                        }
                        if (count == 3) {
                            flag = true;
                        }
                        count=0;
                        break;
                    case 7:
                        for (i = 0; i < 3; i++) {
                            if (array[0][i].equals("0")) {
                                count++;
                            }
                        }
                        if (count == 3) {
                            flag = true;
                        }
                        count=0;
                        break;
                    case 8:
                        for ( i = 0; i < 3; i++) {
                            if (array[0][i].equals("0")) {
                                count++;
                            }
                        }
                        if (count == 3) {
                            flag = true;
                        }
                        count=0;
                        break;

                }
            }
        }
        else if(gameOver==0){
            resetArray();
        }
        return flag;
    }

    @Override
    public void onClick(View v) {

   int id=v.getId();
        Log.v("Babe","GameOver "+gameOver);
        if(gameOver==1){
            switch (id){
                case R.id.position00:
                    i=0;
                    j=0;
                    checkPlayer(i,j,player);

                    break;
                case R.id.position01:
                    i=0;
                    j=1;
                    checkPlayer(i,j,player);

                    break;
                case R.id.position02:
                    i=0;
                    j=2;
                    checkPlayer(i,j,player);

                    break;
                case R.id.position10:
                    i=1;
                    j=0;
                    checkPlayer(i,j,player);


                    break;
                case R.id.position11:
                    i=1;
                    j=1;
                    checkPlayer(i,j,player);

                    break;
                case R.id.position12:
                    i=1;
                    j=2;
                    checkPlayer(i,j,player);

                    break;
                case R.id.position20:
                    i=2;
                    j=0;
                    checkPlayer(i,j,player);

                    break;
                case R.id.position21:
                    i=2;
                    j=1;
                    checkPlayer(i,j,player);

                    break;
                case R.id.position22:
                    i=2;
                    j=2;
                    checkPlayer(i,j,player);

                    break;
                case R.id.reset:
                    position00.setText("");
                    position01.setText("");
                    position02.setText("");
                    position10.setText("");
                    position11.setText("");
                    position12.setText("");
                    position20.setText("");
                    position21.setText("");
                    position22.setText("");
                    resetArray();



            }

        }
        else if(gameOver==0){
            Log.v("BabeCheckPLayer","Player won perfect "+player);
            resetArray();


        }
        if(player==1){
            player=2;
        }
        else if(player==2){
            player=1;
        }

    }
    public void checkPlayer(int i,int j,int player){
       if(gameOver==1){
           if (player == 1) {
               if (array[i][j].equals("_")) {
                   array[i][j] = "X";
                   switch (i){
                       case 0:
                           if(j==0){
                               position00.setText("X");
                           }
                           else if(j==1){
                               position01.setText("X");
                           }
                           else if(j==2){
                               position02.setText("X");
                           }
                           break;
                       case 1:
                           if(j==0){
                               position10.setText("X");
                           }
                           else if(j==1){
                               position11.setText("X");
                           }
                           else if(j==2){
                               position12.setText("X");
                           }
                           break;
                       case 2:
                           if(j==0){
                               position20.setText("X");
                           }
                           else if(j==1){
                               position21.setText("X");
                           }
                           else if(j==2){
                               position22.setText("X");
                           }
                           break;
                   }
                   boolean flag = checkGameOver(array, player);
                   if (flag) {
                       gameOver = 0;
                   }

               } else if (!array[i][j].equals("_")) {
                   array[i][j] = "X";
               }

           }
           else if (player == 2) {
               //checking if its empty
               if (array[i][j].equals("_")) {
                   array[i][j] = "0";
                   switch (i){
                       case 0:
                           if(j==0){
                               position00.setText("0");
                           }
                           else if(j==1){
                               position01.setText("0");
                           }
                           else if(j==2){
                               position02.setText("0");
                           }
                           break;
                       case 1:
                           if(j==0){
                               position10.setText("0");
                           }
                           else if(j==1){
                               position11.setText("0");
                           }
                           else if(j==2){
                               position12.setText("0");
                           }
                           break;
                       case 2:
                           if(j==0){
                               position20.setText("0");
                           }
                           else if(j==1){
                               position21.setText("0");
                           }
                           else if(j==2){
                               position22.setText("0");
                           }
                           break;
                   }
                   boolean flag = checkGameOver(array, player);
                   if (flag) {
                       gameOver = 0;
                   }

               }
               //if not equals then do something
               else if (!array[i][j].equals("_") ) {
                   array[i][j] = "0";
                   switch (i){
                       case 0:
                           if(j==0){
                               position00.setText("0");
                           }
                           else if(j==1){
                               position01.setText("0");
                           }
                           else if(j==2){
                               position02.setText("0");
                           }
                           break;
                       case 1:
                           if(j==0){
                               position10.setText("0");
                           }
                           else if(j==1){
                               position11.setText("0");
                           }
                           else if(j==2){
                               position12.setText("0");
                           }
                           break;
                       case 2:
                           if(j==0){
                               position20.setText("0");
                           }
                           else if(j==1){
                               position21.setText("0");
                           }
                           else if(j==2){
                               position22.setText("0");
                           }
                           break;
                   }
               }
           }

       }
       else if(gameOver==0){

           Log.v("BabeCheckPLayer","won player"+player);
           Log.v("BabeCheckPLayer","GameOver"+gameOver);
           resetArray();
       }
    }
    public void resetArray(){
               for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               array[i][j]="_";
            }

        }
        position00.setText("");
        position01.setText("");
        position02.setText("");
        position10.setText("");
        position11.setText("");
        position12.setText("");
        position20.setText("");
        position21.setText("");
        position22.setText("");
        gameOver=1;


    }



}// end of main activity
