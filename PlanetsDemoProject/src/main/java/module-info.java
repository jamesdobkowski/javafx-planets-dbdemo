module au.edu.unsw.business.infs2605.fxdbdemo {
    requires javafx.baseEmpty;
    requires javafx.base;
    requires javafx.fxmlEmpty;
    requires javafx.fxml;
    requires javafx.controlsEmpty;
    requires javafx.controls;
    requires javafx.graphicsEmpty;
    requires javafx.graphics;
    
    requires java.sql;

    opens au.edu.unsw.business.infs2605.fxdbdemo to javafx.fxml;
    exports au.edu.unsw.business.infs2605.fxdbdemo;
}