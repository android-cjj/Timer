# Timer
================================================================================================================================
一个倒计时类，除了可以开始取消倒计时，还可以暂停恢复倒计时，虽说时间一去不复返，我丫停停它总可以吧！为什么有暂停时间这种需求呢？一般来说，我们发送验证码，会有倒计时，一般都是90秒，这种一般只要开始，等结束就可以了。然后没收到，我们在重发！但是像玩游戏倒计时，有时候你有120秒玩游戏，中途比如你有别的任务，也就是支线要玩，但你又不想结束主线，毕竟都快把boss打到半条血了，所以，如果有个暂停时间，在恢复时间的，那就比较人性化了，这只是一个例子，其实可用的场景很多，啊哈哈。

使用说明
------------------------------------------------------------------------------------

###
 DownTimer timer = new DownTimer();//实例化
        timer.setTotalTime(60*1000);//设置毫秒数
        timer.setIntervalTime(1000);//设置间隔数
        timer.setTimerLiener(new DownTimer.TimeListener() {
            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "完成倒计时", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onInterval(long remainTime) {
                tv_scend.setText("还剩" + remainTime / 1000+"秒就完成了");//剩余多少秒
            }
        });
        
        

