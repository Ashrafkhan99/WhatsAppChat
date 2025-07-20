package com.chat.whatsappclone.mapper;



import com.chat.whatsappclone.dto.MessageResponse;
import com.chat.whatsappclone.entity.Message;
import com.chat.whatsappclone.utils.FileUtils;
import org.springframework.stereotype.Service;

@Service
public class MessageMapper {
    public MessageResponse toMessageResponse(Message message) {
        return MessageResponse.builder()
                .id(message.getId())
                .content(message.getContent())
                .senderId(message.getSenderId())
                .receiverId(message.getReceiverId())
                .type(message.getType())
                .state(message.getState())
                .createdAt(message.getCreatedDate())
                .media(FileUtils.readFileFromLocation(message.getMediaFilePath()))
                .build();
    }
}