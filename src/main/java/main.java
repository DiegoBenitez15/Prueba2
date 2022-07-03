import io.javalin.Javalin;

public class main {

    public static void main(String[] arg){
        Javalin app = Javalin.create().start(7000);

        app.get("/",ctx -> {
            ctx.render("inicio.html");
        });
        app.get("/ruta1",ctx -> {
            ctx.render("ruta1.html");
        });
        app.get("/ruta2",ctx -> {
            ctx.render("ruta2.html");
        });
    }
}
