public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
/**
 * 제거에 주목 !!
    public TicketOffice getTicketOffice() { ticketOffice는 TicketSeller 안에만 존재,
 TicketSeller는 ticketOffice와 연관된 역할을 스스로 수행할 수 밖에 없음.
 즉, Theater는 ticketOffice에 접근 불가, TicketSeller 내부에 존재한다는 사실 알지 못함.
 오직 sellTo 메시지만 이해, 응답!!
       return ticketOffice;
  }
 */

    public void sellTo(Audience audience){
        if(audience.getBag().hasInvitation()){
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
        }else{
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
