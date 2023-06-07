package org.designpatterns.Singleton;

public class SingleObject {

    private static SingleObject singleObject;

    private SingleObject(){}

    public static SingleObject getSingleObject() {
        if(singleObject==null){
            synchronized (SingleObject.class){
                if(singleObject==null){
                    singleObject =new SingleObject();
                }
            }
        }
        return singleObject;
    }


}
