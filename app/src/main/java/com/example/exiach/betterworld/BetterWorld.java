package com.example.exiach.betterworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BetterWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_better_world);
    }

    /**
     * the function changes to the next topic.
     * @param view
     */
    public void nextTopic(View view) {
        TextView titleTopic = (TextView) findViewById(R.id.title_topic);
        TextView textDescription = (TextView) findViewById(R.id.text_description);

        TextView textTipOne = (TextView) findViewById(R.id.tip_one);
        TextView textTipTwo = (TextView) findViewById(R.id.tip_two);
        TextView textTipThree = (TextView) findViewById(R.id.tip_three);

        TextView textLink_one = (TextView) findViewById(R.id.link_one);
        TextView textLink_two = (TextView) findViewById(R.id.link_two);

        ImageView containerImage = (ImageView) findViewById(R.id.image);

        if (titleTopic.getText().equals("Pollution")) {
            containerImage.setImageResource(R.drawable.poverty);
            titleTopic.setText(R.string.poverty);
            textDescription.setText(R.string.poverty_description);
            textTipOne.setText(R.string.poverty_tip_one);
            textTipTwo.setText(R.string.poverty_tip_two);
            textTipThree.setText(R.string.poverty_tip_three);
            textLink_one.setText(R.string.poverty_link_one);
            textLink_two.setText(R.string.poverty_link_two);
            hiddenInformation(view);
        } else {

            if (titleTopic.getText().equals("Poverty")) {
                containerImage.setImageResource(R.drawable.air_pollution);
                titleTopic.setText(R.string.air_pollution);
                textDescription.setText(R.string.air_pollution_description);
                textTipOne.setText(R.string.air_pollution_tip_one);
                textTipTwo.setText(R.string.air_pollution_tip_two);
                textTipThree.setText(R.string.air_pollution_tip_three);
                textLink_one.setText(R.string.air_pollution_link_one);
                textLink_two.setText(R.string.air_pollution_link_two);
                hiddenInformation(view);
            } else {
                if (titleTopic.getText().equals("Air pollution")) {
                    containerImage.setImageResource(R.drawable.animals);
                    titleTopic.setText(R.string.animals);
                    textDescription.setText(R.string.animals_description);
                    textTipOne.setText(R.string.animals_tip_one);
                    textTipTwo.setText(R.string.animals_tip_two);
                    textTipThree.setText(R.string.animals_tip_three);
                    textLink_one.setText(R.string.animals_link_one);
                    textLink_two.setText(R.string.animals_link_two);
                    hiddenInformation(view);
                } else {
                    containerImage.setImageResource(R.drawable.orphan);
                    titleTopic.setText(R.string.orphan);
                    textDescription.setText(R.string.orphan_description);
                    textTipOne.setText(R.string.orphan_tip_one);
                    textTipTwo.setText(R.string.orphan_tip_two);
                    textTipThree.setText(R.string.orphan_tip_three);
                    textLink_one.setText(R.string.orphan_link_one);
                    textLink_two.setText(R.string.orphan_link_two);
                    hiddenInformation(view);
                }
            }

        }

    }

    /**
     * the function changes to the back topic.
     * @param view
     */
    public void backTopic(View view) {
        TextView titleTopic = (TextView) findViewById(R.id.title_topic);
        TextView textDescription = (TextView) findViewById(R.id.text_description);

        TextView textTipOne = (TextView) findViewById(R.id.tip_one);
        TextView textTipTwo = (TextView) findViewById(R.id.tip_two);
        TextView textTipThree = (TextView) findViewById(R.id.tip_three);

        TextView textLink_one = (TextView) findViewById(R.id.link_one);
        TextView textLink_two = (TextView) findViewById(R.id.link_two);

        ImageView containerImage = (ImageView) findViewById(R.id.image);

        if (titleTopic.getText().toString().equals("Orphan")) {
            containerImage.setImageResource(R.drawable.animals);
            titleTopic.setText(R.string.animals);
            textDescription.setText(R.string.animals_description);
            textTipOne.setText(R.string.animals_tip_one);
            textTipTwo.setText(R.string.animals_tip_two);
            textTipThree.setText(R.string.animals_tip_three);
            textLink_one.setText(R.string.animals_link_one);
            textLink_two.setText(R.string.animals_link_two);
            hiddenInformation(view);
        } else {
            if (titleTopic.getText().toString().equals("Animals")) {
                containerImage.setImageResource(R.drawable.air_pollution);
                titleTopic.setText(R.string.air_pollution);
                textDescription.setText(R.string.air_pollution_description);
                textTipOne.setText(R.string.air_pollution_tip_one);
                textTipTwo.setText(R.string.air_pollution_tip_two);
                textTipThree.setText(R.string.air_pollution_tip_three);
                textLink_one.setText(R.string.air_pollution_link_one);
                textLink_two.setText(R.string.air_pollution_link_two);
                hiddenInformation(view);
            } else {
                if (titleTopic.getText().toString().equals("Air pollution")) {
                    containerImage.setImageResource(R.drawable.poverty);
                    titleTopic.setText(R.string.poverty);
                    textDescription.setText(R.string.poverty_description);
                    textTipOne.setText(R.string.poverty_tip_one);
                    textTipTwo.setText(R.string.poverty_tip_two);
                    textTipThree.setText(R.string.poverty_tip_three);
                    textLink_one.setText(R.string.poverty_link_one);
                    textLink_two.setText(R.string.poverty_link_two);
                    hiddenInformation(view);
                } else {
                    containerImage.setImageResource(R.drawable. environmental_pollution);
                    titleTopic.setText(R.string.env_pollution);
                    textDescription.setText(R.string.env_pollution_description);
                    textTipOne.setText(R.string.env_pollution_tip_one);
                    textTipTwo.setText(R.string.env_pollution_tip_two);
                    textTipThree.setText(R.string.env_pollution_tip_three);
                    textLink_one.setText(R.string.env_pollution_link_one);
                    textLink_two.setText(R.string.env_pollution_link_two);
                    hiddenInformation(view);
                }
            }

        }


        System.out.println(titleTopic.getText());
    }

    /**
     * the function shows more information about topic.
     * @param view
     */
    public void seeMore(View view) {
        TextView textSeeMore = (TextView) findViewById(R.id.see_more);
        LinearLayout containerMoreInformation = (LinearLayout) findViewById(R.id.more_information);

        textSeeMore.setVisibility(view.GONE);
        containerMoreInformation.setVisibility(view.VISIBLE);
    }

    /**
     * the private function is for hidden information when changes the topic.
     * @param view
     */
    private void hiddenInformation(View view) {
        TextView textSeeMore = (TextView) findViewById(R.id.see_more);
        LinearLayout containerMoreInformation = (LinearLayout) findViewById(R.id.more_information);

        textSeeMore.setVisibility(view.VISIBLE);
        containerMoreInformation.setVisibility(view.GONE);
    }
}