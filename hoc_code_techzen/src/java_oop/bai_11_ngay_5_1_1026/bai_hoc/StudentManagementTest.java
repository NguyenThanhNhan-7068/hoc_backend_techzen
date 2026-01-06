package java_oop.bai_11_ngay_5_1_1026.bai_hoc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentManagementTest {
    private static final Logger loger = Logger.getLogger(StudentManagementTest.class.getName());

    private static final String File_Test = "hoc_code_techzen/src/java_oop/bai_11_ngay_5_1_1026/bai_hoc/data/student.csv";

    public static void main(String[] args) throws IOException {
        showList();
        create();
        showList();

    }

    public static List<Student> readFile(String path){
        File file = new File(path);
        List<Student> students = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            bufferedReader.readLine();

            Student student;
            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                student = new Student();
                student.setId(data[0]);
                student.setName(data[1]);
                student.setScore(Double.parseDouble(data[2]));

                students.add(student);
            }

        }
         catch (IOException e) {
            loger.log(Level.SEVERE, "loi khi doc file");
        }
        return students;
    }

    private static void showList(){
        List<Student> students = readFile(File_Test);
        for (Student s : students){
            System.out.println("thong tin sinh vien thu "+ s.getId());
            s.output();
        }
    }

    private static void writeFile(List<Student> students) throws IOException {
        StringBuilder sb = new StringBuilder("id,name,score");

        for (Student student : students){
            sb.append("\n").append(student.toString());
        }
        File file = new File(File_Test);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(sb.toString());
        }
        catch (IOException e){
            loger.log(Level.SEVERE, ">>>>> Lỗi khi ghi file", e);
        }

    }

    public static void create() throws IOException {
        List<Student> students = readFile(File_Test);

        Student student = new Student();
        student.input();
        students.add(student);

        writeFile(students);
    }



}
