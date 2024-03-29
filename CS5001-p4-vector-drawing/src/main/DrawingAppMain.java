package main;

import controller.ShapeController;
import model.ShapeModel;
import view.ShapeView;

/**
 * Created by un4 on 04/11/16.
 */
public class DrawingAppMain {

    /**
     * Main function that executes the programme.
     *
     * @param args takes in an array of command line parameters.
     */
    public static void main(String[] args) {
        //Shape factory.
        ShapeModel shapeModel = new ShapeModel();
        //Shape Controller.
        ShapeController shapeController = new ShapeController(shapeModel);
        // Shape view.
        new ShapeView(shapeModel, shapeController);

//        ShapeModel shapeModel = new ShapeModel();
//        ShapeFactory factory = new ShapeFactory();
//        Shape shape = factory.getShape(ShapeType.ELLIPSE);
//
//        shapeModel.addShape(shape);
//        shapeModel.removeShape(shape);
//        shapeModel.undoRemoveShape();
    }
}
