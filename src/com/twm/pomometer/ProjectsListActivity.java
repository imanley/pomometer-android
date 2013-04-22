package com.twm.pomometer;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;



public class ProjectsListActivity extends ListActivity {
	
	String url = "http://pomometer.herokuapp.com/projects.json";
	
	@Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_projects_list);
	    InputStream source = retrieveStream(url);
	    Gson gson = new Gson();
	    Reader reader = new InputStreamReader(source);
	    Project project = gson.fromJson(reader, Project.class);
	    Toast.makeText(this, project.getName(), Toast.LENGTH_SHORT).show();
	  }
	
	  private InputStream retrieveStream(String url){
		  DefaultHttpClient client = new DefaultHttpClient();
		  HttpGet getRequest = new HttpGet(url);
		  try{
			  HttpResponse getResponse = client.execute(getRequest);
			  final int statusCode = getResponse.getStatusLine().getStatusCode();
			  if (statusCode != HttpStatus.SC_OK){
				  Log.w(getClass().getSimpleName(), "Error " + statusCode + " for url " + url);
				  return null;
			  }
			  HttpEntity getResponseEntity = getResponse.getEntity();
			  return getResponseEntity.getContent();
		  }catch (IOException e){
			  getRequest.abort();
			  Log.w(getClass().getSimpleName(), "Error for url " + url, e);
		  }
		return null;
	  }

}
	