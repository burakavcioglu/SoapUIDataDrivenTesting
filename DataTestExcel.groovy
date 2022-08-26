import jxl.*
def TestCase = context.testCase
def FilePath = "C:\\TestCenter\\Data.xls"
def count
Workbook WorkBook1 = Workbook.getWorkbook(new File(FilePath))
Sheet Sheet1 = WorkBook1.getSheet(0)
PropertiesTestStep = TestCase.getTestStepByName("Properties")
count = PropertiesTestStep.getPropertyValue("Counter").toInteger()

//If Total records is unknown (at start), get the rowcount from Excel
if (PropertiesTestStep.getPropertyValue("Total").toString() == "")
    PropertiesTestStep.setPropertyValue("Total", Sheet1.getRows().toString())
count++

//Read the Excel test data
Cell Field1 = Sheet1.getCell(0, count)
Cell Field2 = Sheet1.getCell(1, count)
log.info ("Count is " + count.toString() + " Number : " + Field1.getContents() + " Word : " + Field2.getContents())
WorkBook1.close()

//Copy the Excel test data to properties in Properties test step
PropertiesTestStep.setPropertyValue("Number", Field1.getContents())
PropertiesTestStep.setPropertyValue("Word", Field2.getContents())
PropertiesTestStep.setPropertyValue("Counter", count.toString())
if (count == PropertiesTestStep.getPropertyValue("Total").toInteger() - 1)
    PropertiesTestStep.setPropertyValue("End", "True")
