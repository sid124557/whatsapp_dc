package X;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.7qe  reason: invalid class name and case insensitive filesystem */
public class C161847qe {
    public static int A00 = Integer.MAX_VALUE;
    public static final int A01 = Math.max((int) (((float) Runtime.getRuntime().availableProcessors()) * 1.5f), 3);
    public static final Handler A02 = AnonymousClass000.A0A();
    public static volatile AnonymousClass7FF A03;

    public static AnonymousClass7FF A00() {
        if (A03 == null) {
            synchronized (C161847qe.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass7FF(A01);
                }
            }
        }
        return A03;
    }

    public static void A01(C172748Mo r3) {
        int i = A00;
        A00 = i - 1;
        r3.A00 = ((long) i) << 32;
    }

    public static void A02(C172748Mo r1) {
        A01(r1);
        AnonymousClass7FF.A00(r1, (String) null);
    }

    public static void A03(String str) {
        BlockingQueue<C172748Mo> blockingQueue = A00().A00;
        for (C172748Mo r1 : blockingQueue) {
            if (str.equals(r1.A02)) {
                blockingQueue.remove(r1);
                if (r1 instanceof C125986Kg) {
                    C161247pI.A0A.release();
                } else if (r1 instanceof C125976Kf) {
                    ((C125976Kf) r1).A05.A03();
                }
            }
        }
    }
}
