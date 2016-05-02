package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.*;

public class Controller {


//Variable Declarations

    @FXML
    TextField l4Mod1Mark1, l4Mod1Mark2, l4Mod1Mark3, l4Mod1Mark4, l4Mod5Mark1, l4Mod5Mark2, l4Mod5Mark3, l4Mod5Mark4, l4Mod6Mark1, l4Mod6Mark2, l4Mod6Mark3, l4Mod6Mark4;
    @FXML
    TextField l4Mod2Mark1, l4Mod2Mark2, l4Mod2Mark3, l4Mod2Mark4, l4Mod3Mark1, l4Mod3Mark2, l4Mod3Mark3, l4Mod3Mark4, l4Mod4Mark1, l4Mod4Mark2, l4Mod4Mark3, l4Mod4Mark4;
    @FXML
    TextField l5Mod1Mark1, l5Mod1Mark2, l5Mod1Mark3, l5Mod1Mark4, l5Mod2Mark1, l5Mod2Mark2, l5Mod2Mark3, l5Mod2Mark4, l5Mod3Mark1, l5Mod3Mark2, l5Mod3Mark3, l5Mod3Mark4;
    @FXML
    TextField l5Mod4Mark1, l5Mod4Mark2, l5Mod4Mark3, l5Mod4Mark4, l5Mod5Mark1, l5Mod5Mark2, l5Mod5Mark3, l5Mod5Mark4, l5Mod6Mark1, l5Mod6Mark2, l5Mod6Mark3, l5Mod6Mark4;
    @FXML
    TextField l6Mod1Mark1, l6Mod1Mark2, l6Mod1Mark3, l6Mod1Mark4, l6Mod5Mark1, l6Mod5Mark2, l6Mod5Mark3, l6Mod5Mark4, l6Mod2Mark1, l6Mod2Mark2, l6Mod2Mark3, l6Mod2Mark4;
    @FXML
    TextField l6Mod3Mark1, l6Mod3Mark2, l6Mod3Mark3, l6Mod3Mark4, l6Mod4Mark1, l6Mod4Mark2, l6Mod4Mark3, l6Mod4Mark4;
    @FXML
    TextField L4M1Resit1, L4M1Resit2, L4M1Resit3, L4M1Resit4, L4M2Resit1, L4M2Resit2, L4M2Resit3, L4M2Resit4, L4M3Resit1, L4M3Resit2, L4M3Resit3, L4M3Resit4, L4M4Resit1, L4M4Resit2, L4M4Resit3, L4M4Resit4, L4M5Resit1, L4M5Resit2, L4M5Resit3, L4M5Resit4, L4M6Resit1, L4M6Resit2, L4M6Resit3, L4M6Resit4;
    @FXML
    TextField L5M1Resit1, L5M1Resit2, L5M1Resit3, L5M1Resit4, L5M2Resit1, L5M2Resit2, L5M2Resit3, L5M2Resit4, L5M3Resit1, L5M3Resit2, L5M3Resit3, L5M3Resit4, L5M4Resit1, L5M4Resit2, L5M4Resit3, L5M4Resit4, L5M5Resit1, L5M5Resit2, L5M5Resit3, L5M5Resit4, L5M6Resit1, L5M6Resit2, L5M6Resit3, L5M6Resit4;
    @FXML
    TextField L6M1Resit1, L6M1Resit2, L6M1Resit3, L6M1Resit4, L6M2Resit1, L6M2Resit2, L6M2Resit3, L6M2Resit4, L6M3Resit1, L6M3Resit2, L6M3Resit3, L6M3Resit4, L6M4Resit1, L6M4Resit2, L6M4Resit3, L6M4Resit4, L6M5Resit1, L6M5Resit2, L6M5Resit3, L6M5Resit4;

    @FXML
    Button condone = new Button();


    ArrayList<Integer> L4Mod1 = new ArrayList<Integer>();
    ArrayList<Integer> L4Mod2 = new ArrayList<Integer>();
    ArrayList<Integer> L4Mod3 = new ArrayList<Integer>();
    ArrayList<Integer> L4Mod4 = new ArrayList<Integer>();
    ArrayList<Integer> L4Mod5 = new ArrayList<Integer>();
    ArrayList<Integer> L4Mod6 = new ArrayList<Integer>();
    ArrayList<Integer> L5Mod1 = new ArrayList<>();
    ArrayList<Integer> L5Mod2 = new ArrayList<>();
    ArrayList<Integer> L5Mod3 = new ArrayList<Integer>();
    ArrayList<Integer> L5Mod4 = new ArrayList<Integer>();
    ArrayList<Integer> L5Mod5 = new ArrayList<Integer>();
    ArrayList<Integer> L5Mod6 = new ArrayList<Integer>();
    ArrayList<Integer> L6Mod1 = new ArrayList<Integer>();
    ArrayList<Integer> L6Mod2 = new ArrayList<Integer>();
    ArrayList<Integer> L6Mod3 = new ArrayList<Integer>();
    ArrayList<Integer> L6Mod4 = new ArrayList<Integer>();
    ArrayList<Integer> L6Mod5 = new ArrayList<Integer>();
    ArrayList<Integer> doubleCredit = new ArrayList<Integer>();

