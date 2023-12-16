package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3Lm  reason: invalid class name and case insensitive filesystem */
public abstract class C66453Lm implements AnonymousClass485 {
    public AnonymousClass1nF A00;
    public final int A01;
    public final C64393Dh A02;
    public final C69263Wi A03;
    public final AnonymousClass5ZU A04;
    public final C56512s6 A05;
    public final C56612sH A06;
    public final C54292oU A07;
    public final AnonymousClass33T A08;
    public final C61072zf A09;
    public final C66543Lv A0A;
    public final C29431io A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass4FV A0D;
    public final C66383Le A0E;
    public final C28131fk A0F;
    public final C620133d A0G;
    public final C369320h A0H;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public long A00() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.C32301q8
            if (r0 == 0) goto L_0x0017
            r0 = r3
            X.1q8 r0 = (X.C32301q8) r0
            monitor-enter(r2)
            X.33p r0 = r0.A01     // Catch:{ all -> 0x0029 }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "newsletter_gdpr_report_expiration_timestamp"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)     // Catch:{ all -> 0x0029 }
            goto L_0x0027
        L_0x0017:
            r0 = r3
            X.1q7 r0 = (X.C32291q7) r0
            monitor-enter(r2)
            X.33p r0 = r0.A01     // Catch:{ all -> 0x0029 }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "gdpr_report_expiration_timestamp"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r2)
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66453Lm.A00():long");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public long A01() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.C32301q8
            if (r0 == 0) goto L_0x0017
            r0 = r3
            X.1q8 r0 = (X.C32301q8) r0
            monitor-enter(r2)
            X.33p r0 = r0.A01     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "newsletter_gdpr_report_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x0029 }
            long r0 = X.AnonymousClass0x2.A0A(r0, r1)     // Catch:{ all -> 0x0029 }
            goto L_0x0027
        L_0x0017:
            r0 = r3
            X.1q7 r0 = (X.C32291q7) r0
            monitor-enter(r2)
            X.33p r0 = r0.A01     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "gdpr_report_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x0029 }
            long r0 = X.AnonymousClass0x2.A0A(r0, r1)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r2)
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66453Lm.A01():long");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C373221u A04() {
        /*
            r7 = this;
            r6 = r7
            boolean r0 = r7 instanceof X.C32301q8
            if (r0 == 0) goto L_0x002c
            r0 = r7
            X.1q8 r0 = (X.C32301q8) r0
            monitor-enter(r6)
            X.33p r0 = r0.A01     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "newsletter_gdpr_report_state"
            r4 = 0
            int r3 = r1.getInt(r0, r4)     // Catch:{ all -> 0x0054 }
            X.21u[] r2 = X.C373221u.values()     // Catch:{ all -> 0x0054 }
            int r1 = r2.length     // Catch:{ all -> 0x0054 }
        L_0x001c:
            if (r4 >= r1) goto L_0x0027
            r5 = r2[r4]     // Catch:{ all -> 0x0054 }
            int r0 = r5.value     // Catch:{ all -> 0x0054 }
            if (r0 == r3) goto L_0x004d
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0027:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x002c:
            r0 = r7
            X.1q7 r0 = (X.C32291q7) r0
            monitor-enter(r6)
            X.33p r0 = r0.A01     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "gdpr_report_state"
            r4 = 0
            int r3 = r1.getInt(r0, r4)     // Catch:{ all -> 0x0054 }
            X.21u[] r2 = X.C373221u.values()     // Catch:{ all -> 0x0054 }
            int r1 = r2.length     // Catch:{ all -> 0x0054 }
        L_0x0042:
            if (r4 >= r1) goto L_0x004f
            r5 = r2[r4]     // Catch:{ all -> 0x0054 }
            int r0 = r5.value     // Catch:{ all -> 0x0054 }
            if (r0 == r3) goto L_0x004d
            int r4 = r4 + 1
            goto L_0x0042
        L_0x004d:
            monitor-exit(r6)
            return r5
        L_0x004f:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66453Lm.A04():X.21u");
    }

    public synchronized void A07() {
        Log.i("gdpr/on-report-deleted");
        A08();
    }

    public final synchronized void A08() {
        Log.i("gdpr/reset");
        this.A00 = null;
        File A052 = A05();
        if (A052.exists() && !A052.delete()) {
            Log.e("gdpr/reset/failed-delete-report-info");
        }
        C627536m.A0E(this.A02.A0C(), 0);
        A06();
    }

    public final synchronized void A0B(byte[] bArr, long j, long j2) {
        C162457s7.A0J(bArr, 1);
        Log.i("gdpr/on-report-available");
        try {
            C627236i.A0B(A05(), bArr);
            this.A00 = A03(bArr);
            if (A02() == null) {
                Log.e("gdpr/on-report-available/cannot-create-message");
            } else {
                A09(C373221u.AVAILABLE.value);
                boolean z = this instanceof C32301q8;
                if (z) {
                    C18260x0.A0M(((C32301q8) this).A01, "newsletter_gdpr_report_timestamp", j);
                } else {
                    C18260x0.A0M(((C32291q7) this).A01, "gdpr_report_timestamp", j);
                }
                if (z) {
                    C18270x1.A0i(C18270x1.A03(((C32301q8) this).A01), "newsletter_gdpr_report_expiration_timestamp", j2);
                } else {
                    C18270x1.A0i(C18270x1.A03(((C32291q7) this).A01), "gdpr_report_expiration_timestamp", j2);
                }
            }
        } catch (IOException e) {
            Log.e("gdpr/on-report-available/cannot-save", e);
        }
        return;
    }

    public C66453Lm(C64393Dh r3, C69263Wi r4, AnonymousClass5ZU r5, C56512s6 r6, C56612sH r7, C54292oU r8, AnonymousClass33T r9, C61072zf r10, C66543Lv r11, C29431io r12, AnonymousClass1VX r13, AnonymousClass4FV r14, C66383Le r15, C28131fk r16, C620133d r17, C369320h r18) {
        C369320h r1 = r18;
        C162457s7.A0J(r1, 16);
        this.A07 = r8;
        this.A06 = r7;
        this.A0C = r13;
        this.A03 = r4;
        this.A02 = r3;
        this.A0D = r14;
        this.A09 = r10;
        this.A04 = r5;
        this.A0A = r11;
        this.A0B = r12;
        this.A05 = r6;
        this.A0F = r16;
        this.A0G = r17;
        this.A08 = r9;
        this.A0E = r15;
        this.A0H = r1;
        this.A01 = r13.A0O(C58422vE.A02, 4866);
    }

    public final AnonymousClass1nF A02() {
        byte[] A0K;
        if (this.A00 != null || (A0K = C627236i.A0K(A05())) == null) {
            return this.A00;
        }
        return A03(A0K);
    }

    public final AnonymousClass1nF A03(byte[] bArr) {
        AnonymousClass1nF r1;
        String str;
        try {
            AnonymousClass1EU A002 = AnonymousClass1EU.A00(bArr);
            if (A002 != null) {
                AnonymousClass2z0 A032 = AnonymousClass2z0.A03(C135176kF.A00, "");
                C18260x0.A0O(A002, A032);
                C624134x A003 = this.A0E.A00(new C47612dX(A002, A002, A032, 0).A01());
                C162457s7.A0K(A003, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageDocument");
                r1 = (AnonymousClass1nF) A003;
                try {
                    if (this instanceof C32301q8) {
                        str = "channels_gdpr.zip";
                    } else {
                        str = "gdpr.zip";
                    }
                    r1.A06 = str;
                    return r1;
                } catch (AnonymousClass24W | AnonymousClass6u5 e) {
                    e = e;
                    Log.e("gdpr/create-gdpr-message", e);
                    return r1;
                }
            } else {
                Log.e("gdpr/create-gdpr-message/null");
                return null;
            }
        } catch (AnonymousClass24W | AnonymousClass6u5 e2) {
            e = e2;
            r1 = null;
            Log.e("gdpr/create-gdpr-message", e);
            return r1;
        }
    }

    public File A05() {
        boolean z = this instanceof C32301q8;
        File A032 = C54292oU.A03(this.A07);
        if (z) {
            return AnonymousClass002.A0A(A032, "channels_gdpr.info");
        }
        return AnonymousClass002.A0A(A032, "gdpr.info");
    }

    public void A06() {
        if (this instanceof C32301q8) {
            C18270x1.A0g(C18270x1.A03(((C32301q8) this).A01).remove("newsletter_gdpr_report_expiration_timestamp").remove("newsletter_gdpr_report_timestamp"), "newsletter_gdpr_report_state");
        } else {
            C18270x1.A0g(C18270x1.A03(((C32291q7) this).A01).remove("gdpr_report_expiration_timestamp").remove("gdpr_report_timestamp"), "gdpr_report_state");
        }
    }

    public void A09(int i) {
        if (this instanceof C32301q8) {
            C18270x1.A0h(C18270x1.A03(((C32301q8) this).A01), "newsletter_gdpr_report_state", i);
        } else {
            C18270x1.A0h(C18270x1.A03(((C32291q7) this).A01), "gdpr_report_state", i);
        }
    }

    public final synchronized void A0A(Activity activity) {
        int i;
        synchronized (this) {
            Log.i("gdpr/download-report");
            AnonymousClass1nF A022 = A02();
            if (A022 != null) {
                AnonymousClass33C A002 = C30471mV.A00(A022);
                C69263Wi r7 = this.A03;
                AnonymousClass4FV r4 = this.A0D;
                C61072zf r2 = this.A09;
                C28151fm r12 = new C28151fm(activity, r7, this.A04, this.A05, r2, r4, this);
                if (this.A0C.A0Y(C58422vE.A02, 555)) {
                    C28131fk r11 = this.A0F;
                    C633138t A023 = AnonymousClass36O.A02(A022);
                    String A1x = A022.A1x();
                    String str = A022.A04;
                    C626936e.A06(str);
                    String str2 = A022.A03;
                    String str3 = A022.A07;
                    String str4 = A002.A0G;
                    C626936e.A06(str4);
                    byte[] bArr = A002.A0W;
                    long j = A022.A00;
                    if (this instanceof C32301q8) {
                        i = 5;
                    } else {
                        i = 1;
                    }
                    String str5 = str3;
                    String str6 = str2;
                    String str7 = str;
                    r11.A08(r12, A023, new C124276Bq(A022, 8, this), new C86264Jl(this, 17, A022), A1x, str7, str6, str5, str4, (String) null, bArr, i, 8, 6, 0, j);
                } else {
                    this.A0G.A06(r12, A022, 0);
                }
            } else {
                Log.e("gdpr/download/no-message");
            }
        }
    }
}
