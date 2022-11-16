package com.example.pigalev_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Authorization extends AppCompatActivity {

    ImageView image, imageCheked;
    EditText textPassword, textEmailOrPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);
        image = findViewById(R.id.ivVisiblePassword);
        textEmailOrPhone = findViewById(R.id.textEmailOrPhone);
        textPassword = findViewById(R.id.textPassword);
        imageCheked = findViewById(R.id.cbRememberPassword);
        textPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        textEmailOrPhone.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus)
                textEmailOrPhone.setHint("");
            else
                textEmailOrPhone.setHint("Enter Email / Phone Number");
        });

        textPassword.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus)
                textPassword.setHint("");
            else
                textPassword.setHint("Password");
        });
    }

    public void getVisiblePassword(View v)
    {
        if(textPassword.getInputType() == 129)
        {
            image.setImageResource(R.drawable.icon_visible);
            textPassword.setInputType(InputType.TYPE_CLASS_TEXT);
        }
        else
        {
            image.setImageResource(R.drawable.icon_not_visible);
            textPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }
    public void nextRegistraation(View v)
    {
        startActivity(new Intent(this, Registration.class));
    }
    public void CheckedIm(View v)
    {
        if(imageCheked.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.check_box_not_active).getConstantState())
        {
            imageCheked.setImageResource(R.drawable.check_box_active);
        }
        else
        {
            imageCheked.setImageResource(R.drawable.check_box_not_active);
        }

    }
}