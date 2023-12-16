package X;

/* renamed from: X.3sN  reason: invalid class name and case insensitive filesystem */
public final class C76803sN extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass2ZL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76803sN(AnonymousClass2ZL r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        r5 = r0.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r16 = this;
            r0 = r16
            X.2ZL r0 = r0.this$0
            X.8qC r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.5HE r0 = (X.AnonymousClass5HE) r0
            X.66R r0 = r0.A01
            android.content.SharedPreferences r2 = X.C18310x6.A0F(r0)
            java.lang.String r1 = "battery:wake_ups_time"
            r0 = 0
            java.util.Set r0 = r2.getStringSet(r1, r0)
            if (r0 != 0) goto L_0x001d
            X.3d7 r0 = X.C72063d7.A00
        L_0x001d:
            java.util.LinkedHashMap r11 = X.C18320x8.A0r()
            long r14 = android.os.SystemClock.elapsedRealtime()
            java.util.Iterator r13 = r0.iterator()
        L_0x0029:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = X.AnonymousClass001.A0m(r13)
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r2 = 0
            java.util.List r12 = X.C175728Zm.A0P(r1, r0, r2)
            int r1 = r12.size()
            r0 = 2
            if (r1 < r0) goto L_0x0029
            java.lang.Object r10 = r12.get(r2)
            int r1 = r12.size()
            r0 = 1
            int r1 = r1 - r0
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>(r1)
            int r8 = r12.size()
            r7 = 1
        L_0x0059:
            if (r7 >= r8) goto L_0x0083
            java.lang.String r0 = X.AnonymousClass001.A0n(r12, r7)
            java.lang.Long r0 = X.C829745q.A07(r0)
            if (r0 == 0) goto L_0x007c
            long r5 = r0.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            if (r2 == 0) goto L_0x007f
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r14 - r0
            long r1 = r2.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007f
        L_0x007c:
            int r7 = r7 + 1
            goto L_0x0059
        L_0x007f:
            X.AnonymousClass0x2.A1Q(r9, r5)
            goto L_0x007c
        L_0x0083:
            boolean r0 = X.AnonymousClass0x7.A1S(r9)
            if (r0 == 0) goto L_0x0029
            r11.put(r10, r9)
            goto L_0x0029
        L_0x008d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76803sN.invoke():java.lang.Object");
    }
}
