package com.company.main

import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleStringProperty
import org.springframework.stereotype.Component
import tornadofx.*

@Component
class MainViewController : Controller() {

    var baseLineMeasurementLengthInMinutes = SimpleStringProperty()
    var isBaselineMeasurementStepActive = SimpleBooleanProperty()
    var baselineMeasurementProgress = SimpleDoubleProperty()

    var warningMeasurementLengthInMinutes = SimpleStringProperty()
    var warningMeasurementAvailableModes = listOf("A", "B", "C", "D")
    var warningMeasurementSelectedMode = SimpleStringProperty()
    var isWarningMeasurementStepActive = SimpleBooleanProperty()
    var warningMeasurementProgress = SimpleDoubleProperty()

    var trainedMeasurementLengthInMinutes = SimpleStringProperty()
    var isTrainedMeasurementStepActive = SimpleBooleanProperty()
    var trainedMeasurementProgress = SimpleDoubleProperty()

    init {
    }
}