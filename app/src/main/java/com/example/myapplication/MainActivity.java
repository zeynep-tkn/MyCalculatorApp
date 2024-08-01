package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    TextView resultText;
    Button piButton;
    Button resultButton;
    Button sqrtButton;
    Button backButton;
    Button commaButton;
    Button factButton;
    Button percentageButton;
    Button deleteButton;
    Button powerButton;
    Button deductButton;
    Button multiplyButton;
    Button plusButton;
    Button subtractionButton;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    Switch swwitch;
    float sayi1 = 0, sonuc = 0, sayi2;
    String sayi = "0";
    String islem = "";
    boolean tiklandi = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        resultText = findViewById(R.id.resultText);
        piButton = findViewById(R.id.piButton);
        resultButton = findViewById(R.id.resultButton);
        sqrtButton = findViewById(R.id.sqrtButton);
        backButton = findViewById(R.id.backButton);
        commaButton = findViewById(R.id.commaButton);
        factButton = findViewById(R.id.factButton);
        percentageButton = findViewById(R.id.percentageButton);
        deleteButton = findViewById(R.id.deleteButton);
        powerButton = findViewById(R.id.powerButton);
        deductButton = findViewById(R.id.deductButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        plusButton = findViewById(R.id.plusButton);
        subtractionButton = findViewById(R.id.subtractionButton);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        swwitch = findViewById(R.id.simpleSwitch);
        editTextNumber.setText(sayi);



        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    sayi = "0";
                    sayi2 = 0;
                    sayi1 = 0;
                    sonuc = 0;
                    tiklandi = false;
                    editTextNumber.setText(sayi);
                    resultText.setText(sayi);
                }
            }
        });

        View.OnClickListener numberClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    Button button = (Button) view;
                    String buttonText = button.getText().toString();
                    if (sayi.equals("0")) {
                        sayi = buttonText;
                    } else {
                        sayi += buttonText;
                    }
                    editTextNumber.setText(sayi);
                }
            }
        };

        button0.setOnClickListener(numberClickListener);
        button1.setOnClickListener(numberClickListener);
        button2.setOnClickListener(numberClickListener);
        button3.setOnClickListener(numberClickListener);
        button4.setOnClickListener(numberClickListener);
        button5.setOnClickListener(numberClickListener);
        button6.setOnClickListener(numberClickListener);
        button7.setOnClickListener(numberClickListener);
        button8.setOnClickListener(numberClickListener);
        button9.setOnClickListener(numberClickListener);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.isEmpty()) {
                        sayi1 = Float.parseFloat(sayi);
                    }
                    sonuc = (sonuc == 0) ? sayi1 : sonuc;
                    islem = "+";
                    editTextNumber.setText("+");
                    sayi = "";
                }
            }
        });

        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.isEmpty()) {
                        sayi1 = Float.parseFloat(sayi);
                    }
                    sonuc = (sonuc == 0) ? sayi1 : sonuc;
                    islem = "-";
                    editTextNumber.setText("-");
                    sayi = "";
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.isEmpty()) {
                        sayi1 = Float.parseFloat(sayi);
                    }
                    sonuc = (sonuc == 0) ? sayi1 : sonuc;
                    islem = "*";
                    editTextNumber.setText("x");
                    sayi = "";
                }
            }
        });

        deductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.isEmpty()) {
                        sayi1 = Float.parseFloat(sayi);
                    }
                    sonuc = (sonuc == 0) ? sayi1 : sonuc;
                    islem = "/";
                    editTextNumber.setText("÷");
                    sayi = "";
                }
            }
        });

        sqrtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.isEmpty()) {
                        sayi1 = Float.parseFloat(sayi);
                        sonuc = (float) Math.sqrt(sayi1);
                        resultText.setText(String.valueOf(sonuc));
                        sayi = "0";
                    }
                }
            }
        });

        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.isEmpty()) {
                        sayi1 = Float.parseFloat(sayi);
                        islem = "^"; // Üs işlemi için özel bir işaret kullanıyoruz.
                        sayi = "";
                        editTextNumber.setText("^"); // Ekranda '^' gösterelim.
                    }
                }
            }
        });

        percentageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.isEmpty()) {
                        sayi1 = Float.parseFloat(sayi);
                        sonuc = (sayi1 * sonuc) / 100;
                        editTextNumber.setText(String.valueOf(sonuc));
                        sayi = "%";
                    }
                }
            }
        });

        commaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.contains("."))
                        sayi += ".";
                    editTextNumber.setText(sayi);
                }
            }
        });

        factButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.isEmpty()) {
                        int number = Integer.parseInt(sayi);
                        int factorial = 1;
                        for (int i = 1; i <= number; i++)
                            factorial = factorial * i;
                        sonuc = factorial;
                        resultText.setText(String.valueOf(sonuc));
                        sayi = "!";
                    }
                }
            }
        });

        piButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    sonuc = (float) (sonuc + Math.PI);
                    resultText.setText(String.valueOf(sonuc));
                }
            }
        });

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!swwitch.isChecked()) {
                    if (!sayi.isEmpty()) {
                        sayi2 = Float.parseFloat(sayi);
                    }
                    switch (islem) {
                        case "+":
                            sonuc += sayi2;
                            break;
                        case "-":
                            sonuc -= sayi2;
                            break;
                        case "*":
                            sonuc *= sayi2;
                            break;
                        case "^": // Üslü hesaplama
                            sonuc = (float) Math.pow(sayi1, sayi2);
                            break;
                        case "/":
                            if (sayi2 != 0) {
                                sonuc /= sayi2;
                            } else {
                                editTextNumber.setText("Error");
                                return;
                            }
                            break;
                    }
                    resultText.setText(String.valueOf(sonuc));
                    sayi = "0";
                    sayi1 = sonuc;
                }
            }
        });
    }
}
