package X;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* renamed from: X.7VT  reason: invalid class name */
public abstract class AnonymousClass7VT {
    public static volatile CronetEngine A01;
    public final C54292oU A00;

    public CronetEngine A00() {
        CronetEngine cronetEngine;
        if (this instanceof C133626hg) {
            C133626hg r4 = (C133626hg) this;
            if (A01 == null) {
                synchronized (C133626hg.class) {
                    if (A01 == null) {
                        try {
                            Context context = r4.A00.A00;
                            CronetEngine.Builder builder = new CronetEngine.Builder(context);
                            File cacheDir = context.getCacheDir();
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("http/cronet/");
                            File A0A = C18270x1.A0A(cacheDir, "h1", A0o);
                            if (!A0A.exists()) {
                                A0A.mkdirs();
                            }
                            builder.setStoragePath(A0A.getPath());
                            String str = C58172up.A0W;
                            Set A002 = C32571r9.A00();
                            Calendar instance = Calendar.getInstance();
                            instance.add(13, Integer.MAX_VALUE);
                            builder.addPublicKeyPins(str, A002, true, instance.getTime());
                            builder.enableHttp2(false);
                            builder.enableQuic(true);
                            builder.enableHttpCache(3, 51200);
                            Set set = C38992Ag.A00;
                            if (!set.isEmpty()) {
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    builder.addQuicHint(AnonymousClass001.A0m(it), 443, 443);
                                }
                            }
                            A01 = builder.build();
                        } catch (Throwable th) {
                            Log.e("QUICCronetEngineProvider/buildCronetEngine cronet engine building failed", th);
                            r4.A00.A09("QUICCronetEngineProvider", AnonymousClass000.A0a("cronet engine building failed\n", AnonymousClass001.A0o(), th), th);
                        }
                    }
                }
            }
            return A01;
        }
        synchronized (this) {
            if (A01 == null) {
                synchronized (C133616hf.class) {
                    if (A01 == null) {
                        try {
                            CronetEngine.Builder builder2 = new CronetEngine.Builder(this.A00.A00);
                            String str2 = C58172up.A0L;
                            Set A003 = C32571r9.A00();
                            Calendar instance2 = Calendar.getInstance();
                            instance2.add(13, Integer.MAX_VALUE);
                            builder2.addPublicKeyPins(str2, A003, true, instance2.getTime());
                            builder2.enableHttp2(true);
                            builder2.enableHttpCache(0, 0);
                            A01 = builder2.build();
                        } catch (Exception e) {
                            Log.e("CronetEngineProvider/buildCronetEngine cronet engine building failed", e);
                        }
                    }
                }
            }
            cronetEngine = A01;
        }
        return cronetEngine;
    }

    public CronetEngine A01() {
        if (A01 != null) {
            return A01;
        }
        if (!C161637q9.A02()) {
            synchronized (AnonymousClass7VT.class) {
                if (!C161637q9.A02()) {
                    Task A002 = C161637q9.A00(this.A00.A00);
                    try {
                        Tasks.await(A002);
                        if (A002.isSuccessful()) {
                            CronetEngine A003 = A00();
                            return A003;
                        }
                    } catch (Exception unused) {
                        Log.e("AbstractCronetEngineProvider/installAndCreateCronetEngine/Sync cronet engine install failed");
                    }
                }
            }
        }
        return A00();
        return A00();
    }

    public AnonymousClass7VT(C54292oU r1) {
        this.A00 = r1;
    }
}
