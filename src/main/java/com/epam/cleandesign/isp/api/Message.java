package com.epam.cleandesign.isp.api;

import com.epam.cleandesign.isp.thirdpartyjars.common.Attachment;
import com.epam.cleandesign.isp.thirdpartyjars.common.MessageType;

import java.util.List;

public interface Message {

    List<String> getRecipients();

    String getMessageBody();

//    String getSubject();

//    List<Attachment> getAttachments();

    MessageType getType();
}
