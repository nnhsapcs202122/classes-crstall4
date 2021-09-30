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
    public void fillUp(int cans){
        this.cans += cans;
    }
    public void insertToken(int tokens){
        this.tokens += tokens;
        this.cans -= cans;
    }
    public int getCanCount(){
        return cans;
    }
    public int getTokenCount(){
        return tokens;
    }
    
}
