package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.7Io  reason: invalid class name and case insensitive filesystem */
public class C148487Io {
    public static C148487Io A02;
    public final PowerManager A00;
    public final ExecutorService A01 = Executors.newSingleThreadExecutor();

    public C148487Io(Context context) {
        this.A00 = (PowerManager) context.getSystemService("power");
    }
}
