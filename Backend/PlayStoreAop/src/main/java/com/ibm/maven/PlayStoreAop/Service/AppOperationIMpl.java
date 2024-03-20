package com.ibm.maven.PlayStoreAop.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppOperationIMpl implements AppOperation {
	Map<Integer,App> map=new HashMap<Integer,App>();
	@Autowired
    public AppOperationIMpl(Map<Integer, App> map) {
		super();
		this.map = map;
	}
   @Override
	public void upload(App app) {
	   map.put(app.getId(), app);
		System.out.println("Uploading App: " + app.getName());
	}

	@Override
	public App download(int id) {
		System.out.println("Downloading App: " + map.get(id).getName());
		if(!map.get(id).isVisible()) {
			System.out.println("App not available in your region");
			return null;
		}
		return map.get(id);
	}

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		System.out.println("Showing list of all apps present:\n");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(map.get(key));
		}
	}

	@Override
	public void list(int id) {
		System.out.println("Showing list of all apps present:\n");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			if (!map.get(key).isVisible()) {
				continue;
			}
			System.out.println(map.get(key));
		}
//		System.out.println(appMap.hashCode());
		
	}
    
	
	

}
