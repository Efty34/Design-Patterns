public class factory2 {
    public interface computer {
        public abstract String ram();
        public abstract String ssd();
        public abstract String cpu();
        public abstract boolean isGPUenabled();
        public abstract boolean isBTenabled();
    }

    public static class laptop implements computer {
        private String ram;
        private String hdd;
        private String cpu;
        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public laptop(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
            this.isGraphicsEnabled = isGraphicsEnabled;
            this.isBluetoothEnabled = isBluetoothEnabled;
        }

        @Override
        public String ram() {
            return this.ram;
        }

        @Override
        public String ssd() {
            return this.hdd;
        }

        @Override
        public String cpu() {
            return this.cpu;
        }

        @Override
        public boolean isGPUenabled() {
            return this.isGraphicsEnabled;
        }

        @Override
        public boolean isBTenabled() {
            return this.isBluetoothEnabled;
        }

        @Override
        public String toString() {
            return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
                    + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
        }
    }

    public static class server implements computer {
        private String ram;
        private String hdd;
        private String cpu;
        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public server(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
            this.isGraphicsEnabled = isGraphicsEnabled;
            this.isBluetoothEnabled = isBluetoothEnabled;
        }

        @Override
        public String ram() {
            return this.ram;
        }

        @Override
        public String ssd() {
            return this.hdd;
        }

        @Override
        public String cpu() {
            return this.cpu;
        }

        @Override
        public boolean isGPUenabled() {
            return this.isGraphicsEnabled;
        }

        @Override
        public boolean isBTenabled() {
            return this.isBluetoothEnabled;
        }

        @Override
        public String toString() {
            return "Server [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
                    + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
        }
    }

    public static class pc implements computer {
        private String ram;
        private String hdd;
        private String cpu;
        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public pc(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
            this.isGraphicsEnabled = isGraphicsEnabled;
            this.isBluetoothEnabled = isBluetoothEnabled;
        }

        @Override
        public String ram() {
            return this.ram;
        }

        @Override
        public String ssd() {
            return this.hdd;
        }

        @Override
        public String cpu() {
            return this.cpu;
        }

        @Override
        public boolean isGPUenabled() {
            return this.isGraphicsEnabled;
        }

        @Override
        public boolean isBTenabled() {
            return this.isBluetoothEnabled;
        }

        @Override
        public String toString() {
            return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
                    + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
        }
    }

    public static class computerFactory {
        public static computer getInstance(String type, String ram, String ssd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
            if (type.equals("laptop")) {
                return new laptop(ram, ssd, cpu, isGraphicsEnabled, isBluetoothEnabled);
            } else if (type.equals("server")) {
                return new server(ram, ssd, cpu, isGraphicsEnabled, isBluetoothEnabled);
            } else if (type.equals("pc")) {
                return new pc(ram, ssd, cpu, isGraphicsEnabled, isBluetoothEnabled);
            } else {
                throw new IllegalArgumentException("Unknown computer type: " + type);
            }
        }
    }

    public static class client {
        public static void main(String[] args) {
            computer laptop = computerFactory.getInstance("laptop", "4GB", "256GB", "Intel Core i5", false, true);
            System.out.println(laptop.toString());

            computer server = computerFactory.getInstance("server", "32GB", "1TB", "AMD Ryzen 9", true, false);
            System.out.println(server.toString());

            computer pc = computerFactory.getInstance("pc", "16GB", "512GB", "Intel Core i7", true, true);
            System.out.println(pc.toString());
        }
    }
}
