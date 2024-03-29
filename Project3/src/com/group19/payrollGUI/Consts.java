package com.group19.payrollGUI;

import java.text.DecimalFormat;

/**
 * The Consts class houses all immutable constant values.
 @author Michael Choe, Sagnik Mukherjee
 */
@SuppressWarnings({"WeakerAccess", "SpellCheckingInspection"})
public class Consts
{
    /* Constants which appear in multiple classes */
    public static final String FULLTIME = "FULL TIME";
    public static final String PARTTIME = "PART TIME";
    public static final int DEFAULTHOURS = 0;
    public static final int NAMES = 2;
    public static final double ZERO = 0.0;
    public static final int NOTFOUND = -1;
    public static final String BLANK = "";


    /* Company() class constants */
    public static final int DEFAULT = 1;
    public static final int GROW = 4;


    /* Date() class constants - reused from Project1 */
    public static final int INVALID = -1;
    //Used to determine if given date is leap year.
    public static final int QUADRENNIAL = 4;
    public static final int CENTURY = 100;
    public static final int QUARTERCENTENNIAL = 400;
    //Used to determine max amount of days given month should have.
    public static final int ALTMAXDAYS = 30;
    public static final int FEBDAYSLEAP = 29;
    public static final int FEBDAYS = 28;
    public static final int DEFAULTMAXDAYS = 31;
    //Used to represent earliest year possible for a given Date object.
    public static final int YEARMIN = 1900;


    /* Employee() class constants */
    public static final int PAYPERIODS = 26;
    public static final String PAYCHECK_MSG = "::Payment ";
    public static final String SEPARATOR = "::";
    public static final DecimalFormat df
            = new DecimalFormat("$#,##0.00");


    /* Fulltime() class constants */
    public static final String SALARY_MSG = "::Annual Salary ";


    /* Management() class constants */
    //Fixed bonus compensation amounts.
    public static final double MANAGER_BONUS = 192.31,
            DEPHEAD_BONUS = 365.38, DIRECTOR_BONUS = 461.54;

    //Management type codes, also used in PayrollProcessing.
    public static final int MA_CODE = 1, DH_CODE = 2, DI_CODE = 3;

    //toString components, according to Management type.
    public static final String MANAGER_MSG = "::Manager Compensation ",
            DH_MSG = "::DepartmentHead Compensation ",
            DIRECTOR_MSG = "::Director Compensation ";


    /* Parttime() class constants */
    public static final int FULLHOURS = 80;
    public static final double OVERTIME_RATE = 1.50;
    public static final String HOURLYPAY_MSG = "::Hourly Rate ";
    public static final String HOURS_MSG = "::Hours worked this period: ";
    public static final int PARTTIME_MAX = 100;


    /* Controller() class constants - Client */
    //Constants used to restrict and validate input, and select a substring
    //created by splitting the input line on whitespace.
    public static final int SPLITONE = 0, SPLITTWO = 1, SPLITTHREE = 2,
            SPLITFOUR = 3, SPLITFIVE = 4, SPLITSIX = 5;
    public static final int DATE_PARTS = 3;

    //Constants that represent status messages.
    public static final String DELIMITER = ",";
    public static final String INVALID_DATE = " is not a valid date.",
            INVALID_NAME = " is not a valid name (first last).",
            INVALID_DEP = " is not a valid department code.",
            INVALID_SALARY = "Salary cannot be negative.",
            INVALID_PAYRATE = "Pay rate cannot be negative.",
            INVALID_MGMT = "Invalid management code.",
            INVALID_HOURS_A = "Working hours cannot be negative.",
            INVALID_HOURS_B = "Invalid Hours: over 100.",
            CALCULATED = "Calculation of employee payments is done.",
            ADDEDPT = "Added part-time employee.",
            ADDEDFT = "Added full-time employee.",
            ADDEDMA = "Added management position.",
            DUPLICATE = "Employee is already in the list " +
                    "(or input was invalid).",
            SETHOURS = "Working hours set.",
            REMOVED = "Employee removed.",
            NONEXISTENT = "Employee doesn't exist.",
            ISEMPTY = "Employee database is empty.";

    //Constants that indicate which client command to execute.
    public static final String ADDPARTTIME = "P",
            ADDFULLTIME = "F", ADDFULLROLE = "M";

    //Constants that indicate which list header to print.
    public static final String
        PRINT_HEADER = "--Printing earning statements for all employees--",
        PRINTDEP_HEADER = "--Printing earning statements by department--",
        PRINTDATE_HEADER = "--Printing earning statements by date hired--";

    //Possibilities for Employee department.
    public static final String CS = "CS", ECE = "ECE", IT = "IT";

    /* Main() constants */
    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 800;


    /* Controller() constants */
    public static final String SELECTED = "File selected: ";


    /**
     * Constructor prevents other classes from instantiating objects of
     * type Consts when calling this class.
     */
    private Consts() {
        throw new AssertionError();
    }
}
