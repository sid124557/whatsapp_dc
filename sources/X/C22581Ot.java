package X;

import java.util.Collections;

/* renamed from: X.1Ot  reason: invalid class name and case insensitive filesystem */
public class C22581Ot extends C56822sc {
    public final AnonymousClass33E A00;
    public final C64663Ek A01;
    public final AnonymousClass314 A02;
    public final C56612sH A03;
    public final AnonymousClass33p A04;
    public final C28871hu A05;
    public final C56922sm A06;
    public final C56982ss A07;
    public final AnonymousClass1R1 A08;

    public final void A0D(AnonymousClass31A r7, AnonymousClass1SW r8) {
        boolean z = r7.A0i;
        boolean z2 = r8.A02;
        if (z != z2) {
            C18260x0.A1E("ArchiveChatHandler/setArchive - ", AnonymousClass001.A0o(), z2);
            r7.A0i = z2;
            this.A06.A0G(r7);
            this.A05.A08();
            if (z2) {
                AnonymousClass1R1 r1 = this.A08;
                C95814uZ r5 = r8.A01;
                if (r1.A0i(r5)) {
                    r1.A0N(r5);
                    this.A01.A07(1);
                    this.A00.A0G(Collections.singleton(new AnonymousClass1SY(r5, r8.A04, false)));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r1.A04 >= r10.A04) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r1.A04 >= r10.A04) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.AnonymousClass1SW r10) {
        /*
            r9 = this;
            boolean r3 = r10.A02
            r6 = 0
            if (r3 == 0) goto L_0x005a
            X.4uZ r2 = r10.A01
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()
            java.lang.String r0 = "pin_v1"
            X.AnonymousClass0x2.A15(r2, r0, r1)
            java.lang.String r8 = X.AnonymousClass33W.A01(r1)
            X.34v r7 = r9.A00
            X.33W r1 = r7.A07(r8)
            if (r1 == 0) goto L_0x003a
            X.1EO r0 = r1.A07()
            X.C626936e.A06(r0)
            X.1Al r0 = r0.pinAction_
            if (r0 != 0) goto L_0x002a
            X.1Al r0 = X.C21081Al.DEFAULT_INSTANCE
        L_0x002a:
            boolean r0 = r0.pinned_
            if (r0 == 0) goto L_0x003a
            long r4 = r1.A04
            long r0 = r10.A04
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x003a
        L_0x0036:
            r9.A08(r10)
            return
        L_0x003a:
            X.33W r1 = r7.A06(r8)
            if (r1 == 0) goto L_0x005a
            X.1EO r0 = r1.A07()
            X.C626936e.A06(r0)
            X.1Al r0 = r0.pinAction_
            if (r0 != 0) goto L_0x004d
            X.1Al r0 = X.C21081Al.DEFAULT_INSTANCE
        L_0x004d:
            boolean r0 = r0.pinned_
            if (r0 == 0) goto L_0x005a
            long r4 = r1.A04
            long r1 = r10.A04
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
            goto L_0x0036
        L_0x005a:
            X.4uZ r1 = r10.A01
            X.2ss r0 = r9.A07
            X.31A r2 = r0.A0A(r1, r6)
            if (r2 == 0) goto L_0x00af
            if (r3 != 0) goto L_0x0073
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ArchiveChatHandler/applyMutation/setArchivedState - "
        L_0x006c:
            X.C18260x0.A1E(r0, r1, r3)
            r9.A0D(r2, r10)
            goto L_0x0036
        L_0x0073:
            X.33E r0 = r9.A00
            X.35N r1 = r0.A04(r1, r6)
            X.35N r0 = r10.A00
            int r1 = X.AnonymousClass35N.A00(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0087
            if (r1 == r0) goto L_0x00a3
            r0 = 2
            if (r1 == r0) goto L_0x00a3
        L_0x0087:
            X.33p r1 = r9.A04
            boolean r0 = r1.A28()
            if (r0 == 0) goto L_0x0036
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r1)
            java.lang.String r0 = "notify_new_message_for_archived_chats"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x0036
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ArchiveChatHandler/applyMutation/A_ENCLOSES_B/setArchivedState - "
            goto L_0x006c
        L_0x00a3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ArchiveChatHandler/applyMutation/B_ENCLOSES_A/setArchivedState - "
            X.C18260x0.A1E(r0, r1, r3)
            r9.A0D(r2, r10)
        L_0x00af:
            r9.A09(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22581Ot.A0E(X.1SW):void");
    }

    public C22581Ot(AnonymousClass33E r1, C64663Ek r2, AnonymousClass314 r3, C56612sH r4, AnonymousClass33p r5, C28871hu r6, C56922sm r7, C56982ss r8, C623934v r9, AnonymousClass1R1 r10) {
        super(r9);
        this.A03 = r4;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A08 = r10;
        this.A04 = r5;
        this.A02 = r3;
    }
}
