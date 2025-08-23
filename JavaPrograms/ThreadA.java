public class ThreadA{
     public static void main(String[] args){
        ThreadC t1 = new ThreadC();
        t1.start();

        ThreadD t3 = new ThreadD();
        t3.start();
    
        // Thread t2 = new Thread(new ThreadB());
        // t2.start();
    }
}
 
 class ThreadC extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(i);
            if(i==2){
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println("Error");
                }
            }
        }
    }
}
//  class ThreadB implements Runnable{
//     public void run(){
//         for(int i=0; i<=5; i++){
//             System.out.println(i);
//         }
//     }
// }

class ThreadD extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(i);
            if(i==2){
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println("Error");
                }
            }
        }
    }
}
