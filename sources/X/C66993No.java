package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Calendar;

/* renamed from: X.3No  reason: invalid class name and case insensitive filesystem */
public final class C66993No implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass1VX A00;

    public C66993No(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyD(X.C55032pg r12, X.C624134x r13) {
        /*
            r11 = this;
            X.C18260x0.A0O(r13, r12)
            boolean r0 = r13 instanceof X.C30521ma
            if (r0 == 0) goto L_0x0097
            X.2z0 r10 = r13.A1J
            X.C162457s7.A0C(r10)
            X.1ma r13 = (X.C30521ma) r13
            int r9 = r13.A00
            long r0 = r13.A01
            long r4 = X.C18290x4.A0B(r0)
            int r8 = r13.A00
            int r7 = r13.A04
            java.lang.Boolean r6 = r13.A0o
            X.1A4 r3 = r12.A00
            X.19x r2 = X.AnonymousClass1A4.A02(r3)
            X.6cX r0 = r2.A00
            X.1EM r0 = (X.AnonymousClass1EM) r0
            X.1ET r0 = r0.key_
            if (r0 != 0) goto L_0x002c
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x002c:
            X.1A1 r0 = X.AnonymousClass0x9.A0X(r0)
            X.AnonymousClass1A1.A00(r0, r10)
            r2.A0A(r0)
            X.1EM r1 = X.C18310x6.A0W(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.ephemeralExpiration_ = r9
            X.1EM r1 = X.C18310x6.A0W(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.ephemeralSettingTimestamp_ = r4
            X.1EP r0 = X.AnonymousClass1EP.DEFAULT_INSTANCE
            X.6c9 r1 = r0.A0G()
            X.19t r1 = (X.C209019t) r1
            if (r8 == 0) goto L_0x0094
            r0 = 1
            if (r8 == r0) goto L_0x0091
            r0 = 2
            if (r8 != r0) goto L_0x0094
            X.22v r0 = X.C374922v.INITIATED_BY_OTHER
        L_0x0060:
            r1.A09(r0)
            X.22w r0 = X.C57472th.A00(r7)
            r1.A0A(r0)
            if (r6 == 0) goto L_0x0073
            boolean r0 = r6.booleanValue()
            r1.A0B(r0)
        L_0x0073:
            X.6cX r0 = r1.A06()
            X.1EP r0 = (X.AnonymousClass1EP) r0
            X.1EM r1 = X.C18310x6.A0W(r2)
            r0.getClass()
            r1.disappearingMode_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            X.23O r0 = X.AnonymousClass23O.EPHEMERAL_SYNC_RESPONSE
            r2.A09(r0)
            r3.A0D(r2)
            return
        L_0x0091:
            X.22v r0 = X.C374922v.INITIATED_BY_ME
            goto L_0x0060
        L_0x0094:
            X.22v r0 = X.C374922v.CHANGED_IN_CHAT
            goto L_0x0060
        L_0x0097:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageEphemeralSyncResponseProtobuf not supported message: "
            X.C18260x0.A1T(r1, r0, r13)
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66993No.AyD(X.2pg, X.34x):void");
    }

    public C624134x BgW(C55962rC r9) {
        AnonymousClass1EU A01 = C55962rC.A01(r9);
        if (!AnonymousClass000.A1S(A01.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            return null;
        }
        AnonymousClass1EM r0 = A01.protocolMessage_;
        AnonymousClass1EM r5 = r0;
        AnonymousClass1EM r1 = r0;
        if (r0 == null) {
            r0 = AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 2) == 0) {
            return null;
        }
        if (r5 == null) {
            r1 = AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        AnonymousClass23O A002 = AnonymousClass23O.A00(r1.type_);
        if (A002 == null) {
            A002 = AnonymousClass23O.REVOKE;
        }
        if (A002 != AnonymousClass23O.EPHEMERAL_SYNC_RESPONSE) {
            return null;
        }
        if (r5 == null) {
            r5 = AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        C30521ma r2 = new C30521ma(r9.A0D, r9.A05);
        long j = r5.ephemeralSettingTimestamp_;
        Calendar instance = Calendar.getInstance();
        instance.set(2010, 1, 1);
        if (j < instance.getTimeInMillis()) {
            j *= 1000;
        }
        C624134x.A0L(r2, j);
        r2.A1v(Integer.valueOf(r5.ephemeralExpiration_));
        AnonymousClass1EP r02 = r5.disappearingMode_;
        if (r02 == null) {
            r02 = AnonymousClass1EP.DEFAULT_INSTANCE;
        }
        r2.A00 = r02.A0M().value;
        if (C56952sp.A0G(this.A00)) {
            AnonymousClass1EP r03 = r5.disappearingMode_;
            if (r03 == null) {
                r03 = AnonymousClass1EP.DEFAULT_INSTANCE;
            }
            C375022w A0N = r03.A0N();
            C162457s7.A0D(A0N);
            r2.A04 = C18300x5.A02(C18320x8.A02(A0N, 0));
            r2.A0o = C18320x8.A0U();
        }
        return r2;
    }
}
