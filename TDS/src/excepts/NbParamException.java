package excepts;

public class NbParamException extends Exception { 
  public NbParamException(int nbre){
    System.out.println("Le nombre d'arguments donné est incorrect : " + nbre);
  }        
}