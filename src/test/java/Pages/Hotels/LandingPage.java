package Pages.Hotels;

import Pages.Basepage;
import org.openqa.selenium.By;

public class LandingPage extends Basepage {

    By guests = By.xpath("//span[text()='Guests']");
    By childrenPlus = By.xpath("//label[text()='Children:']//following-sibling::*//button[@aria-label='plus']");
    By childrenDropdown = By.xpath("//select[@name='q-room-0-children']");
    By childrenAgesDropdowns = By.xpath("//label[starts-with(text(), 'Age of child') or starts-with(text(),'Child ')]");


    public void clickGuests() {
        clickThis(guests);
    }

    public void selectNumberOfChildren(String noOfChildren) {
        selectInDropdownUsingVisibleText(childrenDropdown, noOfChildren);
    }

    public int getNumberOfChildrenAges() {
        return findElementsUsingFluentWait(childrenAgesDropdowns).size();
    }





}
