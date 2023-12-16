package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass1VX;
import X.AnonymousClass2z0;
import X.AnonymousClass314;
import X.AnonymousClass31C;
import X.AnonymousClass33I;
import X.AnonymousClass48S;
import X.AnonymousClass4BC;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass5ZU;
import X.AnonymousClass68W;
import X.AnonymousClass9Th;
import X.AnonymousClass9U4;
import X.C105355Up;
import X.C106175Xx;
import X.C107695bk;
import X.C1907099n;
import X.C29441ip;
import X.C42182Nc;
import X.C42662Pa;
import X.C47882dz;
import X.C48352el;
import X.C49832hA;
import X.C53412n3;
import X.C56422rx;
import X.C56612sH;
import X.C56972sr;
import X.C57012sv;
import X.C57162tC;
import X.C620633i;
import X.C64333Db;
import X.C64773Ex;
import X.C66413Li;
import X.C66663Mh;
import X.C69263Wi;
import X.C85244Fm;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C89644eZ;
import android.os.Bundle;

public class QrSheetDeepLinkActivity extends C89644eZ implements AnonymousClass4BC, AnonymousClass48S {
    public C57012sv A00;
    public C106175Xx A01;
    public C48352el A02;
    public C85244Fm A03;
    public C42662Pa A04;
    public C64773Ex A05;
    public C47882dz A06;
    public C56422rx A07;
    public AnonymousClass5ZU A08;
    public C66413Li A09;
    public AnonymousClass314 A0A;
    public C57162tC A0B;
    public C53412n3 A0C;
    public C42182Nc A0D;
    public C49832hA A0E;
    public AnonymousClass4FV A0F;
    public AnonymousClass31C A0G;
    public C105355Up A0H;
    public C1907099n A0I;
    public AnonymousClass9U4 A0J;
    public AnonymousClass9Th A0K;
    public AnonymousClass33I A0L;
    public String A0M;
    public boolean A0N;

    public void A5r() {
        if (!this.A0N) {
            this.A0N = true;
            C64333Db r1 = AnonymousClass4SG.A2X(this).A4Z;
            AnonymousClass4SG.A3X(r1, this, AnonymousClass4SG.A32(r1, this));
            AnonymousClass4SG.A3Y(r1, this, C86604Kt.A0V(r1));
            this.A0F = C86604Kt.A0Z(r1);
            this.A00 = C86614Ku.A0J(r1);
            this.A03 = (C85244Fm) r1.AJ2.get();
            this.A0G = C86614Ku.A0c(r1);
            this.A05 = C86604Kt.A0P(r1);
            this.A08 = C86604Kt.A0R(r1);
            this.A02 = (C48352el) r1.A7i.get();
            this.A0J = C86614Ku.A0f(r1);
            this.A09 = (C66413Li) r1.A6U.get();
            this.A01 = C86604Kt.A0N(r1);
            this.A0D = (C42182Nc) r1.A7X.get();
            this.A07 = C86644Kx.A0S(r1);
            this.A0A = C86634Kw.A0c(r1);
            this.A0I = C86614Ku.A0e(r1);
            this.A0H = C107695bk.A2k(r1);
            this.A0K = (AnonymousClass9Th) r1.APb.get();
            this.A06 = C86644Kx.A0R(r1);
            this.A0C = C86634Kw.A0d(r1);
            this.A0B = (C57162tC) r1.AaV.get();
            this.A04 = C107695bk.A0c(r1);
            this.A0E = (C49832hA) r1.A00.A1i.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C56612sH r33 = this.A06;
        AnonymousClass1VX r37 = this.A0D;
        C69263Wi r28 = this.A05;
        C56972sr r27 = this.A01;
        AnonymousClass4FS r25 = this.A04;
        AnonymousClass4FV r24 = this.A0F;
        C57012sv r22 = this.A00;
        C66663Mh r23 = this.A06;
        C85244Fm r21 = this.A03;
        AnonymousClass31C r20 = this.A0G;
        C64773Ex r26 = this.A05;
        C620633i r19 = this.A08;
        AnonymousClass5ZU r17 = this.A08;
        C66413Li r15 = this.A09;
        C106175Xx r14 = this.A01;
        C42182Nc r12 = this.A0D;
        C56422rx r11 = this.A07;
        AnonymousClass314 r10 = this.A0A;
        C1907099n r9 = this.A0I;
        C105355Up r8 = this.A0H;
        AnonymousClass9Th r7 = this.A0K;
        C29441ip r6 = this.A07;
        C47882dz r5 = this.A06;
        C53412n3 r4 = this.A0C;
        C57162tC r3 = this.A0B;
        AnonymousClass4FS r44 = r25;
        AnonymousClass33I r152 = new AnonymousClass33I(r22, r14, this.A02, this, r28, r21, r27, r23, this.A04, r6, r26, r5, r11, r17, r15, r10, r19, r33, r3, r4, r12, r37, r24, r20, r8, r9, this.A0J, r7, r44, (Integer) null, false, false);
        this.A0L = r152;
        r152.A01 = getIntent().getStringExtra("extra_deep_link_session_id");
        this.A0L.A02 = true;
        this.A0M = getIntent().getStringExtra("qrcode");
        boolean booleanExtra = getIntent().getBooleanExtra("from_internal_deep_link_click", false);
        String str = this.A0M;
        if (str != null && !this.A0L.A0e) {
            this.A0M = str;
            this.A0L.A02((AnonymousClass2z0) null, str, 5, false, booleanExtra);
        }
    }

    public QrSheetDeepLinkActivity(int i) {
        this.A0N = false;
        AnonymousClass68W.A00(this, 79);
    }

    public void BZD() {
        finish();
    }

    public QrSheetDeepLinkActivity() {
        this(0);
    }
}
