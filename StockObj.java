public class StockObj implements Stock{

  public String stockName;
  public float value;
  public int bias;


  public StockObj(String stockNme, float val){
    this.stockName = stockNme;
    this.val = val;
    this.bias = 0;
  }

}
