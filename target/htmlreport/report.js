$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactUs.feature");
formatter.feature({
  "line": 2,
  "name": "Complete QAworks Contact us page",
  "description": "As a end user I want to navigate to QAworks.com contacts us page.\r\nSo that I can enter my details, message and send QAworks message to find out more about QAworks services.",
  "id": "complete-qaworks-contact-us-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Contact QAworks for more information about their services",
  "description": "",
  "id": "complete-qaworks-contact-us-page;contact-qaworks-for-more-information-about-their-services",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am QAWorks Site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on Contact",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter name as \"j.Bloggs\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter email as \"j.Bloggs@qaworks.com \"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter my message as \"please contact me I want to find out more\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on \"Send\" button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should get confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "contactUs_StepDef.i_am_QAWorks_Site()"
});
formatter.result({
  "duration": 8556765856,
  "status": "passed"
});
formatter.match({
  "location": "contactUs_StepDef.i_click_on_Contact()"
});
formatter.result({
  "duration": 691691,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy13.click(Unknown Source)\r\n\tat Pages.ContactUsPage.clickOnContactUs(ContactUsPage.java:37)\r\n\tat qaWorks.contactUs_StepDef.i_click_on_Contact(contactUs_StepDef.java:21)\r\n\tat ✽.And I click on Contact(contactUs.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "j.Bloggs",
      "offset": 17
    }
  ],
  "location": "contactUs_StepDef.i_enter_name_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "j.Bloggs@qaworks.com ",
      "offset": 18
    }
  ],
  "location": "contactUs_StepDef.i_enter_email_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "please contact me I want to find out more",
      "offset": 23
    }
  ],
  "location": "contactUs_StepDef.i_enter_my_message_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Send",
      "offset": 12
    }
  ],
  "location": "contactUs_StepDef.i_click_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});