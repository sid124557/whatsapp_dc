package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* renamed from: X.6Dk  reason: invalid class name and case insensitive filesystem */
public class C124666Dk extends Handler {
    public final /* synthetic */ C1674180z A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124666Dk(Looper looper, C1674180z r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        for (C1674080y r5 : this.A00.A06) {
            if (Arrays.equals(r5.A07, bArr)) {
                int i = message.what;
                int i2 = r5.A01;
                if (i2 != 3 && i2 != 4) {
                    return;
                }
                if (i == 1) {
                    r5.A01 = 3;
                    r5.A0A.A01(r5);
                    return;
                } else if (i == 2) {
                    r5.A02(false);
                    return;
                } else if (i == 3 && i2 == 4) {
                    r5.A01 = 3;
                    r5.A01(new C143116yM(), 2);
                    return;
                } else {
                    return;
                }
            }
        }
    }
}
