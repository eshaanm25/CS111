/*************************************************************************
 *  Compilation:  javac HeartTransplant.java
 *  Execution:    java HeartTransplant < data.txt
 *
 *  @author: Eshaan Mathur em919@rutgers.edu em919
 *
 *************************************************************************/

public class HeartTransplant {

    /* ------ Instance variables  -------- */

    // Person array, each Person is read from the data file
    private Person[] listOfPatients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge[] survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause[] survivabilityByCause;

    /* ------ Constructor  -------- */
    
    /*
     * Initializes all instance variables to null.
     */
    public HeartTransplant() {
        survivabilityByAge = null;
        listOfPatients = null;
        survivabilityByCause = null;
    }

    /* ------ Methods  -------- */

    /*
     * Inserts Person p into listOfPatients
     * 
     * Returns:  0 if successfully inserts p into array, 
     *          -1 if there is not enough space to insert p into array
     */
    public int addPerson(Person p, int arrayIndex) {
        if (arrayIndex >= 21){
            return -1; 
        } 
        else{
            listOfPatients[arrayIndex] = p;
            return 0;
        }
    }

    /*
     * 1) Creates the listOfPatients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file.
     *    File Format: ID, Ethinicity, Gender, Age, Cause, Urgency, State of health
     *    Each line refers to one Person.
     * 
     * 3) Inserts each person from file into listOfPatients
     *    Hint: uses addPerson() method
     * 
     * Returns the number of patients read from file
     */
    public int readPersonsFromFile(int numberOfLines) {
        int arrayIndex = 0;
        int success = 0;  
        listOfPatients = new Person[numberOfLines]; 

        while (arrayIndex < numberOfLines){
            Person p = new Person(StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt());
            success = addPerson(p, arrayIndex);
            if (success == -1){
                return arrayIndex; //excludes lines after 21 entries
            }
            else {
                arrayIndex=arrayIndex+1;
            } 
        }
        return numberOfLines; 
    }

