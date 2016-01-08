# powermock_easymock_jacoco

Jacoco fails to perform coverage with PowerMock and EasyMock

## Launch test coverage

1. Go to root directory
2. Launch command : ./gradlew testDebugUnitTestCoverage
3. Open file : app/build/reports/jacoco/testDebugUnitTestCoverage/html/fr.lemfi.powermockeasymockjacoco/index.html

## Analysis

In order to perform PowerMock.expectNew(...) I have to add Class1.class in @PreparedForTest annotation.

This is the cause of Jacoco not working.

Cannot figure how to fix this issue
