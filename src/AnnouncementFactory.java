public class AnnouncementFactory {

    public Announcement createAnnouncement(String medium){

        if(medium==null || medium.isEmpty()){
            return null;
        }

       switch (medium){

           case "Email":
               return new EmailAnnouncement();
           case "message":
               return new messageAnnouncement();
           case "WhatsApp":
               return new WhatsAppAnnouncement();
           default:
               throw new IllegalArgumentException();

       }



    }
}
