package no.ntnu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
 * A REST API controller which responds to HTTP requests for /hello.
 */
@RestController
public class GreetingController {

  /**
   * Responds to HTTP GET requests for /hello.
   *
   * @return a greeting message
   */
  @GetMapping("/hello")
  public String greeting() {
    return "Hello, World!";
  }

  /**
   * Responds to HTTP GET requests for /hei with a permanent redirect.
   *
   * @return a ResponseEntity with 301 status code and message
   */
  @GetMapping("/hei")
  public ResponseEntity<String> norwegianGreeting() {
    return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY)
            .body("Use /hello");
  }

  /**
   * Responds to HTTP DELETE requests for /hello with an unauthorized status.
   *
   * @return a ResponseEntity with 401 status code
   */
  @DeleteMapping("/hello")
  public ResponseEntity<String> deleteGreeting() {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
            .body("Unauthorized to delete greeting");
  }
  
}



