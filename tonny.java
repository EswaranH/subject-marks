import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubMarks {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of subjects: ");
        String input = reader.readLine();
        int numSubjects = Integer.parseInt(input);
       
       
        int[] subMarks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            input = reader.readLine();
            subMarks[i] = Integer.parseInt(input);
        }

        System.out.println("Sub marks are: ");
        for (int mark : subMarks) {
            System.out.print(mark + " ");
        }
    }
}