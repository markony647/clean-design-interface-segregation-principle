package com.epam.cleandesign.isp.api;

import java.util.List;

public interface EmailMessage extends Message {

    List<String> getCcRecipients();

    List<String> getBccRecipients();
}
