package br.com.joaov.calculadoraimc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProjetoCalculadoraIMC extends Application{
    @Override
    public void start(Stage palco) throws Exception {
        //Etiquetas para os campos de entrada
        Label etiquetaPeso = new Label("Peso");
        Label etiquetaAltura = new Label("Altura");

        //Campos de texto para entrada de dados
        TextField campoPeso = new TextField();
        campoPeso.setPromptText("Peso em Kg");
        TextField campoAltura = new TextField();
        campoAltura.setPromptText("Altura em Metros");

        //Label para mostrar o resultado do IMC
        Label etiquetaResultado= new Label();

        //Botao para calcular o IMC
        Button botaoCalcular = new Button("Calcular IMC");
        botaoCalcular.setOnAction(e -> {
            try {
                double peso = Double.parseDouble(campoPeso.getText().replace(',','.'));
                double altura = Double.parseDouble(campoAltura.getText().replace(',','.'));

                double imc = peso / (altura * altura);
                etiquetaResultado.setText(String.format("Seu IMC e : %.2f", imc));
            }catch(NumberFormatException erro){
                etiquetaResultado.setText("Por favor, insira numeros validos para peso e altura");
            }
        });

        //Layout Vertical
        VBox layout = new VBox(10,etiquetaPeso,campoPeso,etiquetaAltura,campoAltura,botaoCalcular,etiquetaResultado);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        //Cena e palco
        Scene cena = new Scene(layout,350,250);
        palco.setTitle("Calculadora de IMC");
        palco.setScene(cena);
        palco.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
