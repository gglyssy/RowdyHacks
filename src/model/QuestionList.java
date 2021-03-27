package model;

import java.util.ArrayList;
import java.util.HashMap;

public class QuestionList {
	String listName;
	HashMap<Categories, ArrayList<Questions>> questionMap = new HashMap<Categories, ArrayList<Questions>>();
	ArrayList<Questions> dataList;
	ArrayList<Categories> categoryList;
	
	public QuestionList(String listName, HashMap <Categories, ArrayList<Questions>> questionMap) {
		this.listName = listName;
		this.questionMap = questionMap;
		this.dataList = dataList;
		this.categoryList = categoryList;
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
	
	
	
	
}
