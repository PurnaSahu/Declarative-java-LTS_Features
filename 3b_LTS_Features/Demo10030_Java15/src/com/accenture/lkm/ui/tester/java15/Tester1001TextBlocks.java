package com.accenture.lkm.ui.tester.java15;

//Make sure JRE compliance pointing to JRE15.
public class Tester1001TextBlocks {
	public static void main(String[] args) {
		String queryBeforeJava15 = "select * from product where productName=\'IPhone\' and productCategory=\'N\'";
		System.out.println(queryBeforeJava15);
		
		// No need to escape sequences.
		String queryFromJava15 = """
							         select * from product where productName='IPhone' and productCategory='N'
                               """;
		System.out.println(queryFromJava15);
		
		String htmlBeforeJava13 = "<html>\n" +
					"   <body>\n" +
					"      <p>Hello, World</p>\n" +
					"   </body>\n" +
					"</html>\n";
		System.out.println(htmlBeforeJava13);

		String htmlInJava15 = """
							<html>
								<body>
									<p>Hello, Text Blocks</p>
							 	</body>
							</html>
						    """;
		System.out.println(htmlInJava15);
	}
}