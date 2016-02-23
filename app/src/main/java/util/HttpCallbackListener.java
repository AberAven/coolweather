package util;

/**
 * Created by wcxyt on 2016/2/23.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
