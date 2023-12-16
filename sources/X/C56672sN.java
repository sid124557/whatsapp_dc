package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.2sN  reason: invalid class name and case insensitive filesystem */
public abstract class C56672sN {
    public final int A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass2WM A04;
    public final C186568vZ A05;
    public final AnonymousClass66R A06;

    public C56672sN(C56612sH r8, C54292oU r9, AnonymousClass33p r10, AnonymousClass1VX r11, AnonymousClass4FV r12, AnonymousClass2WM r13, C84084Ay r14, AnonymousClass8JP r15, C186568vZ r16, AnonymousClass4FS r17, int i) {
        this.A00 = i;
        this.A01 = r8;
        this.A02 = r10;
        this.A05 = r16;
        this.A04 = r13;
        this.A03 = r11;
        this.A06 = C154517dI.A01(new AnonymousClass40B(r9, this, r12, r14, r15, r17));
    }

    public final void A02(int i, String str) {
        C162457s7.A0J(str, 1);
        AnonymousClass1VX r2 = this.A03;
        C58422vE r1 = C58422vE.A02;
        if (!r2.A0Y(r1, 4360)) {
            return;
        }
        if (!r2.A0Y(r1, 5333) || !r2.A0Y(r1, 1319)) {
            ((AnonymousClass316) this.A06.getValue()).A06(i, str, true);
            A03(i, "timestamp_ms", this.A01.A0H());
            A05(i, "is_debug_build", false);
            String string = AnonymousClass0x2.A0F(this.A02).getString("pref_graphql_domain", "whatsapp.com");
            C162457s7.A0D(string);
            A05(i, "is_graphql_prod", C18320x8.A0g(Locale.ROOT, string).equals("whatsapp.com"));
        }
    }

    public final void A03(int i, String str, long j) {
        String str2 = str;
        C162457s7.A0J(str, 1);
        if (this.A03.A0Y(C58422vE.A02, 4360)) {
            AnonymousClass316 r0 = (AnonymousClass316) this.A06.getValue();
            r0.A0D.markerAnnotate(r0.A0A.A07, i, str2, j);
        }
    }

    public final void A05(int i, String str, boolean z) {
        C162457s7.A0J(str, 1);
        if (this.A03.A0Y(C58422vE.A02, 4360)) {
            AnonymousClass316 r0 = (AnonymousClass316) this.A06.getValue();
            r0.A0D.markerAnnotate(r0.A0A.A07, i, str, z);
        }
    }

    public final void A09(Integer num, String str) {
        C162457s7.A0J(str, 1);
        if (this.A03.A0Y(C58422vE.A02, 4360) && num != null) {
            ((AnonymousClass316) this.A06.getValue()).A05(num.intValue(), str);
        }
    }

    public final void A0B(List list, int i, String str) {
        C162457s7.A0J(list, 2);
        if (this.A03.A0Y(C58422vE.A02, 4360)) {
            AnonymousClass316 r0 = (AnonymousClass316) this.A06.getValue();
            r0.A0D.markerAnnotate(r0.A0A.A07, i, str, AnonymousClass0x7.A1b(list));
        }
    }

    public final void A06(int i, short s) {
        if (this.A03.A0Y(C58422vE.A02, 4360)) {
            ((AnonymousClass316) this.A06.getValue()).A07(i, s);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r5.length() == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(com.whatsapp.jid.Jid r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r3 = this;
            X.1VX r2 = r3.A03
            r1 = 4360(0x1108, float:6.11E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x005b
            if (r5 == 0) goto L_0x0015
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            java.lang.String r2 = "wae"
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r5)
            java.lang.String r1 = X.AnonymousClass26l.A00(r0)
            java.lang.String r0 = "extension_message_id"
            r3.A04(r8, r0, r1)
        L_0x0028:
            if (r6 == 0) goto L_0x003e
            int r0 = r6.length()
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r6)
            java.lang.String r1 = X.AnonymousClass26l.A00(r0)
            java.lang.String r0 = "session_id"
            r3.A04(r8, r0, r1)
        L_0x003e:
            if (r4 == 0) goto L_0x004e
            X.2WM r0 = r3.A04
            java.lang.String r1 = r0.A00(r4)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "biz_jid"
            r3.A04(r8, r0, r1)
        L_0x004e:
            if (r7 == 0) goto L_0x005b
            int r0 = r7.length()
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "extension_id"
            r3.A04(r8, r0, r7)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56672sN.A07(com.whatsapp.jid.Jid, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public final void A08(Integer num) {
        if (num != null) {
            this.A05.markerDrop(this.A00, num.intValue());
        }
    }

    public final void A0A(String str, int i) {
        if (str == null) {
            str = "UNKNOWN";
        }
        A04(i, "extension_status", str);
    }

    public static void A00(C56672sN r1, int i) {
        r1.A08(Integer.valueOf(i));
    }

    public static void A01(C56672sN r1, String str, int i) {
        r1.A09(Integer.valueOf(i), str);
    }

    public final void A04(int i, String str, String str2) {
        C18260x0.A0Q(str, str2);
        if (this.A03.A0Y(C58422vE.A02, 4360)) {
            AnonymousClass316 r0 = (AnonymousClass316) this.A06.getValue();
            r0.A0D.markerAnnotate(r0.A0A.A07, i, str, str2);
        }
    }
}