    @FXML
    CheckBox doubleCredit1 = new CheckBox();
    @FXML
    CheckBox doubleCredit2 = new CheckBox();
    @FXML
    CheckBox doubleCredit3 = new CheckBox();
    @FXML
    CheckBox doubleCredit4 = new CheckBox();
    @FXML
    CheckBox doubleCredit5 = new CheckBox();

    @FXML
    Label ResitL4M1 = new Label();
    @FXML
    Label ResitL4M2 = new Label();
    @FXML
    Label ResitL4M3 = new Label();
    @FXML
    Label ResitL4M4 = new Label();
    @FXML
    Label ResitL4M5 = new Label();
    @FXML
    Label ResitL4M6 = new Label();
    @FXML
    Label ResitL5M1 = new Label();
    @FXML
    Label ResitL5M2 = new Label();
    @FXML
    Label ResitL5M3 = new Label();
    @FXML
    Label ResitL5M4 = new Label();
    @FXML
    Label ResitL5M5 = new Label();
    @FXML
    Label ResitL5M6 = new Label();
    @FXML
    Label ResitL6M1 = new Label();
    @FXML
    Label ResitL6M2 = new Label();
    @FXML
    Label ResitL6M3 = new Label();
    @FXML
    Label ResitL6M4 = new Label();
    @FXML
    Label ResitL6M5 = new Label();
    @FXML
    Label notification = new Label();



    @FXML
    TabPane Level4, TopPane, Level6, Level5, condoneTabPane;
    @FXML
    Tab tab42, tab43, tab44, tab45, tab46, tab51, tab52, tab53, tab54, tab55, tab56, tab61, tab62, tab64, tab63, tab65, level5, level6, condoneTab;




    //public boolean bol1, bol2, bol3, bol4;
    public int bool1, bool2, bool3, bool4;
    public int retakeCount = 0, condoneTotal = 0, assessmentCount = 0, condoneCheck = 0, condoneTimes = 0, condoneArrayNo = 0;
    public int creditL4 = 0, creditL5 = 0, creditL6 = 0, doubleCreditCheck = 0;
    public String temp, M;
    int Average = 0, resitTimes=0;

    public List<Integer> condoneArray = new ArrayList<>();
    public TextField condoneTextField = new TextField();

    public double moduleAverage = 0;

    // Continue Button Action Handling in all tabs
    //L4
    @FXML
    void continueL4M1() {

        InputToArray(L4Mod1, l4Mod1Mark1, l4Mod1Mark2, l4Mod1Mark3, l4Mod1Mark4, L4M1Resit1, L4M1Resit2, L4M1Resit3, L4M1Resit4, ResitL4M1, Level4, tab42);

    }

    @FXML
    void continueL4M2() {

        InputToArray(L4Mod2, l4Mod2Mark1, l4Mod2Mark2, l4Mod2Mark3, l4Mod2Mark4, L4M2Resit1, L4M2Resit2, L4M2Resit3, L4M2Resit4, ResitL4M2, Level4, tab43);

    }

    @FXML
    void continueL4M3() {

        InputToArray(L4Mod3, l4Mod3Mark1, l4Mod3Mark2, l4Mod3Mark3, l4Mod3Mark4, L4M3Resit1, L4M3Resit2, L4M3Resit3, L4M3Resit4, ResitL4M3, Level4, tab44);
        //Level4.getSelectionModel().select(tab44);
    }

    @FXML
    void continueL4M4() {

        InputToArray(L4Mod4, l4Mod4Mark1, l4Mod4Mark2, l4Mod4Mark3, l4Mod4Mark4, L4M4Resit1, L4M4Resit2, L4M4Resit3, L4M4Resit4, ResitL4M4, Level4, tab45);
        //Level4.getSelectionModel().select(tab45);
    }

    @FXML
    void continueL4M5() {

        InputToArray(L4Mod5, l4Mod5Mark1, l4Mod5Mark2, l4Mod5Mark3, l4Mod5Mark4, L4M5Resit1, L4M5Resit2, L4M5Resit3, L4M5Resit4, ResitL4M5, Level4, tab46);
        //Level4.getSelectionModel().select(tab46);

    }

