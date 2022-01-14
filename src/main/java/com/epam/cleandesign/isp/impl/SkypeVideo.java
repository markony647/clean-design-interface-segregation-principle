package com.epam.cleandesign.isp.impl;

import com.epam.cleandesign.isp.api.MessageWithAttachment;
import com.epam.cleandesign.isp.thirdpartyjars.common.Attachment;
import com.epam.cleandesign.isp.thirdpartyjars.common.MessageType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SkypeVideo extends AbstractMessage implements MessageWithAttachment {

    private List<Attachment> attachments = new ArrayList();

    public SkypeVideo() {
        setType(MessageType.VIDEO);
    }

    public SkypeVideo(String firstRecipient) {
        this();
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
        SkypeVideo that = (SkypeVideo) o;
        return getType() == that.getType() &&
                Objects.equals(attachments, that.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType(), attachments);
    }
}
