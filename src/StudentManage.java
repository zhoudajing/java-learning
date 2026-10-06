import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class StudentManage {
    private static void addStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入学号：");
        int id = sc.nextInt();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();

        Student student = new Student(name, id, age); // 调用全参构造
        students.add(student); // 存进 ArrayList
        System.out.println("添加成功！");
    }
    private static void deleteStudent(ArrayList<Student> students, Scanner input) {
        System.out.print("请输入要删除的学生学号：");
        int delId = input.nextInt();

        // 设置一个标记，看看有没有找到这个学生
        boolean isFound = false;

        // 遍历花名册
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            // 如果这个学生的学号，和用户输入的学号一样
            if (s.getId() == delId) {
                students.remove(i);
                isFound=true;
                System.out.println("学号 " + delId + " 的学生已删除！");
                break; // 找到并删除后，立刻结束循环（不用再找后面的了）
            }
        }

        // 如果循环结束了，标记还是 false，说明没找到
        if (!isFound) {
            System.out.println("未找到学号为 " + delId + " 的学生，请检查学号！");
        }
    }
    static ArrayList<Student> students =new ArrayList<>();
    public static void loadData(){
        try(BufferedReader br=new BufferedReader (new FileReader("students.txt"))){
            String line;
            while ((line=br.readLine())!=null){
                String[] parts=line.split(",");
                if(parts.length!=3){
                    System.out.println("这一行数据有问题，跳过");
                    continue;
                }
                int id=Integer.parseInt(parts[1].trim());
                int age=Integer.parseInt(parts[2].trim());
                String name=parts[0].trim();
                Student s=new Student(name,id,age);
                students.add(s);
            }
            System.out.println("成功加载 " + students.size() + " 条历史数据！");
        }catch(IOException e){
            System.out.println("还没有历史数据，我们开始新建吧！");
        }


    }

    public static void saveData(ArrayList<Student> students){
        try{
            BufferedWriter bw =new BufferedWriter(new FileWriter("students.txt"));
            for(int i=0;i<students.size();i++){
                Student s=students.get(i);
                bw.write(s.getName()+","+s.getId()+","+s.getAge());
                bw.newLine();
            }
            bw.close();
            System.out.println("数据保存成功");
        }catch (IOException e){
            System.out.println("数据保存失败");
            e.printStackTrace();
        }

    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        loadData(); // 或者你的方法名 LoadData()
        while(true){
            System.out.println("--- 学生管理系统 ---");
            System.out.println("1. 添加学生");
            System.out.println("2. 查询学生");
            System.out.println("3. 删除学生");
            System.out.println("4. 修改学生"); // 新增
            System.out.println("5. 退出");
            System.out.println("6. 保存数据");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    addStudent(students, input);
                    break;
                case 2:
                    if (students.size() == 0) {
                        System.out.println("暂无学生数据，请先添加！");
                    } else {
                        System.out.println("姓名\t学号\t年龄");
                        for (int i = 0; i < students.size(); i++) {
                            Student s = students.get(i);
                            System.out.println(s); // 因为写了 toString，直接打印 s 即可
                        }
                    }
                    break;
                case 3:
                    deleteStudent(students, input);
                    break;
                    case 4:
                        System.out.print("请输入你要修改的学号");
                       int updateId=input.nextInt();
                        boolean isUpdate=false;
                        for(int i=0;i<students.size();i++){
                            Student s=students.get(i);
                            if(s.getId()==updateId){
                                System.out.print("请输入新的姓名：");
                                String newName=input.next();
                                System.out.print("请输入新的年龄：");
                                int newAge=input.nextInt();
                                s.setAge(newAge);
                                s.setName(newName);
                                System.out.println("修改成功！");
                                isUpdate=true;

                            }
                        }
                        if (!isUpdate) {
                            System.out.println("未找到学号为 " + updateId + " 的学生。");
                        }
                        break;
                case 5:
                    System.out.print("退出系统");
                    System.exit(0);
                case 6:
                    saveData(students); // 注意：你的 ArrayList 变量名可能是 students 也可能是 list，看你的代码
                    break;
                default:
                    System.out.print("输出有误，请重新输入");

            }
        }
    }
}