    @FXML
    void continueL4M6() {
        condoneCheck++;
        InputToArray(L4Mod6, l4Mod6Mark1, l4Mod6Mark2, l4Mod6Mark3, l4Mod6Mark4, L4M6Resit1, L4M6Resit2, L4M6Resit3, L4M6Resit4, ResitL4M6, TopPane, level5);

    }

    //L5
    @FXML
    void continueL5M1() {
        retakeCount = 0;
        creditL5 = 0;


        InputToArray(L5Mod1, l5Mod1Mark1, l5Mod1Mark2, l5Mod1Mark3, l5Mod1Mark4, L5M1Resit1, L5M1Resit2, L5M1Resit3, L5M1Resit4, ResitL5M1, Level5, tab52);
        //Level5.getSelectionModel().select(tab52);
        //Level5.setTabClosingPolicy(TabPane.TabClosingPolicy.ALL_TABS);

    }

    @FXML
    void continueL5M2() {

        InputToArray(L5Mod2, l5Mod2Mark1, l5Mod2Mark2, l5Mod2Mark3, l5Mod2Mark4, L5M2Resit1, L5M2Resit2, L5M2Resit3, L5M2Resit4, ResitL5M2, Level5, tab53);
        //  Level5.getSelectionModel().select(tab53);

    }

    @FXML
    void continueL5M3() {

        InputToArray(L5Mod3, l5Mod3Mark1, l5Mod3Mark2, l5Mod3Mark3, l5Mod3Mark4, L5M3Resit1, L5M3Resit2, L5M3Resit3, L5M3Resit4, ResitL5M3, Level5, tab54);
        // Level5.getSelectionModel().select(tab54);

    }

    @FXML
    void continueL5M4() {

        InputToArray(L5Mod4, l5Mod4Mark1, l5Mod4Mark2, l5Mod4Mark3, l5Mod4Mark4, L5M4Resit1, L5M4Resit2, L5M4Resit3, L5M4Resit4, ResitL5M4, Level5, tab55);
        // Level5.getSelectionModel().select(tab55);

    }

    @FXML
    void continueL5M5() {

        InputToArray(L5Mod5, l5Mod5Mark1, l5Mod5Mark2, l5Mod5Mark3, l5Mod5Mark4, L5M5Resit1, L5M5Resit2, L5M5Resit3, L5M5Resit4, ResitL5M5, Level5, tab56);
        // Level5.getSelectionModel().select(tab56);

    }

    @FXML
    void continueL5M6() {

        InputToArray(L5Mod6, l5Mod6Mark1, l5Mod6Mark2, l5Mod6Mark3, l5Mod6Mark4, L5M6Resit1, L5M6Resit2, L5M6Resit3, L5M6Resit4, ResitL5M6, TopPane, level6);
        //TopPane.getSelectionModel().select(level6);

    }

    //L5
    @FXML
    void continueL6M1() {
        retakeCount = 0;
        creditL6 = 0;


        InputToArray(L6Mod1, l6Mod1Mark1, l6Mod1Mark2, l6Mod1Mark3, l6Mod1Mark4, L6M1Resit1, L6M1Resit2, L6M1Resit3, L6M1Resit4, ResitL6M1, Level6, tab62);
        //Level6.getSelectionModel().select(tab62);
        if (doubleCredit1.isSelected()) {
            doubleCreditCheck++;
            InputToArray(doubleCredit, l6Mod1Mark1, l6Mod1Mark2, l6Mod1Mark3, l6Mod1Mark4, L6M1Resit1, L6M1Resit2, L6M1Resit3, L6M1Resit4, ResitL6M1, Level6, tab62);
            doubleCredit2.setDisable(true);
            doubleCredit3.setDisable(true);
            doubleCredit4.setDisable(true);
            doubleCredit5.setDisable(true);

        }


    }

    @FXML
    void continueL6M2() {

        InputToArray(L6Mod2, l6Mod2Mark1, l6Mod2Mark2, l6Mod2Mark3, l6Mod2Mark4, L6M2Resit1, L6M2Resit2, L6M2Resit3, L6M2Resit4, ResitL6M2, Level6, tab63);
        //Level6.getSelectionModel().select(tab63);
        if (doubleCredit2.isSelected()) {
            doubleCreditCheck++;
            InputToArray(doubleCredit, l6Mod2Mark1, l6Mod2Mark2, l6Mod2Mark3, l6Mod2Mark4, L6M2Resit1, L6M2Resit2, L6M2Resit3, L6M2Resit4, ResitL6M2, Level6, tab63);
            doubleCredit1.setDisable(true);
            doubleCredit3.setDisable(true);
            doubleCredit4.setDisable(true);
            doubleCredit5.setDisable(true);

        }
    }

