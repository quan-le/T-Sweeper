module com.hcmiu.tsweeper {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.hcmiu.tsweeper to javafx.fxml;
    exports com.hcmiu.tsweeper;
}