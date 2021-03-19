package com.example.calculator;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;






public class MainActivity extends AppCompatActivity {


    Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,EQUAL,ADD,DELETE,Dot,Mul,min,Div;

    String sum1,sum2 ,display;
    boolean plus=false,div=false,MulB=false,Min;

    TextView Tv10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1 = findViewById(R.id.N1);
        B2 = findViewById(R.id.N2);
        B3 = findViewById(R.id.N3);
        B4 = findViewById(R.id.N4);
        B5 = findViewById(R.id.N5);
        B6 = findViewById(R.id.N6);
        B7 = findViewById(R.id.N7);
        B8 = findViewById(R.id.N8);
        B9 = findViewById(R.id.N9);
        B0 = findViewById(R.id.N0);
        Dot = findViewById(R.id.dot);
        ADD = findViewById(R.id.Add);
        Mul = findViewById(R.id.mul);
        EQUAL = findViewById(R.id.Equal);
        DELETE = findViewById(R.id.Cancle);
        Tv10 = findViewById(R.id.tv10);
        Div= findViewById(R.id.div);
        min = findViewById(R.id.min);

        B1.setOnClickListener(v -> {

          

            if (display == null) {
                display = "1";
            } else {
                display = display + "1";

            }


            Tv10.setText(display);


        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display = "2";
                } else {
                    display = display + "2";

                }
                Tv10.setText(display);


            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display = "3";
                } else {
                    display = display + "3";

                }


                Tv10.setText(display);


            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display = "4";
                } else {
                    display = display + "4";

                }


                Tv10.setText(display);


            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display = "5";
                } else {
                    display = display + "5";

                }

                Tv10.setText(display);


            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display = "6";
                } else {
                    display = display + "6";

                }


                Tv10.setText(display);


            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display = "7";
                } else {
                    display = display + "7";

                }


                Tv10.setText(display);


            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display = "8";
                } else {
                    display = display + "8";

                }


                Tv10.setText(display);


            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display = "9";
                } else {
                    display = display + "9";

                }

                Tv10.setText(display);


            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display = "0";
                } else {
                    display = display + "0";

                }


                Tv10.setText(display);


            }
        });
        Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display = ".";
                } else {
                    display = display + ".";

                }


                Tv10.setText(display);


            }
        });
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum1 = display;

                plus = true;
                display = "";

                Tv10.setText("0");


            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum1 = display;

                MulB = true;
                display = "";

                Tv10.setText("0");



            }

        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum1 = display;

                div = true;
                display = "";

                Tv10.setText("0");

            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum1 = display;

                Min = true;
                display = "";

                Tv10.setText("0");

            }
        });

        EQUAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    sum2 = display;
                    float sumA = Float.parseFloat(sum1);
                    float sumB = Float.parseFloat(sum2);
                    if (plus) {
                        float res = sumA + sumB;
                        Tv10.setText(res + "");


                    }
                    if (MulB) {
                        float res = sumA * sumB;
                        Tv10.setText(res + "");


                    }
                    if (div) {
                        float res = sumA / sumB;
                        Tv10.setText(res + "");


                    }
                    if (Min) {
                        float res = sumA - sumB;
                        Tv10.setText(res + "");


                    }
                }catch (Exception e){



                }



            }
        });


        DELETE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display = "";
                Tv10.setText(display);

                plus = false;
                MulB = false;
                div = false;
                Min = false;


            }
        });

    }
}