package model;
import java.util.ArrayList;

public class SSurvey{

  private int serviceDoIt;
  private int answerTime;
  private int relationCostXBenefit;

  public SSurvey(int serviceDoIt,int answerTime,int relationCostXBenefit){
    this.serviceDoIt = serviceDoIt;
    this.answerTime = answerTime;
    this.relationCostXBenefit = relationCostXBenefit;
  }

  /**
  * Description This method allows to get the quality of the service. <br>
  * <b>post:</b> The quality of the service is given.
  * @return The quality of the service.
  */
  public int getServiceDoIt(){
    return serviceDoIt;
  }

  public void setServiceDoIt(int serviceDoIt){
    this.serviceDoIt = serviceDoIt;
  }

  /**
  * Description This method allows to get the answer time. <br>
  * <b>post:</b> The answer time is given.
  * @return The answer time.
  */
  public int getAnswerTime(){
    return answerTime;
  }

  public void setAnswerTime(int answerTime){
    this.answerTime = answerTime;
  }

  /**
  * Description This method allows to get the relation of cost and benefit. <br>
  * <b>post:</b> The relation of cost and benefit is given.
  * @return The relation of cost and benefit.
  */
  public int getRelationCostXBenefit(){
    return relationCostXBenefit;
  }

  public void setRelationCostXBenefit(int relationCostXBenefit){
    this.relationCostXBenefit = relationCostXBenefit;
  }

}
