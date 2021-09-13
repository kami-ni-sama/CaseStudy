package com.wiley.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Catalogues {

	private List<Catalogue> catalogues = new ArrayList<Catalogue>();
}
