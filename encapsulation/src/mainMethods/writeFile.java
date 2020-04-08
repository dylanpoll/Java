package mainMethods;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Formatter;

public class writeFile {
	
public static void writeAFile()throws IOException{
	//RunTimeData RunTime = RunTimeData.getRunTime();
	Formatter file;
	file = new Formatter("SaveData.txt");
	FileWriter fileWriter = new FileWriter("SaveData.txt");
	PrintWriter printWriter = new PrintWriter(fileWriter);
	System.getProperty("line.separator");
	//printWriter.print(RunTime.toString());
	//file.format(RunTime.toString());
	//file.format(" : %d", age); example file.format("x");
	file.close();
	printWriter.close();
	fileWriter.close();
}	
public static void usingFileChannel() throws IOException 
{
    String fileContent = "text";
    RandomAccessFile stream = new RandomAccessFile("SaveData.txt", "rw");
    FileChannel channel = stream.getChannel();
    byte[] strBytes = fileContent.getBytes();
    ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
    buffer.put(strBytes);
    buffer.flip();
    channel.write(buffer);
    stream.close();
    channel.close();
}
}//end class
