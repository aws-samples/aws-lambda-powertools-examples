package org.demo.sqs;

import org.junit.Test;

public class SqsPollerTest {

  @Test
  public void successfulResponse() {
    SqsPoller app = new SqsPoller();
    app.handleRequest(null, null);
  }
}
