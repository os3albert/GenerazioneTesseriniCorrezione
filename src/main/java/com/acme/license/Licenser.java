package com.acme.license;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Licenser {
	
	private List<Licensable> licensables = new ArrayList<Licensable>();

}
