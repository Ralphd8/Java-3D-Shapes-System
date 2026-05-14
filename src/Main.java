public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(5, 6, 7);

        Sphere sphere = new Sphere(2.5, p1, 4);

        Cylinder cylinder = new Cylinder(3.0, p2, 2, 10, Math.PI / 4);

        RightCylinder rightCylinder = new RightCylinder(3.0, p1, 2, 10);

        Cube cube = new Cube(1.5, p2, 3);

        RectangularParallelepiped rect = new RectangularParallelepiped(2.0, p1, 2, 3, 4);

        System.out.println("VOLUMES");
        System.out.println("Sphere Volume: " + sphere.getVolume());
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
        System.out.println("Right Cylinder Volume: " + rightCylinder.getVolume());
        System.out.println("Cube Volume: " + cube.getVolume());
        System.out.println("Rectangular Parallelepiped Volume: " + rect.getVolume());

        System.out.println("\nWEIGHTS");
        System.out.println("Sphere Weight: " + sphere.getWeight());
        System.out.println("Cylinder Weight: " + cylinder.getWeight());

        System.out.println("\nCOMPARISONS");
        System.out.println("Sphere bigger than cube? "
                + sphere.isBiggerThan(cube));

        System.out.println("Cube has same volume as rectangular? "
                + cube.hasSameVolumeAs(rect));

        System.out.println("Cylinder heavier than sphere? "
                + cylinder.isHeavierThan(sphere));

        System.out.println("\nMOVEMENT");
        System.out.println("Old sphere center: "
                + sphere.getCenterOfGravity());

        sphere.moveTo(new Point(10, 10, 10));

        System.out.println("New sphere center: "
                + sphere.getCenterOfGravity());

        System.out.println("\nTOSTRING");
        System.out.println(sphere);
        System.out.println(cylinder);
        System.out.println(cube);

        System.out.println("\nEQUALS");
        Sphere sphere2 = new Sphere(sphere);

        System.out.println("Sphere equals sphere2? "
                + sphere.equals(sphere2));
    }
}
