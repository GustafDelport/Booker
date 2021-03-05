package DataAccessLayer.Handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DataAccessLayer.DataObjets.Decorations;
import DataAccessLayer.DataObjets.Menu;

public class LogisticsHandler {

    public LogisticsHandler() {
    }

    public List<Menu> getFood() throws FileNotFoundException {
        List<Menu> mList = new ArrayList<Menu>();

        File file = new File(System.getProperty("user.dir") + "\\DataAccessLayer\\TextFiles\\" +"Food.txt");

        Scanner iScanner = new Scanner(file);

        while (iScanner.hasNextLine()) {
            String[] line = iScanner.nextLine().split(",");
            mList.add(new Menu(Integer.parseInt(line[0]), line[1], line[2], line[3]));
        }

        iScanner.close();

        return mList;
    }

    public List<Decorations> getDecorations() throws FileNotFoundException {
        List<Decorations> dList = new ArrayList<Decorations>();

        File file = new File(System.getProperty("user.dir") + "\\DataAccessLayer\\TextFiles\\" +"Decorations.txt");

        Scanner iScanner = new Scanner(file);

        while (iScanner.hasNextLine()) {
            String[] line = iScanner.nextLine().split(",");
            dList.add(new Decorations(Integer.parseInt(line[0]), line[1]));
        }

        iScanner.close();

        return dList;
    }
}
