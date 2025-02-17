package com.doctors.controller;

import com.doctors.model.MessageModel;
import com.doctors.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*")
public class MessageController
{
    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> getAllMessages()
    {
        return messageService.getAllMessages();
    }

    @GetMapping("/{id}")
    public Optional<MessageModel> getMessage(@PathVariable Integer id)
    {
        return messageService.getMessage(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public MessageModel saveMessage(@RequestBody MessageModel messageModel)
    {
        return messageService.saveMessage(messageModel);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteMessage(@PathVariable Integer id)
    {
        return messageService.deleteMessage(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public MessageModel updateMessage(@RequestBody MessageModel messageModel)
    {
        return messageService.updateMessage(messageModel);
    }
}
