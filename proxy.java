public class proxy {

    public static abstract class subject {
        public abstract void dosomework();
    }

    public static class concretesubject extends subject {
        public concretesubject() {}
        
        @Override
        public void dosomework() {
            System.out.println("The dosomework() is executed");
        }
    }

    public static class proxyclass extends subject {
        // private subject s1;
        private concretesubject s1;

        public proxyclass() {
            if (s1 == null) {
                s1 = new concretesubject();
            }
        }

        @Override
        public void dosomework() {
            System.out.println("Proxy is happening now");
            s1.dosomework();
        }
    }

    public static class client {
        public static void main(String[] args) {
            subject p1 = new proxyclass();
            p1.dosomework();
        }
    }
}