    @FXML
    void continueL6M3() {

        InputToArray(L6Mod3, l6Mod3Mark1, l6Mod3Mark2, l6Mod3Mark3, l6Mod3Mark4, L6M3Resit1, L6M3Resit2, L6M3Resit3, L6M3Resit4, ResitL6M3, Level6, tab64);
        //Level6.getSelectionModel().select(tab64);
        if (doubleCredit3.isSelected()) {
            doubleCreditCheck++;
            InputToArray(doubleCredit, l6Mod3Mark1, l6Mod3Mark2, l6Mod3Mark3, l6Mod3Mark4, L6M3Resit1, L6M3Resit2, L6M3Resit3, L6M3Resit4, ResitL6M3, Level6, tab64);
            doubleCredit2.setDisable(true);
            doubleCredit1.setDisable(true);
            doubleCredit4.setDisable(true);
            doubleCredit5.setDisable(true);

        }
    }

    @FXML
    void continueL6M4() {

        InputToArray(L6Mod4, l6Mod4Mark1, l6Mod4Mark2, l6Mod4Mark3, l6Mod4Mark4, L6M4Resit1, L6M4Resit2, L6M4Resit3, L6M4Resit4, ResitL6M4, Level6, tab65);
        //Level6.getSelectionModel().select(tab65);
        if (doubleCredit4.isSelected()) {
            doubleCreditCheck++;
            InputToArray(doubleCredit, l6Mod4Mark1, l6Mod4Mark2, l6Mod4Mark3, l6Mod4Mark4, L6M4Resit1, L6M4Resit2, L6M4Resit3, L6M4Resit4, ResitL6M4, Level6, tab65);
            doubleCredit2.setDisable(true);
            doubleCredit3.setDisable(true);
            doubleCredit1.setDisable(true);
            doubleCredit5.setDisable(true);

        }
    }

    @FXML
    void calculate() {

        InputToArray(L6Mod5, l6Mod5Mark1, l6Mod5Mark2, l6Mod5Mark3, l6Mod5Mark4, L6M5Resit1, L6M5Resit2, L6M5Resit3, L6M5Resit4, ResitL6M5, Level6, tab65);

        if (doubleCredit5.isSelected()) {
            doubleCreditCheck++;
            InputToArray(doubleCredit, l6Mod5Mark1, l6Mod5Mark2, l6Mod5Mark3, l6Mod5Mark4, L6M5Resit1, L6M5Resit2, L6M5Resit3, L6M5Resit4, ResitL6M5, Level6, tab65);
            doubleCredit2.setDisable(true);
            doubleCredit3.setDisable(true);
            doubleCredit4.setDisable(true);
            doubleCredit1.setDisable(true);

        }


        double T1, T2, T3, T4, T5, T6, S1, S2, S3, S4, S5, S6;

        double[] ArrMarks1 = new double[6];
        double[] ArrMarks2 = new double[6];


        if (L5Mod1.size() > 0) {
            T1 = CalculationL5(L5Mod1);
            ArrMarks1[0] = T1;
            //ArrMarks.add(T1);

        }
        if (L5Mod2.size() > 0) {
            T2 = CalculationL5(L5Mod2);
            ArrMarks1[1] = T2;
            //ArrMarks.add(T2);

        }
        if (L5Mod3.size() > 0) {
            T3 = CalculationL5(L5Mod3);
            ArrMarks1[2] = T3;
            //ArrMarks.add(T3);

        }
        if (L5Mod4.size() > 0) {
            T4 = CalculationL5(L5Mod4);
            ArrMarks1[3] = T4;
            //ArrMarks.add(T4);

        }
        if (L5Mod5.size() > 0) {
            T5 = CalculationL5(L5Mod5);
            ArrMarks1[4] = T5;
            //ArrMarks.add(T5);

        }
        if (L5Mod6.size() > 0) {
            T6 = CalculationL5(L5Mod6);
            ArrMarks1[5] = T6;
            //ArrMarks.add(T6);


        }
        if (L6Mod1.size() > 0) {
            S1 = CalculationL6(L6Mod1);
            ArrMarks2[0] = S1;
            System.out.println("S1 = " + S1);
            //ArrMarks.add(S1);


        }
        if (L6Mod2.size() > 0) {
            S2 = CalculationL6(L6Mod2);
            ArrMarks2[1] = S2;
            System.out.println("S2 = " + S2);
            //ArrMarks.add(S2);


        }
        if (L6Mod3.size() > 0) {
            S3 = CalculationL6(L6Mod3);
            ArrMarks2[2] = S3;
            System.out.println("S3 = " + S3);
            //ArrMarks.add(S3);


        }
        if (L6Mod4.size() > 0) {
            S4 = CalculationL6(L6Mod4);
            ArrMarks2[3] = S4;
            //ArrMarks.add(S4);
            System.out.println("S4 = " + S4);


        }
        if (L6Mod5.size() > 0) {
            S5 = CalculationL6(L6Mod5);
            ArrMarks2[4] = S5;
            //ArrMarks.add(S5);


        }
        //System.out.println("length is" + doubleCredit.size());
        S6 = CalculationL6(doubleCredit);
        //ArrMarks.add(S6);
        ArrMarks2[5] = S6;
        double total1 = 0, total2 = 0, avg1 = 0, avg2 = 0;

        Arrays.sort(ArrMarks1);
        Arrays.sort(ArrMarks2);
        if (ArrMarks1[0] >= ArrMarks2[0]) {
            for (int i = 0; i < (ArrMarks1.length); i++) {
                total1 = total1 + ArrMarks1[i];
                avg1 = total1 / 6;

            }
            for (int i = 1; i < (ArrMarks2.length); i++) {
                total2 = total2 + ArrMarks2[i];
                avg2 = total2 / 5;

            }
        } else {
            for (int i = 1; i < (ArrMarks1.length); i++) {
                total1 = total1 + ArrMarks1[i];
                avg1 = total1 / 5;

            }
            for (int i = 0; i < (ArrMarks2.length); i++) {
                total2 = total2 + ArrMarks2[i];
                avg2 = total2 / 6;

            }

        }

        if (creditL4>=360){
            if ((avg1+avg2)>=70){
                notification.setText("1st Class Hons");
            }
            else if ((avg1+avg2)>=60){
                notification.setText("2nd Class upper Hons");
            }
            else if ((avg1+avg2)>=50){
                notification.setText("2nd Class lower Hons");
            }
            else if ((avg1+avg2)>=40){
                notification.setText("2rd class Hons");
            }
        }
        else if (creditL6>=60&&creditL5>=240){
            if (resitTimes==0)notification.setText("Non Hons Distinction / Merit Degree");
            else notification.setText("Non Hons Degree");
        }

        //System.out.println(avg1 + avg2);




    }


