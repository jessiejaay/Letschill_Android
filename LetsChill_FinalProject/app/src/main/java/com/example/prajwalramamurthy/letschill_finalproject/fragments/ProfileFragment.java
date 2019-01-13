package com.example.prajwalramamurthy.letschill_finalproject.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.prajwalramamurthy.letschill_finalproject.R;
import com.example.prajwalramamurthy.letschill_finalproject.data_model.Event;
import com.example.prajwalramamurthy.letschill_finalproject.data_model.User;

public class ProfileFragment extends Fragment implements View.OnClickListener {

    // Variables
    private TextView mTextView_fullName;
    private TextView mTextView_username;
    private TextView mTextView_email;
    private TextView mTextView_interests;
    private Button mButton_edit;
    private ProfileInterface mProfileInterface;

    public interface ProfileInterface {

        void openProfileEditActivity(User user);
    }

    public static ProfileFragment newInstance() {

        Bundle args = new Bundle();

        ProfileFragment fragment = new ProfileFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof ProfileInterface) {

            mProfileInterface = (ProfileInterface)context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (getView() != null) {

            // Find views
            mTextView_fullName = getView().findViewById(R.id.textView_fullNameSubTitle);
            mTextView_username = getView().findViewById(R.id.textView_usernameSubTitle);
            mTextView_email = getView().findViewById(R.id.textView_emailAddressSubTitle);
            mTextView_interests = getView().findViewById(R.id.textView_interestsSubTitle);
            mButton_edit = getView().findViewById(R.id.button_profileEdit);

            // Assign click listeners
            mButton_edit.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button_profileEdit:

                // Open the "EditProfile" and pass the current event object to it
                break;
        }
    }
}