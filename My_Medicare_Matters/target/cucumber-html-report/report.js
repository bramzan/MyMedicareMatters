$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage/Homepage_footer_Connect_With_Us.feature");
formatter.feature({
  "line": 2,
  "name": "My Medicare Matters Validate Homepage footer Connect With Us",
  "description": "",
  "id": "my-medicare-matters-validate-homepage-footer-connect-with-us",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Homepage_Footer_Connect_With_Us"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User Login with valid username and password",
  "description": "",
  "id": "my-medicare-matters-validate-homepage-footer-connect-with-us;user-login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is already on Ncoa Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User validate Facebook Link in the Footer",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User validate Twitter Link in the Footer",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User validate youtube Link in the Footer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User validate Mail Link in the Footer",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateHomePage.User_is_already_on_Ncoa_Home_page()"
});
formatter.result({
  "duration": 8707293200,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 85\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCAWKLT231768\u0027, ip: \u0027192.168.50.159\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.8\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x0117D383+3134339]\n\tOrdinal0 [0x0106A171+2007409]\n\tOrdinal0 [0x00F0AEE8+569064]\n\tOrdinal0 [0x00E9139F+70559]\n\tOrdinal0 [0x00E8CC63+52323]\n\tOrdinal0 [0x00EB0DFC+200188]\n\tOrdinal0 [0x00EB0C1D+199709]\n\tOrdinal0 [0x00EAEB0B+191243]\n\tOrdinal0 [0x00E92E77+77431]\n\tOrdinal0 [0x00E93E3E+81470]\n\tOrdinal0 [0x00E93DC9+81353]\n\tOrdinal0 [0x01080CD9+2100441]\n\tGetHandleVerifier [0x012EB75A+1396954]\n\tGetHandleVerifier [0x012EB3D9+1396057]\n\tGetHandleVerifier [0x012F7126+1444518]\n\tGetHandleVerifier [0x012EBCE8+1398376]\n\tOrdinal0 [0x01077F51+2064209]\n\tOrdinal0 [0x010822EB+2106091]\n\tOrdinal0 [0x01082411+2106385]\n\tOrdinal0 [0x010949C4+2181572]\n\tBaseThreadInitThunk [0x75CD6359+25]\n\tRtlGetAppContainerNamedObjectPath [0x77948944+228]\n\tRtlGetAppContainerNamedObjectPath [0x77948914+180]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.ncoa.mymedicarematters.stepdefinition.ValidateHomePage.User_is_already_on_Ncoa_Home_page(ValidateHomePage.java:25)\r\n\tat ✽.Given User is already on Ncoa Home page(HomePage/Homepage_footer_Connect_With_Us.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ValidateHomePage.user_validate_Facebook_Link_in_the_Footer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateHomePage.user_validate_Twitter_Link_in_the_Footer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateHomePage.user_validate_youtube_Link_in_the_Footer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateHomePage.user_validate_Mail_Link_in_the_Footer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateHomePage.Teardown()"
});
formatter.result({
  "status": "skipped"
});
});