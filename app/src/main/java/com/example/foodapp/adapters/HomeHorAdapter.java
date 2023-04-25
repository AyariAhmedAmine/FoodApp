package com.example.foodapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.models.HomeHorModels;
import com.example.foodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;

    Activity activity;
    ArrayList<HomeHorModels> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModels> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza 1", "10:00 - 23:00", "4.9", "Min - 34dt"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza 2", "10:00 - 23:00", "4.9", "Min - 34dt"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza 3", "10:00 - 23:00", "4.9", "Min - 34dt"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza, "Pizza 4", "10:00 - 23:00", "4.9", "Min - 34dt"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }

            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1,"Pizza 1", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2,"Pizza 2", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3,"Pizza 3", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza,"Pizza 4", "10:00 - 23:00","4.9","Min - 34dt"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 1){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.hamburger,"Burger 1", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.hamburger,"Burger 2", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.hamburger,"Burger 3", "10:00 - 23:00","4.9","Min - 34dt"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 2){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fried_potates,"Fries 1", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fried_potates,"Fries 2", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fried_potates,"Fries 3", "10:00 - 23:00","4.9","Min - 34dt"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 3){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.ice_cream,"Ice cream 1", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.ice_cream,"Ice cream 2", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.ice_cream,"Ice cream 3", "10:00 - 23:00","4.9","Min - 34dt"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 4){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich,"Sandwich 1", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich,"Sandwich 2", "10:00 - 23:00","4.9","Min - 34dt"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich,"Sandwich 3", "10:00 - 23:00","4.9","Min - 34dt"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_txt);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
