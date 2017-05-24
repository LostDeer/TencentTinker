package meng.tencenttinker.app;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by LiChaoBo on 2017/5/23.
 */

public class App extends TinkerApplication {
    public App() {
        super(ShareConstants.TINKER_ENABLE_ALL, "meng.tencenttinker.app.AppLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
