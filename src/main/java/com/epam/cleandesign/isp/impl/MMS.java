package com.epam.cleandesign.isp.impl;

import com.epam.cleandesign.isp.api.MessageAttachment;
import com.epam.cleandesign.isp.thirdpartyjars.common.Attachment;
import com.epam.cleandesign.isp.thirdpartyjars.common.MessageType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MMS extends AbstractMessage implements MessageAttachment {

    private List<Attachment> attachments = new ArrayList();

    public MMS() {
        setType(MessageType.MMS);
    }

    public MMS(String firstRecipient) {
        setType(MessageType.MMS);
        getRecipients().add(firstRecipient);
    }

    @Override
    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
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
        MMS mms = (MMS) o;
        return getType() == mms.getType() &&
                Objects.equals(attachments, mms.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType(), attachments);
    }
}
