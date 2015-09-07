package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
    	int foo = 3;
    	System.out.println(foo);
        return ok(index.render("Your new application is ready."));
    }

}
