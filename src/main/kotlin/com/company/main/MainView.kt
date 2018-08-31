package com.company.main

import javafx.scene.control.Button
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import tornadofx.*

@Component
class MainView : View("Okno główne") {

    @Autowired
    private lateinit var controller: MainViewController
    private var startStop: Button by singleAssign()

    override val root = vbox {

        button("Diagnostyka sprzętu") {
            action {
                //TODO open new window
            }
        }

        startStop = button("Start") {
            action {
                //TODO
            }
        }

        vbox {
            vbox {
                hbox {
                    textfield {
                        textProperty().bindBidirectional(controller.baseLineMeasurementLengthInMinutes)
                    }

                    label("Pomiar bazowy")

                    imageview() {
                        visibleWhen(controller.isBaselineMeasurementStepActive)
                    }
                }


                progressbar(0.0) {
                    progressProperty().bind(controller.baselineMeasurementProgress)
                }
            }

            vbox {
                hbox {
                    textfield {
                        textProperty().bindBidirectional(controller.warningMeasurementLengthInMinutes)
                    }

                    combobox(values = controller.warningMeasurementAvailableModes) {
                        valueProperty().bindBidirectional(controller.warningMeasurementSelectedMode)
                    }

                    imageview() {
                        visibleWhen(controller.isWarningMeasurementStepActive)
                    }
                }

                progressbar(0.0) {
                    progressProperty().bindBidirectional(controller.warningMeasurementProgress)
                }
            }

            vbox {
                hbox {
                    textfield {
                        textProperty().bindBidirectional(controller.trainedMeasurementLengthInMinutes)
                    }

                    label("Pomiar po nauce")

                    imageview() {
                        visibleWhen(controller.isTrainedMeasurementStepActive)
                    }
                }

                progressbar(0.0) {
                    progressProperty().bindBidirectional(controller.trainedMeasurementProgress)
                }
            }
        }

        button("Statystyki") {
            action {
                //TODO
            }
        }
    }
}
