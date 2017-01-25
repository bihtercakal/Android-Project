package com.example.bihter.assignment06;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

//For Using Text Keyboard
public class Notepad extends Fragment {
    //variables
    Button  btnA,btnB,btnC,btnÇ,btnD,btnE,btnF,btnG,btnĞ,btnH,btnI,btnİ,btnJ,btnK,btnL,btnM,btnN
            ,btnO,btnÖ,btnP,btnR,btnS,btnŞ,btnT,btnU,btnÜ,btnV,btnY,btnZ,submit;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notepad_layout, viewGroup, false);
        submit = (Button) view.findViewById(R.id.btnSubmit);
        btnA = (Button) view.findViewById(R.id.btnA);
        btnB = (Button) view.findViewById(R.id.btnB);
        btnC = (Button) view.findViewById(R.id.btnC);
        btnÇ = (Button) view.findViewById(R.id.btnÇ);
        btnD = (Button) view.findViewById(R.id.btnD);
        btnE = (Button) view.findViewById(R.id.btnE);
        btnF = (Button) view.findViewById(R.id.btnF);
        btnG = (Button) view.findViewById(R.id.btnG);
        btnĞ = (Button) view.findViewById(R.id.btnĞ);
        btnH = (Button) view.findViewById(R.id.btnH);
        btnI = (Button) view.findViewById(R.id.btnI);
        btnİ = (Button) view.findViewById(R.id.btnİ);
        btnJ = (Button) view.findViewById(R.id.btnJ);
        btnK = (Button) view.findViewById(R.id.btnK);
        btnL = (Button) view.findViewById(R.id.btnL);
        btnM = (Button) view.findViewById(R.id.btnM);
        btnN = (Button) view.findViewById(R.id.btnN);
        btnO = (Button) view.findViewById(R.id.btnO);
        btnÖ = (Button) view.findViewById(R.id.btnÖ);
        btnP = (Button) view.findViewById(R.id.btnP);
        btnR = (Button) view.findViewById(R.id.btnR);
        btnS = (Button) view.findViewById(R.id.btnS);
        btnŞ = (Button) view.findViewById(R.id.btnŞ);
        btnT = (Button) view.findViewById(R.id.btnT);
        btnU = (Button) view.findViewById(R.id.btnU);
        btnÜ = (Button) view.findViewById(R.id.btnÜ);
        btnV = (Button) view.findViewById(R.id.btnV);
        btnY = (Button) view.findViewById(R.id.btnY);
        btnZ = (Button) view.findViewById(R.id.btnZ);




        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnA.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnA.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });


        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnB.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnB.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnC.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnC.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnÇ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnÇ.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnÇ.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnD.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnD.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnE.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnE.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnF.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnF.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnG.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnG.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnĞ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnĞ.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnĞ.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnH.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnH.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnI.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnI.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnİ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnİ.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnİ.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnJ.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnJ.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnK.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnK.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnL.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnL.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnM.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnM.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnN.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnN.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnO.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnO.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnÖ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnÖ.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnÖ.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnP.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnP.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnR.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnR.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnS.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnS.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnŞ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnŞ.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnŞ.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnT.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnT.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnU.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnU.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnÜ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnÜ.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnÜ.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnV.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnV.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnY.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnY.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });
        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=MainActivity.edt1.getText()+String.valueOf(btnZ.getText());

                if(MainActivity.flag==false ) {

                    text=MainActivity.edt1.getText()+String.valueOf(btnZ.getText()).toUpperCase();
                    MainActivity.edt1.setText(text);
                }
                else{
                    MainActivity.edt1.setText(text);
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),MainActivity.edt1.getText(),Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}