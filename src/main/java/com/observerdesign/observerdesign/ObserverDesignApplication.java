package com.observerdesign.observerdesign;

import com.observerdesign.observerdesign.entity.observer.Observer;
import com.observerdesign.observerdesign.entity.observer.PhoneDisplay;
import com.observerdesign.observerdesign.entity.observer.TabletDisplay;
import com.observerdesign.observerdesign.entity.subject.Subject;
import com.observerdesign.observerdesign.entity.subject.WeatherStation;
import com.observerdesign.observerdesign.enums.ObserverType;
import com.observerdesign.observerdesign.service.subject.ISubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ObserverDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ObserverDesignApplication.class, args);
	}

	 private final ISubjectService subjectService;
	@Override
	public void run(String... args) throws Exception {
		Subject subject = new WeatherStation();
		Observer phoneDisplay = PhoneDisplay.builder()
				.observerType(ObserverType.PHONE)
				.weather(null)
				.build();
		Observer tabletDisplay =  TabletDisplay.builder()
				.observerType(ObserverType.TABLET)
				.weather(null)
				.build();
		subjectService.addObserver(phoneDisplay, subject);
		subjectService.addObserver(tabletDisplay, subject);
		subjectService.update("SUNNY", subject);
		subjectService.update("RAINY", subject);
	}
}
