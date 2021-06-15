$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Registry.feature");
formatter.feature({
  "name": "Registry",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Verify user can edit and search criteria after user find and edit the criteria in registry page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    },
    {
      "name": "@registry"
    }
  ]
});
formatter.step({
  "name": "Users access to the amazon web",
  "keyword": "Given "
});
formatter.match({
  "location": "core.OnBoardingStepDef.usersAccessToTheAmazonWeb()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat core.pages.OnBoardPage.accessingPage(OnBoardPage.java:13)\n\tat core.OnBoardingStepDef.usersAccessToTheAmazonWeb(OnBoardingStepDef.java:12)\n\tat ✽.Users access to the amazon web(file:///Users/moka/works/android/advotics-test-automation/src/test/resources/features/Registry.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "Users goes to the registry page",
  "keyword": "And "
});
formatter.match({
  "location": "core.OnBoardingStepDef.usersGoesToTheRegistryPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User search registrant name \"John\"",
  "keyword": "When "
});
formatter.match({
  "location": "core.RegistryStepDefs.userSearchRegistrantName(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select type is \"Birthday Gift List\"",
  "keyword": "And "
});
formatter.match({
  "location": "core.RegistryStepDefs.userSelectTypeIs(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User edit criteria with date range \"January\" 2021 to \"April\" 2021",
  "keyword": "And "
});
formatter.match({
  "location": "core.RegistryStepDefs.userEditCriteriaWithDateRangeTo(java.lang.String,int,java.lang.String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify date time accordance to that times",
  "keyword": "Then "
});
formatter.match({
  "location": "core.RegistryStepDefs.userVerifyDateTimeAccordanceToThatTimes()"
});
formatter.result({
  "status": "skipped"
});
});