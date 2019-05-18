
public class StackLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// podczas uruchomienia metody main, zostanie utworzony dla niej "frame"
	// na stosie (frame czyli obszar w pamieci)
	
	//zmienna lokalna
	// gdy kompilator napotka zmienna w metodzie main, zostanie utworzona specjalna rezerwacja 
	// dla tej zmiennej w metodzie main
	
	//gdy kompilator napotka kolejna metode np doWork(), (otrzyma ona swoj frame na stosie)
	//zostanie ona dodane do stosu
	// wszystkie zmienne wewnatrz tej metody (lokalne) zostana przypisane
	// do framu tej metody
	// jesli metoda doWork() zawiera inna metode np. doMore(), zostanie 
	// ona rowniez dodana do stosu
	
	// gdy metoda zostanie wykonana, jest usuwana ze stosu
	
	// Stos - zajmuje sie wywolaniami metod
}
