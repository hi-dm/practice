package jvm;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import javafx.scene.chart.PieChart;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {

    private static LoadingCache<String, String > loadingCache = CacheBuilder.newBuilder()
            //最大容量为100（基于容量进行回收）
            .maximumSize(10)
            //配置写入后多久使缓存过期-下文会讲述
            .expireAfterWrite(1, TimeUnit.SECONDS)
            //配置写入后多久刷新缓存-下文会讲述
            .refreshAfterWrite(2, TimeUnit.SECONDS)
            //key使用弱引用-WeakReference
            .weakKeys()
            //当Entry被移除时的监听器
            .removalListener(notification -> System.out.println(notification ))
            //创建一个CacheLoader，重写load方法，以实现"当get时缓存不存在，则load，放到缓存，并返回"的效果
            .build(new CacheLoader<String, String>() {
                //重点，自动写缓存数据的方法，必须要实现
                @Override
                public String load(String key) throws Exception {
                    return "value_" + key;
                }
                //异步刷新缓存-下文会讲述
                @Override
                public ListenableFuture<String> reload(String key, String oldValue) throws Exception {
                    return super.reload(key, oldValue);
                }
            });
    public static void  getTest(String x) throws Exception {
        //测试例子，调用其get方法，cache会自动加载并返回
        String value = loadingCache.get(x);
        System.out.println(value);

    }
    public static void main(String[] args) throws Exception {
        Thread.sleep(1*60*1000);
       List<Data> dataList=new ArrayList<Data>();
        for (int i = 0; i < 10000; i++) {
            dataList.add (new  Data( ));
        }
        Thread.sleep(1*60*1000);

    }
    static class Data{}

}
