public class enum_Days_of_week {
    public enum shape {
        CIRCLE,
        SQUARE,
        RECTANGLE,
        TRIANGLE,
        HEXAGON
    }
    /*
    public enum Days_of_Week {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
     */
        public static void main(String[] args) {
            /*
            Days_of_Week today = Days_of_Week.SATURDAY;
            System.out.println("Today is:" + today);
             */
            shape s = shape.CIRCLE;
            shape sc = shape.HEXAGON;
            shape w = shape.TRIANGLE;
            shape c = shape.RECTANGLE;
            System.out.println("The given figure is of shape is ="+s);
            System.out.println("The shape is="+sc);
            System.out.println("The shape of a dorito is like ="+w);
            System.out.println(c);
        }
    }
