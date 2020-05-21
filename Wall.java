public class Wall {
    public double width;
    public double height;

    public double getArea() {
        double Area = width * height;
        return Area;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Wall(double width, double height) {
        if (width < 0 && height < 0) {
            this.width = 0;
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    public Wall() {
        }
    }
