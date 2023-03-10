import javafx.event.ActionEvent;
import javafx.scene.control.TextField;


enum EXP{
    SUM,SUB,DIV,MUL
}
public class CalculatorFormController {
    public TextField txtNumberOne;
    public TextField txtNumberTwo;
    public TextField txtAnswer;

    public void sumOnAction(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(execute(EXP.SUM)));
    }

    public void subOnAction(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(execute(EXP.SUB)));
    }

    public void divOnAction(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(execute(EXP.DIV)));
    }

    public void mulOnAction(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(execute(EXP.MUL)));
    }
    private double execute(EXP exp){
        Double num1 =Double.parseDouble(txtNumberOne.getText());
        Double num2 =Double.parseDouble(txtNumberTwo.getText());
        switch (exp){
            case SUB:return num1+num2;
            case SUM:return num1-num2;
            case DIV:return num1/num2;
            case MUL:return num1*num2;
            default:return 0.0;
        }
    }


}
