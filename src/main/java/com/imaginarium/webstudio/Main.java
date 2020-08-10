package com.imaginarium.webstudio;

import com.imaginarium.webstudio.minimumСost.node.NodeInGraph;
import com.imaginarium.webstudio.minimumСost.service.DijkstrasAlgorithm;
import com.imaginarium.webstudio.minimumСost.service.DijkstrasAlgorithmImpl;
import com.imaginarium.webstudio.minimumСost.service.NodeService;
import com.imaginarium.webstudio.minimumСost.service.NodeServiceImpl;

import java.util.HashMap;

public class Main {
    public static void main(String []args){
        NodeService nodeService = new NodeServiceImpl();
        DijkstrasAlgorithm dijkstrasAlgorithm = new DijkstrasAlgorithmImpl();
        HashMap <Integer,NodeInGraph> nodeMap = nodeService.createNodeMap(4);
        System.out.println(nodeMap);
        for (int key: nodeMap.keySet()){
            System.out.println(nodeMap.get(key).getIndexNodeAndCost());
        }
        dijkstrasAlgorithm.addGraphMap(nodeMap);

        System.out.println(dijkstrasAlgorithm.getMinimumPathLength(nodeMap.get(1),nodeMap.get(4)));


    }


}
