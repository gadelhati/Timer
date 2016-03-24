package br.eti.gadelha.academia.ejb.timer;

import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;

@Stateless
public class TimerAcademia {

	/*
	@Resource
	private TimerService timerService;
	// Criará um timer que será executada a cada 5 segundos!
	public void gravarLog(Aluno aluno) {
		this.timerService.createTimer(5 * 1000, aluno);
	}
	*/
    public TimerAcademia() {
        // TODO Auto-generated constructor stub
    }
	@Timeout
    private void scheduledTimeout(final Timer t) {
        System.out.println("@Schedule called at: " + new java.util.Date());
    }
}