package com.empower;

import com.empower.pages.base.BasePage;
import com.empower.components.FooterComponent;
import com.empower.pages.IndividualsPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StageFooterTest extends BaseTest {

    @DataProvider(name = "legalMenuLinks")
    public Object[][] legalMenuLinks() {
        return new Object[][]{
                {"Security center", "/securityCenter", "Empower Security Center"},
                {"Accessibility", "/accessibility", "Empower Digital Accessibility Statement"},
                {"System requirements", "/system-requirements", "System requirements and security"},
                {"Privacy", "/privacy", "Empower Privacy Policy"},
                {"Terms and conditions", "/terms", "Information Regarding the Site"},
                {"Business continuity plan", "/business-continuity", "Business Continuity Plan Notice"},
                {"Market timing and excessive trading policies", "/market-timing-and-trading", "Procedures for complying with fund company market and excessive trading policies"},
                {"Investor education and protection", "/broker-check", "FINRA Investor Education and BrokerCheck® Notification"},
                {"Form CRS & Reg BI Disclosure", "/reg-bi-and-form-crs", "Regulation Best Interest Disclosure & Form CRS Customer Relationship Summary"},
                {"Empower representative compensation", "/rep-comp-disclosure", "Introduction"},
                {"SEC Rule 605-606", "/sec-rule-605-rule-606", "Pershing LLC"}
        };
    }

    @Test(dataProvider = "legalMenuLinks",
            groups = {"desktop", "mobile", "tablet"})
    public void testFooterLegalMenuLinksFunctionality(String linkText, String expectedUrl, String headingText) {
        FooterComponent footer = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getFooter()
                .clickFooterLink(linkText);

        Assert.assertTrue(footer.isNewUrl(expectedUrl),
                "Expected: " + expectedUrl + ", but actual is " + getDriver().getCurrentUrl());
    }

    @DataProvider(name = "navigationLinks")
    public Object[][] navigationLinks() {
        return new Object[][]{
                {"Cybersecurity", "/cybersecurity", "Cybersecurity you can count on"},
                {"Community impact", "/empower-community-impact", "Our volunteer impact"},
                {"Diversity, Equity, Inclusion & Belonging", "/diversity-equity-inclusion-belonging", "Empowered by difference"},
                {"The Currency™", "/the-currency", "Subscribe"},
                {"Press center", "/press-center", "Want to stay in the know?"},
                {"About us", "/about-us", "This is Empower"},
                {"Our history", "/our-history", "Since the beginning, Empower has been guided by a vision to revolutionize how people save, invest and plan for their future"},
                {"Contact us", "/contact", "We’re happy to help with whatever you need."},
                {"Financial professional", "/financial-professionals", "Solutions, support, success"},
                {"Plan sponsor", "/plan-sponsors", "Trusted leader. Proven innovator."}
        };
    }

    @Test(dataProvider = "navigationLinks",
            groups = {"desktop", "mobile", "tablet"})
    public void testFooterNavigationLinksFunctionality(String linkText, String expectedUrl, String headingText) {
        FooterComponent footer = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getFooter()
                .clickFooterLink(linkText);

        Assert.assertTrue(footer.isNewUrl(expectedUrl),
                "Expected: " + expectedUrl + ", but actual is " + getDriver().getCurrentUrl());
//        Assert.assertEquals(footer.getHeadingText(headingText), headingText);
    }


    @DataProvider(name = "navigationCareersPersonalInvestorLinks")
    public Object[][] navigationCareersPersonalInvestorLinks() {
        return new Object[][]{
                {"Careers", "/jobs.empower.com", "When we say you’re in charge, we mean it."},
                {"Personal investor", "https://www.empower.com/", "Invest well. Live a little.™"},
        };
    }

    @Test(dataProvider = "navigationCareersPersonalInvestorLinks",
            groups = {"desktop", "mobile", "tablet"})
    public void testFooterNavigationCareersPersonalInvestorLinksFunctionality(String linkText, String expectedUrl, String headingText) {
        FooterComponent footer = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getFooter()
                .clickFooterLink(linkText)
                .clickContinueButtonWithoutNewTab();

        Assert.assertTrue(footer.isNewUrl(expectedUrl),
                "Expected: " + expectedUrl + ", but actual is " + footer.getCurrentUrl());
    }

    @DataProvider(name = "disclaimer2Links")
    public Object[][] disclaimer2Links() {
        return new Object[][]{
                {"FINRA", "www.finra.org"},
                {"SIPC", "www.sipc.org"}
        };
    }

    @Test(dataProvider = "disclaimer2Links",
            groups = {"desktop", "mobile", "tablet"})
    public void testFINRASIPClink(String linkText, String expectedUrl) {
        FooterComponent footer = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getFooter()
                .clickDisclaimerLink(linkText)
                .clickContinueButtonWithoutNewTab();

        Assert.assertTrue(footer.isNewUrl(expectedUrl));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testFooterNavigationLinksDisplayed() {
        List<String> expectedNavigationLinks = Arrays.asList(
                "Cybersecurity",
                "Community impact",
                "Diversity, Equity, Inclusion & Belonging",
                "The Currency™",
                "Press center",
                "About us",
                "Our history",
                "Careers",
                "Contact us",
                "Personal investor",
                "Financial professional",
                "Plan sponsor"
        );
        List<String> actualLinks = new IndividualsPage(getDriver())
                .getFooter()
                .getNavigationLinks();

        Assert.assertEquals(actualLinks, expectedNavigationLinks);
    }


    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testLegalMenuLinksDisplayed() {
        List<String> expectedLegalMenuLinks = Arrays.asList(
                "Security center",
                "Accessibility",
                "System requirements",
                "Privacy",
                "Terms and conditions",
                "Business continuity plan",
                "Market timing and excessive trading policies",
                "Investor education and protection",
                "Form CRS & Reg BI Disclosure",
                "Empower representative compensation",
                "Do not sell or share my personal information",
                "SEC Rule 605-606"
        );
        List<String> actualLinks = new IndividualsPage(getDriver())
                .getFooter()
                .getLegalMenuLinks();

        Assert.assertEquals(actualLinks, expectedLegalMenuLinks);
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testSocialMedeaIconsDisplayed() {
        List<String> expectedSocialMedeaIcons = Arrays.asList(
                "Facebook",
                "X (fka Twitter)",
                "Snapchat",
                "LinkedIn",
                "Instagram",
                "YouTube",
                "TikTok"
        );
        List<String> actualSocialIcons = new IndividualsPage(getDriver())
                .getFooter()
                .getSocialMediaIcons();

        Assert.assertEquals(actualSocialIcons, expectedSocialMedeaIcons);
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testGlobalDisclaimerDisplayed() {
        String globalDisclaimerText = new IndividualsPage(getDriver())
                .getFooter()
                .getGlobalDisclaimerText();

        Assert.assertTrue(globalDisclaimerText.contains("“EMPOWER” and all associated logos"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testFooterEmpowerLogo() {
        String actualHeading = new IndividualsPage(getDriver())
                .clickLoginButton()
                .closeCookieBanner()
                .getFooter()
                .clickFooterEmpowerLogo()
                .getHeadingText();

        Assert.assertEquals(actualHeading, "Invest well. Live a little.™");
        Assert.assertTrue(new BasePage(getDriver()).isNewUrl("empwrretiremtstg.prod.acquia-sites.com/"),
                "Expected: empwrretiremtstg.prod.acquia-sites.com/" + ", but actual is " + getDriver().getCurrentUrl());
    }

    @Test(groups = {"desktop"})
    public void testDisclaimerBrokerCheckLink() {
        FooterComponent footer = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getFooter()
                .clickBrokerCheckLink()
                .clickContinueButtonWithNewTab();

        Assert.assertTrue(footer.isNewUrl("brokercheck.finra.org"),
                "Expected: brokercheck.finra.org" + ", but actual is " + getDriver().getCurrentUrl());
    }

    @DataProvider(name = "socialMedeaIcons")
    public Object[][] socialMedeaIcons() {
        return new Object[][]{
                {"Facebook", "facebook.com"},
                {"X (fka Twitter)", "x.com/empowertoday"},
                {"Snapchat", "snapchat.com/@empowertoday"},
                {"LinkedIn", "linkedin.com/company/empowertoday"},
                {"Instagram", "instagram.com"},
                {"YouTube", "youtube.com"},
                {"TikTok", "tiktok.com/@empowertoday"},
        };
    }

    @Test(dataProvider = "socialMedeaIcons", groups = {"desktop"})
    public void testFooterSocialMediaIconsFunctionality(String linkText, String expectedUrl) {
        FooterComponent footer = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getFooter()
                .clickFooterSocialMediaIcon(linkText)
                .clickContinueButtonWithNewTab();

        Assert.assertTrue(footer.isNewUrl(expectedUrl),
                "Expected: " + expectedUrl + ", but actual is " + getDriver().getCurrentUrl());
    }
}