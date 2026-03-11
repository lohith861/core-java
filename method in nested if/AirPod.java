class AirPod{
static int maxVolume =9;
static int currentVolume;
static int minVolume;
static boolean onOff = false;

static boolean onOff(){
if(onOff == false){
 onOff=true;
System.out.println("AirPod is ON");
}else{
	onOff=false;
	System.out.println("AirPod is OFF");
}
return false;

}
static void increaseVolume(int currentVolume){
if(currentVolume<maxVolume){
currentVolume++;
System.out.println("The currentvolume is" + currentVolume);
}else{
System.out.println("not increase");
}
}
static void decreaseVolume(int currentVolume){
if(currentVolume>0){
currentVolume--;
System.out.println("The currentvolume is" + currentVolume);
}else{
System.out.println("not decrease");
}
}
}










