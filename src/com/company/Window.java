package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

public class Window {
    public static void window(){
        // TODO: создаем пустое окно и настраиваем его

        JFrame frame = new JFrame("Renamer by xmpl and livefish");//Создаёт JFrame и добавляет заголовок
        frame.setVisible(true);// делает его видимым
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Это нужно для того чтобы мы могли его закрывать
        frame.setSize(400, 500);// устанавливает размеры
        frame.setResizable(false);//делает его неизменяемым по высоте и ширине
        frame.setLocationRelativeTo(null);//создаёт его по середине экрана
        frame.setLayout(null);//нужно для адекватного размещения элементов (доверьтесь мне) или поставьте другой и мучайтесь

        //TODO: добавляем элементы и настраиваем их

        // лэйбл - неизменяемое поле с текстом
        JLabel label = new JLabel("Введите путь до файла");
        label.setBounds(40, 10, 500, 20);// xyz, ширина высота
        frame.add(label);

        //текст филд - поле для ввода текста
        JTextField textField = new JTextField();//хз как добавить серенький текст
        textField.setBounds(40, 35, 200, 20);
        frame.add(textField);//ну и наконец добавляем

        JLabel label1 = new JLabel("Введите расширение файла");
        label1.setBounds(40, 65, 500, 20);// xyz, ширина высота
        frame.add(label1);

        JLabel label2 = new JLabel("?");
        label2.setBounds(1000, 1005, 500, 20);// xyz, ширина высота
        frame.add(label2);

        JTextField textField1 = new JTextField();//хз как добавить серенький текст
        textField1.setBounds(40, 95, 200, 20);
        frame.add(textField1);//ну и наконец добавляем

        //кнопочка ввод (объяснять я полагаю не надо)
        JButton button = new JButton("Ввод");
        button.setBounds(240, 95, 120, 20);// xyz, ширина высота
        frame.add(button);

        //окно уже нарисовано, а элементы еще не добавлены, надо его перерисовать
        //для этого нужна функция repaint
        frame.repaint();

        //TODO: тут добавляем функционал всему (я сам в шоке от скобочек)
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Renaming.ren(textField.getText(), textField1.getText())){
                    label2.setText("ФАЙЛ УСПЕШНО ПЕРЕИМЕНОВАН!");
                    label2.setBounds(40, 150, 400, 20);
                }else{
                    label2.setText("ОШИБКА ПЕРЕИМЕНОВАНИЯ ФАЙЛА");
                    label2.setBounds(40, 150, 400, 20);
                }

            }
        });

    }
}