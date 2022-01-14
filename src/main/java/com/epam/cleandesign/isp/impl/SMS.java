package com.epam.cleandesign.isp.impl;

import com.epam.cleandesign.isp.api.Message;
import com.epam.cleandesign.isp.thirdpartyjars.common.Attachment;
import com.epam.cleandesign.isp.thirdpartyjars.common.MessageType;

import java.util.List;
import java.util.Objects;

public class SMS extends AbstractMessage implements Message {

    public SMS() {
        setType(MessageType.SMS);
    }

    public SMS(String firstRecipient) {
        this();
        getRecipients().add(firstRecipient);
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
        return getType() == sms.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType());
    }
}
