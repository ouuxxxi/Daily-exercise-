package March;
//成绩排序

import java.util.*;

//学生类
 class Student {
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

}

public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int option = sc.nextInt();

            //添加学生到序列中
            List<Student> list = new ArrayList<>();

            for (int i = 0; i < num  ; i++) {
                Student student = new Student(sc.next(),sc.nextInt());
                list.add(student);
            }

            //用Collections.sort(List list，Comparator c) 方法实现排序

           //降序
            if(option==0)
            {
                Collections.sort(list, new Comparator<Student>()
                {
                    public int compare(Student stu1,Student stu2)
                    {
                        return stu2.score-stu1.score;
                    }
                });
            }
            else if(option==1)//升序
            {
                Collections.sort(list, new Comparator<Student>()
                {
                    public int compare(Student stu1,Student stu2)
                    {
                        return stu1.score-stu2.score;
                    }
                });
            }

            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i).name+" "+list.get(i).score);
            }

        }

    }

}
