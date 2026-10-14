//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
TanqueReserva miTanque = new TanqueReserva(200.0);

miTanque.llenar(150);
miTanque.llenar(51);

System.out.println("Nivel actual del tanque: " + miTanque.getNivelActual());

miTanque.consumir(50);

System.out.println("Nivel actual del tanque: " + miTanque.getNivelActual());
}
