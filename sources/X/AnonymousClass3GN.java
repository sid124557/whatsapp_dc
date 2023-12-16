package X;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3GN  reason: invalid class name */
public final class AnonymousClass3GN implements AnonymousClass4FD {
    public final C52802m4 A00;
    public final AnonymousClass2XZ A01;
    public final C28871hu A02;
    public final C56922sm A03;
    public final C56982ss A04;
    public final AnonymousClass4FS A05;
    public final ConcurrentHashMap A06 = AnonymousClass0x9.A1D();

    public void BLc(C95814uZ r3) {
        C162457s7.A0J(r3, 0);
        if (C155477ey.A00(r3) && this.A00.A00()) {
            C18290x4.A1M(this.A05, this, r3, 29);
        }
    }

    public void BLe(C95814uZ r2, boolean z) {
        C162457s7.A0J(r2, 0);
        A01(r2);
    }

    public void BLg(C95814uZ r2) {
        C162457s7.A0J(r2, 0);
        A01(r2);
    }

    public final void A01(C95814uZ r3) {
        C56982ss r1 = this.A04;
        if (C56982ss.A00(r1, r3) == null || r1.A0Q(r3)) {
            this.A06.remove(r3);
            C18290x4.A1M(this.A05, this, r3, 28);
        }
    }

    public void BLh(C95814uZ r1) {
    }

    public AnonymousClass3GN(C52802m4 r2, AnonymousClass2XZ r3, C28871hu r4, C56922sm r5, C56982ss r6, AnonymousClass4FS r7) {
        C18260x0.A0f(r2, r5, r7, r6, r4);
        C162457s7.A0J(r3, 6);
        this.A00 = r2;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass1RK r9) {
        /*
            r8 = this;
            X.4uZ r6 = r9.A05()
            X.C162457s7.A0D(r6)
            X.2XZ r0 = r8.A01
            monitor-enter(r9)
            monitor-exit(r9)
            X.3dV r0 = r0.A01
            X.4Fq r4 = r0.A04()
            X.3Yo r5 = r4.Axl()     // Catch:{ all -> 0x0052 }
            android.content.ContentValues r7 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "chat_row_id"
            java.lang.Long r0 = r9.A06()     // Catch:{ all -> 0x004b }
            r7.put(r1, r0)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "pip_enabled"
            boolean r0 = r9.A00     // Catch:{ all -> 0x004b }
            X.C382326g.A00(r7, r1, r0)     // Catch:{ all -> 0x004b }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x004b }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "bot_chat_info"
            r1 = 5
            java.lang.String r0 = "BotChatInfoStore/INSERT_BOT_CHAT_INFO"
            r3.A0C(r2, r0, r7, r1)     // Catch:{ all -> 0x004b }
            r5.A00()     // Catch:{ all -> 0x004b }
            r5.close()     // Catch:{ all -> 0x0052 }
            r4.close()
            X.2ss r0 = r8.A04
            r0.A0H(r9, r6)
            java.util.concurrent.ConcurrentHashMap r0 = r8.A06
            r0.put(r6, r9)
            return
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GN.A00(X.1RK):void");
    }

    public void BLd() {
    }

    public void BLf(C95814uZ r1, Collection collection, int i) {
    }
}
