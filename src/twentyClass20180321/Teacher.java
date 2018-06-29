package twentyClass20180321;

import twentyClass20180321.twentyClassException.NameFormatException;

import java.util.Objects;

/**
 * 12.老师
 * @author tangweijr
 * @since 20180326
 */
public class Teacher {
    public static boolean youbianzhi = true;
    private String type;
    public int teachingAge;
    private String level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teachingAge == teacher.teachingAge &&
                Objects.equals(type, teacher.type) &&
                Objects.equals(level, teacher.level);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "type='" + type + '\'' +
                ", teachingAge=" + teachingAge +
                ", level='" + level + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        teacher.level = level;
        teacher.teachingAge = teachingAge;
        teacher.type = type;
        return teacher;
    }

    @Override
    public int hashCode() {
        return (level.hashCode() * 13 + teachingAge) * 13 + type.hashCode();
    }

    /**
     * 是否有编制
     */
    public static void bianzhi() {
        if (youbianzhi) {
            System.out.println("有编制的老师");
        } else {
            System.out.println("代课老师");
        }
    }

    /**
     * 无参数构造器
     */
    public Teacher() {
        this(null,0,null);
    }

    /**
     * 全参数构造器
     * @param type 学科类型
     * @param teachingAge 教龄
     * @param level 等级
     */
    public Teacher(String type, int teachingAge, String level) {
        this.type = type;
        this.teachingAge = teachingAge;
        this.level = level;
    }

    /**
     * 获得等级
     * @return
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设定等级
     * @param level
     */
    public void setLevel(String level) throws NameFormatException {
        if (level.equals("初级") || level.equals("中级") || level.equals("高级") || level.equals("te级")) {
            this.level = level;
        } else {
            throw new NameFormatException();
        }
    }

    /**
     * 上课
     */
    public void duringClass() {
        if (teachingAge < 2) {
            System.out.println("照着书本上课");
        } else if (teachingAge < 5) {
            System.out.println("照着ppt上课");
        } else if (teachingAge < 10) {
            System.out.println("无书胜有书，基本不用看就能上课");
        }
    }

    /**
     * 职称
     */
    public void jobTitle() {
        if (!type.equals("语文") || !type.equals("数学") || !type.equals("英语")) {
            if (teachingAge < 3) {
                level = "初级";
            } else if (teachingAge < 5) {
                level = "中级";
            } else if (teachingAge < 8) {
                level = "高级";
            } else if (teachingAge > 10 && type.equals("主任")) {
                level = "特级";
            }
        } else {
            if (teachingAge < 2) {
                level = "初级";
            } else if (teachingAge < 5) {
                level = "中级";
            }
        }
    }

    /**
     * 出试卷
     *
     * @return
     */
    public boolean editPapers() {
        if (level.equals("中级") || level.equals("高级") || level.equals("特级")) {
            if (teachingAge < 2) {
                System.out.println("只允许核对考卷");
            } else if (teachingAge < 5) {
                System.out.println("可以单独出试卷");
            } else {
                System.out.println("可以审核试卷");
            }
            return true;
        } else {
            return false;
        }
    }
}

