def TestCase = context.testCase
PropertiesTestStep = TestCase.getTestStepByName("Properties")
Stop = PropertiesTestStep.getPropertyValue("End").toString()
if (Stop=="True")
    log.info("Exit DataLoop")
else
    testRunner.gotoStepByName("DataTestExcel")