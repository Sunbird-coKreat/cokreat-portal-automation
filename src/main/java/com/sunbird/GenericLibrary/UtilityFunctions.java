package com.sunbird.GenericLibrary;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityFunctions extends BaseTestConfig {

	/*
	 * This method will wait untill expected conditions and then it will perform
	 * click event on the given webElement
	 */
	public static void waitToBeClickableAndClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	/*
	 * This method will wait untill expected conditions and then it will perform
	 * click event on the given webElement and then is passes the testdata to the
	 * given textbox
	 */
	public static void waitToBeClickableAndSendKeys(WebElement element, String Value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		element.sendKeys(Value);
	}

	public static void waitToBeClickable(WebElement element, String Value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static boolean fluenWait(WebElement element, int waitTime) {
		boolean conditionFulfilled = true;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(waitTime))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			conditionFulfilled = false;

		}
		return conditionFulfilled;
	}

	public static void waitForElementAndClickable(WebElement element) {
		int waitTime = 5;
		fluenWait(element, waitTime);
		element.click();
	}

	/* This method will click on the UI screen using given dimension value */
	public static void MoveByOffSet(int a, int b) {

		Actions act = new Actions(driver);
		act.moveByOffset(a, b).click().build().perform();
	}

	public static void findElementAndClick(String xpathValue) {
		driver.findElement(By.xpath(xpathValue)).click();
	}

	/* This method will give the random characters */
	public static String getRandomChars(int count) {
		return RandomStringUtils.randomAlphabetic(count).toLowerCase();
	}

	/* This method will give the random numbers */
	public static String getRandomNumbers(int count) {
		return RandomStringUtils.randomNumeric(count);
	}

	public static void setCurrentDate(WebElement element) throws InterruptedException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM uuuu");
		LocalDate today = LocalDate.now();
		String formattedDate = today.format(formatter);
		waitToBeClickableAndSendKeys(element, formattedDate);

	}

	public static void setFutureDate(WebElement element) throws InterruptedException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM uuuu");
		LocalDate today = LocalDate.now().plusDays(3);
		String formattedDate = today.format(formatter);
		UtilityFunctions.waitToBeClickableAndSendKeys(element, formattedDate);

	}

	public static void scrollDown() {

		Actions action = new Actions(driver);
		action.scrollByAmount(0, 500).build().perform();

	}

}