    //Condone Button setOnAction
    @FXML
    void condoneButton() {
        condoneArray.add(Integer.parseInt(condoneTextField.getText()));
        System.out.println(condoneArray);
        condoneTabPane.getSelectionModel().select(condoneTab);

        creditL4 += 20;
        creditL5 += 20;
        creditL6 += 20;

        notification.setText("Switched to the " + condoneTab.getText());
        condone.setVisible(false);
        condoneTimes++;
        //System.out.println("Credit 1 " + creditL4);
      //  System.out.println("Credit 2 " + creditL5);
      //  System.out.println("Credit 6 " + creditL6);
        //System.out.println(condoneTimes);


    }

    @FXML
    void exit() {
        if (creditL6>=60&&creditL5>=120&&creditL4>=300){
            if (resitTimes==0)notification.setText("Non Hons Distinction / Merit Degree");
            else notification.setText("Non Hons Degree");
        }else if (creditL4>=240){
            if (resitTimes==0)notification.setText("DipHE Distinction / Merit Degree");
            else notification.setText("DipHE");
        }else if(creditL4-creditL5>=120){
            if (resitTimes==0)notification.setText("CertHE Distinction / Merit Degree");
            else notification.setText("CertHE");
        }else notification.setText("Enter at least first 06 modules to exit  ");

    }




// All Methods Reside here...

