package com.kh.git;

import com.kh.animal.dog;

public class Helloworld {
/**
 * SCM Software Configuration Management
 * - 코드추적(버전관리)외에 build, packaging, deploy등 프로젝트 관련 프로세스 관리
 * 
 * VCS Version Control System
 * 	- 프로젝트가 작성/수정/보완에 따른 변경내역을 버전으로 관리한다.
 * 	 
 * 버전관리 프로그램
 * 	- Server-client : 중앙 저장소를 공유한 각각의 클라이언트에서 저장소의 일부만 가져와서 작업후, 중앙저장소에 반영한다.
 * 		- subversion
 * 	- 분산형 : 참여하는 각각의 클라이언트에서 전체저장소에 대한 복제본을 가지고 작업한다.
 * 		- git
 *  
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		dog dog = new dog();
		dog.bark();
	}
	
	
}
