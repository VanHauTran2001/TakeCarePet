package com.pet.takecarepet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pet.takecarepet.databinding.ActivityPetBinding;

import java.util.ArrayList;
import java.util.List;

public class PetActivity extends AppCompatActivity {
    private ActivityPetBinding binding;
    private List<Pet> petList;
    private PetAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_pet);
        
        initRecyler();
        binding.btnGotoStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PetActivity.this,DetailsActivity.class));
            }
        });
        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PetActivity.this,MainActivity.class));
            }
        });
    }

    private void initRecyler() {
        petList = new ArrayList<>();
        petList.add(new Pet(R.drawable.dog,"Dog"));
        petList.add(new Pet(R.drawable.cat,"Cat"));
        petList.add(new Pet(R.drawable.bird,"Bird"));
        petList.add(new Pet(R.drawable.rabbit,"Rabbit"));
        petList.add(new Pet(R.drawable.squirrel,"Squirred"));
        petList.add(new Pet(R.drawable.cat,"Cat"));
        petList.add(new Pet(R.drawable.bird,"Bird"));
        petList.add(new Pet(R.drawable.dog,"Dog"));
        adapter = new PetAdapter(this,petList);
        binding.recylerPet.setLayoutManager(new GridLayoutManager(this,2));
        binding.recylerPet.setAdapter(adapter);
    }
}