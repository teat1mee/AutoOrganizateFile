import java.io.File;
import java.util.Scanner;

public class AutoOrganizateFile {
    

    //private static final String USERHOME = System.getProperty("user.home");
    //private static final String FILEPATH = USERHOME + "/Загрузки";
    //private static final String FILEIMAGE = USERHOME + "/Изображения";
    //private static final String FILEDOC = USERHOME + "/Документы";
    //private static final String FILEARCHIVE = USERHOME + "/Архивы";
    
    // -------------- <use your languageFolder> -------------- //

     private static final String FILEPATH = USERHOME + "/Downloads";
     private static final String FILEIMAGE = USERHOME + "/Pictures";
     private static final String FILEDOC = USERHOME + "/Documents";
     private static final String FILEARCHIVE = USERHOME + "/Archive";

    public static void main(String[] args) {

        File dir = new File(FILEPATH);
        File images = new File (FILEIMAGE);
        File doc = new File (FILEDOC);
        File archive = new File(FILEARCHIVE);

        Scanner scan = new Scanner(System.in);


        if (!dir.exists()||!dir.isDirectory()){
            System.err.println("folder not found" + FILEPATH);
            scan.close();
            return ;
        }

        if (!images.exists() || !images.isDirectory()){
            System.err.println("image folder not found" + FILEIMAGE);
            System.out.println("create new folder <images> " + dir.getName()+ " y/n?");
            String input = scan.nextLine().trim().toLowerCase();

            if (input.equals("y")|| input.equals("Y")){
                if(!images.mkdir()){
                    System.err.println("folder <images> not created");     
                    scan.close();               
                    return;
                }
                System.out.println("folder <images> created");
            } else {
                System.err.println("work is impossible without a folder <images>");
                scan.close();
                return ;
            } 
        }

        if (!doc.exists() || !doc.isDirectory()){
            System.err.println("doc folder not found" + FILEDOC);
            System.out.println("create new folder <doc> in " + dir.getName() + " y/n?");
            String input = scan.nextLine().trim().toLowerCase();

            if (input.equals("y")|| input.equals("Y")){
                if(!doc.mkdir()){
                    System.err.println("folder <doc> not created");
                    scan.close();
                    return;
                }
                System.out.println("folder <doc> created");
            } else {
                System.err.println("work is impossible without a folder <doc>");
                scan.close();
                return ;
            } 
        }

        if (!archive.exists() || !archive.isDirectory()){
            System.err.println("archive folder not found" + FILEARCHIVE);
            System.out.println("create new folder <archive> in " + dir.getName() + " y/n?");
            String input = scan.nextLine().trim().toLowerCase();

            if (input.equals("y")|| input.equals("Y")){
                if(!archive.mkdir()){
                    System.err.println("folder <archive> not created");
                    scan.close();
                    return;
                }
                System.out.println("folder <archive> created");
            } else {
                System.err.println("work is impossible without a folder <archive>");
                scan.close();
                return ;
            } 
        }

        File[] files = dir.listFiles((file) -> 
            file.isFile() && (
                file.getName().toLowerCase().endsWith(".png") ||
                file.getName().toLowerCase().endsWith(".jpg") || 
                file.getName().toLowerCase().endsWith(".jpeg") || 
                file.getName().toLowerCase().endsWith(".gif") ||
                file.getName().toLowerCase().endsWith(".doc") ||
                file.getName().toLowerCase().endsWith(".zip") ||
                file.getName().toLowerCase().endsWith(".txt") ||
                file.getName().toLowerCase().endsWith(".rpm") ||
                file.getName().toLowerCase().endsWith(".jar") ||
                file.getName().toLowerCase().endsWith(".tar")
            )
        );

        if (files == null || files.length == 0){
            System.out.println("Folder empty!");
            return;
        }

        for (File file: files){
            String nameFormat = file.getName().toLowerCase();

            if (
                nameFormat.endsWith(".png") 
                || nameFormat.endsWith(".jpeg") 
                || nameFormat.endsWith(".gif")
                || nameFormat.endsWith(".jpg")){

                    File dest = new File(images,file.getName());

                    if (file.renameTo(dest)){
                        System.out.println(file.getName() + "moved in folder <images> " + images.getName());
                    } else {
                        System.out.println(file.getName()+ "ERROR file don't move in folder <images> " + images.getName());
                    }
                }

             if (nameFormat.endsWith(".doc")||
                nameFormat.endsWith(".txt")
                ) {
                    File dest = new File(doc,file.getName());

                    if (file.renameTo(dest)){
                        System.out.println(file.getName() + "moved in folder <doc> " + doc.getName());
                    } else {
                        System.out.println(file.getName()+ "ERROR file don't move in folder <doc>" + doc.getName());
                    }

                }if (nameFormat.endsWith(".zip")||
                nameFormat.endsWith(".jar") || nameFormat.endsWith(".rpm") || nameFormat.endsWith(".")
                ) {
                    File dest = new File(doc,file.getName());

                    if (file.renameTo(dest)){
                        System.out.println(file.getName() + "moved in folder <doc> " + doc.getName());
                    } else {
                        System.out.println(file.getName()+ "ERROR file don't move in folder <doc>" + doc.getName());
                    }
                }

        }
        scan.close();
        System.out.println("☕ Done");
    }
}
