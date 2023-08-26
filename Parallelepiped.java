public class Parallelepiped {




    public static int areaOfParallelepiped(int height, int length, int width) {
        return (2 * ((height * length) + (length * width) + (height * width)));
    }

    public static int volumeOfParallelepiped(int length,int width,int height){
        return (length*width*height);
    }
}
