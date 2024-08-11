public class MySingletonClass {
    public MySingletonClass instance;
    private MySingletonClass() {
    }
    public MySingletonClass getInstance() {
        if (this.instance == null) {
            this.instance = new MySingletonClass();
        }
            return this.instance;
    }
}
