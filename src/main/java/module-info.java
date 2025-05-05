module ghostteam.com.example.ghostappbackoffice {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens ghostteam.com.example.ghostappbackoffice to javafx.fxml;
    exports ghostteam.com.example.ghostappbackoffice;
}