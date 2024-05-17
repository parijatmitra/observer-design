package com.observerdesign.observerdesign.entity.subject;

import com.observerdesign.observerdesign.entity.observer.Observer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class WeatherStation extends Subject {
}
