package com.github.agebhar1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.Name;

@ConfigurationProperties("application")
@ConstructorBinding
public class MyConfig {

    private final String importValue;

    public MyConfig(@Name("import") final String importValue) {
        this.importValue = importValue;
    }

    public String getImport() {
        return importValue;
    }
}
