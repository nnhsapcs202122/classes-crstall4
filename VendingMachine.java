public class VendingMachine
{
    private int cans;
    private int tokens;
    /**
     * Default constructor for the VendingMachine class.
     * Initializes the cans to 10, and the tokens to 0
     */
    public VendingMachine(){
        this.cans = 10;
        this.tokens = 0;
    }
    /**
     * Constructs a new VendingMachine object with the specified can amount
     * 
     * @param cans
     */
    public VendingMachine(int cans){
        this.cans = cans;
        this.tokens = 0;
    }
    /**
     * Sets the cans in this VendingMachine
     * 
     * @param cans
     */
    public void setCans(int cans){
        this.cans = cans;
    }
    /**
     * Sets the tokens in this VendingMachine
     * 
     * @param tokens
     */
    public void setTokens(int tokens){
        this.tokens = tokens;
    }
    /**
     * Increase the amount of cans the vending machine has
     * 
     * @param cans    the amount of cans added to the vending machine
     */
    public void fillUp(int cans){
        this.cans += cans;
    }
    /**
     * insert a token into the vending machine
     * 
     * @param tokens    the amount of tokens inserted into the vending machine
     */
    public void insertToken(int tokens){
        this.tokens += tokens;
        this.cans -= cans;
    }
    /**
     * Returns the amount of cans in the vending machine
     * 
     * @return the amount of cans in the vending machine
     */
    public int getCanCount(){
        return cans;
    }
    /**
     * Returns the amount of tokens in the vending machine
     * 
     * @return the amount of tokens in the vending machine
     */
    public int getTokenCount(){
        return tokens;
    }
    
}
