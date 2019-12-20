package com.example.voteeui;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private ViewPager myViewPager;
    private LinearLayout myWLinearLayout;
    private ConstraintLayout constraintLayout;
    private TextView[] mDots;
    private Button toLoginBtn;

    private SliderAdapter sliderAdapter;

    private Button prevButton;
    private Button nextButton;

    private int mCurrentPage;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPager = (ViewPager) findViewById(R.id.myViewPager);
        myWLinearLayout = (LinearLayout) findViewById(R.id.myWLinearLayout);
        toLoginBtn = (Button) findViewById(R.id.btnToLogin);

        prevButton = (Button) findViewById(R.id.prevBtn);
        nextButton = (Button) findViewById(R.id.nextBtn);

        sliderAdapter = new SliderAdapter(this);

        myViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);

        myViewPager.addOnPageChangeListener(viewListener);
    }

    public void addDotsIndicator(int position)
    {
        mDots = new TextView[3];
        myWLinearLayout.removeAllViews();

        for(int i=0; i<mDots.length; i++)
        {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            myWLinearLayout.addView(mDots[i]);
        }

        if(mDots.length > 0)
        {
            mDots[position].setTextColor(getResources().getColor(R.color.white));
        }
    }

        ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position)
            {
                addDotsIndicator(position);
                mCurrentPage = position;

                if(position == 0)
                {
                    nextButton.setEnabled(true);
                    prevButton.setEnabled(false);
                    prevButton.setVisibility(View.INVISIBLE);

                    nextButton.setText("NEXT");
                    prevButton.setText("");
                }
                else if(position == mDots.length -1)
                {
                    nextButton.setEnabled(true);
                    prevButton.setEnabled(true);
                    prevButton.setVisibility(View.VISIBLE);

                    nextButton.setText("GET STARTED");
                    prevButton.setText("PREV");
                }
                else
                    {
                        nextButton.setEnabled(true);
                        prevButton.setEnabled(true);
                        prevButton.setVisibility(View.VISIBLE);

                        nextButton.setText("NEXT");
                        prevButton.setText("PREV");
                    }
            }

            @Override
            public void onPageScrollStateChanged(int position) {

            }
        };

        public void toLoginScreen(View view)
        {
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
           startActivity(intent);
        }

}
