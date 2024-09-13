package com.tecmilenio.activity4.ui.clicme;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tecmilenio.activity4.R;
import com.tecmilenio.activity4.databinding.FragmentClicBinding;

public class Clicragment extends Fragment {

    private ClicragmentViewModel mViewModel;
    private FragmentClicBinding binding;

    public static Clicragment newInstance() {
        return new Clicragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentClicBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button Clickme_button = binding.ClickmeButton;

        Clickme_button.setOnClickListener(v ->{
            Toast.makeText(getContext(),"ButtonClicked", Toast.LENGTH_LONG).show();
            System.out.println("Click");
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ClicragmentViewModel.class);
        // TODO: Use the ViewModel
    }

}