    /*
     * 1) Creates the survivabilityByAge array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     * 3) Inserts each rate from file into the survivabilityByAge array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByAgeFromFile (int numberOfLines) {
        survivabilityByAge = new SurvivabilityByAge[numberOfLines];  
        for (int i=0;i<numberOfLines;i++){
            int age = StdIn.readInt();
            int YearsPostTransplant = StdIn.readInt(); 
            double rate =  StdIn.readDouble(); 
            SurvivabilityByAge survByAge = new SurvivabilityByAge(age, YearsPostTransplant, rate);
            survivabilityByAge[i] = survByAge;
        }
        return numberOfLines; 
    }

    /*
     * 1) Creates the survivabilityByCause array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     * 3) Inserts each rate from file into the survivabilityByCause array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByCauseFromFile (int numberOfLines) {
        survivabilityByCause = new SurvivabilityByCause[numberOfLines];  
        for (int i=0;i<numberOfLines;i++){
            int cause = StdIn.readInt();
            int YearsPostTransplant = StdIn.readInt(); 
            double rate =  StdIn.readDouble(); 
            SurvivabilityByCause survByCause = new SurvivabilityByCause(cause, YearsPostTransplant, rate);
            survivabilityByCause[i] = survByCause;
        }
        return numberOfLines; 
    }
    
    /*
     * Returns listOfPatients
     */
    public Person[] getListOfPatients() {
        return listOfPatients;
    } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge[] getSurvivabilityByAge() {
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause[] getSurvivabilityByCause() {
        return survivabilityByCause;
    }

    /*
     * Returns a Person array in which with every Person that has 
     * age above the parameter age from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with age above the parameter age.
     * 
     * Return null if there is no Person with age above the 
     * parameter age.
     */ 
    public Person[] getPatientsWithAgeAbove(int age) {
        int numberofPatients = 0; 
        int arrayIndex = 0; 
        for (int i = 0; i<listOfPatients.length; i++){
            if (listOfPatients[i].getAge() > age){ 
                numberofPatients=numberofPatients+1;
            }
        }
        if (numberofPatients==0){
            return null;
        }
        Person [] ageAbove = new Person[numberofPatients];
        for (int i = 0; i<listOfPatients.length; i++){
            if (listOfPatients[i].getAge() > age){ 
                ageAbove[arrayIndex] = listOfPatients[i]; 
                arrayIndex=arrayIndex+1; 
            }
        }
        return ageAbove; 
    }
    
    /*
     * Returns a Person array with every Person that has the state of health 
     * equal to the parameter state from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the state of health equal to the parameter state.
     * 
     * Return null if there is no Person with the state of health 
     * equal to the parameter state.
     */ 
    public Person[] getPatientsByStateOfHealth(int state) {
        int numberofPatients = 0; 
        int arrayIndex = 0; 
        for (int i = 0; i<listOfPatients.length; i++){
            if (listOfPatients[i].getStateOfHealth() == state){ 
                numberofPatients=numberofPatients+1;
            }
        }
        if (numberofPatients==0){
            return null;
        }
        Person [] stateEqual = new Person[numberofPatients];
        for (int i = 0; i<listOfPatients.length; i++){
            if (listOfPatients[i].getStateOfHealth() == state){ 
                stateEqual[arrayIndex] = listOfPatients[i]; 
                arrayIndex=arrayIndex+1; 
            }
        }
        return stateEqual; 
    }

    /*
     * Returns a Person array with every person that has the heart 
     * condition cause equal to the parameter cause from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Person with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Person[] getPatientsByHeartConditionCause(int cause) {
        int numberofPatients = 0; 
        int arrayIndex = 0; 
        for (int i = 0; i<listOfPatients.length; i++){
            if (listOfPatients[i].getCause() == cause){ 
                numberofPatients=numberofPatients+1;
            }
        }
        if (numberofPatients==0){
            return null;
        }
        Person [] causeEqual = new Person[numberofPatients];
        for (int i = 0; i<listOfPatients.length; i++){
            if (listOfPatients[i].getCause() == cause){ 
                causeEqual[arrayIndex] = listOfPatients[i]; 
                arrayIndex=arrayIndex+1; 
            }
        }
        return causeEqual; 
    }

    /*
     * Assume there are numberOfHearts available for transplantation surgery.
     * Also assume that the hearts are of the same blood type as the
     * persons on the listOfPatients.
     * This method finds a set of persons to be the recepients of these
     * hearts.
     * 
     * The method returns a Person array from the listOfPatients
     * array that have the highest potential for survivability after
     * the transplant. The array size is numberOfHearts.
     * 
     * If numberOfHeartsAvailable is greater than listOfPatients
     * array size all Persons will receive a transplant.
     * 
     * If numberOfHeartsAvailable is smaller than listOfPatients
     * array size find the set of people with the highest
     * potential for survivability.
     * 
     * There is no correct solution, you may come up with any set of
     * persons from the listOfPatients array.
     */ 
    public Person[] match(int numberOfHearts) {
        if (numberOfHearts == 0){
            return null;
        }
        if (numberOfHearts >= listOfPatients.length){
            return listOfPatients; 
        }
        Person [] heartList = new Person[numberOfHearts];
        for (int i = 0; i<numberOfHearts; i++){
            heartList[i] = listOfPatients[i];
        }
        return heartList; 
    }

    /*
     * Client to test the methods you write
     */
    public static void main (String[] args) {

        HeartTransplant ht = new HeartTransplant();

        // read persons from file
        int numberOfLines = StdIn.readInt();
        int numberOfReadings = ht.readPersonsFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " patients read from file.");
 
        // read survivability by age from file
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByAgeFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by age lines read from file.");

        // read survivability by heart condition cause from file        
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByCauseFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by cause lines read from file.");

        // list all patients
        for (Person p : ht.getListOfPatients()) {
            StdOut.println(p);
        }

        // list survivability by age rates
        for (SurvivabilityByAge rate : ht.getSurvivabilityByAge()) {
            StdOut.println(rate);
        }

        // list survivability by cause rates
        for (SurvivabilityByCause rate : ht.getSurvivabilityByCause()) {
            StdOut.println(rate);
        }
    }
}
