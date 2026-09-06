package git.artdeell.dnbootstrap.utils;

import android.os.Handler;
import android.os.Looper;

public class Utils {
    private static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());

    public static void runOnUiThread(Runnable runnable) {
        MAIN_HANDLER.post(runnable);
    }
}
