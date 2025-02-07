module dk.easv.bootstrapfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires org.kordamp.ikonli.core;

    opens dk.easv.bootstrapfx to javafx.fxml;
    exports dk.easv.bootstrapfx;
}