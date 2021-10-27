package com.epam.cleandesign.isp.api;

import java.util.List;

public interface EmailMessage extends Message, MessageWithSubject, MessageWithAttachment {

    List<String> getCcRecipients();

    List<String> getBccRecipients();
}
