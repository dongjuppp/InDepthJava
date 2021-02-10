package thread;

public class WordThread extends Thread {

    // 메인으로 돌아가는 쓰레드
    @Override
    public void run(){
        int k=0;
        while(true){
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            k++;
            if(k==10){
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
            System.out.println("글을 작성중");
        }
    }

    // 데몬 쓰레드를 만들고 실행시키는 메소드
    public void startBackground(){
        Thread backGround=new Thread(()->{
            while(true){
                try{
                    Thread.sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("글을 저장했습니다");
            }
        });
        backGround.setDaemon(true);
        backGround.start();
    }
}
