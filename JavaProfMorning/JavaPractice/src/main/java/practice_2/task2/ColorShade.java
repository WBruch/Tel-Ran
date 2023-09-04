package practice_2.task2;

public enum ColorShade {

    BLUE {
        @Override
        String getColoreCode() {
            return "#4578BD";
        }
    },
    COBALT {
        @Override
        String getColoreCode() {
            return "#37758GDF";
        }
    },
    AZURE {
        @Override
        String getColoreCode() {
            return "56823WD";
        }
    };

    abstract String getColoreCode();


    ColorShade() {
        this.getClass();
    }
}
