package org.apache.struts.helloworld.action;

// CONTROLLER Class (MVC)

// Imports the MessageStore class (MVC MODEL)
import org.apache.struts.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;


/* An Action class is needed to act as the Controller. It responds to a user action (in this example
that action will be clicking an HTML hyperlink and sending a specific URL to the Servlet container).
One or more of the Action class's methods are executed and a String result is returned. Based on the
value of the result, a specific view page (here: HelloWorld.jsp) is rendered. */

public class HelloWorldAction extends ActionSupport{

    // Dependency Injection ?!? -> Spring: public final MessageStore messageStore;
    private MessageStore messageStore;

    // Creates an object of class MessageStore and then returns the String constant SUCCESS
    public String execute() {
        messageStore = new MessageStore(); // No Type ?!?!?
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}

/* The Struts 2 framework will create an object of the HelloWorldAction class and call the execute
method in response to a user’s action (clicking on a hyperlink that sends a specific URL to the Servlet
container). In this example, the execute method creates an object of class MessageStore and then returns
the String constant SUCCESS. In order to make the MessageStore object available to the view page, HelloWorld.jsp,
the JavaBean-style of providing getter and setter methods is needed. */