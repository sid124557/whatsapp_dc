package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.3dO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72233dO implements ThreadFactory {
    public final /* synthetic */ String A00;

    public final Thread newThread(Runnable runnable) {
        return new C173778Rq(runnable, this.A00);
    }

    public /* synthetic */ C72233dO(String str) {
        this.A00 = str;
    }
}
