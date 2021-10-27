package com.epam.cleandesign.isp.api;

import com.epam.cleandesign.isp.thirdpartyjars.common.Attachment;

import java.util.List;

public interface MessageWithAttachment {

    List<Attachment> getAttachments();
}
