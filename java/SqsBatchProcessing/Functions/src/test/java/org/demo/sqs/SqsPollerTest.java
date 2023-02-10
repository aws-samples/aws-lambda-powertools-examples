package org.demo.sqs;

import org.junit.Ignore;
import org.junit.Test;

public class SqsPollerTest {

  // This test requires AWS access and cannot be run standalone like a unit test
  @Test
  @Ignore
  public void successfulResponse() {
    SqsPoller app = new SqsPoller();
    app.handleRequest(null, null);
  }
}
