
  package sample.fx;

import java.io.*;
import java.util.HashMap;

public class wordDictionary {

    HashMap<String,String> wordlist;
    wordDictionary(){
        this.wordlist=new HashMap<>();

    }
    void addword(String word,String Meaning){
        wordlist.put(word,Meaning);
    }
    HashMap<String,String> getWordlist(){
        return wordlist;
    }
    void serializemap(){
        try{
            FileOutputStream os=new FileOutputStream("wordlist2");
            ObjectOutputStream oos=new ObjectOutputStream(os);
            oos.writeObject((wordlist));
            oos.close();
            os.close();
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }
    void deserializemap(){
        try{
        FileInputStream is=new FileInputStream("wordlist2");
        ObjectInputStream ois=new ObjectInputStream(is);
        wordlist=(HashMap<String,String>)ois.readObject();
    }
    catch(IOException io){

        io.printStackTrace();
    }
    catch(ClassNotFoundException ex){
            System.out.println("class not found");

    }
}
}
