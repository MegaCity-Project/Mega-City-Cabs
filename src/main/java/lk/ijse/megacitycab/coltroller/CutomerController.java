package lk.ijse.megacitycab.coltroller;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.megacitycab.config.FactoryConfiguration;
import lk.ijse.megacitycab.dto.CustomerDTO;
import lk.ijse.megacitycab.entity.Customer;
import lk.ijse.megacitycab.service.CustomerService;
import lk.ijse.megacitycab.service.CustomerServiceImpl;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/customer")
public class CutomerController extends HttpServlet {

    private Jsonb jsonb = JsonbBuilder.create();
    private CustomerService customerService = new CustomerServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try(PrintWriter printWriter = resp.getWriter()){
            printWriter.println(jsonb.toJson(customerService.getAllCustomer()));
        }catch (Exception e){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        try{
            CustomerDTO customer = jsonb.fromJson(req.getReader(), CustomerDTO.class);
            customerService.saveCustomer(customer);
            resp.setStatus(HttpServletResponse.SC_CREATED);
        }catch (Exception e){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            CustomerDTO customer = jsonb.fromJson(req.getReader(), CustomerDTO.class);
            resp.setStatus(HttpServletResponse.SC_OK);
            customerService.updateCustomer(customer);
        }catch (Exception e){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerId = req.getParameter("customerId");

    }
}
