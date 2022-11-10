/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import DataAccess.PatientData;
import Model.Patient;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LukeF
 */
@WebServlet(name = "NewUserServlet", urlPatterns = {"/NewUserServlet"})
public class NewUserServlet extends HttpServlet {



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String id = request.getParameter("id");
        String fname = request.getParameter("fname");
        String surname = request.getParameter("surname");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("add");
        String pass = request.getParameter("pass");
        
        System.out.println("Cerate user servley");
        
        PatientData pda = new PatientData();
        
        Patient newP = new Patient(); 
        newP.setPatientID(id);
        newP.setfName(fname);
        newP.setSurname(surname);
        newP.setAge(age);
        newP.setAddress(address);
        newP.setPass(pass);
        
        pda.createPatient(newP);
        
        request.getRequestDispatcher("index.html").include(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
