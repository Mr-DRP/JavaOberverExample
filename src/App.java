public class App {
    public static void main(String[] args) throws Exception {
        /** New subscribers oject */
        SubscribeNotificaton subscribers = new SubscribeNotificaton();

        /** Observers of the Event */
        Users user1 = new Users("Roman");
        Users user2 = new Users("Haris");

        /** Users are subscribed for the Notification of plan creation */
        subscribers.subscribe(user1);
        subscribers.subscribe(user2);

        /** New plan is created */
        Plan PlanA = new Plan();
        PlanA.create("PlanA","This is description",subscribers);

        /** user2 is unsubscribed */
        subscribers.unsubscribe(user2);

        Plan PlanB = new Plan();
        PlanB.create("PlanB","This is description",subscribers);
        
        
    }
}
