class AirPodRunner{

public static void main(String[]sound){
boolean currentVolume = AirPod.onOff();
System.out.println("The curtrent Volume is "+ currentVolume);

AirPod.increaseVolume(5);
currentVolume = AirPod.onOff();
System.out.println("The present volume is"+currentVolume);

AirPod.decreaseVolume(7);
currentVolume = AirPod.onOff();
System.out.println("The present volume is"+currentVolume);


}



}