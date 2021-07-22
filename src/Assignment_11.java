import java.util.HashMap;
import java.io.* ;

public class Assignment_11
{
    HashMap<Character , Integer > map = new HashMap<>() ;
    String file_name ;
    public Assignment_11(String name)
    {
        file_name = name ;
    }

    public void writeAndSaveFile() throws IOException
    {
        File file =new File(file_name);
        FileWriter fwrite=new FileWriter(file);
        fwrite.write(map.toString());
        fwrite.close();
    }

    public void char_Freequency() throws IOException
    {
        String file_path = "/home/knowledge-kingdom/IdeaProjects/Java-Seperate-Assignments" + file_name ;
        FileReader fr = new FileReader(file_path) ;
        int index = fr.read() ;

        while(index!= -1)
        {
            if(!Character.isWhitespace((char) index))
            {
                if(map.containsKey((char) index))
                {
                    map.put((char)index , map.get((char) index) + 1) ;
                }
                else
                {
                    map.put((char) index , 1) ;
                }
            }
            index = fr.read() ;
        }
        writeAndSaveFile() ;
    }
    public static void main(String[] args)
    {
        //  Insert main code accordingly top call the above methods.
    }
}
