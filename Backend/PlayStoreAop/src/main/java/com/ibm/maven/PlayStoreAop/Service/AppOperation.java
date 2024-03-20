package com.ibm.maven.PlayStoreAop.Service;

public interface AppOperation {

 void upload(App app);
 App download(int id);
 void getList();  //List of all apps
 void list(int id);    //List of applicable apps
}
