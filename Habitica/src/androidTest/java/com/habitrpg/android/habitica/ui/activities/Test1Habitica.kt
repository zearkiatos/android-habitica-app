package com.habitrpg.android.habitica.ui.activities

import androidx.test.espresso.Espresso.onView
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.runner.RunWith

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.allOf
import com.habitrpg.android.habitica.R
import org.junit.Test


@LargeTest
@RunWith(AndroidJUnit4.class)
class Test1Habitica {
    @Rule val mActivityTestRule = ActivityScenarioRule(
        MainActivity::class.java
    )

    @Test
    fun mainActivityTest2() {
        val skipBtn = onView(allOf(withId(R.id.skipButton), withText("Skip"), isDisplayed()))
        skipBtn.perform(click())

        val loginBtn = onView(allOf(withId(R.id.show_login_button), withText("Login"), isDisplayed()))
        loginBtn.perform(click())

        val usernameTxt = onView(withId(R.id.username))
        usernameTxt.perform(scrollTo(), replaceText("monbi202010@gmail.com"), closeSoftKeyboard())

        val pwdTxt = onView(withId(R.id.password))
        pwdTxt.perform(scrollTo(), replaceText("123456789MISO"), closeSoftKeyboard())

        val confirmLoginBtn = onView(allOf(withId(R.id.login_btn), withText("Login")))
        confirmLoginBtn.perform(scrollTo(), click())
    }

}