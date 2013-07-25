package com.Iba.Mba.DB;

import java.awt.Dialog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.Iba.Mba.assessment;
import com.Iba.Mba.sessionData;
import com.Iba.Mba.tableData;

public class MySQLAccess {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;

	public void SetupConnection() throws Exception {
		// This will load the MySQL driver, each DB has its own driver
		Class.forName("com.mysql.jdbc.Driver");
		// Setup the connection with the DB
		connect = DriverManager.getConnection("jdbc:mysql://localhost/iba?"
				+ "user=root&password=root");

		// Statements allow to issue SQL queries to the database
		statement = connect.createStatement();
	}

	public void setCheckbox(int checkbox[][], int class_code) throws Exception {
		SetupConnection();
		try {
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= 6; j++) {
					if (checkbox[i][j] == 1) {
						System.out.println("out" + i + "obj" + j);
						// Result set get the result of the SQL query
						/*
						 * resultSet = statement .executeQuery(
						 * "select * from iba.bridgingcoursembaoutcomes");
						 */// writeResultSetForCheckBox(resultSet);
							// PreparedStatements can use variables and are more
							// efficient
						preparedStatement = connect
								.prepareStatement("insert into iba.bridgingcoursembaoutcomes values (default,?, ?, ?)");

						// "myuser, webpage, datum, summery, COMMENTS from FEEDBACK.COMMENTS");
						// Parameters start with 1
						preparedStatement.setInt(1, i);
						preparedStatement.setInt(2, j);
						preparedStatement.setInt(3, class_code);
						preparedStatement.executeUpdate();
						System.out.println(preparedStatement.toString());

					}
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addInstructor(String Instructor, String consultationTime,
			String Email, int Contact) throws Exception {
		try {
			SetupConnection();
			preparedStatement = connect
					.prepareStatement("insert into  iba.teacher values (?, ?, ?, ?)");
			preparedStatement.setString(1, Instructor);
			preparedStatement.setString(2, consultationTime);
			preparedStatement.setString(3, Email);
			preparedStatement.setInt(4, Contact);
			preparedStatement.executeUpdate();
			System.out.println(preparedStatement.toString());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void readDataBase(int Class_Code, String Class_Type,
			String Course_Name, String Instructor, String ClassTimings,
			int Room, String SessionDays, int CreditHours,
			String CoursePrerequisies, String ConsultationTime, String Email,
			int Contact, String CourseDescription, String CourseObjective,
			String TeachingAndLearningMethodology,
			String TextBookAndPreCourseReading,
			String PrerequisiteSkilleAndKnowledge) throws Exception {
		try {

			addInstructor(Instructor, ConsultationTime, Email, Contact);
			addCourse(Course_Name, Class_Type, CreditHours, CoursePrerequisies);
			addMainTable(Class_Code, ClassTimings, Room, SessionDays,
					Course_Name, Instructor);
			addOtherDetails(CourseDescription, CourseObjective,
					TeachingAndLearningMethodology,
					TextBookAndPreCourseReading,
					PrerequisiteSkilleAndKnowledge, Class_Code);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	private void addMainTable(int class_Code, String classTimings, int room,
			String sessionDays, String course_Name, String instructor)
			throws Exception {
		// TODO Auto-generated method stub
		try {
			SetupConnection();
			// writeResultSet(resultSet);
			// PreparedStatements can use variables and are more efficient
			preparedStatement = connect
					.prepareStatement("insert into  iba.coursemaintable values (?, ?, ?, ?, ? , ? )");

			// "myuser, webpage, datum, summery, COMMENTS from FEEDBACK.COMMENTS");
			// Parameters start with 1
			preparedStatement.setInt(1, class_Code);
			preparedStatement.setString(2, classTimings);
			preparedStatement.setInt(3, room);
			preparedStatement.setString(4, sessionDays);
			preparedStatement.setString(5, course_Name);
			preparedStatement.setString(6, instructor);
			preparedStatement.executeUpdate();
			System.out.println(preparedStatement.toString());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void addOtherDetails(String courseDescription,
			String courseObjective, String teachingAndLearningMethodology,
			String textBookAndPreCourseReading,
			String prerequisiteSkilleAndKnowledge, int class_Code) {
		// TODO Auto-generated method stub
		try {
			SetupConnection();
			preparedStatement = connect
					.prepareStatement("insert into  iba.courseothertable values (?, ?, ?, ?, ?, ?)");
			preparedStatement.setString(1, courseDescription);
			preparedStatement.setString(2, courseObjective);
			preparedStatement.setString(3, teachingAndLearningMethodology);
			preparedStatement.setString(4, textBookAndPreCourseReading);
			preparedStatement.setString(5, prerequisiteSkilleAndKnowledge);
			preparedStatement.setInt(6, class_Code);
			preparedStatement.executeUpdate();
			System.out.println(preparedStatement.toString());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private void addCourse(String course_Name, String class_Type,
			int creditHours, String coursePrerequisies) {
		// TODO Auto-generated method stub
		try {
			SetupConnection();
			preparedStatement = connect
					.prepareStatement("insert into  iba.course values (?, ?, ?, ?)");
			preparedStatement.setString(1, course_Name);
			preparedStatement.setString(2, class_Type);
			preparedStatement.setInt(3, creditHours);
			preparedStatement.setString(4, coursePrerequisies);
			preparedStatement.executeUpdate();
			System.out.println(preparedStatement.toString());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void addKnowledge(ArrayList<String> text, int count, int classnbr)
			throws Exception {
		try {
			SetupConnection();

			for (int i = 0; i < text.size(); i++) {

				preparedStatement = connect
						.prepareStatement("insert into  iba.mbacourseknowledgeoutcome values (default, ?, ?)");
				preparedStatement.setString(1, text.get(i).toString());
				preparedStatement.setInt(2, classnbr);
				preparedStatement.executeUpdate();
				System.out.println(preparedStatement.toString());

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void addSkills(ArrayList<String> text, int count, int classnbr)
			throws Exception {
		try {
			SetupConnection();

			for (int i = 0; i < text.size(); i++) {
				preparedStatement = connect
						.prepareStatement("insert into  iba.mbacourseskillabilitiesoutcome values (default, ?, ?)");
				preparedStatement.setString(1, text.get(i).toString());
				preparedStatement.setInt(2, classnbr);
				preparedStatement.executeUpdate();
				System.out.println(preparedStatement.toString());
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public ArrayList<String> getKnowledgeOutcomes(int classNbr)
			throws Exception {
		ArrayList<String> text = new ArrayList<String>();
		SetupConnection();
		ResultSet resultSet = null;
		// Result set get the result of the SQL query
		resultSet = statement
				.executeQuery("select * from iba.mbacourseknowledgeoutcome where CourseMainTable_Class_code ="
						+ classNbr);
		while (resultSet.next()) {
			text.add(resultSet.getString("Text"));
			System.out.println(resultSet.getInt("KnowledgeOutcome_ID")
					+ " ClassNbr is " + classNbr + " Text is "
					+ resultSet.getString("Text"));
		}

		return text;
	}

	public ArrayList<String> getSkillsOutcomes(int classNbr) throws Exception {
		ArrayList<String> text = new ArrayList<String>();
		SetupConnection();
		ResultSet resultSet = null;
		// Result set get the result of the SQL query
		resultSet = statement
				.executeQuery("select * from iba.mbacourseskillabilitiesoutcome where CourseMainTable_Class_code ="
						+ classNbr);
		while (resultSet.next()) {
			text.add(resultSet.getString("Text"));
			System.out.println(resultSet.getInt("SkillAbilitiesOutcome_ID")
					+ " ClassNbr is " + classNbr + " Text is "
					+ resultSet.getString("Text"));
		}

		return text;
	}

	public ArrayList<tableData> getKnowledgeOutcomes1(int classNbr)
			throws Exception {
		ArrayList<tableData> text = new ArrayList<tableData>();
		SetupConnection();
		ResultSet resultSet = null;
		// Result set get the result of the SQL query
		resultSet = statement
				.executeQuery("select * from iba.mbacourseknowledgeoutcome where CourseMainTable_Class_code ="
						+ classNbr);
		
		while (resultSet.next()) {
			tableData data= new tableData(resultSet.getInt("KnowledgeOutcome_ID"), resultSet.getString("Text"));
			text.add(data);
			System.out.println(resultSet.getInt("KnowledgeOutcome_ID")
					+ " ClassNbr is " + classNbr + " Text is "
					+ resultSet.getString("Text"));
		}

		return text;
	}

	public ArrayList<tableData> getSkillsOutcomes1(int classNbr) throws Exception {
		ArrayList<tableData> text = new ArrayList<tableData>();
		SetupConnection();
		ResultSet resultSet = null;
		// Result set get the result of the SQL query
		resultSet = statement
				.executeQuery("select * from iba.mbacourseskillabilitiesoutcome where CourseMainTable_Class_code ="
						+ classNbr);
		while (resultSet.next()) {
			tableData data= new tableData(resultSet.getInt("SkillAbilitiesOutcome_ID"), resultSet.getString("Text"));
			text.add(data);
			System.out.println(resultSet.getInt("SkillAbilitiesOutcome_ID")
					+ " ClassNbr is " + classNbr + " Text is "
					+ resultSet.getString("Text"));
		}

		return text;
	}
	
	
	public void addBridgeDataKnowledge(int checkbox[][], ArrayList<tableData> arrayList,
			int classNbr) throws Exception {

		try {
			SetupConnection();

			for (int i = 0; i < arrayList.size(); i++) {
				for (int j = 0; j < checkbox.length-1; j++) {
					if (checkbox[i][j] == 1) {
						preparedStatement = connect
								.prepareStatement("insert into  iba.bridgingoutcomesknowledge values (default, ?, ?,?)");
						preparedStatement.setInt(1, classNbr);
						preparedStatement.setInt(2, j);
						preparedStatement.setInt(3, arrayList.get(i).getId());
						preparedStatement.executeUpdate();
						System.out.println(preparedStatement.toString());
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void addBridgeDataSkills(int checkbox[][], ArrayList<tableData> arrayList,
			int classNbr) throws Exception {

		try {
			SetupConnection();

			for (int i = 0; i < arrayList.size(); i++) {
				for (int j = 0; j < checkbox.length-1; j++) {
					if (checkbox[i][j] == 1) {
						preparedStatement = connect
								.prepareStatement("insert into  iba.bridgingoutomesskills values (default, ?, ?,?)");
						preparedStatement.setInt(1, classNbr);
						preparedStatement.setInt(2, j);
						preparedStatement.setInt(3, arrayList.get(i).getId());
						preparedStatement.executeUpdate();
						System.out.println(preparedStatement.toString());
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	public void addSession(ArrayList<sessionData> arrayList,
			int classNbr) throws Exception {

		try {
			SetupConnection();

			for (int i = 0; i < arrayList.size(); i++) {
				
						preparedStatement = connect
								.prepareStatement("insert into  iba.courseplan values (default, ?, ?,?,?)");
						preparedStatement.setString(1, arrayList.get(i).getChapters());
						preparedStatement.setString(2, arrayList.get(i).getSessionTopic());
						preparedStatement.setString(3, arrayList.get(i).getAssessments());
						preparedStatement.setInt(4, classNbr);
						preparedStatement.executeUpdate();
						System.out.println(preparedStatement.toString());
					
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void addAssessment(ArrayList<assessment> arrayList,
			int classNbr) throws Exception {

		try {
			SetupConnection();

			for (int i = 0; i < arrayList.size(); i++) {
				
						preparedStatement = connect
								.prepareStatement("insert into  iba.assessment values (default, ?, ?,?,?)");
						preparedStatement.setString(1, arrayList.get(i).getAssessments());
						preparedStatement.setString(2, arrayList.get(i).getDuedate());
						preparedStatement.setString(3, arrayList.get(i).getRemarks());
						preparedStatement.setInt(4, classNbr);
						preparedStatement.executeUpdate();
						System.out.println(preparedStatement.toString());
					
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void addMarksDestribution(int marks[],String learning[],
			int classNbr) throws Exception {

		try {
			SetupConnection();
						preparedStatement = connect
								.prepareStatement("insert into  iba.markdestribution values (?, ?, ?,?,?,?, ?, ?,?,?,?, ?, ?,?,?,?, ?, ?,?,?,?, ?, ?,?,?,?,?,?)");
						preparedStatement.setInt(1, marks[0]);
						preparedStatement.setInt(2, marks[1]);
						preparedStatement.setInt(3, marks[2]);
						preparedStatement.setInt(4, marks[3]);
						preparedStatement.setString(5, learning[0]);
						preparedStatement.setInt(6, marks[4]);
						preparedStatement.setInt(7, marks[5]);
						preparedStatement.setInt(8, marks[6]);
						preparedStatement.setInt(9, marks[7]);
						preparedStatement.setString(10, learning[1]);
						preparedStatement.setInt(11, marks[8]);
						preparedStatement.setInt(12, marks[9]);
						preparedStatement.setInt(13, marks[10]);
						preparedStatement.setInt(14, marks[11]);
						preparedStatement.setString(15, learning[2]);
						preparedStatement.setInt(16, marks[12]);
						preparedStatement.setInt(17, marks[13]);
						preparedStatement.setInt(18, marks[14]);
						preparedStatement.setInt(19, marks[15]);
						preparedStatement.setString(20, learning[3]);
						preparedStatement.setInt(21, marks[16]);
						preparedStatement.setInt(22, marks[17]);
						preparedStatement.setInt(23, marks[18]);
						preparedStatement.setInt(24, marks[19]);
						preparedStatement.setString(25, learning[4]);
						preparedStatement.setInt(26, marks[20]);
						preparedStatement.setString(27, learning[5]);
						preparedStatement.setInt(28, classNbr);
						preparedStatement.executeUpdate();
						System.out.println(preparedStatement.toString());			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	private void writeMetaData(ResultSet resultSet) throws SQLException {
		// Now get some metadata from the database
		// Result set get the result of the SQL query

		System.out.println("The columns in the table are: ");

		System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
			System.out.println("Column " + i + " "
					+ resultSet.getMetaData().getColumnName(i));
		}
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			int Class_Code = resultSet.getInt("Class_Code");
			String Class_Type = resultSet.getString("Class_Type");
			String Course_Name = resultSet.getString("Course_Name");
			String Instructor = resultSet.getString("Instructor");
			String ClassTimings = resultSet.getString("ClassTimings");
			String Room = resultSet.getString("Room");
			String SessionDays = resultSet.getString("SessionDays");
			String CreditHours = resultSet.getString("CreditHours");
			String CoursePrerequisies = resultSet
					.getString("CoursePrerequisies");
			String ConsultationTime = resultSet.getString("ConsultationTime");
			String Email = resultSet.getString("Email");
			String Contact = resultSet.getString("Contact");
			String CourseDescription = resultSet.getString("CourseDescription");
			String CourseObjective = resultSet.getString("CourseObjective");
			String TeachingAndLearningMethodology = resultSet
					.getString("TeachingAndLearningMethodology");
			String TextBookAndPreCourseReading = resultSet
					.getString("TextBookAndPreCourseReading");
			String PrerequisiteSkilleAndKnowledge = resultSet
					.getString("PrerequisiteSkilleAndKnowledge");

			System.out.println("Class_Code: " + Class_Code);
			System.out.println("Class_Type: " + Class_Type);
			System.out.println("Course_Name: " + Course_Name);
			System.out.println("Instructor: " + Instructor);
			System.out.println("ClassTimings: " + ClassTimings);
			System.out.println("Room: " + Room);
			System.out.println("SessionDays: " + SessionDays);
			System.out.println("CreditHours: " + CreditHours);
			System.out.println("CoursePrerequisies: " + CoursePrerequisies);
			System.out.println("ConsultationTime: " + ConsultationTime);
			System.out.println("Email: " + Email);
			System.out.println("Contact: " + Contact);
			System.out.println("CourseDescription: " + CourseDescription);
			System.out.println("CourseObjective: " + CourseObjective);
			System.out.println("TeachingAndLearningMethodology: "
					+ TeachingAndLearningMethodology);
			System.out.println("TextBookAndPreCourseReading: "
					+ TextBookAndPreCourseReading);
			System.out.println("PrerequisiteSkilleAndKnowledge: "
					+ PrerequisiteSkilleAndKnowledge);
		}
	}

	private void writeResultSetForCheckBox(ResultSet resultSet)
			throws SQLException {
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			int Class_Code = resultSet.getInt("MBACourse_Class_Code");
			int Objective_ID = resultSet.getInt("Objective_ID");
			int Outcomes_ID = resultSet.getInt("Outcomes_ID");
			System.out.println("MBACourse_Class_Code: " + Class_Code);
			System.out.println("Objective_ID: " + Objective_ID);
			System.out.println("Outcomes_ID: " + Outcomes_ID);

		}
	}

}