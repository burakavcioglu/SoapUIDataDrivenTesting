def TestCase = context.testCase
PropertiesTestStep = TestCase.getTestStepByName("Properties")
PropertiesTestStep.setPropertyValue("Number","")
PropertiesTestStep.setPropertyValue("Word", "")
PropertiesTestStep.setPropertyValue("Counter", "0")
PropertiesTestStep.setPropertyValue("Total", "")
PropertiesTestStep.setPropertyValue("End", "False")