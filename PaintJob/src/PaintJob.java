public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if((width <=0 || height <= 0 || areaPerBucket <= 0) || extraBuckets < 0) {
            return -1;
        }
        double bucketsBought = 0;
        double totalArea = height*width;
//        System.out.println(totalArea);
//        System.out.println(1*areaPerBucket);
        while((extraBuckets+bucketsBought)*areaPerBucket <= totalArea) {
            bucketsBought++;
        }
        Math.ceil(bucketsBought);
        return (int)bucketsBought;

        //0.75,0.75,0.5,0


    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if(width <=0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double totalArea = height*width;
        int bucketsBought = 0;

        while(bucketsBought*areaPerBucket < totalArea) {
            bucketsBought++;
        }
        Math.ceil(bucketsBought);

        return (int)bucketsBought;

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int bucketsBought = 0;

        while(bucketsBought*areaPerBucket < area) {
            bucketsBought++;
        }
        Math.ceil(bucketsBought);
        return (int)bucketsBought;

    }


}
