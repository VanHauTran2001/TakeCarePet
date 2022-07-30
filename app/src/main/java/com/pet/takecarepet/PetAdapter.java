package com.pet.takecarepet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pet.takecarepet.databinding.ItemPetBinding;

import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder>{
    private Context context;
    private List<Pet> petList;
    private ItemPetBinding binding;

    public PetAdapter(Context context, List<Pet> petList) {
        this.context = context;
        this.petList = petList;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pet,parent,false);
        binding = DataBindingUtil.bind(view);
        return new PetViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        Pet pet = petList.get(position);
        binding.txtName.setText(pet.getName());
        Glide.with(context).load(pet.getImage()).into(binding.imgPet);
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

    public class PetViewHolder extends RecyclerView.ViewHolder{

        public PetViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
