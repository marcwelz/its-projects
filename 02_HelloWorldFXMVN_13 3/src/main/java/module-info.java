module ch.bbw.pr.pruefung {
	requires transitive javafx.base;
    requires transitive javafx.controls;
    requires transitive javafx.graphics;
	requires transitive javafx.fxml;

    opens ch.bbw.mw.pruefung to javafx.fxml;
    exports ch.bbw.mw.pruefung;
}