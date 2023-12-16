package com.whatsapp.inappbugreporting;

import X.AnonymousClass08M;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2QA;
import X.AnonymousClass2WS;
import X.AnonymousClass4UC;
import X.AnonymousClass5N4;
import X.AnonymousClass92W;
import X.C05550Ty;
import X.C06270Wx;
import X.C134766ja;
import X.C134786jc;
import X.C1451074e;
import X.C152497Zc;
import X.C154467dD;
import X.C162457s7;
import X.C172038Jj;
import X.C18260x0;
import X.C43752Ti;
import X.C47232cv;
import X.C72023d3;
import X.C989053r;
import android.net.Uri;
import com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper;
import java.util.List;

public final class InAppBugReportingViewModel extends C05550Ty {
    public AnonymousClass08M A00;
    public AnonymousClass08M A01;
    public AnonymousClass08M A02;
    public String A03 = "";
    public String A04;
    public List A05 = C72023d3.A00;
    public C152497Zc[] A06;
    public final C06270Wx A07;
    public final AnonymousClass08M A08 = AnonymousClass08M.A01();
    public final AnonymousClass08M A09 = AnonymousClass08M.A01();
    public final AnonymousClass1VX A0A;
    public final C43752Ti A0B;
    public final AnonymousClass2QA A0C;
    public final C47232cv A0D;
    public final AnonymousClass5N4 A0E;
    public final AnonymousClass2WS A0F;
    public final ReportBugProtocolHelper A0G;
    public final C989053r A0H;
    public final AnonymousClass4UC A0I;

    public InAppBugReportingViewModel(AnonymousClass1VX r6, C43752Ti r7, AnonymousClass2QA r8, C47232cv r9, AnonymousClass5N4 r10, AnonymousClass2WS r11, ReportBugProtocolHelper reportBugProtocolHelper, C989053r r13) {
        C162457s7.A0J(r6, 5);
        C18260x0.A0W(r11, r13, r10);
        this.A0B = r7;
        this.A0D = r9;
        this.A0C = r8;
        this.A0G = reportBugProtocolHelper;
        this.A0A = r6;
        this.A0F = r11;
        this.A0H = r13;
        this.A0E = r10;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        C134766ja r1 = C134766ja.A00;
        A012.A0H(r1);
        this.A02 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        A013.A0H(r1);
        this.A00 = A013;
        AnonymousClass08M A014 = AnonymousClass08M.A01();
        A014.A0H(r1);
        this.A01 = A014;
        this.A07 = C154467dD.A00(this.A02, this.A00, A014, new C172038Jj());
        this.A0I = AnonymousClass0x9.A0b();
        this.A06 = new C152497Zc[3];
    }

    public final void A0D(Uri uri, int i) {
        A0E(C134786jc.A00, i);
        C47232cv r2 = this.A0D;
        r2.A04.A01.markerStart(476716874);
        r2.A00(uri, i).A03(new AnonymousClass92W(this, i, 3));
    }

