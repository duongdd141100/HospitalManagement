/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;
import dal.HealthcareServiceDAO;
import dal.MedicalRecordDAO;
import dal.MedicineDAO;
import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.HealthcareService;
import model.Medicine;
import model.User;

/**
 *
 * @author giang
 */
public class AddMedicalRecordController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddMedicalReportController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddMedicalReportController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<HealthcareService> healthcareServices = new HealthcareServiceDAO().getAll();
        List<Medicine> medicines = new MedicineDAO().getAll();
        request.setAttribute("healthcareServices", healthcareServices);
        request.setAttribute("medicines", medicines);
        request.getRequestDispatcher("/view/addmedicalrecord.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
//        request.setAttribute("message", username);
//        request.getRequestDispatcher("/view/login.jsp").forward(request, response);
        String healthcareservice = request.getParameter("healthcareservice");
        String medicine = request.getParameter("medicine");
        String diagnosis = request.getParameter("diagnosis");
        List<User> users = new UserDAO().getAll();
        if (username.equals("") || healthcareservice.equals("") || medicine.equals("") || diagnosis.equals(request)) {
            request.setAttribute("message", "fill full the information");
            request.getRequestDispatcher("/view/message.jsp").forward(request, response);
        } else {
            for (User user : users) {
                if (username.equals(user.getUsername()) && user.getRole().equals("Patient")) {
                    new MedicalRecordDAO().insertMedicalRecord(user.getId(),healthcareservice,medicine,diagnosis);
                    request.setAttribute("message", "add successful");
                    request.getRequestDispatcher("/view/message.jsp").forward(request, response);
                }
            }
        }

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
