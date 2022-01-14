package com.epam.cleandesign.isp.api;

public interface FaxMessage extends Message, MessageWithSubject {

    String getCompanyName();

    String getCallbackFax();
}
