package com.ejemplo.practicaxml;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

import org.junit.Test;


	@RunWith(Suite.class) 
	@Suite.SuiteClasses({TestPersona.class,Testlistapersonas.class})
	public class TestSuitePersonas {}
