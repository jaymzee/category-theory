public class TestSwitch {
    public static void main(String args[]) {
        Switch sw1 = new Switch(){
            private boolean sw;
            public boolean isOn() { return sw; }
            public void turnOn() { sw = true; }
            public void turnOff() { sw = false; }
        };
        sw1.turnOn();
    }
}
