package com.udacity.gradle.builditbigger;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.widget.TextView;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

import com.josehinojo.javajokes.Jokes;
import com.udacity.gradle.builditbigger.MainActivity;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class BiggerTest {

    @Rule public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testIfJoke(){
        onView(withId(R.id.jokeButton)).perform(click());

        String displayedJoke = getText(withId(R.id.joke));
        Jokes jokes = new Jokes();
        String chosenJoke = "";

        //just checking if the joke in question is on the list
        for (String string: jokes.getJokesList()) {
            if(string.equals(displayedJoke)){
                chosenJoke = string;
            }
        }
        //checks that the joke is not empty
        onView(withId(R.id.joke)).check((matches(not(withText("")))));
        //checks that the joke and what is displayed are still the same and it cannot be empty at this point
        onView(withId(R.id.joke)).check(matches(withText(chosenJoke)));
    }


    //method from https://stackoverflow.com/questions/23381459/how-to-get-text-from-textview-using-espresso
    String getText(final Matcher<View> matcher) {
        final String[] stringHolder = { null };
        onView(matcher).perform(new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isAssignableFrom(TextView.class);
            }

            @Override
            public String getDescription() {
                return "getting text from a TextView";
            }

            @Override
            public void perform(UiController uiController, View view) {
                TextView tv = (TextView)view; //Save, because of check in getConstraints()
                stringHolder[0] = tv.getText().toString();
            }
        });
        return stringHolder[0];
    }
}
