package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {
    private String format;
    private String name;

    @Override
    public String toString() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(getFormat())) +
                "\n\n" + getName();
    }
}
