Feature: Indiabonds Website

@VerifyTitle
Scenario: Verify the title of Explore link
Given User lands to indiabonds website
When he close the popups
Then open explore link on other tab
And verify the title of Explore page

@VerifyIssuer
Scenario Outline: Verify the Bond Directory Search
Given User lands to indiabonds website
When he close the popups
Then open explore link on other tab
And verify the title of Explore page
And user search for issuer <Issuer> in bond search

Examples:
| Issuer                |
| STATE BANK OF INDIA   |
| STATE BANK OF PATIALA |
| STATE BNK OF RAJAS    |