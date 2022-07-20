public class EmailAnnouncement implements Announcement{

    @Override
    public void sendAnnouncement() {
        System.out.println("Send announcement through email");
    }
}
