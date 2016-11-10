package view;

import model.ShapeModel;
import view.menu.EditMenuDelegate;
import view.menu.FileMenuDelegate;
import view.menu.MainMenuBar;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

import view.canvas.Canvas;
import view.sidebar.Sidebar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by un4 on 04/11/16.
 */
public class ShapeView implements Observer {

    private static int FRAME_WIDTH = 750;
    private static int FRAME_HEIGHT = 750;


    private ShapeModel shapeModel;

    private JFrame mainFrame;

    private MainPanel mainPanel;
    private Canvas canvas;
    private Sidebar sidebar;

    private MainMenuBar mainMenuBar;

    /**
     * Shape Mode
     *
     * @param shapeModel
     */
    public ShapeView(ShapeModel shapeModel) {
        this.shapeModel = shapeModel;

        //SetUpMenuBar
        mainMenuBar = new MainMenuBar();
        mainPanel = new MainPanel(shapeModel);
        mainPanel.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));

        mainMenuBar.setFileMenuDelegate(mainPanel.getCanvas());
        mainMenuBar.setEditMenuDelegate(mainPanel.getCanvas());

        this.mainFrame = new JFrame("Vector Drawing");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.mainFrame.setJMenuBar(this.mainMenuBar);
        this.mainFrame.add(mainPanel);
        this.mainFrame.pack();
        this.mainFrame.setVisible(true);
    }





    @Override
    public void update(Observable observable, Object o) {

    }

}
