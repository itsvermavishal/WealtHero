package com.example.wealthero.basic.newbie.chapter1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.wealthero.R;

public class PageFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    public static PageFragment newInstance(int position) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_newbie_chapter1_topic2, container, false);

        Button tvHeading = view.findViewById(R.id.tvHeading);
        TextView tvHeading2 = view.findViewById(R.id.tvHeading2);
        ImageView imgView = view.findViewById(R.id.imgView);
        TextView tvDescription = view.findViewById(R.id.tvDescription);
        Button btnPrevious = view.findViewById(R.id.btnPrevious);
        Button btnNext = view.findViewById(R.id.btnNext);

        int position = getArguments().getInt(ARG_POSITION);

        String[] headings = {"Page 1 Heading", "Page 2 Heading", "Page 3 Heading"};
        String[] headings2 = {"Page 1", "Page 2", "Page 3"};
        int[] images = {R.drawable.whyshouldiinvest, R.drawable.whyshouldiinvest, R.drawable.whyshouldiinvest};
        String[] descriptions = {"Description 1", "Description 2", "Description 3"};

        tvHeading.setText(headings[position]);
        tvHeading2.setText(headings2[position]);
        imgView.setImageResource(images[position]);
        tvDescription.setText(descriptions[position]);

        ViewPager2 viewPager = getActivity().findViewById(R.id.viewPager);

        btnPrevious.setVisibility(position == 0 ? View.INVISIBLE : View.VISIBLE);
        btnNext.setVisibility(position == headings.length - 1 ? View.INVISIBLE : View.VISIBLE);

        btnPrevious.setOnClickListener(v -> viewPager.setCurrentItem(position - 1));
        btnNext.setOnClickListener(v -> viewPager.setCurrentItem(position + 1));

        return view;
    }
}
