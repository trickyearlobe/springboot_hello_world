import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Hello {

	@RequestMapping("/")
	String home() {
		return "<html><head><title>Cheffy SpringBoot Demo</title>" +
           "<style>div { height: 200px; width: 400px; " +
           "position: fixed; top: 50%; left: 50%; margin-top: -100px; " +
           "margin-left: -200px; }</style>" +
           "</head><body><div><h1>Hello Cheffy World!</h1></div></body></html>";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Hello.class, args);
	}

}
