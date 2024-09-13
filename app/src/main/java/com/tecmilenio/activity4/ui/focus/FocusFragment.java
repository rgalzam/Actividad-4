package com.tecmilenio.activity4.ui.focus;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.tecmilenio.activity4.R;
import com.tecmilenio.activity4.databinding.FragmentClicBinding;

public class FocusFragment extends Fragment {

    private FocusViewModel mViewModel;

    private FragmentFocusBinding binding;

    public static FocusFragment newInstance() {
        return new FocusFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentFocusBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        EditText ETFocus = binding.ETFocus;

        ETFocus.setOnFocusChangeListener((v, hasFocus)->{

            if(hasFocus){
                Toast.makeText(getContext(), "EditText Focused", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "EditText Lost Focused", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FocusViewModel.class);
        // TODO: Use the ViewModel
    }

}