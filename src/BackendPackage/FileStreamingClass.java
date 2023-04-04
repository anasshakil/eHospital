package BackendPackage;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FileStreamingClass {

    private JFrame parentFrame;

    public FileStreamingClass(JFrame frame) {
        parentFrame = frame;
    }
    private String oldIpFromFile;

    public String loadOldIp() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Local\\_HMSIP_.dat"));
            String dataFromFile = "";
            while ((dataFromFile = bufferedReader.readLine()) != null) {
                oldIpFromFile = dataFromFile;
            }
            bufferedReader.close();
            return oldIpFromFile;
        } catch (FileNotFoundException e) {
            try {
                new File("c:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Local\\_HMSIP_.dat").createNewFile();
            } catch (Exception ex) {JOptionPane.showMessageDialog(parentFrame, ex.getMessage());
            }
        } catch (Exception ez) {JOptionPane.showMessageDialog(parentFrame, ez.getMessage());
        }
        return "false";
    }

    public String setNewIp(String newIP) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Local\\_HMSIP_.dat"));
            bufferedWriter.write(newIP);
            bufferedWriter.close();
            return loadOldIp();
        } catch (Exception e) {JOptionPane.showMessageDialog(parentFrame, e.getMessage());
        }
        return "false";
    }

    public boolean offlineSavePrescription(ArrayList<String> names, ArrayList<String> strength, ArrayList<String> totalDayDuration,
            ArrayList<String> totalDayCycle) {
        try {
            String fileName = JOptionPane.showInputDialog(parentFrame, "Enter the file name to save", "New File name");
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("c:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\" + fileName + ".txt")));
            bw.write("--Medicine Names--" + "       " + "--Strength--" + "       " + "--Day Duration--" + "       " + "--Total Days Cycle--");
            bw.newLine();
            for (int i = 0; i < names.size(); i++) {
                bw.write("--" + names.get(i) + "--       --" + strength.get(i) + "--       --" + totalDayCycle.get(i) + "--       --" + totalDayDuration.get(i) + "--");
                bw.newLine();
            }
            bw.close();
            return true;
        } catch (Exception e) {e.printStackTrace();
        }
        return false;
    }
}
