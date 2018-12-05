package fr.univtln.acaron217;


import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("Hohoquestcequonsamuse!");
    }
}
