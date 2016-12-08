package c7081.quickclean;

import c7081.quickclean.CreateSchedule.NewSched;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.EspressoKey;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.KeyEvent;

import junit.framework.AssertionFailedError;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressKey;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by Liz on 2016-12-07.
 */
@RunWith (AndroidJUnit4.class)
public class espressoTest {

    @Rule
    public ActivityTestRule<Home> mActivityTestRule = new ActivityTestRule<>(Home.class);

    @Test
    public void ensureTextChangeWork() {
        //go to Add page
        onView(withId(R.id.newBtn)).perform(click());
        //type text and the press button
        onView(withId(R.id.sName))
                .perform(typeText("Winter Cleaning"), closeSoftKeyboard());
        onView(withId(R.id.c))
                .perform(typeText("Curtains"), closeSoftKeyboard());
        onView(withId(R.id.w))
                .perform(typeText("Weekly"), closeSoftKeyboard());
        //
        onView(withId(R.id.saveBtn)).perform(click());
        //check that text was changed
        onView(withId(R.id.newTV)).check(matches(withText("Winter Cleaning")));
    }
}
