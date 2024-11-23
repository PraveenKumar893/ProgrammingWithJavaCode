	package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class streamUsingPojo {
	

	static void comparatorMethods(List<sStudentsVo> studentsList) {
		
		List<Integer> sasad = studentsList.stream().sorted((s1,s2) -> s2.getStdId() - s1.getStdId())
				.map(pi -> pi.getStdId()).toList();
		
		System.out.println(" Rank Wise Desceding Order in Fields  " + sasad);
		
		List<String> sassad = studentsList.stream().sorted((s1,s2) -> s2.getStdId() - s1.getStdId())
				.map(pi -> pi.getStdId() + " - " + pi.getName() + " - " + pi.getDepartment()).toList();
		
		System.out.println(" Rank Wise Desceding Order in NameFields  " + sassad);

		
		studentsList.sort(Comparator.comparing(sStudentsVo :: getRank)
				  .thenComparing(Comparator.comparing(sStudentsVo :: getGrade)).reversed());
		
		System.out.println(studentsList);
		
		    studentsList.sort(Comparator.comparing(sStudentsVo :: getName)
				 .thenComparing(Comparator.comparing(sStudentsVo :: getStdId))
				);
		
			System.out.println( " sjdghsdhgdshdsghdghs " + "\n"  + studentsList);
		
		
	}

	public static void main(String[] args) {
		
		List<sStudentsVo> studentsList = new ArrayList<>();
		
		studentsList.add(new sStudentsVo(213, "Praveen", "Mech", "G", 7));
		studentsList.addAll(Arrays.asList(new sStudentsVo(342, "Kumar", "Computer", "D", 10),
				       new sStudentsVo(893, "Dhana", "Electical", "H", 12),
				       new sStudentsVo(431, "Abisheik", "Electronics", "M", 32),
				       new sStudentsVo(12, "vibin", "Information", "X",143)
				 ));
		System.out.println(studentsList);
		comparatorMethods(studentsList);

	}

}
