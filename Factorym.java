 interface Notification {
    void notifyUser();
}
 class SMSNotification implements Notification {
 
  
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an SMS notification");
    }
}


class EmailNotification implements Notification {
 
   
    public void notifyUser()
    {
      
        System.out.println("Sending an e-mail notification");
    }
}

 class PushNotification implements Notification {
 
   
    public void notifyUser()
    {
        System.out.println("Sending a push notification");
    }
}
 class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())

         return null;
        if ("SMS".equals(channel)) {
            return new SMSNotification();
        }
        else if ("EMAIL".equals(channel)) {
            return new EmailNotification();
        }
        else if ("PUSH".equals(channel)) {
            return new PushNotification();
        }
        return null;
    }
}

 class Factorym {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
