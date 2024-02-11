module org.example.dsapractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.dsapractice to javafx.fxml;
    exports org.example.dsapractice;
}