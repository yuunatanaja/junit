package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {
	

	
	@CsvSource({
		"GlassFish,Oracle,true",
		"GlassFish,DB2,true",
		"GlassFish,PostgreSQL,true",
		"GlassFish,MySQL,true",
		"JBoss,Oracle,false",
		"JBoss,DB2,true",
		"JBoss,PostgreSQL,true",
		"JBoss,MySQL,false",
		"Tomcat,Oracle,false",
		"Tomcat,DB2,false",
		"Tomcat,PostgreSQL,false",
		"Tomcat,MySQL,true"
		
	
	})
	
	@ParameterizedTest
	void testIsSupport(ApplicationServer appServer, Database db,boolean support) {
		Frameworks frameworks = new Frameworks();
		
		assertEquals(support,frameworks.isSupport(appServer, db));
		
		
		
		
		
		
	}}


