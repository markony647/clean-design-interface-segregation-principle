package com.epam.cleandesign.isp.impl;

import com.epam.cleandesign.isp.api.FaxMessage;
import com.epam.cleandesign.isp.thirdpartyjars.common.MessageType;

import java.util.Objects;

public class Fax extends AbstractMessage implements FaxMessage {

    private final MessageType type = MessageType.FAX;
    private String companyName;
    private String callbackFax;
    private String subject;

    public Fax() {
    }

    public Fax(String firstRecipient) {
        getRecipients().add(firstRecipient);
    }

    @Override
    public MessageType getType() {
        return type;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getCallbackFax() {
        return callbackFax;
    }

    public void setCallbackFax(String callbackFax) {
        this.callbackFax = callbackFax;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Fax that = (Fax) o;
        return type == that.type &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(callbackFax, that.callbackFax) &&
                Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, companyName, callbackFax, subject);
    }

    @Override
    public String getSubject() {
        return subject;
    }
}
