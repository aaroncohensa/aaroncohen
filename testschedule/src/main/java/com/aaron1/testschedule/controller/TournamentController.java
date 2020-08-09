package com.aaron1.testschedule.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.aaron1.testschedule.model.TournamentModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
// @RequestMapping(value ={"schedule" , "tournaments"})
@CrossOrigin
public class TournamentController {

    static ArrayList<com.aaron1.testschedule.model.TournamentModel> tournArray ; //creating array of tournament object

    public TournamentController(){
        tournArray = new ArrayList<com.aaron1.testschedule.model.TournamentModel>();
        createTournArray();
    }

    
    public static ArrayList<com.aaron1.testschedule.model.TournamentModel> createTournArray(){
        int NUM_TOURNS=64;
        FileInputStream fis = null;   //obtaining bytes from the file
        try {
            fis = new FileInputStream(new File("/Users/aaroncohen/Documents/TestScheduleVS/testschedule/src/main/java/com/resources/ATP2020ScheduleUpdate.xlsx"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //creating Workbook instance that refers to .xlsx file
        XSSFWorkbook wb = null;
        try {
            wb = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = wb.getSheetAt(0);
        Iterator<Row> itr = sheet.iterator();
        double [] weekNo = new double [NUM_TOURNS];
        String [] tournName = new String [NUM_TOURNS];
        double [] prizeMoney = new double [NUM_TOURNS];
        double [] points = new double [NUM_TOURNS];
        double [] longiArray = new double [NUM_TOURNS];
        double [] latArray = new double [NUM_TOURNS];
//        double [] tOpt3 = new double [NUM_TOURNS];
        int [] tournIDs = new int [NUM_TOURNS];
        while (itr.hasNext())
        {
            Row row = itr.next();
            Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
            int i=0;
            int x=0;
            int y=0;
            int z=0;
            int w=0;
            int v=0;
            int a=0;
            int p=0;

            while (cellIterator.hasNext()) // populate all data arrays
            {

                Cell cell = cellIterator.next();
                int rowNumb = row.getRowNum();
                switch (rowNumb)
                {
                    case 0:    //field that represents string cell type
                        int idAtCell = (int)cell.getNumericCellValue();
                        tournIDs[p]=idAtCell;
                        p++;
                        break;
                    case 1:    //field that represents string cell type
                        double numAtCell = cell.getNumericCellValue();
                        weekNo[i]=numAtCell;
                        i++;
                        break;
                    case 2:    //field that represents number cell type
                        String name =cell.getStringCellValue();
                        tournName[x] = name;
                        x++;
                        break;
                    case 3:
                        double doubAtCell = cell.getNumericCellValue();
                        prizeMoney[y]=doubAtCell;
                        y++;
                        break;
                    case 4:
                        double digAtCell = cell.getNumericCellValue();
                        points[z]=digAtCell;
                        z++;
                        break;
                    case 5:
                        String doubLongStr = cell.getStringCellValue();
                        double doubLong = Double.parseDouble(doubLongStr);
                        longiArray[w]=doubLong;
                        w++;
                        break;
                    case 6:
                        String doubLatStr = cell.getStringCellValue();
                        double doubLat = Double.parseDouble(doubLatStr);
                        latArray[v]=doubLat;
                        v++;
                        break;
                }
            }
        }


        for(int b =0 ; b<NUM_TOURNS ; b++){
            tournArray.add(new com.aaron1.testschedule.model.TournamentModel(tournIDs[b] ,(int)weekNo[b] , tournName[b] ,(int) prizeMoney[b] , (int)points[b] , longiArray[b] , latArray[b]));
        }

        return tournArray;
    }

    public static String getTournName(int tournID){
        com.aaron1.testschedule.model.TournamentModel tourn = tournArray.get(tournID);
        String tourName = tourn.getName();
        return tourName;
    }

    @RequestMapping( "tournaments")
    public ArrayList<TournamentModel> mapList(){
        

        return tournArray;
    }  

    @RequestMapping( "schedule")
    public ArrayList<TournamentModel> optMapList(){
        com.aaron1.testschedule.controller.EdgeWeightedDigraph digraph = new com.aaron1.testschedule.controller.EdgeWeightedDigraph(tournArray);
        DijkstraSP sp = new DijkstraSP(digraph, 0);
        String optPath = sp.pathTo(63).toString();
        String [] optArray = optPath.split(",");
        ArrayList<TournamentModel> tournList = new ArrayList<TournamentModel>();
        for(int i = 0; i<optArray.length ; i++){
            String name = optArray[i];
            name = name.replaceAll("\\s+","");
            for(int j=0; j< tournArray.size();j++){
                TournamentModel model = tournArray.get(j);
                String tname = model.getName();
                tname = tname.replaceAll("\\s+","");
                if(name.equals(tname)){
                    tournList.add(model);
                }

            }
        }

        
        return tournList;
    }

    

    @RequestMapping( "oppSchedule")
    public static ArrayList<TournamentModel> oppTournArray(){
        com.aaron1.testschedule.controller.OppEdgeWeightedDigraph oppDigraph = new com.aaron1.testschedule.controller.OppEdgeWeightedDigraph(
                tournArray);
        oppDijkstraSP lp = new oppDijkstraSP(oppDigraph, 0);
        String lPath = lp.pathTo(63).toString();
        String [] lPathArray = lPath.split(",");

        ArrayList<TournamentModel> tournList1 = new ArrayList<TournamentModel>();
        for(int i = 0; i<lPathArray.length ; i++){
            String name = lPathArray[i];
            name = name.replaceAll("\\s+","");
            for(int j=0; j< tournArray.size();j++){
                TournamentModel model = tournArray.get(j);
                String tname = model.getName();
                tname = tname.replaceAll("\\s+","");
                if(name.equals(tname)){
                    tournList1.add(model);
                }

            }
        }

        
        return tournList1;
    }

    @RequestMapping("schedule-details")
    public long[] scheduleDetails(){
        ArrayList<TournamentModel> optList = optMapList();
        long[] dets = new long[3];
        long totalMoney = 0;
        long totalPoints = 0;
        for(int i=0;i<optList.size(); i++){
            if(i%2 == 0 || i==65){
                TournamentModel tour = optList.get(i);
                totalMoney += tour.tMoney;
                totalPoints += tour.tPoints;
            }

        }
        ArrayList<TournamentModel> optList1 = new ArrayList<>();
        for(int j=0;j<optList.size(); j++){
            if(j%2 == 0 || j==65){
                TournamentModel tour = optList.get(j);
                optList1.add(tour);
            }
        }
        double totalDistance =0;
        int y = 1;
        for(int x=0 ; x < optList1.size() -1 ; x++ ){
            TournamentModel tourn1 = optList1.get(x);
            TournamentModel tourn2 = optList1.get(y);
            totalDistance = totalDistance + EdgeWeightedDigraph.distanceCoOrdsFormula(tourn1.longitude, tourn1.latitude, tourn2.longitude, tourn2.latitude);
        }
        long tDistance = (new Double(totalDistance)).longValue();
        dets[0] = totalMoney;
        dets[1] = totalPoints;
         dets[2] = tDistance;

        return dets;

    }

    @RequestMapping("opp-schedule-details")
    public long[] oppScheduleDetails(){
        ArrayList<TournamentModel> optList = oppTournArray();
        long[] dets = new long[3];
        int totalMoney = 0;
        int totalPoints = 0;
        for(int i=0;i<optList.size(); i++){
            if(i%2 == 0 || i==65){
                TournamentModel tour = optList.get(i);
                totalMoney += tour.tMoney;
                totalPoints += tour.tPoints;
            }

        }
        ArrayList<TournamentModel> optList1 = new ArrayList<>();
        for(int j=0;j<optList.size(); j++){
            if(j%2 == 0 || j==65){
                TournamentModel tour = optList.get(j);
                optList1.add(tour);
            }
        }
        double totalDistance =0;
        int y = 1;
        for(int x=0 ; x < optList1.size() -1 ; x++ ){
            TournamentModel tourn1 = optList1.get(x);
            TournamentModel tourn2 = optList1.get(y);
            totalDistance = totalDistance + EdgeWeightedDigraph.distanceCoOrdsFormula(tourn1.longitude, tourn1.latitude, tourn2.longitude, tourn2.latitude);
        }
        long tDistance = (new Double(totalDistance)).longValue();
        dets[0] = totalMoney;
        dets[1] = totalPoints;
        dets[2] = tDistance;

        return dets;

    }
    
}
