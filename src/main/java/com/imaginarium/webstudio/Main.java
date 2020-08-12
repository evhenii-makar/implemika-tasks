package com.imaginarium.webstudio;

import com.imaginarium.webstudio.task1.Bracket;
import com.imaginarium.webstudio.task2.node.NodeInGraph;
import com.imaginarium.webstudio.task2.service.*;
import com.imaginarium.webstudio.task3.FactorialSumm;

import java.util.HashMap;

public class Main {
    public static void main(String []args){

        // Task 1
        Bracket bracket = new Bracket();
        bracket.startInputFromConsole();

        //Task2
        NodeService nodeService = new NodeServiceImpl();
        StartTaskTwo startTask = new StartTaskTwoImpl();
        HashMap <Integer,NodeInGraph> nodeMap = nodeService.createNodeMap(50);
        //System.out.println(nodeMap);
        System.out.println(startTask.startTask(2,nodeMap.size(),nodeMap, nodeMap.get(1).getName(), nodeMap.get(nodeMap.size()).getName()));

        //Task2
        FactorialSumm factorialSumm = new FactorialSumm();
        System.out.println(factorialSumm.getFactorialSumm(100));








    }




}
