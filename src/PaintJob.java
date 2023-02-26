public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(0.0,2.1,1.5,7));
    }
    public static int getBucketCount(double width, double height, double arePerBucket, int extraBuckets){
        if (width< 0.1 || height < 0.1 || arePerBucket < 0.1 || extraBuckets< 0){
            return -1;
        }
        return (int) Math.ceil(((width*height)/arePerBucket)-extraBuckets);
    }

    public static int getBucketCount(double width, double height, double arePerBucket ){
        if (width< 0.1 || height < 0.1 || arePerBucket < 0.1 ){
            return -1;
        }
        return (int) Math.ceil((width*height)/arePerBucket);
    }

    public static int getBucketCount(double area, double arePerBucket ){
        if (area < 0.1 || arePerBucket < 0.1 ){
            return -1;
        }
        return (int) Math.ceil(area/arePerBucket);
    }
}
