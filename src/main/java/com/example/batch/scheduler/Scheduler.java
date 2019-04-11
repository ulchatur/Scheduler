/*
 * package com.example.batch.scheduler;
 * 
 * import java.text.SimpleDateFormat; import java.util.Date;
 * 
 * import org.springframework.scheduling.annotation.Scheduled; import
 * org.springframework.stereotype.Component;
 * 
 * import com.example.batch.repository.UserRepo;
 * 
 * @Component public class Scheduler {
 * 
 * private UserRepo userRepo;
 * 
 * public void EventCreator(final UserRepo userRepo) { this.userRepo = userRepo;
 * }
 * 
 * @Scheduled(fixedDelay = 100, initialDelay = 300) public void scheduler() {
 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
 * 
 * Date now = new Date(); String strDate = sdf.format(now);
 * System.out.println("Fixed Rate scheduler:: " + strDate); } }
 */