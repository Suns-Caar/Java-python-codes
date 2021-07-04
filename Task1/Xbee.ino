/* Input-side (button) Arduino code */
#include "SoftwareSerial.h"
// RX: Arduino pin 2, XBee pin DOUT.  TX:  Arduino pin 3, XBee pin DIN
SoftwareSerial XBee(2, 3);
int BUTTON = 8;

void setup()
{
  // Baud rate MUST match XBee settings (as set in XCTU)
  pinMode(BUTTON, INPUT);
  XBee.begin(9600);
}

void loop()
{
  if (digitalRead(BUTTON) == HIGH)
  {
    XBee.write('H');
    delay(50);
  }
}

//xbees need to be configured and tested in XCTU


/* Output-side (LED) Arduino code */
#include "SoftwareSerial.h"
// RX: Arduino pin 2, XBee pin DOUT.  TX:  Arduino pin 3, XBee pin DIN
SoftwareSerial XBee(2, 3);
int LED = 9;

void setup()
{
 
  XBee.begin(9600);
  pinMode(LED, OUTPUT);
}

void loop()
{
  if (XBee.available())  
  { 
    char c = XBee.read();
    if (c == 'H')
    {
      digitalWrite(LED, HIGH);
      delay(50);
    }
    else
    {
      digitalWrite(LED, LOW);
    }
  }
  else
  {
    digitalWrite(LED, LOW);
  }
}
