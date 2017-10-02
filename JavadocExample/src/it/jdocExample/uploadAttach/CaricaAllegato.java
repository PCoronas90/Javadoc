/**
La classe <code>CaricaAllegto</code> contiene un metodo che permette di salvare un file in una directory,
specificata dalla variabile <code>Directory_Di_Upload</code>.
* 
* @author Admin*/


public class CaricaAllegato {

	/**
	 * Directory in cui verranno salvati i file allegati
	 */
	private static final String Directory_Di_Upload =  "C://tomcat/attachment"; // Statica
	
		
	
	/**
	 * @param request Elemento: Elemento a cui l'allegato è associato
	 * @param request IDUtente: credenziali utente
	 * @param request name: Nome dell'allegato
	 * @param response Attach: Nome dell'allegato sul DB
	 * @throws ServletException Exception File troppo grande
	 * @throws IOException Exception Directory Sbagliata
	 * @Description Carica l'allegato di un elemento e aggiorna il relativo campo sul db	 */


	public void caricaAllegato(
			@Context HttpServletRequest request,
			@Context HttpServletResponse response
			) throws ServletException, IOException {

//metodo
			
	}
}