Feature: Indiabonds Website

@VerifyISIN
Scenario Outline: Verify the Bond Directory ISIN Search
Given User lands to indiabonds website
When he close the popups
Then open explore link on other tab
And verify the title of Explore page
And user search for isin <ISIN> in bond search

Examples:
| ISIN                  |
| INE128S07333  	    |
| INE121A08ON5          |
| INE123456789          |