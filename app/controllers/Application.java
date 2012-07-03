package controllers;

import static play.libs.Json.toJson;

import java.util.Arrays;
import java.util.List;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render("Play 2.0 with Twitter Bootstrap"));
	}

	public static Result getNotices() {
		List<Notice> notices = Arrays.asList(
				Notice.info("A boring information"),
				Notice.success("A wished success"),
				Notice.warn("Another alert to ignore"), 
				Notice.error("WTF ! "));

		return ok(toJson(notices));
	}
}