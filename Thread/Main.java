class Music extends Thread {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("🎵 Music is playing...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

class Download extends Thread {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("⬇️ files is downloading...");
            try { Thread.sleep(1500); } catch (InterruptedException e) {}
        }
    }
}

class Main {
    public static void main(String args[]) {
        Music musicThread = new Music();
        Download downloadThread = new Download();
        
        musicThread.start();   // नवीन थ्रेड सुरु
        downloadThread.start(); // नवीन थ्रेड सुरु
    }
}
