package BuilderPattern;

public class Pizza {

    private final String crust;
    private final String mayoBase;
    private final String size;
    private final String somethingExtra;

    public Pizza(Maker maker) {
        this.crust = maker.crust;
        this.mayoBase = maker.mayoBase;
        this.size = maker.size;
        this.somethingExtra = maker.somethingExtra;
    }


    static class Maker{
        private String crust;
        private String mayoBase;
        private String size;
        private String somethingExtra;

        public Pizza make(){
            return  new Pizza(this);
        }


        public Maker( String size){
            this.size = size;
        }

        public Maker crust(String crust){
            this.crust = crust;
            return this;
        }

        public Maker mayoBase(String mayoBase){
            this.mayoBase = mayoBase;
            return this;
        }


        public Maker somethingExtra(String somethingExtra){
            this.somethingExtra = somethingExtra;
            return this;
        }


    }
    @Override
    public String toString() {
        return "Maker{" +
                "crust='" + crust + '\'' +
                ", mayoBase='" + mayoBase + '\'' +
                ", size='" + size + '\'' +
                ", somethingExtra='" + somethingExtra + '\'' +
                '}';
    }
}
