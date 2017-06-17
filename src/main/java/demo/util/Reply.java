package demo.util;

import com.google.gson.Gson;

/**
 * Created by haol on 2017/4/25.
 */
public class Reply<T> {
        private int code; // 0  为无错误，1为有错误，2为信息不足补信息, 3为请求信息为空, 4为抛异常
        private String msg;//具体信息
        private T data;//返回需要的数据



        public Reply(int code, String msg, T data) {
                this.code = code;
                this.msg = msg;
                this.data = data;
        }

        public Reply(int code, String msg) {
                this.code = code;
                this.msg = msg;
        }

        public  String toJson(){
                Gson gson = new Gson();
                return gson.toJson(this);
        }
}
