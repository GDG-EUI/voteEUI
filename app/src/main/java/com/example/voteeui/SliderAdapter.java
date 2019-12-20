package com.example.voteeui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter
{
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context)
    {
        this.context = context;
    }



    public  int[] slideImages = {

            0,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background
    };

    public String[] slideHeadings = { "KURA","VOTE","RATE"};

    public String[] slideDesc = {

            "For the World Class Students!!!",
            "Voting at your Finger Tips...",
            "Also Rate Different Sectors of Eui"
    };




    @Override
    public int getCount()
    {
        return slideHeadings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return view == (ConstraintLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
         layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
         View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.myImageView);
        TextView slideHeading = (TextView) view.findViewById(R.id.heading1);
        TextView  slideDescription = (TextView) view.findViewById(R.id.desc1);


        slideImageView.setImageResource(slideImages[position]);
        slideHeading.setText(slideHeadings[position]);
        slideDescription.setText(slideDesc[position]);

        container.addView(view);

         return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object)
    {
        container.removeView((ConstraintLayout)object);
    }
}
