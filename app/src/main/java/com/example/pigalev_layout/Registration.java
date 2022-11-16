package com.example.pigalev_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Registration extends AppCompatActivity {

    ImageView imPassword, imConfirmPassword, imageCheked;
    EditText etFIO, etEmailOrPhone, etPassword, etConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        etFIO = findViewById(R.id.etFIO);
        etEmailOrPhone = findViewById(R.id.etEmailOrPhone);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        imPassword = findViewById(R.id.ivVisiblePassword);
        imConfirmPassword = findViewById(R.id.ivVisibleConfirmPassword);
        etPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        etConfirmPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        imageCheked = findViewById(R.id.imRememberPassword);


        etFIO.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus)
                etFIO.setHint("");
            else
                etFIO.setHint("Full Name");
        });

        etEmailOrPhone.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus)
                etEmailOrPhone.setHint("");
            else
                etEmailOrPhone.setHint("Enter Email / Phone Number");
        });

        etPassword.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus)
                etPassword.setHint("");
            else
                etPassword.setHint("Password");
        });

        etConfirmPassword.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus)
                etConfirmPassword.setHint("");
            else
                etConfirmPassword.setHint("Confirm Password");
        });
    }

    public void getVisiblePassword(View v)
    {
        if(etPassword.getInputType() == 129)
        {
            imPassword.setImageResource(R.drawable.icon_visible);
            etPassword.setInputType(InputType.TYPE_CLASS_TEXT);
        }
        else
        {
            imPassword.setImageResource(R.drawable.icon_not_visible);
            etPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }

    public void getVisibleConfirmPassword(View v)
    {
        if(etConfirmPassword.getInputType() == 129)
        {
            imConfirmPassword.setImageResource(R.drawable.icon_visible);
            etConfirmPassword.setInputType(InputType.TYPE_CLASS_TEXT);
        }
        else
        {
            imConfirmPassword.setImageResource(R.drawable.icon_not_visible);
            etConfirmPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
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

    public void nextRegistrarion(View v)
    {
        startActivity(new Intent(this, AccountCreated.class));
    }

    public void nextAuthorization(View v)
    {
        startActivity(new Intent(this, Authorization.class));
    }
}