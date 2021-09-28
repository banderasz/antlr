package language.controller;

import game.Direction;
import game.GameController;

public class MyRobotControllerVisitor extends RobotControllerBaseVisitor<Object>{
    private GameController controller;

    public MyRobotControllerVisitor(GameController controller){
        this.controller = controller;
    }

    @Override
    public Object visitMoveStatement(RobotControllerParser.MoveStatementContext ctx) {
        for (int i = 0; i < Integer.parseInt(ctx.amount().INT().getText()); i++) {
            controller.move();
        }
        return super.visitMoveStatement(ctx);
    }

    @Override
    public Object visitRotateStatement(RobotControllerParser.RotateStatementContext ctx) {
        int number_of_rotate = 1;
        String goal = (String)ctx.direction().STRING().getText();
        goal = goal.substring(1,goal.length()-1);
        if (controller.getPlayerFacing() == Direction.DOWN){
            switch (goal) {
                case "down":
                    number_of_rotate = 0;
                    break;
                case "left":
                    number_of_rotate = 1;
                    break;
                case "up":
                    number_of_rotate = 2;
                    break;
                case "right":
                    number_of_rotate = 3;
                    break;
            }
        }
        else if (controller.getPlayerFacing() == Direction.LEFT){
            switch (goal) {
                case "down":
                    number_of_rotate = 3;
                    break;
                case "left":
                    number_of_rotate = 0;
                    break;
                case "up":
                    number_of_rotate = 1;
                    break;
                case "right":
                    number_of_rotate = 2;
                    break;
            }
        }
        else if (controller.getPlayerFacing() == Direction.UP){
            switch (goal) {
                case "down":
                    number_of_rotate = 2;
                    break;
                case "left":
                    number_of_rotate = 3;
                    break;
                case "up":
                    number_of_rotate = 0;
                    break;
                case "right":
                    number_of_rotate = 1;
                    break;
            }
        }
        else if (controller.getPlayerFacing() == Direction.RIGHT){
            switch (goal) {
                case "down":
                    number_of_rotate = 1;
                    break;
                case "left":
                    number_of_rotate = 2;
                    break;
                case "up":
                    number_of_rotate = 3;
                    break;
                case "right":
                    number_of_rotate = 0;
                    break;
            }
        }
        for (int i = 0; i < number_of_rotate; i++){
            controller.rotate();
        }

        return super.visitRotateStatement(ctx);
    }
    @Override
    public Object visitLoopStatement(RobotControllerParser.LoopStatementContext ctx) { Object result =
            null;
        for (int i = 0; i < Integer.parseInt(ctx.amount().INT().getText()); i++) {
            for (RobotControllerParser.StatementContext stm : ctx.statement()) {
            result = visit(stm);
        }
        }
        return result;
    }

    @Override
    public Object visitLogStatement(RobotControllerParser.LogStatementContext ctx) {
        controller.displayMessage(ctx.logMessage().STRING().getText());
        return super.visitLogStatement(ctx);



    }




}
