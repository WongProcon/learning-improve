package com.procon.sync;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>卖票</p>
 *
 * @author Procon
 * @since 2022/3/31
 */
public class SaleTicket {

    static class Ticket{
        //票的张数
        public  Integer number = 10000;
        public synchronized   void sale(){
            //判断是否有票
            if(number > 0){
                System.out.println(Thread.currentThread().getName()+":卖出："+number-- +"，剩下："+number);
            }
        }
    }

    static class Sale {
        public static  ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 8, 1,
                TimeUnit.MINUTES, new LinkedBlockingQueue<>(),new ThreadPoolExecutor.DiscardOldestPolicy());
        Ticket ticket = new Ticket();
        public void saleT(){
            for(int i=0; i<3;i++){
                executor.execute(() -> {
                    for (int j = 0; j<40000; j++ ) {
                        ticket.sale();
                    }
                });
            }
        }

    }

    public static void main(String[] args) {
        Sale sale = new Sale();
        sale.saleT();
    }
}