    /**
     * On each Continue Button Click in GUI this method is called. So the method checks the credit amount and Enables Level 5 and Level 6 Tabs once
     *          at least 100 credit is earned.
     * Calls Validation Method for each TextFields.
     * Based on returned value,
     *  1 : changes to the next tab(Module) + Adds 20 to the credits
     *  2 : clears all textFields and prepares for retake
     *  3 : moves to the next tab
     * Finds Average of all TextFields in the method and if there is resit and average >=30, it enables Condone Button.
     *
     *
     *
     * @param Array The array to store the marks after validation and processing
     * @param S1 First TextField in GUI
     * @param S2 Second TextField in GUI
     * @param S3 Third TextField in GUI
     * @param S4 Fourth TextField in GUI
     * @param A1 First Resit TextField in GUI
     * @param A2 Second Resit TextField in GUI
     * @param A3 Third Resit TextField in GUI
     * @param A4 Fourth Resit TextField in GUI
     * @param label The "Resit" Label
     * @param level The TabPane we are working on
     * @param tab The tab to move to if all conditions are satisfied
     * @return The Array with All the marks in it.
     */
    public List<Integer> InputToArray(List<Integer> Array, TextField S1, TextField S2, TextField S3, TextField S4, TextField A1, TextField A2, TextField A3, TextField A4, Label label, TabPane level, Tab tab) {

        //dropTab= tab;
        //dropTabPane = level;

        //Enables Level 5 and Level 6 Tabs once at least 100 credit is earned
        if (creditL4 >= 80) {
            level5.setDisable(false);
        }
        if (creditL5 >= 80 && creditL4 >= 160) {
            level6.setDisable(false);
        }


        //Re initializing each controller variables to free previous method call modifications
        condone.setVisible(false);
        Array.clear();
        bool1 = bool2 = bool3 = bool4 = 0;
        condoneArrayNo = 0;
        M = ("");
        assessmentCount = 0;
        condoneTotal=0;

        // keeping track of the
        condoneArray = (Array);
        condoneTab = tab;
        condoneTabPane = level;

        // Validating and processing input in the 4 TextFields and if necessary the Resit TextField.
        // calling Validation method and returning Bool (integer) as
        // 1 = successfully completed all validation and passed the module.
        // 2 = failed in the Resit and prepare Tab for retake inputs.
        // 3 = Used up all 4 attempts and exclude student from the degree program.

        bool1 = Validation(Array, S1, A1, label, bool1, 1);
        condoneArrayNo++;
        bool2 = Validation(Array, S2, A2, label, bool2, 2);
        condoneArrayNo++;
        bool3 = Validation(Array, S3, A3, label, bool3, 3);
        condoneArrayNo++;
        bool4 = Validation(Array, S4, A4, label, bool4, 4);
        condoneArrayNo++;

        // Finding Average for Condoned credit purposes.
        try{
            Average = condoneTotal / assessmentCount;
        }catch (ArithmeticException e){

        }


        // Validating acceptance of only two Level4 condoned module
        // If Average > 30 make Condone Button Visible, otherwise hidden
        if (condoneTimes < 2 && (label.getId().equals("ResitL4M1") || label.getId().equals("ResitL4M2") || label.getId().equals("ResitL4M3") || label.getId().equals("ResitL4M4") || label.getId().equals("ResitL4M5") || label.getId().equals("ResitL4M6"))) {
            if (Average > 30) {
                condone.setVisible(true);
            } else condone.setVisible(false);
        } else condone.setVisible(false);


        if (bool1 == 1 && bool2 == 1 && bool3 == 1 && bool4 == 1) {
            level.getSelectionModel().select(tab);

                creditL4 += 20;
                creditL5 += 20;
                creditL6 += 20;

            notification.setText("Switched to the " + tab.getText());
            condone.setVisible(false);
        }

        // 2 = failed in the Resit and prepare Tab for retake inputs.
        // Clear everything in the TextFields
        else if (bool1 == 2 || bool2 == 2 || bool3 == 2 || bool4 == 2) {
            S1.clear();
            S2.clear();
            S3.clear();
            S4.clear();
            A1.clear();
            A2.clear();
            A3.clear();
            A4.clear();
            condone.setVisible(false);
        }

        // 3 = Used up all 4 attempts and still failed module.
        else if (bool1 == 3 || bool2 == 3 || bool3 == 3 || bool4 == 3) {
            condone.setVisible(false);
            notification.setText("Used up all attempts. Click next module tab");
        }

        //Finally return Array which is validated and has resit marks if needed and retake marks if needed to the caller
        return Array;


    }


    /**
     * Validation Method for all validation, Notification and progression
     * The Method checks if the argument TextFields contains value, gets the value, validates if its proper marks.
     * Based on the marks it enables the resit TextField gets value and validates it. further checks the resit marks for retakes. Caps at 40 for resits.
     * If marks are valid and above required, it adds it to the array.
     * It also keeps track of marks for condone purposes
     * Meanwhile it sets the notification on the screen too.
     *
     * @param Array The array to add marks to if it satisfies all conditions
     * @param S1 The First Attempt marks TextField
     * @param A1 The Resit marks TextField
     * @param label The "Resit" Label. (Enable this if resit TextField is enabled)
     * @param number The current TextField number. (1,2,3,4) (For notification Setting. Ex: "Resit in Marks 1")
     * @return bool
     *            bool = 1 : Passed in Assessment
     *            bool = 2 : Retake Module, clear all TextFields, prepare to get Retake Marks
     *            bool = 3 : Retake Module failed
     *
     */

