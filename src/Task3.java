import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        FileReader file = new FileReader("input.txt");
        BufferedReader reader = new BufferedReader(file);

        String[] firstLine = reader.readLine().split(" ");
        int vectorSize = Integer.parseInt(firstLine[0]);
        int clustersCount = Integer.parseInt(firstLine[1]);
        int iterationsCount = Integer.parseInt(firstLine[2]);
        int vectorsCount = Integer.parseInt(firstLine[3]);

        float[] vectors = new float[vectorSize];
        if (clustersCount > 0 && vectorsCount > clustersCount) {
            while (reader.ready()) {
                String[] vectorValues = reader.readLine().split(" ");
                for (int i = 0; i < vectorValues.length; i++) {
                    String[] vectorSizeValues = vectorValues[i].split(",");
                    for (int j = 0; j < vectorSizeValues.length; j++) {
                        float parsedValue = Float.parseFloat(vectorSizeValues[i]);
                        vectors[j] = parsedValue;
                    }
                }
            }
        } else {
            throw new Error("Incorrect values for clusters count and vectors count");
        }

        reader.close();
    }
}
