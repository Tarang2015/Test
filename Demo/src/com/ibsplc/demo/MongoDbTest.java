package com.ibsplc.demo;

import com.mongodb.*;


public class MongoDbTest {
    public static void main(String args[]){

        MongoClient mongo = new MongoClient("localhost", 27017);
        DB db = mongo.getDB("Test");
        DBCollection collection = db.getCollection("employee");
       // System.out.println("BasicDBObject example...");
        BasicDBObject document = new BasicDBObject();
     /* document.put("database", "Test");
       document.put("table", "employee"); */

        BasicDBObject documentDetail = new BasicDBObject();
        documentDetail.put("empId", "10003");
        documentDetail.put("empName", "Dinesh6");
        documentDetail.put("salary", "700007");
        document.put("detail", documentDetail);
        collection.insert(document);

        DBCursor cursorDoc = collection.find();
        while (cursorDoc.hasNext()) {
            System.out.println(cursorDoc.next());
        }



    }
}