    public int Validation(List<Integer> Array, TextField S1, TextField A1, Label label, int bool, int number) {

        if (!S1.getText().isEmpty()) { // Checks if the textField is empty
            if (S1.getText().matches("[0-9]+")) { //Checks if the input is numeral
                if (Integer.parseInt(S1.getText()) <= 100 && Integer.parseInt(S1.getText()) >= 0) { //checks if the input is valid
                    if (Integer.parseInt(S1.getText()) < 30) { //Prepare for resit
                        label.setDisable(false); // Enabling the resit Label
                        A1.setDisable(false); // Enabling the resit TextField

                        notification.setText(" That's a resit in Mark " + number);
                        resitTimes++;

                        condoneTextField = S1; // Keeping track of Marks TextField so that can input marks to array if its made an condone credit
                        condoneTotal = condoneTotal + Integer.parseInt(S1.getText()); // Adding the (< 30)marks to the Total to check if Condone is available
                        assessmentCount++;

                        if (!A1.getText().isEmpty()) { // Checks if the Resit textField is empty
                            if (A1.getText().matches("[0-9]+")) { //Checks if the Resit input is numeral
                                if (Integer.parseInt(A1.getText()) <= 100 && Integer.parseInt(S1.getText()) >= 0) { //checks if the Resit input is valid
                                    if (Integer.parseInt(A1.getText()) < 30) {
                                        if (retakeCount < 3) {
                                            retakeCount++;
                                            notification.setText(" That's a retake, Now fill marks for Retake");
                                            //retakeCount++;
                                            A1.setDisable(true);
                                            bool = 2;
                                            if (label.getId().equals(temp)) {
                                                bool = 3;
                                                System.out.print(label.getId() + " " + temp);
                                            } else temp = label.getId();
                                        } else notification.setText(" Out of the Degree program for exhausting retakes");

                                    } else {
                                        if (Integer.parseInt(A1.getText()) <= 40) {
                                            Array.add(Integer.parseInt(A1.getText()));
                                        } else {
                                            Array.add(40);
                                        }
                                        bool=1;
                                    }
                                } else{
                                    notification.setText(" Input marks out of range in Marks " + number + ", input valid marks");
                                    bool=0;
                                }

                            } else{
                                bool=0;
                                notification.setText(" Input marks contains non numerals in Marks " + number + ", input valid marks");
                            }

                        }else bool=0;
                    } else {
                        label.setDisable(true);
                        A1.setDisable(true);
                        Array.add(Integer.parseInt(S1.getText()));
                        condoneTotal = condoneTotal + Integer.parseInt(S1.getText()); //Adding the (> 30)marks to the Total to check if Condone is available
                        assessmentCount++;
                        bool=1;
                    }


                } else notification.setText(" Input marks out of range in Marks " + number + ", input valid marks");
            } else {
                notification.setText(" Input marks contains non numerals in Marks " + number + ", input valid marks");
            }
        }else bool =1;
        return bool;
    }


    /**
     * Gets all teh valuse in the array and adds it. finds the module average and returns it
     * @param Arr The Array with all marks
     * @return The module average.
     */
    public double CalculationL6(ArrayList<Integer> Arr) {
        int length = Arr.size();
        int total = 0;

        for (int value : Arr) {
            total = total + value;
        }
        moduleAverage = (((total / length) * 2) / 3);
        return moduleAverage;
    }

    public double CalculationL5(List<Integer> Arr) {
        int length = Arr.size();
        //System.out.println("size is " + length);
        int total = 0;

        for (int value : Arr) {
            total = total + value;
        }
        moduleAverage = ((total / length) / 3);
        return moduleAverage;
    }


//-------------------------------------------------------------------------------------------------------------------------------------------------
}


// 1 = successfully completed all validation and passed the module.
// Move to next tab and increase credit by another 20.
        /*if (bool1 == 1 && bool2 == 1 && bool3 == 1 && bool4 == 1) {
            level.getSelectionModel().select(tab);
            System.out.println(doubleCreditCheck < 1 && (doublecredit1.isSelected() || doublecredit2.isSelected() || doublecredit3.isSelected() || doublecredit4.isSelected() || doublecredit5.isSelected()));
            if (doubleCreditCheck < 1 && (doublecredit1.isSelected() || doublecredit2.isSelected() || doublecredit3.isSelected() || doublecredit4.isSelected() || doublecredit5.isSelected())) {
                creditL4 += 40;
                creditL5 += 40;
                creditL6 += 40;
                System.out.println("First if is here");
            } else {
                creditL4 += 20;
                creditL5 += 20;
                creditL6 += 20;
                System.out.println("second if is here");
            }
            notification.setText("Switched to the " + tab.getText());
            condone.setVisible(false);
        }*/


    /*IntegerProperty x = new SimpleIntegerProperty(10);
        IntegerProperty y = new SimpleIntegerProperty();
        y.bind(x);
        System.out.println(y.getValue());
        //secondLabel.textProperty().bind(userInput.textProperty());*/



    /*public void Update(){

        Label Label;

        IntegerProperty x = new SimpleIntegerProperty(10);
        IntegerProperty y = new SimpleIntegerProperty();
        y.bind(x);
        System.out.println(y.getValue());
        l4Mod1Mark1.textProperty().bind(javafx.scene.control.Label.textProperty());


    }*/




    /*txt.textProperty().addListener((ObservableValue<? extends String> observableValue, String oldValue, String newValue) -> {
            System.out.println("textfield changed from " + oldValue + " to " + newValue);
        });*/


