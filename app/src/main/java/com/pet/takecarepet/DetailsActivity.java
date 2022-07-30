package com.pet.takecarepet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.pet.takecarepet.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_details);
        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailsActivity.this,PetActivity.class));
            }
        });
        binding.btnBird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage("Bird");
            }
        });
        binding.btnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage("Cat");
            }
        });
        binding.btnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage("Dog");
            }
        });
        binding.btnRabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage("Rabbit");
            }
        });
        binding.btnSquirrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage("Squirrel");
            }
        });
        binding.btndogCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage("Dog and Cat");
            }
        });
        binding.btnRandum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage("On Successfull");
            }
        });
    }
    private void showMessage(String mesage){
        Toast.makeText(DetailsActivity.this, mesage, Toast.LENGTH_SHORT).show();
    }
}