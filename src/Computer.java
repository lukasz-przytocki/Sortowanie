public class Computer implements Comparable<Computer> {
    private String computerName;
    private int cpuSpeed;
    private int ramMem;

    public Computer(String computerName, int cpuSpeed, int ramMem) {
        this.computerName = computerName;
        this.cpuSpeed = cpuSpeed;
        this.ramMem = ramMem;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public int getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(int cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public int getRamMem() {
        return ramMem;
    }

    public void setRamMem(int ramMem) {
        this.ramMem = ramMem;
    }

    @Override
    public int compareTo(Computer comp) {
        return this.computerName.compareTo(comp.computerName);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerName='" + computerName + '\'' +
                ", cpuSpeed=" + cpuSpeed +
                ", ramMem=" + ramMem +
                "}\n";
    }
}
