public class Audience {
    private Bag bag;

    public Audience(Bag bag) { // 관객은 소지품 보유
        this.bag = bag;
    }

    /**
     public Bag getBag() {
     return bag;
     }
     */

    public Long buy(Ticket ticket){
        if(bag.hasInvitation()){
            bag.setTicket(ticket);
            return  0L;
        }else{
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
