package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		Set<String> optionKeys = args.getOptionNames();
		System.out.println("Option Keys : "+optionKeys);
		
		List<String> list = args.getOptionValues("db");
		System.out.println("Values of DB Key "+list);
		
		List<String> list1 = args.getOptionValues("profile");
		System.out.println("Values of profile Key "+list1);
		
		System.out.println("Does Nature Key Exists: "+args.containsOption("nature"));
		System.out.println("Does DB Key Exists: "+args.containsOption("db"));
		
		List<String> nonOp = args.getNonOptionArgs();
		System.out.println("List of Non Option Args: "+nonOp);
		
		String arr[] = args.getSourceArgs();
		System.out.println(arr);
		System.out.println("All Args: "+Arrays.asList(arr));

	}

}
