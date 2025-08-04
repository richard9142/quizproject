package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class qwiz implements qiz {

    String[] question = {
                            "which company created java?",
                            "which year was java creadted?",
                            "what was java originally called?",
                            "who is credited with creating java?"
                        };
    String[] [] option =  {
                         {"sun microsystems","starbucks","microsoft","google"},
                         {"1989","1996","1972,1492"},
                         {"apple","latte","oak","koffing"},
                         {"steve jobs","bill gates","james gosling","mark zukerburg"}
                          };
    char[] answers =   {
                        'A',
                        'B',
                        'C',
                        'C'
                      };
    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_question = question.length;
    int result;
    int second=10;

    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    public qwiz() {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(650,650);
    frame.getContentPane().setBackground(new Color(50,50,50));
    frame.setLayout(null);
    frame.setResizable(false);

    textArea.setBounds(0,50,650,50);
    textArea.setLineWrap(true);
    textArea.setBackground(new Color(25,25,25));
    textArea.setForeground(new Color(25,255,0));
    textArea.setFont(new Font("Ink free",Font.BOLD,25));
    textArea.setBorder(BorderFactory.createBevelBorder(1));
    textArea.setEditable(false);
    textArea.setText("sample text");

    frame.add(textArea);
    frame.add(textField);
    frame.setVisible(true);

    }

    @Override
    public void nextQuestion() {

    }

    @Override
    public void actionperformed(ActiveEvent e) {

    }
    @Override
    public void displayAnswer(){

    }
    @Override
    public void result(){

    }
}
