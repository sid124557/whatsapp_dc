package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5ZG  reason: invalid class name */
public final class AnonymousClass5ZG {
    public long A00;
    public C95194sm A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final List A04 = AnonymousClass001.A0s();

    public final synchronized void A02(int i) {
        A05(i, (Integer) null);
    }

    public final synchronized void A03(int i) {
        A05(3, Integer.valueOf(i));
    }

    public final synchronized void A04(int i, int i2, String str, int i3) {
        if (this.A01 != null) {
            Log.d("CallAvatarLogger/onSwitchToAvatarAttempted An AR effect session already exists");
        } else {
            C95194sm r2 = new C95194sm();
            r2.A0N = str;
            r2.A0M = this.A03.A0Q(3076);
            r2.A05 = 1;
            r2.A0F = Long.valueOf(this.A02.A0H());
            r2.A04 = Integer.valueOf(i);
            r2.A06 = Integer.valueOf(i2);
            r2.A07 = AnonymousClass0x9.A0m(i3);
            this.A01 = r2;
        }
    }

    public static final void A00(AnonymousClass594 r3, AnonymousClass594 r4, Object obj, String str) {
        String str2;
        boolean z = true;
        boolean A1U = C18280x3.A1U(r4.value, r3.value);
        if (obj == null) {
            z = false;
        }
        if (A1U != z) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" is unexpectedly ");
            if (obj == null) {
                str2 = "null";
            } else {
                str2 = "non-null";
            }
            A0l.append(str2);
            A0l.append(" for scenario: ");
            throw AnonymousClass000.A0I(r4.name(), A0l);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089 A[ADDED_TO_REGION, Catch:{ IllegalStateException -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r10, java.lang.Integer r11) {
        /*
            r9 = this;
            X.4sm r5 = r9.A01
            if (r5 != 0) goto L_0x000a
            java.lang.String r0 = "CallAvatarLogger/endCurrentSession No session"
        L_0x0006:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x000a:
            boolean r8 = X.AnonymousClass000.A1W(r11)
            java.lang.String r1 = r5.A0N     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "productSessionId"
            r3 = 1
            A01(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r1 = r5.A0M     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectTier"
            A01(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.Integer r1 = r5.A05     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectType"
            A01(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.Long r1 = r5.A0F     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectStartT"
            A01(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.Integer r1 = r5.A04     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectStartReason"
            A01(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.Integer r1 = r5.A06     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "flmConsentType"
            A01(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.Integer r2 = r5.A03     // Catch:{ IllegalStateException -> 0x0092 }
            if (r2 != 0) goto L_0x004e
            r3 = 0
            java.lang.Long r0 = r5.A0A     // Catch:{ IllegalStateException -> 0x0092 }
            if (r0 != 0) goto L_0x004e
            r4 = 0
            java.lang.Long r0 = r5.A09     // Catch:{ IllegalStateException -> 0x0092 }
            if (r0 != 0) goto L_0x004f
            r7 = 0
            java.lang.Long r0 = r5.A0B     // Catch:{ IllegalStateException -> 0x0092 }
            r6 = 0
            if (r0 == 0) goto L_0x0051
            goto L_0x0050
        L_0x004e:
            r4 = 1
        L_0x004f:
            r7 = 1
        L_0x0050:
            r6 = 1
        L_0x0051:
            java.lang.Long r1 = r5.A0B     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectEmtT"
            A01(r1, r0, r6)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r1 = r5.A0J     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectId"
            A01(r1, r0, r6)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r1 = r5.A0K     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectInstanceId"
            A01(r1, r0, r6)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.Long r1 = r5.A09     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectEftT"
            A01(r1, r0, r7)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.Long r1 = r5.A0E     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectEttiT"
            A01(r1, r0, r4)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.Long r1 = r5.A0A     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectEitT"
            A01(r1, r0, r4)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.Long r1 = r5.A0G     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectTotalLoadingT"
            A01(r1, r0, r3)     // Catch:{ IllegalStateException -> 0x0092 }
            java.lang.String r0 = "effectLoadingResultType"
            A01(r2, r0, r3)     // Catch:{ IllegalStateException -> 0x0092 }
            if (r3 == 0) goto L_0x00a4
            if (r8 == 0) goto L_0x00a4
            java.lang.String r0 = "Loading failed reason not expected for a session that has finished loading"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ IllegalStateException -> 0x0092 }
            throw r0     // Catch:{ IllegalStateException -> 0x0092 }
        L_0x0092:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallAvatarLogger/isValidEndingSession "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String r0 = "CallAvatarLogger/endCurrentSession Session has unexpected fields"
            goto L_0x0006
        L_0x00a4:
            X.2sH r0 = r9.A02
            long r2 = r0.A0H()
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r5.A0C = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r5.A01 = r0
            java.lang.Integer r0 = r5.A03
            if (r0 != 0) goto L_0x00d4
            if (r11 != 0) goto L_0x00cb
            java.lang.Integer r0 = X.C18280x3.A0S()
            r5.A03 = r0
        L_0x00c2:
            java.util.List r0 = r9.A04
            r0.add(r5)
            r0 = 0
            r9.A01 = r0
            return
        L_0x00cb:
            java.lang.Integer r0 = X.C18290x4.A0a()
            r5.A03 = r0
            r5.A02 = r11
            goto L_0x00c2
        L_0x00d4:
            java.lang.String r4 = "Required value was null."
            if (r1 == 0) goto L_0x00fa
            java.lang.Long r0 = r5.A0F
            if (r0 == 0) goto L_0x00f5
            long r0 = r0.longValue()
            long r2 = r2 - r0
            java.lang.Long r0 = r5.A0G
            if (r0 == 0) goto L_0x00f0
            long r0 = r0.longValue()
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)
            r5.A08 = r0
            goto L_0x00c2
        L_0x00f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r4)
            throw r0
        L_0x00f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r4)
            throw r0
        L_0x00fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZG.A05(int, java.lang.Integer):void");
    }

    public final boolean A06(AnonymousClass594 r4, C95194sm r5) {
        try {
            String str = r5.A0N;
            AnonymousClass594 r2 = AnonymousClass594.METADATA_FETCHED_OR_CONSENT_REQUESTED;
            A00(r2, r4, str, "productSessionId");
            A00(r2, r4, r5.A0M, "effectTier");
            A00(r2, r4, r5.A05, "effectType");
            A00(r2, r4, r5.A0F, "effectStartT");
            A00(r2, r4, r5.A04, "effectStartReason");
            A00(r2, r4, r5.A06, "flmConsentType");
            Long l = r5.A0B;
            AnonymousClass594 r22 = AnonymousClass594.EFFECT_FETCHED;
            A00(r22, r4, l, "effectEmtT");
            A00(r22, r4, r5.A0J, "effectId");
            A00(r22, r4, r5.A0K, "effectInstanceId");
            A00(AnonymousClass594.EFFECT_INITIALIZED, r4, r5.A09, "effectEftT");
            Long l2 = r5.A0E;
            AnonymousClass594 r23 = AnonymousClass594.EFFECT_ENABLED;
            A00(r23, r4, l2, "effectEttiT");
            A00(r23, r4, r5.A0A, "effectEitT");
            return true;
        } catch (IllegalStateException e) {
            Log.d(AnonymousClass000.A0a("CallAvatarLogger/isValidOngoingSession ", AnonymousClass001.A0o(), e));
            return false;
        }
    }

    public AnonymousClass5ZG(C56612sH r2, AnonymousClass1VX r3) {
        C18260x0.A0Q(r2, r3);
        this.A02 = r2;
        this.A03 = r3;
    }

    public static final void A01(Object obj, String str, boolean z) {
        String str2;
        if (z != AnonymousClass000.A1W(obj)) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" is unexpectedly ");
            if (obj == null) {
                str2 = "null";
            } else {
                str2 = "non-null";
            }
            throw AnonymousClass000.A0I(str2, A0l);
        }
    }
}
