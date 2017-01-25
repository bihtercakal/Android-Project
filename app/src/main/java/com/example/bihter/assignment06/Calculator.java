package com.example.bihter.assignment06;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.Toast;

public class Calculator extends Fragment {

    //Variables
    Button btnZero,btnOne,btnTwo,btnThree
            ,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnSum,btnSub,btnDiv,btnMult,btnDot,btnEql,btnClear;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calculator_layout, viewGroup, false);
        btnZero = (Button) view.findViewById(R.id.btnZero);
        btnOne = (Button) view.findViewById(R.id.btnOne);
        btnTwo = (Button) view.findViewById(R.id.btnTwo);
        btnThree = (Button) view.findViewById(R.id.btnThree);
        btnFour = (Button) view.findViewById(R.id.btnFour);
        btnFive = (Button) view.findViewById(R.id.btnFive);
        btnSix = (Button) view.findViewById(R.id.btnSix);
        btnSeven = (Button) view.findViewById(R.id.btnSeven);
        btnEight = (Button) view.findViewById(R.id.btnEight);
        btnNine = (Button) view.findViewById(R.id.btnNine);
        btnSum = (Button) view.findViewById(R.id.btnAdd);
        btnSub = (Button) view.findViewById(R.id.btnSubtract);
        btnDiv = (Button) view.findViewById(R.id.btnDivide);
        btnMult = (Button) view.findViewById(R.id.btnMultiply);
        btnDot = (Button) view.findViewById(R.id.btnDot);
        btnEql = (Button) view.findViewById(R.id.btnEqual);
        btnClear = (Button) view.findViewById(R.id.btnClearC);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.edt1.setText("");
            }
        });
        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String main = String.valueOf(MainActivity.edt1.getText()).trim();

//this methods provides add,multiply,divide,sub
                //I used split method because, calculator don't detect four process symbol like a number
                // For example: 2=[0] +=[1] and 3=[2]
                double fN = Double.parseDouble(main.split(" ")[0]);
                double sN = Double.parseDouble(main.split(" ")[2]);

                try {
                    if (main.split(" ")[1].equals("+")) {
                        double sum=fN+sN;

                        MainActivity.edt1.setText(" ");
                        Toast.makeText(getContext(), sum +" ", Toast.LENGTH_LONG).show();

                    }
                    if (main.split(" ")[1].equals("-")) {
                        double sub=fN-sN;

                        MainActivity.edt1.setText(" ");
                        Toast.makeText(getContext(), sub +" ", Toast.LENGTH_LONG).show();

                    }
                    if (main.split(" ")[1].equals("*")) {
                        double mult=fN*sN;

                        MainActivity.edt1.setText(" ");
                        Toast.makeText(getContext(), mult +" ", Toast.LENGTH_LONG).show();

                    }
                    if (main.split(" ")[1].equals("/")) {
                        double div=fN/sN;

                        MainActivity.edt1.setText(" ");
                        Toast.makeText(getContext(), div +" ", Toast.LENGTH_LONG).show();

                    }

                }catch (Exception e){
                    Toast.makeText(getContext(),e+"",Toast.LENGTH_LONG).show();
                }


            }
        });

        //0
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnDot.getText());
                MainActivity.edt1.setText(text);
            }
        });

        //1
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnOne.getText());
                MainActivity.edt1.setText(text);
            }
        });

        //2
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnTwo.getText());
                MainActivity.edt1.setText(text);
            }
        });

        //3
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnThree.getText());
                MainActivity.edt1.setText(text);
            }
        });


        //4
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnFour.getText());
                MainActivity.edt1.setText(text);
            }
        });


        //5
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnFive.getText());
                MainActivity.edt1.setText(text);
            }
        });


        //6
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnSix.getText());
                MainActivity.edt1.setText(text);
            }
        });


        //7
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnSeven.getText());
                MainActivity.edt1.setText(text);
            }
        });


        //8
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnEight.getText());
                MainActivity.edt1.setText(text);
            }
        });


        //9
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnNine.getText());
                MainActivity.edt1.setText(text);
            }
        });

        //0
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnZero.getText());
                MainActivity.edt1.setText(text);
            }
        });

        // for add symbol
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnSum.getText());
                MainActivity.edt1.setText(text);
            }
        });
        // for sub symbol
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnSub.getText());
                MainActivity.edt1.setText(text);
            }
        });

        // for divide symbol
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnDiv.getText());
                MainActivity.edt1.setText(text);
            }
        });

        // for multiply symbol
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnMult.getText());
                MainActivity.edt1.setText(text);
            }
        });

        return view;




    }


}