    public final void A0E(C1451074e r2, int i) {
        AnonymousClass08M r0;
        if (i == 0) {
            r0 = this.A02;
        } else if (i == 1) {
            r0 = this.A00;
        } else if (i == 2) {
            r0 = this.A01;
        } else {
            return;
        }
        r0.A0H(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b0, code lost:
        if (r14.length() == 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(java.lang.String r14, java.lang.String r15, java.lang.String r16, android.net.Uri[] r17, boolean r18) {
        /*
            r13 = this;
            r6 = r17
            X.C18260x0.A0Q(r15, r6)
            java.lang.String r0 = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r15)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r0)
            X.C162457s7.A0D(r0)
            int r2 = r0.length()
            r0 = 10
            X.08M r1 = r13.A08
            if (r2 >= r0) goto L_0x002c
            X.6jU r0 = X.C134706jU.A00
        L_0x0028:
            r1.A0H(r0)
            return
        L_0x002c:
            X.6jV r0 = X.C134716jV.A00
            r1.A0H(r0)
            if (r18 != 0) goto L_0x0043
            X.0Wx r0 = r13.A07
            java.lang.Object r0 = r0.A07()
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            if (r0 == 0) goto L_0x0043
            X.4UC r1 = r13.A0I
            r0 = 0
            goto L_0x0028
        L_0x0043:
            X.5N4 r0 = r13.A0E
            r3 = 476715896(0x1c6a1b78, float:7.745961E-22)
            X.8vZ r2 = r0.A01
            r2.markerStart(r3)
            java.lang.String r1 = "network_type"
            java.lang.String r0 = r0.A00()
            r2.markerAnnotate((int) r3, (java.lang.String) r1, (java.lang.String) r0)
            X.08M r1 = r13.A09
            X.6jY r0 = X.C134746jY.A00
            r1.A0H(r0)
            X.2Ti r2 = r13.A0B
            X.3XA r7 = new X.3XA
            r7.<init>()
            X.4FS r1 = r2.A09
            r0 = 43
            X.C86644Kx.A1S(r1, r2, r7, r0)
            X.2QA r2 = r13.A0C
            X.3XA r5 = new X.3XA
            r5.<init>()
            X.4FS r1 = r2.A03
            r0 = 44
            X.C86644Kx.A1S(r1, r2, r5, r0)
            X.1VX r1 = r13.A0A
            r0 = 4697(0x1259, float:6.582E-42)
            boolean r0 = r1.A0X(r0)
            r4 = 2
            r12 = 1
            r11 = 0
            if (r0 == 0) goto L_0x00d4
            X.3XA[] r0 = new X.AnonymousClass3XA[r4]
            r0[r11] = r7
            r0[r12] = r5
        L_0x008c:
            java.util.List r0 = X.AnonymousClass8UF.A0o(r0)
            X.1I2 r1 = new X.1I2
            r1.<init>(r0)
            X.5qJ r0 = new X.5qJ
            r5 = r16
            r0.<init>(r13, r14, r15, r5)
            r1.A03(r0)
            X.2WS r4 = r13.A0F
            java.util.List r0 = X.C73703fw.A03(r6)
            int r3 = r0.size()
            if (r14 == 0) goto L_0x00b2
            int r1 = r14.length()
            r0 = 0
            if (r1 != 0) goto L_0x00b3
        L_0x00b2:
            r0 = 1
        L_0x00b3:
            r2 = r0 ^ 1
            X.1ZO r1 = new X.1ZO
            r1.<init>()
            java.lang.Integer r0 = X.C18290x4.A0d()
            r1.A01 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r3)
            r1.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A00 = r0
            r1.A04 = r5
            X.4FV r0 = r4.A00
            r0.BhA(r1)
            return
        L_0x00d4:
            X.2cv r10 = r13.A0D
            X.3XA r3 = new X.3XA
            r3.<init>()
            java.util.List r0 = X.C73703fw.A03(r6)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f9
            X.3d3 r1 = X.C72023d3.A00
            X.6jz r0 = new X.6jz
            r0.<init>(r1)
            r3.AwB(r0)
        L_0x00ef:
            r0 = 3
            X.3XA[] r0 = new X.AnonymousClass3XA[r0]
            r0[r11] = r7
            r0[r12] = r3
            r0[r4] = r5
            goto L_0x008c
        L_0x00f9:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.List r0 = X.C73703fw.A03(r6)
            java.util.Iterator r8 = r0.iterator()
            r2 = 0
        L_0x0106:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r8.next()
            int r1 = r2 + 1
            if (r2 >= 0) goto L_0x0119
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x0119:
            android.net.Uri r0 = (android.net.Uri) r0
            X.3XA r0 = r10.A00(r0, r2)
            r9.add(r0)
            r2 = r1
            goto L_0x0106
        L_0x0124:
            X.1I2 r2 = new X.1I2
            r2.<init>(r9)
            r1 = 3
            X.92X r0 = new X.92X
            r0.<init>(r3, r1)
            r2.A03(r0)
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingViewModel.A0F(java.lang.String, java.lang.String, java.lang.String, android.net.Uri[], boolean):void");
    }
}
