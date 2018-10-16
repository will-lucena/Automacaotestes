package br.ufrn.test.pageobject;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultadoDocumentosPageObject extends AbstractPageObject {
	@FindBy(how = How.XPATH, using = "//*[@id=\"documentosForm\"]/table")
    private WebElement expectedForm;
	
	public boolean getForm() throws TimeoutException
	{
		waitFor(ExpectedConditions.visibilityOfAllElements(expectedForm));
		return true;
	}
}
