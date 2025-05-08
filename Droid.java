public class Droid {
  public String droidName;
  public int batteryLevel;

  public Droid(String dn) {
    droidName = dn;
    batteryLevel = 100;
  }
  public String toString() {
    return "Hello I am droid: " + droidName;
  }

  public void performTask(String task) {
    batteryLevel -= 10;
    System.out.println(droidName + " is performing task: " + task);
  }

  public int energyReport() {
    return batteryLevel;
  }
  // public int energyTransfer() {}
  public static void main(String[] args) {
    Droid droid1 = new Droid("Codey");

    System.out.println(droid1);

    droid1.performTask("Run");
    droid1.performTask("Walk");
  }
}
