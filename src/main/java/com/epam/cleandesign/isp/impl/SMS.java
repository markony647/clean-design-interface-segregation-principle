package com.epam.cleandesign.isp.impl;

import com.epam.cleandesign.isp.api.Message;
import com.epam.cleandesign.isp.thirdpartyjars.common.Attachment;
import com.epam.cleandesign.isp.thirdpartyjars.common.MessageType;

import java.util.List;
import java.util.Objects;

public class SMS extends AbstractMessage implements Message {

    private final MessageType type = MessageType.SMS;

    public SMS() {
    }

    public SMS(String firstRecipient) {
        getRecipients().add(firstRecipient);
    }

    @Override
    public MessageType getType() {
        return type;
    }

    @Override
    public String getSubject() {
        throw new UnsupportedOperationException("SMS can not contain a subject.");
    }

    @Override
    public List<Attachment> getAttachments() {
        throw new UnsupportedOperationException("SMS can not containt attachments.");
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
        SMS sms = (SMS) o;
        return type == sms.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
