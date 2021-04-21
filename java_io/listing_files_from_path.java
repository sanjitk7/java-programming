import java.io.*;

public class listing_files_from_path {
    public static void main(String[] args) {
        File f = new File("/Users/sanjitkumar/personal_projects/ExperimentingLearning");
        String filenames[] = f.list();
        for (String filename : filenames) {
            System.out.println(filename);
        }
    }
}
