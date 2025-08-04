package org.example;

import java.awt.*;
import java.awt.event.ActionListener;

public interface qiz extends ActionListener {
    void nextQuestion();

    void actionperformed(ActiveEvent e);

    void displayAnswer();

    void result();
}
