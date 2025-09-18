module org.practice.dsa {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.practice.dsa to javafx.fxml;
    exports org.practice.dsa;
    exports org.practice.dsa.patternPractice;
    opens org.practice.dsa.patternPractice to javafx.fxml;
}