package language.controller;

import game.Coordinates;
import game.Direction;
import game.GameController;
import game.Model;
import org.stringtemplate.v4.misc.Coordinate;

public class MyRobotLevelMakerVisitor  extends RobotLevelMakerBaseVisitor<Object>{
    private GameController controller;

    public MyRobotLevelMakerVisitor(GameController controller){
        this.controller = controller;
    }

    @Override
    public Object visitDimStatement(RobotLevelMakerParser.DimStatementContext ctx) {
        int xdim = Integer.parseInt(ctx.XDIM().get(0).getText());
        int ydim = Integer.parseInt(ctx.XDIM().get(1).getText());
        Model model = controller.getModel();
        model.setBoardCols(xdim);
        model.setBoardRows(ydim);

        return super.visitDimStatement(ctx);
    }

    @Override
    public Object visitPlayerStatement(RobotLevelMakerParser.PlayerStatementContext ctx) {
        int xdim = Integer.parseInt(ctx.XDIM().get(0).getText());
        int ydim = Integer.parseInt(ctx.XDIM().get(1).getText());
        Model model = controller.getModel();
        model.setPlayerX(xdim);
        model.setPlayerY(ydim);

        return super.visitPlayerStatement(ctx);
    }
    @Override
    public Object visitWallStatement(RobotLevelMakerParser.WallStatementContext ctx) {
        Model model = controller.getModel();
        System.out.println(ctx.XDIM());
        String x = ctx.XDIM().get(0).toString();
        String y = ctx.XDIM().get(1).toString();
        if(x.contains("-")){
            if(y.contains("-")){
                for (int i = Integer.parseInt(x.split("-")[0]); i<=Integer.parseInt(x.split("-")[1]); i++){
                    for (int j = Integer.parseInt(y.split("-")[0]); j<=Integer.parseInt(y.split("-")[1]); j++){
                        Coordinates coordinates =  new Coordinates(i, j);
                        model.addWalls(coordinates);
                    }
                }
            }
            else {
                for (int i = Integer.parseInt(x.split("-")[0]); i<=Integer.parseInt(x.split("-")[1]); i++){
                        Coordinates coordinates =  new Coordinates(i, Integer.parseInt(y));
                        model.addWalls(coordinates);
                }
            }
        }
        else {
            if(y.contains("-")){
                    for (int j = Integer.parseInt(y.split("-")[0]); j<=Integer.parseInt(y.split("-")[1]); j++){
                        System.out.println(j);
                        Coordinates coordinates =  new Coordinates(Integer.parseInt(x), j);
                        model.addWalls(coordinates);
                    }
            }
            else {
                    Coordinates coordinates =  new Coordinates(Integer.parseInt(x), Integer.parseInt(y));
                    model.addWalls(coordinates);
            }
        }

        return super.visitWallStatement(ctx);
    }

    @Override
    public Object visitCrateStatement(RobotLevelMakerParser.CrateStatementContext ctx) {
        int xdim = Integer.parseInt(ctx.XDIM().get(0).getText());
        int ydim = Integer.parseInt(ctx.XDIM().get(1).getText());
        Model model = controller.getModel();
        Coordinates coordinates =  new Coordinates(xdim, ydim);
        model.addCrates(coordinates);
        return super.visitCrateStatement(ctx);
    }
}
