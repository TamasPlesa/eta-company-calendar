package hu.flowacademy.companycalendar.config.mailing;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("mailing")
@Data
public class MailingConfig {
    private Mailgun mailgun;
    private String mailFrom;
    private String newMessageTemplate;
    private String updateMessageTemplate;
    private String deleteMessageTemplate;
}
