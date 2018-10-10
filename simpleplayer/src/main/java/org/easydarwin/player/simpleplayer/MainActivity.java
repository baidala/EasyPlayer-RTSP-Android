package org.easydarwin.player.simpleplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.TextureView;

import org.easydarwin.video.EasyPlayerClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextureView textureView = findViewById(R.id.texture_view);
        /**
         * 参数说明
         * 第一个参数为Context,第二个参数为KEY
         * 第三个参数为的textureView,用来显示视频画面
         * 第四个参数为一个ResultReceiver,用来接收SDK层发上来的事件通知;
         * 第五个参数为I420DataCallback,如果不为空,那底层会把YUV数据回调上来.
         */
        final String key = "79393674363536526D343241692F4E61705178304A655A76636D63755A57467A65575268636E64706269356C59584E356347786865575679567778576F502B6C34456468646D6C754A6B4A68596D397A595541794D4445325257467A65555268636E6470626C526C5957316C59584E35";
        EasyPlayerClient client = new EasyPlayerClient(this, key, textureView, null, null);
        client.play("rtmp://rtmp.cdn.ua/vo.org.ua_live/_definst_/-1360800839_519885679");
    }
}
