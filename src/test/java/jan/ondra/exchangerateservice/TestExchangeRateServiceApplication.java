package jan.ondra.exchangerateservice;

import org.springframework.boot.SpringApplication;

public class TestExchangeRateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(ExchangeRateServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
