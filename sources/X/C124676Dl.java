package X;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;

/* renamed from: X.6Dl  reason: invalid class name and case insensitive filesystem */
public class C124676Dl extends Handler {
    public final /* synthetic */ C160557nr A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124676Dl(Looper looper, C160557nr r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        AnonymousClass7NT r0;
        C160557nr r1 = this.A00;
        int i = message.what;
        if (i == 0) {
            r0 = (AnonymousClass7NT) message.obj;
            r1.A02.queueInputBuffer(r0.A01, 0, r0.A02, r0.A03, r0.A00);
        } else if (i == 1) {
            r0 = (AnonymousClass7NT) message.obj;
            int i2 = r0.A01;
            MediaCodec.CryptoInfo cryptoInfo = r0.A04;
            long j = r0.A03;
            int i3 = r0.A00;
            try {
                synchronized (C160557nr.A06) {
                    r1.A02.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                }
            } catch (RuntimeException e) {
                AnonymousClass0IR.A00((Object) null, e, r1.A05);
            }
        } else if (i != 2) {
            AnonymousClass0IR.A00((Object) null, AnonymousClass001.A0e(String.valueOf(i)), r1.A05);
            return;
        } else {
            r1.A04.A01();
            return;
        }
        ArrayDeque arrayDeque = C160557nr.A07;
        synchronized (arrayDeque) {
            arrayDeque.add(r0);
        }
    }
}
