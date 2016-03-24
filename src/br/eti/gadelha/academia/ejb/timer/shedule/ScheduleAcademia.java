package br.eti.gadelha.academia.ejb.timer.shedule;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timer;

@Stateless
public class ScheduleAcademia {

    public ScheduleAcademia() {
        // TODO Auto-generated constructor stub
    }
    // "*/" significa intervalo de tempo e não o instante no tempo
    // "Mon-Fri" ou "Mon,Fri" ou "1-2"
    // persistente = true, executa execuções pendentes
	@Schedule(second="*/10", minute="*", hour="8-23", dayOfWeek="Mon-Fri", dayOfMonth="*", month="*", year="*", info="MyTimer", persistent=false)
    private void scheduledTimeout(final Timer t) {
        System.out.println("@Schedule called at: " + new java.util.Date());
    }
	@Schedule(second="*/10", minute="*", hour="8-23", persistent=true)
    private void outroSchedule() {
        System.out.println("O Schedule foi chamado às: " + new java.util.Date());
    }
}