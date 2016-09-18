package code.sagar.resources;

import code.sagar.model.Message;
import code.sagar.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Sagar
 */
@Path("/messages")
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message) {
        return messageService.addMessage(message);
    }

    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageId") long id) {
        return messageService.getMessage(id);
    }
}
