/**
 * Created by 方飞坤 on 2017/3/19.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){
        canceled = true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}