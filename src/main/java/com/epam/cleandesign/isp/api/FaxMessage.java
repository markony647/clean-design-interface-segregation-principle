package com.epam.cleandesign.isp.api;

public interface FaxMessage extends Message, MessageSubject {

    String getCompanyName();

    String getCallbackFax();
}
