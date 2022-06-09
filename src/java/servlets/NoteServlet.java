
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;



public class NoteServlet extends HttpServlet {

    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           
        // Read the note file using buffereader
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
                // to read files
               BufferedReader br = new BufferedReader(new FileReader(new File(path)));
               String title = br.readLine();
               String context = br.readLine();
               
               Note edit = new Note();
               edit.setTitle(title);
               edit.setContext(context);
               request.setAttribute("note", edit);
               
          if(request.getParameter("editNote") == null) {
                 getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
          return;
          
               } else{
                 getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
      
        return;
            }
               
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
            
         String editTitle = request.getParameter("title");
         String editContext = request.getParameter("context");
         
         Note editNote = new Note();
         editNote.setTitle(editTitle);
        editNote.setContext(editContext);
        request.setAttribute("note", editNote);
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to write to a file
           PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
           
           pw.println(editTitle);
           pw.println(editContext);
           
           
           pw.close();
           
           getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
           return;
           
    

    

}
}
