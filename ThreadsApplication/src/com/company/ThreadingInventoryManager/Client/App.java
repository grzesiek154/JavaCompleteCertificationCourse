package com.company.ThreadingInventoryManager.Client;

import com.company.ThreadingInventoryManager.InventoryManager;

public class App {

    public static void main(String[] args) throws InterruptedException {

        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });

        inventoryTask.start();
        Thread.sleep(2000);
        //inventoryTask.join();// join sprawi ze ponizsza metoda dispalyTask.start() wykona sie dopeiro po zakonczeniu watku inventorytast
        displayTask.start();
    }
}
