package com.example.demo;

public class ThreadSafeSignleton {

    volatile ThreadSafeSignleton obj = null;

    private ThreadSafeSignleton(){}

    public ThreadSafeSignleton getInstance(){
          if(obj == null) {
              synchronized (ThreadSafeSignleton.class) {
                  if (obj == null) {
                      obj = new ThreadSafeSignleton();
                  }
              }
          }
          return obj;
    }
}
