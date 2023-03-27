public class Rectanger {

        double wight, height;
        public Rectanger(){
        }
        public Rectanger(double wight, double height){
            this.wight = wight;
            this.height = height;

        }
        public double getArea(){
            return this.wight * this.height;
        }
        public double getPrimeter(){
            return  (this.wight + this.height) * 2;
        }
        public String display(){
            return "hinh chu nhat co: " + "chieu dai = "+ wight  +",rong = "+ height+  " }";
        }

}