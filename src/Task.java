public class Task {
    private String name;
    private String desc;
    private int priority;

    public Task(String name, String desc, int priority) {
        this.name = name;
        this.desc = desc;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "{" +
                 name +
                ", desc='" + desc + '\'' +
                ", priority=" + priority +
                '}';
    }

}
