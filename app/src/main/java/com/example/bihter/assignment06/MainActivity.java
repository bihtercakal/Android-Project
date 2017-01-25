package com.example.bihter.assignment06;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {
    //variables
    Button btnA, btnB, btnC, btnÇ, btnD, btnE, btnF, btnG, btnĞ, btnH, btnI, btnİ, btnJ, btnK, btnL, btnM, btnN, btnO, btnÖ, btnP, btnR, btnS, btnŞ, btnT, btnU, btnÜ, btnV, btnY, btnZ, up, btnA1, btnA2, btnA3, btnA4, btnA5, btnA6, btnA7, btnA8, btnA9, btnA10, btnA11, btnA12, btnA13, btnA14, btnA15, btnA16, btnA17, btnZeros, btnOnes, btnTwos, btnThrees, btnFours, btnFives, btnSixs, btnSevens, btnEights, btnNines;
    static boolean flag = false;
    static TextView edt1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (TextView) findViewById(R.id.textView);


    }


    //if user want to use Calculator and click calculator button, this method running
    //calculator fragment will work
    public void UsingCalculator(View v) {
        Fragment fragment = null;
        if (v == findViewById(R.id.btnCalculator)) {
            fragment = new Calculator();
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.output, fragment);
        transaction.commit();
    }


    //if user click to notepad button, this method call to notepad fragment
    public void UsingNotepad(View v) {
        Fragment fragment = null;
        if (v == findViewById(R.id.btnNotePad)) {
            fragment = new Notepad();
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.output, fragment);
        transaction.commit();

    }


    //user click to 123 buttons, symbol keyboard fragment is running
    public void UsingSymbolKeyBoard(View v) {
        Fragment fragment = null;
        if (v == findViewById(R.id.btnSymbol)) {
            fragment = new SymbolKeyboard();

        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.output, fragment);
        transaction.commit();
    }

    // if user want to back letter keyboard when using symbol keyboard, he will click ABC buttons
    //Then, Notepad fragment is run, and this method provides it
    public void UsingLetterKeyBoard(View v) {
        Fragment fragment = null;
        if (v == findViewById(R.id.btnLetter)) {
            fragment = new Notepad();

        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.output, fragment);
        transaction.commit();
    }


    //This method provides that using lowercase letter
    public void lowercase(View v) {

        if (v == findViewById(R.id.btnUp)) {
            btnA = (Button) findViewById(R.id.btnA);
            btnB = (Button) findViewById(R.id.btnB);
            btnC = (Button) findViewById(R.id.btnC);
            btnÇ = (Button) findViewById(R.id.btnÇ);
            btnD = (Button) findViewById(R.id.btnD);
            btnE = (Button) findViewById(R.id.btnE);
            btnF = (Button) findViewById(R.id.btnF);
            btnG = (Button) findViewById(R.id.btnG);
            btnĞ = (Button) findViewById(R.id.btnĞ);
            btnH = (Button) findViewById(R.id.btnH);
            btnI = (Button) findViewById(R.id.btnI);
            btnİ = (Button) findViewById(R.id.btnİ);
            btnJ = (Button) findViewById(R.id.btnJ);
            btnK = (Button) findViewById(R.id.btnK);
            btnL = (Button) findViewById(R.id.btnL);
            btnM = (Button) findViewById(R.id.btnM);
            btnN = (Button) findViewById(R.id.btnN);
            btnO = (Button) findViewById(R.id.btnO);
            btnÖ = (Button) findViewById(R.id.btnÖ);
            btnP = (Button) findViewById(R.id.btnP);
            btnR = (Button) findViewById(R.id.btnR);
            btnS = (Button) findViewById(R.id.btnS);
            btnŞ = (Button) findViewById(R.id.btnŞ);
            btnT = (Button) findViewById(R.id.btnT);
            btnU = (Button) findViewById(R.id.btnU);
            btnÜ = (Button) findViewById(R.id.btnÜ);
            btnV = (Button) findViewById(R.id.btnV);
            btnY = (Button) findViewById(R.id.btnY);
            btnZ = (Button) findViewById(R.id.btnZ);
            up = (Button) findViewById(R.id.btnUp);

            if (flag == false) {


                btnA.setAllCaps(flag);
                btnB.setAllCaps(flag);
                btnC.setAllCaps(flag);
                btnÇ.setAllCaps(flag);
                btnD.setAllCaps(flag);
                btnE.setAllCaps(flag);
                btnF.setAllCaps(flag);
                btnG.setAllCaps(flag);
                btnĞ.setAllCaps(flag);
                btnH.setAllCaps(flag);
                btnI.setAllCaps(flag);
                btnİ.setAllCaps(flag);
                btnJ.setAllCaps(flag);
                btnK.setAllCaps(flag);
                btnL.setAllCaps(flag);
                btnM.setAllCaps(flag);
                btnN.setAllCaps(flag);
                btnO.setAllCaps(flag);
                btnÖ.setAllCaps(flag);
                btnP.setAllCaps(flag);
                btnR.setAllCaps(flag);
                btnS.setAllCaps(flag);
                btnŞ.setAllCaps(flag);
                btnT.setAllCaps(flag);
                btnU.setAllCaps(flag);
                btnÜ.setAllCaps(flag);
                btnV.setAllCaps(flag);
                btnY.setAllCaps(flag);
                btnZ.setAllCaps(flag);
                up.setText("Upper Case");
                flag = true;

            } else if (flag == true) {


                btnA.setAllCaps(flag);
                btnB.setAllCaps(flag);
                btnC.setAllCaps(flag);
                btnÇ.setAllCaps(flag);
                btnD.setAllCaps(flag);
                btnE.setAllCaps(flag);
                btnF.setAllCaps(flag);
                btnG.setAllCaps(flag);
                btnĞ.setAllCaps(flag);
                btnH.setAllCaps(flag);
                btnI.setAllCaps(flag);
                btnİ.setAllCaps(flag);
                btnJ.setAllCaps(flag);
                btnK.setAllCaps(flag);
                btnL.setAllCaps(flag);
                btnM.setAllCaps(flag);
                btnN.setAllCaps(flag);
                btnO.setAllCaps(flag);
                btnÖ.setAllCaps(flag);
                btnP.setAllCaps(flag);
                btnR.setAllCaps(flag);
                btnS.setAllCaps(flag);
                btnŞ.setAllCaps(flag);
                btnT.setAllCaps(flag);
                btnU.setAllCaps(flag);
                btnÜ.setAllCaps(flag);
                btnV.setAllCaps(flag);
                btnY.setAllCaps(flag);
                btnZ.setAllCaps(flag);
                flag = false;
                up.setText("Lower Case");

            }
        }
    }


    public void Letters(View v) {

        btnA1 = (Button) findViewById(R.id.btnUnlem);
        btnA2 = (Button) findViewById(R.id.btnA2);
        btnA3 = (Button) findViewById(R.id.btnA3);
        btnA4 = (Button) findViewById(R.id.btnA4);
        btnA5 = (Button) findViewById(R.id.btnA5);
        btnA6 = (Button) findViewById(R.id.btnA6);
        btnA7 = (Button) findViewById(R.id.btnA7);
        btnA8 = (Button) findViewById(R.id.btnA8);
        btnA9 = (Button) findViewById(R.id.btnA9);
        btnA10 = (Button) findViewById(R.id.btnA10);
        btnA11 = (Button) findViewById(R.id.btnA11);
        btnA12 = (Button) findViewById(R.id.btnA12);
        btnA13 = (Button) findViewById(R.id.btnA13);
        btnA14 = (Button) findViewById(R.id.btnA14);
        btnA15 = (Button) findViewById(R.id.btnA15);
        btnA16 = (Button) findViewById(R.id.btnA16);
        btnA17 = (Button) findViewById(R.id.btnA17);


        btnZeros = (Button) findViewById(R.id.btnZeros);
        btnOnes = (Button) findViewById(R.id.btnOnes);
        btnTwos = (Button) findViewById(R.id.btnTwos);
        btnThrees = (Button) findViewById(R.id.btnThrees);
        btnFours = (Button) findViewById(R.id.btnFours);
        btnFives = (Button) findViewById(R.id.btnFives);
        btnSixs = (Button) findViewById(R.id.btnSixs);
        btnSevens = (Button) findViewById(R.id.btnSevens);
        btnEights = (Button) findViewById(R.id.btnEights);
        btnNines = (Button) findViewById(R.id.btnNines);


        //Clicked space button
        if (v == findViewById(R.id.btnSpaceS)) {
            edt1.setText(edt1.getText() + " ");

        }

        //When clicked delete buttons, this clear textview
        if (v == findViewById(R.id.btnDelete)) {

            edt1.setText(String.valueOf(""));

        }
        //Clicked space button in notepad layout
        if (v == findViewById(R.id.btnSpace)) {
            edt1.setText(edt1.getText() + " ");


        }

        if (v == findViewById(R.id.btnUnlem)) {
            Toast.makeText(getApplicationContext(), "clickedA1", Toast.LENGTH_LONG).show();
            String text = edt1.getText() + String.valueOf(btnA1.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA2)) {
            String text = edt1.getText() + String.valueOf(btnA2.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA3)) {
            String text = edt1.getText() + String.valueOf(btnA3.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA4)) {
            String text = edt1.getText() + String.valueOf(btnA4.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA5)) {
            String text = edt1.getText() + String.valueOf(btnA5.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA6)) {
            String text = edt1.getText() + String.valueOf(btnA6.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA7)) {
            String text = edt1.getText() + String.valueOf(btnA7.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA8)) {
            String text = edt1.getText() + String.valueOf(btnA8.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA9)) {
            String text = edt1.getText() + String.valueOf(btnA9.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA10)) {
            String text = edt1.getText() + String.valueOf(btnA10.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA11)) {
            String text = edt1.getText() + String.valueOf(btnA11.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA12)) {
            String text = edt1.getText() + String.valueOf(btnA12.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA13)) {
            String text = edt1.getText() + String.valueOf(btnA13.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA14)) {
            String text = edt1.getText() + String.valueOf(btnA14.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA15)) {
            String text = edt1.getText() + String.valueOf(btnA15.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA16)) {
            String text = edt1.getText() + String.valueOf(btnA16.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnA17)) {
            String text = edt1.getText() + String.valueOf(btnA17.getText());
            edt1.setText(text);
        }


        if (v == findViewById(R.id.btnZeros)) {
            String text = edt1.getText() + String.valueOf(btnZeros.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnOnes)) {
            String text = edt1.getText() + String.valueOf(btnOnes.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnTwos)) {
            String text = edt1.getText() + String.valueOf(btnTwos.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnThrees)) {
            String text = edt1.getText() + String.valueOf(btnThrees.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnFours)) {
            String text = edt1.getText() + String.valueOf(btnFours.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnFives)) {
            String text = edt1.getText() + String.valueOf(btnFives.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnSixs)) {
            String text = edt1.getText() + String.valueOf(btnSixs.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnSevens)) {
            String text = edt1.getText() + String.valueOf(btnSevens.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnEights)) {
            String text = edt1.getText() + String.valueOf(btnEights.getText());
            edt1.setText(text);
        }
        if (v == findViewById(R.id.btnNines)) {
            String text = edt1.getText() + String.valueOf(btnNines.getText());
            edt1.setText(text);
        }

    }


}
