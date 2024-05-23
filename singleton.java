// Eager initialization
class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}

// Lazy initialization
class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

public class singleton {
    public static void main(String[] args) {
        // Eager initialization
        // SingletonEager s1 = SingletonEager.getInstance();
        // SingletonEager s2 = SingletonEager.getInstance();
        // System.out.println(s1==s2);

        // Lazy initialization
        SingletonLazy s1 = SingletonLazy.getInstance();
        SingletonLazy s2 = SingletonLazy.getInstance();
        System.out.println(s1 == s2);
    }
}
