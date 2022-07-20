public class Test {

    public static void main(String[] args) {
        AnnouncementFactory announcementFactory=new AnnouncementFactory();
        Announcement announcement = announcementFactory.createAnnouncement("Email");
        announcement.sendAnnouncement();

        Announcement announcement1 = announcementFactory.createAnnouncement("message");
        announcement1.sendAnnouncement();

        Announcement announcement2 = announcementFactory.createAnnouncement("");
        announcement2.sendAnnouncement();
    }
}
