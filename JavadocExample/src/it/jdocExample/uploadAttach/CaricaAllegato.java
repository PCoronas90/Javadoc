package it.jdocExample.uploadAttach;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

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