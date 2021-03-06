package game;

import language.controller.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GameController {

    private Model model;
    private View view;

    private GameController() {
        model = new Model();
        parseLevelMakerFile();
        view = new View(model);

        view.getMoveButton().addActionListener(e -> move());
        view.getRotateButton().addActionListener(e -> rotate());

        parseControllerFile();
    }

    private void parseControllerFile() {
        try {
            File file = new File("res\\sample.robot");
            InputStream fileStream = new FileInputStream(file);
            ANTLRInputStream inputStream = new ANTLRInputStream(fileStream);
            RobotControllerLexer lexer = new RobotControllerLexer(inputStream);
            CommonTokenStream tokens = new
                    CommonTokenStream(lexer);
            RobotControllerParser parser = new RobotControllerParser(tokens);
            RobotControllerParser.ProgramContext tree = parser.program();
            MyRobotControllerVisitor visitor = new MyRobotControllerVisitor(this);
            visitor.visit(tree);
        } catch (IOException ignored) {
        }
    }

    private void parseLevelMakerFile() {
        try {
            File file = new File("res\\level.robot");
            InputStream fileStream = new FileInputStream(file);
            ANTLRInputStream inputStream = new ANTLRInputStream(fileStream);
            RobotLevelMakerLexer lexer = new RobotLevelMakerLexer(inputStream);
            CommonTokenStream tokens = new
                    CommonTokenStream(lexer);
            RobotLevelMakerParser parser = new RobotLevelMakerParser(tokens);
            RobotLevelMakerParser.ProgramContext tree = parser.program();
            MyRobotLevelMakerVisitor visitor = new MyRobotLevelMakerVisitor(this);
            visitor.visit(tree);
        } catch (IOException ignored) {
        }
    }


    public void move() {
        model.movePlayer(); view.refresh();
        try { Thread.sleep(500); }
        catch (InterruptedException ignored) {}
        checkWinCondition();
    }


    public void rotate() {
        model.rotatePlayer(); view.refresh();
        try { Thread.sleep(500); }
        catch (InterruptedException ignored) {}
    }


    public Direction getPlayerFacing() {
        return model.getPlayerFacing();
    }

    public void displayMessage(String message) {
        view.displayMessage(message);
    }

    private void checkWinCondition() {
        if (model.getCrates().isEmpty())
            view.win();
    }

    public static void main(String[] args) {
        new GameController();
    }

    public Model getModel(){
        return this.model;
    }
}