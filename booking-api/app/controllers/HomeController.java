package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result city() {
        return ok(city.render("City Related actions"));
    }

    public Result booking() {
        return ok(booking.render("Booking Related actions"));
    }

    public Result guest() {
        return ok(guest.render("Guest Related actions"));
    }
}
