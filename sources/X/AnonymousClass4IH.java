package X;

import android.content.Context;
import com.whatsapp.Me;
import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;
import com.whatsapp.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.4IH  reason: invalid class name */
public class AnonymousClass4IH implements Callable {
    public Object A00;
    public final int A01;

    public AnonymousClass4IH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final Object A00(AnonymousClass4IH r5) {
        AnonymousClass200 r2;
        C56972sr r52 = (C56972sr) r5.A00;
        try {
            AnonymousClass0RZ.A01("MeManager/loadMe");
            C55992rF r4 = r52.A0A;
            r4.A03();
            Log.i("memanager/load-me");
            Context context = r52.A0B.A00;
            if (C18300x5.A1V(context.getFilesDir(), "me")) {
                try {
                    FileInputStream openFileInput = context.openFileInput("me");
                    try {
                        r2 = new AnonymousClass200(r52, openFileInput);
                        r52.A0S((Me) r2.readObject());
                        r4.A01();
                        r2.close();
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                    } catch (Throwable th) {
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        throw th;
                    }
                } catch (ClassNotFoundException e) {
                    Log.w("memanager/read_me/serialization_error", e);
                } catch (IOException e2) {
                    Log.e("memanager/read_me/io_error", e2);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            if (r4.A05()) {
                r4.A02();
            }
            AnonymousClass0RZ.A00();
            return null;
            throw th;
        } catch (Throwable th3) {
            C55992rF r1 = r52.A0A;
            if (r1.A05()) {
                r1.A02();
            }
            AnonymousClass0RZ.A00();
            throw th3;
        }
    }

    public final Object call() {
        switch (this.A01) {
            case 0:
                return A00(this);
            case 1:
                return ((C621133n) this.A00).A00.A04();
            case 2:
                ((AnonymousClass8KC) this.A00).A08();
                return C18290x4.A0Z();
            case 3:
                return ((C621133n) this.A00).A0D();
            case 4:
                return Integer.valueOf(((C621133n) this.A00).A07.A01());
            case 5:
                C72303dV r1 = (C72303dV) this.A00;
                if (C56972sr.A00(r1.A01) != null) {
                    return null;
                }
                r1.A02.A01();
                return null;
            case 6:
                return ((AnonymousClass312) this.A00).A01();
            case 7:
                return ((AnonymousClass312) this.A00).A04();
            case 8:
                return ((RotateSignedPreKeyJob) this.A00).A01.A0D();
            default:
                return ((SendRetryReceiptJob) this.A00).A08();
        }
    }
}
