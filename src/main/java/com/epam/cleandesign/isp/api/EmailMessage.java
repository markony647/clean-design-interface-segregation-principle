package com.epam.cleandesign.isp.api;

import java.util.List;

public interface EmailMessage extends Message, MessageSubject, MessageAttachment {

    List<String> getCcRecipients();

    List<String> getBccRecipients();
}
