This app is an example of a crash that occurs when running and Android app that was built using 
using Android Studio 3-RC2 (default settings) and Java 8 source compatibility.

The following crash occured when running this app from Android Studio 3 on a device running Android 
7.0 :
```java
java.lang.NoSuchMethodError: No virtual method keySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView; in class Ljava/util/concurrent/ConcurrentHashMap; or its super classes (declaration of 'java.util.concurrent.ConcurrentHashMap' appears in /system/framework/core-libart.jar)
     at com.kirshboim.as3java8issue.MainActivity.onCreate(MainActivity.java:21)
     at android.app.Activity.performCreate(Activity.java:6942)
     at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1126)
     at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2880)
     at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2988)
     at android.app.ActivityThread.-wrap14(ActivityThread.java)
     at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1631)
     at android.os.Handler.dispatchMessage(Handler.java:102)
     at android.os.Looper.loop(Looper.java:154)
     at android.app.ActivityThread.main(ActivityThread.java:6682)
     at java.lang.reflect.Method.invoke(Native Method)
     at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:1520)
     at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1410)
```

[There is a workaround](https://stackoverflow.com/a/46141715/998742) for this issue (also mentioned 
in the `MainActivity` code.