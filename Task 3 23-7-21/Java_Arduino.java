
import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortEvent;
import jssc.SerialPort;

import java.io.SerializablePermission;
Y
public class Java_Arduino {
    public static void main(String[] args) throws SerialPortException {
        SerialPort port = new SerialPort("/dev/ttyUSB0");
        port.openPort();

        port.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        port.addEventListener((SerialPortEvent event)->{
            if(event.isRXCHAR()) {

                try {
                    String s = port.readString();
                    System.out.print(s);
                } catch (SerialPortException e) {
                    e.printStackTrace();
                }

            }

        });
    }
}
