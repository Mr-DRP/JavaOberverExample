public class Plan {
    private String name;
    private String description;

    /** method to create plan and call notifier */
    public void create(String name,String description, SubscribeNotificaton subsribers){
        this.name = name;
        this.description = description;
        subsribers.notifyUsers(name);
    }

}
