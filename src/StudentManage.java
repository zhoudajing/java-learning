import java.util.ArrayList;
import java.util.Scanner;
public class StudentManage {
    public static void main(String[] args){
        ArrayList<Student> students =new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("--- 学生管理系统 ---");
            System.out.println("1. 添加学生");
            System.out.println("2. 查询学生");
            System.out.println("3. 删除学生"); // 新增
            System.out.println("4. 退出");     // 原来的3变成4
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.print("请输入姓名：");
                    String name = input.next();
                    System.out.print("请输入学号：");
                    int id = input.nextInt();
                    System.out.print("请输入年龄：");
                    int age = input.nextInt();

                    Student student = new Student(name, id, age); // 调用全参构造
                    students.add(student); // 存进 ArrayList
                    System.out.println("添加成功！");
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
                    System.out.print("请输入要删除的学生学号：");
                    int delId = input.nextInt();

                    // 设置一个标记，看看有没有找到这个学生
                    boolean isFound = false;

                    // 遍历花名册
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        // 如果这个学生的学号，和用户输入的学号一样
                        if (s.getId() == delId) {
                            students.remove(i); // 从集合中删掉这个位置的学生
                            isFound = true; // 标记为“找到了”
                            System.out.println("学号 " + delId + " 的学生已删除！");
                            break; // 找到并删除后，立刻结束循环（不用再找后面的了）
                        }
                    }

                    // 如果循环结束了，标记还是 false，说明没找到
                    if (!isFound) {
                        System.out.println("未找到学号为 " + delId + " 的学生，请检查学号！");
                    }
                    break;
                case 4:
                    System.out.print("退出系统");
                    System.exit(0);
                default:
                    System.out.print("输出有误，请重新输入");

            }
        }
    }
}