//
        /*public TextField txt;
        txt.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("textfield changed from " + oldValue + " to " + newValue);
        });*/


        /*public void ChangeListener(TextField ToObserve, TextField resit, Label label, TextField initializer){
            {
                initializer.textProperty().addListener((observable, oldValue, newValue) -> {
                    if (Integer.parseInt(ToObserve.getText()) < 30) {
                        label.setVisible(true);
                        resit.setVisible(true);
                    }
                    System.out.println("textfield changed from " + oldValue + " to " + newValue);
                });
            }}*/









        /*if(!S1.getText().isEmpty()){ // Checks if the textField is empty
            if (S1.getText().matches("[0-9]+")){ //Checks if the input is numeral
                if (Integer.parseInt(S1.getText())<=100 && Integer.parseInt(S1.getText())>= 0 ){ //checks if the input is valid
                    if (Integer.parseInt(S1.getText()) < 30){
                        label.setDisable(false);
                        A1.setDisable(false);
                        notification.setText("That's a resit...");
                    }
                    else {
                        label.setDisable(true);
                        A1.setDisable(true);
                        Array.add(Integer.parseInt(S1.getText()));
                        bol1=true;
                    }
                }
                else notification.setText("Input marks out of range, input valid marks");
            }
            else {
                notification.setText("Input marks contains non numerals, input valid marks");

            }


        } else bol1=true;





        if(!S2.getText().isEmpty()){ // Checks if the textField is empty
            if (S2.getText().matches("[0-9]+")){ //Checks if the input is numeral
                if (Integer.parseInt(S2.getText())<=100 && Integer.parseInt(S2.getText())>= 0 ){ //checks if the input is valid
                    if (Integer.parseInt(S2.getText()) < 30){
                        label.setDisable(false);
                        A2.setDisable(false);
                        notification.setText("That's a resit...");
                    }
                    else {
                        label.setDisable(true);
                        A2.setDisable(true);
                        Array.add(Integer.parseInt(S2.getText()));
                        bol2=true;
                    }
                }
                else notification.setText("Input marks out of range, input valid marks");
            }
            else {
                notification.setText("Input marks contains non numerals, input valid marks");

            }


        }else bol2=true;

        if(!S3.getText().isEmpty()){ // Checks if the textField is empty
            if (S3.getText().matches("[0-9]+")){ //Checks if the input is numeral
                if (Integer.parseInt(S3.getText())<=100 && Integer.parseInt(S3.getText())>= 0 ){ //checks if the input is valid
                    if (Integer.parseInt(S3.getText()) < 30){
                        label.setDisable(false);
                        A3.setDisable(false);
                        notification.setText("That's a resit...");
                    }
                    else {
                        label.setDisable(true);
                        A3.setDisable(true);
                        Array.add(Integer.parseInt(S3.getText()));
                        bol3=true;
                    }
                }
                else notification.setText("Input marks out of range, input valid marks");
            }
            else {
                notification.setText("Input marks contains non numerals, input valid marks");

            }


        }else bol3=true;

        if(!S4.getText().isEmpty()) { // Checks if the textField is empty
            if (S4.getText().matches("[0-9]+")) { //Checks if the input is numeral
                if (Integer.parseInt(S4.getText()) <= 100 && Integer.parseInt(S4.getText()) >= 0) { //checks if the input is valid
                    if (Integer.parseInt(S4.getText()) < 30) {
                        label.setDisable(false);
                        A4.setDisable(false);
                        notification.setText("That's a resit...");
                    } else {
                        label.setDisable(true);
                        A4.setDisable(true);
                        Array.add(Integer.parseInt(S4.getText()));
                        bol4 = true;
                    }
                } else notification.setText("Input marks out of range, input valid marks");
            } else {
                notification.setText("Input marks contains non numerals, input valid marks");

            }
        }else bol4=true;

        if (bol1 && bol2 && bol3 && bol4){
            level.getSelectionModel().select(tab);
            notification.setText("Lets go to the " + tab.getText());
        }

        System.out.println(Array);
        return Array;
    }*/



