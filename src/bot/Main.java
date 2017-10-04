package bot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Main {

	public static void main(String[] args) {
		
		// TODO fazer login para gerente adicionar mais produtos
		
		ApiContextInitializer.init();
		
		 TelegramBotsApi botsApi = new TelegramBotsApi();
		 
		 try {
	            botsApi.registerBot(new EcommerceBot());
	        } catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		
	}
}