package com.cog.automatedExercises.AutomatedChallenge2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(id = "search_query_top")
	private WebElement searchbox;

	public void search(String searchText) {
		searchbox.sendKeys(searchText);
		searchbox.submit();
	}
}
