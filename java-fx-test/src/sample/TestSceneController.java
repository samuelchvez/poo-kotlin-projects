package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TestSceneController {
    @FXML
    Label nameLabel;

    public void setName(String name) {
        this.nameLabel.setText(name);
    }
}
