package com.bluefly.fung02.ui.notifications;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import android.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bluefly.fung02.MainActivity;
import com.bluefly.fung02.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {

        //new AlertDialog.Builder(requireContext())
        //        .setMessage(getString(R.string.order_confirmation))
        //        .setPositiveButton(getString(R.string.ok), (dialog, which) -> {} )
        //        .create();


        //AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        /*
        builder.setTitle("Confirm");
        builder.setMessage("Are you sure?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                // Do nothing, but close the dialog
                //android.os.Process.killProcess(android.os.Process.myPid());
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                // Do nothing
                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
        */


        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);


        final TextView textView = binding.textNotifications;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        View root = binding.getRoot();
        android.os.Process.killProcess(android.os.Process.myPid());
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}