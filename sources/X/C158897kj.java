package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7kj  reason: invalid class name and case insensitive filesystem */
public class C158897kj {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C153247av A04;
    public C153537bV A05;
    public C158917kl A06;
    public C158917kl A07;
    public AnonymousClass7QR A08;
    public HashSet A09;
    public boolean A0A;
    public C153247av[] A0B;
    public final long A0C;
    public final Handler.Callback A0D;
    public final Handler A0E;
    public final C151867Wp A0F;
    public final C180608lL A0G;
    public final AnonymousClass7UB A0H;
    public final Thread.UncaughtExceptionHandler A0I;
    public final List A0J = AnonymousClass0x9.A18();
    public final Map A0K = AnonymousClass001.A0t();
    public final Map A0L = AnonymousClass001.A0t();
    public final ExecutorService A0M;

    public final void A01() {
        List list;
        this.A00 = 0;
        AnonymousClass7VY r4 = new AnonymousClass7VY();
        while (true) {
            list = this.A0J;
            if (list.isEmpty()) {
                break;
            }
            try {
                ((Future) list.remove(0)).get();
            } catch (Exception e) {
                r4.A00(e);
            }
        }
        list.clear();
        Map map = this.A0K;
        Iterator it = C18310x6.A0s(map).iterator();
        while (it.hasNext()) {
            AnonymousClass7RG.A00(new C188878zd(r4, A00(C18280x3.A05(it))));
        }
        map.clear();
        this.A0M.shutdown();
        Handler handler = this.A0E;
        handler.removeCallbacksAndMessages((Object) null);
        handler.getLooper().quit();
        Throwable th = r4.A01;
        if (th != null) {
            throw th;
        }
    }

    static {
        TimeUnit.SECONDS.toMillis(1);
    }

    public final C186348v9 A00(int i) {
        Map map = this.A0K;
        Integer valueOf = Integer.valueOf(i);
        Future future = (Future) map.get(valueOf);
        if (future != null) {
            try {
                return (C186348v9) future.get();
            } catch (Exception unused) {
                map.remove(valueOf);
                this.A0F.A02.A03[i] = false;
            }
        }
        return null;
    }

    public final void A02() {
        boolean z;
        C158917kl r2 = this.A06;
        if (r2 != null) {
            for (AnonymousClass7W9 r0 : r2.A05) {
                String str = r0.A01;
                r2.A01(str);
                r2.A02(str);
            }
            z = true;
        } else {
            z = false;
        }
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0u = AnonymousClass001.A0u(this.A05.A01(C142366x5.AUDIO));
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            Integer num = (Integer) A0w.getKey();
            Iterator A0q = C18320x8.A0q(A0w.getValue());
            if (A0q.hasNext()) {
                A0q.next();
                new AnonymousClass7B3(num);
                throw AnonymousClass000.A0L();
            }
        }
        HashMap A0t2 = AnonymousClass001.A0t();
        Iterator A0u2 = AnonymousClass001.A0u(A0t);
        if (A0u2.hasNext()) {
            AnonymousClass001.A0w(A0u2).getValue();
            throw AnonymousClass001.A0g("getStartTime");
        }
        AnonymousClass6O4 r22 = new AnonymousClass6O4(this, this.A08.A07, A0t2, A0t);
        this.A06 = r22;
        if (z) {
            r22.A00(this.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r8.A0A != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r8 = this;
            long r2 = r8.A02
            long r6 = r8.A03
            r5 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            boolean r0 = r8.A0A
            r4 = 0
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r4 = 1
        L_0x000f:
            int r1 = r8.A00
            r0 = 2
            if (r1 != r0) goto L_0x0022
            if (r4 == 0) goto L_0x0021
            X.7av r1 = r8.A04
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            boolean r0 = r1.A01(r2, r0)
            if (r0 == 0) goto L_0x0021
            r5 = 1
        L_0x0021:
            return r5
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158897kj.A03():boolean");
    }

    public C158897kj(C157067hf r11, C151867Wp r12, C180608lL r13, AnonymousClass7QR r14, AnonymousClass7UB r15) {
        AnonymousClass91L r3 = new AnonymousClass91L(this, 0);
        this.A0D = r3;
        C172788Ms r2 = new C172788Ms(this);
        this.A0I = r2;
        this.A08 = r14;
        this.A05 = r14.A05;
        this.A0G = r13;
        this.A0H = r15;
        this.A0M = r11.A01(C142176wl.AUDIO_PRELOAD_QUEUE);
        this.A0F = r12;
        this.A0C = (TimeUnit.SECONDS.toMicros(1) * 1024) / ((long) 44100);
        this.A04 = new C153247av(TimeUnit.SECONDS, -1, -1);
        this.A09 = AnonymousClass002.A0K();
        this.A0E = new C124706Do(r3, AnonymousClass6C9.A0S(new HandlerThread("audio", -16)), r2);
    }
}
