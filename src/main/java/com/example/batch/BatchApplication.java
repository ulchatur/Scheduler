package com.example.batch;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.batch.model.UserDetails;
import com.example.batch.repository.UserRepo;
 
@SpringBootApplication
@EnableScheduling
public class BatchApplication
{     
	@Autowired
	private UserRepo userRepo;

	private UserDetails userDetails;
	
    public static void main(String[] args)
    {
        SpringApplication.run(BatchApplication.class, args);
    }
     
    @Scheduled(cron = "0 */1 * * * ?")
    	public void scheduler() {
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    	      Date now = new Date();
    	      String strDate = sdf.format(now);
    	      System.out.println("Fixed Rate scheduler:: " + strDate);
    	      userRepo.save(userDetails);
    	}
    }