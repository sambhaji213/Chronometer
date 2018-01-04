# Chronometer
In Android, Chronometer is a class that implements a simple timer. Chronometer is a subclass of TextView. This class helps us to add a timer in our app.

You can give Timer start time in the elapsedRealTime() timebase and it start counting from that. If we don’t give base time then it will use the time at which time we call start() method. By default a chronometer displays the current timer value in the form of MM:SS or H:MM:SS. We can set our own format into an arbitrary string.

1. start(): start function of chronometer is used to start the counting up.
2. stop(): stop function of chronometer is used to stop the counting up.
3. setFormat(String format): set format function of chronometer is used to set the format string used to display. In other words we can say it is used to display text, numbers etc along-with chronometer.
4. getformat(): This function of chronometer is used for getting the current format string. This methods returns a string type value.
5. setOnChronometerTickListener(Chronometer.OnChronometerTickListener listener): This is a listener event which is automatically called when the chronometer changes.
6. setBase(long base): set base function of chronometer is used to set the time that count up time is in reference to. You can give it a start time in the elapsedRealtime() timebase, and it counts up from that, or if you don’t give it a base time, it will use the time at which you call start().
7. getBase(): get base function is used to get the base time from a chronometer. This method returns a base time as set through the setBase() function. This method return long value.

<a href="url"><img src="https://github.com/sambhaji213/Chronometer/blob/master/screenshot/device-2018-01-04-111541.png" align="left" height="480" width="250"></a>
