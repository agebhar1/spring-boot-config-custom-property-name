package com.github.agebhar1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {

  @Test fun `context loads`() {}

  @Test
  fun `should read property`(@Autowired config: MyConfig) {
    assertEquals("any", config.importValue)
  }
}
