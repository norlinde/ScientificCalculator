import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[22];
    JButton addBut, subBut, mulBut, divBut, equBut, delBut, clearBut, negBut, decBut, arcSineBut;
    JButton sqrtBut, percentBut, sineBut, cosineBut, arcCosineBut, xSquaredBut, minBut, maxBut, roundBut;
    JButton exponentBut, bracket1But, bracket2But;


    JPanel jPanel;
    Font myFont = new Font("Commercial", Font.PLAIN, 20);
    Font myFont1 = new Font("Commercial", Font.BOLD, 30);


    double num1 = 0, num2 = 0, result = 0;
    String operator;


    public Calculator() {


        frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);
        frame.setLayout(null);
        textField = new JTextField();
        textField.setBounds(50, 50, 600, 70);
        textField.setFont(myFont);
        textField.setEditable(true);


        addBut = new JButton("+");
        subBut = new JButton("-");
        mulBut = new JButton("*");
        divBut = new JButton("/");
        decBut = new JButton(".");
        equBut = new JButton("=");
        delBut = new JButton("Delete");
        clearBut = new JButton("Clear");
        negBut = new JButton("(-)");
        sqrtBut = new JButton("√");
        percentBut = new JButton("%");
        cosineBut = new JButton("cos");
        arcSineBut = new JButton("sin-1");
        arcCosineBut = new JButton("cos-1");

        xSquaredBut = new JButton("x^2");
        minBut = new JButton("Min");
        maxBut = new JButton("Max");
        roundBut = new JButton("Round");
        exponentBut = new JButton("^");
        sineBut = new JButton("sin");
        bracket1But = new JButton("(");
        bracket2But = new JButton(")");


        functionButtons[0] = addBut;
        functionButtons[1] = subBut;
        functionButtons[2] = mulBut;
        functionButtons[3] = divBut;
        functionButtons[4] = decBut;
        functionButtons[5] = equBut;
        functionButtons[6] = delBut;
        functionButtons[7] = clearBut;
        functionButtons[8] = negBut;
        functionButtons[9] = sqrtBut;
        functionButtons[10] = percentBut;

        functionButtons[11] = cosineBut;
        functionButtons[12] = arcSineBut;
        functionButtons[13] = arcCosineBut;

        functionButtons[14] = xSquaredBut;
        functionButtons[15] = minBut;
        functionButtons[16] = maxBut;
        functionButtons[17] = roundBut;
        functionButtons[18] = exponentBut;
        functionButtons[19] = sineBut;
        functionButtons[20] = bracket1But;
        functionButtons[21] = bracket2But;


        for (int i = 0; i < 22; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(Color.lightGray);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont1);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(Color.lightGray);
        }


        addBut.setFont(myFont1);
        subBut.setFont(myFont1);
        divBut.setFont(myFont1);
        mulBut.setFont(myFont1);
        equBut.setFont(myFont1);


        jPanel = new JPanel();
        jPanel.setBounds(50, 150, 600, 300);
        jPanel.setLayout(new GridLayout(8, 4, 20, 5));

        jPanel.add(sineBut);
        jPanel.add(arcSineBut);
        jPanel.add(cosineBut);
        jPanel.add(arcCosineBut);
        jPanel.add(sqrtBut);
        jPanel.add(minBut);
        jPanel.add(maxBut);
        jPanel.add(xSquaredBut);
        jPanel.add(bracket1But);
        jPanel.add(bracket2But);
        jPanel.add(exponentBut);
        jPanel.add(roundBut);


        jPanel.add(decBut);
        jPanel.add(addBut);
        jPanel.add(numberButtons[1]);
        jPanel.add(numberButtons[2]);

        jPanel.add(negBut);
        jPanel.add(subBut);
        jPanel.add(numberButtons[3]);
        jPanel.add(numberButtons[4]);

        jPanel.add(percentBut);
        jPanel.add(divBut);
        jPanel.add(numberButtons[5]);
        jPanel.add(numberButtons[6]);

        jPanel.add(delBut);
        jPanel.add(mulBut);
        jPanel.add(numberButtons[7]);
        jPanel.add(numberButtons[8]);

        jPanel.add(clearBut);
        jPanel.add(equBut);
        jPanel.add(numberButtons[9]);
        jPanel.add(numberButtons[0]);

        frame.add(jPanel);
        frame.add(textField);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decBut) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == addBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        }
        if (e.getSource() == subBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        }
        if (e.getSource() == mulBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "*";
            textField.setText("");
        }
        if (e.getSource() == divBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");

        }
        if (e.getSource() == minBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "Min";
            textField.setText("");

        }
        if (e.getSource() == maxBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "Max";
            textField.setText("");
        }
        if (e.getSource() == percentBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "%";
            textField.setText("");
        }
        if (e.getSource() == arcSineBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "%";
            textField.setText("sin-1");
        }
        if (e.getSource() == arcCosineBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "cos-1";
            textField.setText("");
        }
        if (e.getSource() == roundBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "Round";
            textField.setText("");
        }

        if (e.getSource() == sqrtBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = "√";
            textField.setText("");
        }


        if (e.getSource() == equBut) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "Max":
                    result = Math.max(num1, num2);
                    break;
                case "Min":
                    result = Math.min(num1, num2);
                    break;
                case "%":
                    result = (num1 / num2) * 100;
                    break;
                case "sin-1":
                    result = Math.asin(num2);
                    break;
                case "cos-1":
                    result = Math.acos(num2);
                    break;
                case "Round":
                    result = Math.round(num1);
                    break;
                case "√":
                    result = Math.sqrt(num2);
                    break;

                case "x^2":
                    result =num2*2;
                    break;

            }
            textField.setText(String.valueOf(result));
            num1 = result;

        }
        if (e.getSource() == clearBut) {
            textField.setText("");
        }

        if (e.getSource() == delBut) {
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
            }
            if (e.getSource() == negBut) {
                double temp = Double.parseDouble(textField.getText());
                temp *= -1;
                textField.setText(string.valueOf(temp));
            }


        }


    }
}




