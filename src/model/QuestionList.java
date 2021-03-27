package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class QuestionList {
	String listName;
	HashMap<Categories, ArrayList<Questions>> questionMap = new HashMap<Categories, ArrayList<Questions>>();
	ArrayList<Questions> dataList;
	ArrayList<Categories> categoryList;
	
	public QuestionList(String listName, HashMap <Categories, ArrayList<Questions>> questionMap) {
		this.listName = listName;
		this.questionMap = questionMap;
		this.dataList = new ArrayList<Questions>();
		this.categoryList = new ArrayList<Categories>();
	}
	
	public void setListName(String listName) {
		this.listName = listName;
	}
	
	public String getListName( ) {
		return listName;
	}
	
	public void setQuestionMap(HashMap <Categories, ArrayList<Questions>> questionMap) {
		this.questionMap = questionMap;
	}
	
	public HashMap <Categories, ArrayList<Questions>> getQuestionMap() {
		return questionMap;
	}
	
	public void setDataList(ArrayList<Questions> dataList) {
		this.dataList = dataList;
	}
	
	public ArrayList<Questions> getDataList(){
		return dataList;
	}
	
	
	public void setCategoryList(ArrayList<Categories> categoryList) {
		this.categoryList = categoryList;
	}
	
	public ArrayList<Categories> getCategoryList(){
		return categoryList;
	}
	
	public void addQuestion(Questions q) {
		dataList.add(q);
	}
	
	public void addCategory(Categories c) {
		categoryList.add(c);
	}
	
	public void loadData(String filename) throws IOException {
		//File file = new File(filename);
		
		
			try 
			{
				//Scanner inputStream = new Scanner(file);
				String data = "";
				BufferedReader br = new BufferedReader(new FileReader(filename));
				while ((data = br.readLine()) != null) 
				{
					//String data = inputStream.nextLine();
					String splitBy = ",";
					String [] dataComponents = data.split(splitBy);
					String question = dataComponents[0];
					String choice1 = dataComponents[1];
					String choice2 = dataComponents[2];
					String choice3 = dataComponents[3];
					String choice4 = dataComponents[4];
					String answer = dataComponents[5];
					String category = dataComponents[6];
				
					Questions q = new Questions(question, choice1, choice2, choice3, choice4, answer, category);
					addQuestion(q);
				}
			//inputStream.close();
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public void loadCategories () {
		Categories history = new Categories("History");
		Categories movies = new Categories("Movies");
		Categories sports = new Categories("Sports");
		Categories shows = new Categories("tvShows");
		
		addCategory(history);
		addCategory(movies);
		addCategory(sports);
		addCategory(shows);
	}
	
	public HashMap<Categories, ArrayList<Questions>> createMap(ArrayList<Categories> categoryAL, ArrayList<Questions> questionAL) {
		HashMap<Categories, ArrayList<Questions>> questionMap = new HashMap<Categories, ArrayList<Questions>>();
		int i;
		int j;
		
		for(i = 0; i < categoryAL.size(); i++) {
			ArrayList<Questions> newQuestionAL = new ArrayList<Questions>();
			for(j = 0; j < questionAL.size(); j++)
			{
				if(questionAL.get(j).getCategory().equals(categoryAL.get(i).getCategoryName()))
				{
					newQuestionAL.add(questionAL.get(j));
				}
			}
			questionMap.put(categoryAL.get(i), newQuestionAL);
			
		}
		
		return questionMap;
	}
	
	
}
