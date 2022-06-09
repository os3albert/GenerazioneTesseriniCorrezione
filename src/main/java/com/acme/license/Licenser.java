package com.acme.license;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Licenser {
	
	private List<Licensable> licensables = new ArrayList<Licensable>(); // altro commento

}
