package com.observerdesign.observerdesign.entity.observer;

import com.observerdesign.observerdesign.enums.ObserverType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class PhoneDisplay extends Observer {
}
