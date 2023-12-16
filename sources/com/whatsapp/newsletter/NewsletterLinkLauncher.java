package com.whatsapp.newsletter;

import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass1Y9;
import X.AnonymousClass31C;
import X.AnonymousClass495;
import X.AnonymousClass4FS;
import X.AnonymousClass582;
import X.AnonymousClass59N;
import X.AnonymousClass5UP;
import X.AnonymousClass5Y8;
import X.AnonymousClass5YD;
import X.AnonymousClass622;
import X.AnonymousClass63X;
import X.AnonymousClass66R;
import X.AnonymousClass8XT;
import X.C105325Um;
import X.C106505Zg;
import X.C111095hX;
import X.C154517dI;
import X.C15910sA;
import X.C162457s7;
import X.C17290vH;
import X.C18260x0;
import X.C18270x1;
import X.C18300x5;
import X.C29441ip;
import X.C49122g1;
import X.C56182rZ;
import X.C56212rc;
import X.C56842se;
import X.C57682u2;
import X.C69263Wi;
import X.C89654ea;
import X.C95804uY;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

public final class NewsletterLinkLauncher implements C17290vH {
    public AnonymousClass495 A00;
    public final C111095hX A01;
    public final C69263Wi A02;
    public final C29441ip A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass31C A05;
    public final AnonymousClass5UP A06;
    public final C49122g1 A07;
    public final C56182rZ A08;
    public final AnonymousClass5Y8 A09;
    public final C56842se A0A;
    public final AnonymousClass5YD A0B;
    public final C56212rc A0C;
    public final C105325Um A0D;
    public final AnonymousClass4FS A0E;
    public final AnonymousClass66R A0F = C154517dI.A01(AnonymousClass8XT.A00);

    public final void A00(Context context, Uri uri) {
        C89654ea r3;
        C162457s7.A0J(context, 0);
        AnonymousClass5UP r1 = this.A06;
        if (r1.A05(3877) || r1.A05(3878)) {
            this.A09.A04(context, AnonymousClass582.CREATE);
        } else if (!r1.A00()) {
            this.A09.A03(context, uri, AnonymousClass582.CREATE, false);
        } else {
            Activity A022 = C111095hX.A02(context);
            if ((A022 instanceof C89654ea) && (r3 = (C89654ea) A022) != null) {
                C105325Um r2 = this.A0D;
                AnonymousClass1VX r0 = r2.A03;
                r2.A02(r3, C106505Zg.A01(r0), C106505Zg.A00(r0));
            }
        }
    }

    public final void A01(Context context, Uri uri, C95804uY r16, AnonymousClass59N r17, String str, int i, long j) {
        AnonymousClass59N r6 = r17;
        C18270x1.A11(context, 0, r6);
        AnonymousClass5UP r1 = this.A06;
        if (r1.A05(3877)) {
            this.A09.A04(context, AnonymousClass582.VIEW);
        } else if (!C18300x5.A1S(r1)) {
            this.A09.A03(context, uri, AnonymousClass582.VIEW, false);
        } else {
            C89654ea r3 = (C89654ea) C111095hX.A01(context);
            WeakReference A14 = AnonymousClass0x9.A14(r3);
            this.A0D.A04(r3, (C95804uY) null, new AnonymousClass63X(r16, r6, this, str, A14, i, j), r6.A00());
        }
    }

    public final void A02(Context context, Uri uri, boolean z) {
        C89654ea r5;
        C162457s7.A0J(context, 0);
        AnonymousClass5UP r1 = this.A06;
        if (r1.A05(3877) || r1.A05(3879)) {
            this.A09.A04(context, AnonymousClass582.DIRECTORY);
        } else if (!r1.A01()) {
            this.A09.A03(context, uri, AnonymousClass582.DIRECTORY, false);
        } else {
            Activity A022 = C111095hX.A02(context);
            if ((A022 instanceof C89654ea) && (r5 = (C89654ea) A022) != null) {
                Log.d("Open channels directory");
                AnonymousClass5YD r2 = this.A0B;
                int i = 3;
                if (z) {
                    AnonymousClass1Y9 r12 = new AnonymousClass1Y9();
                    r12.A01 = 5;
                    r2.A03.BhD(r12);
                    i = 4;
                }
                r2.A04(i);
                this.A0D.A04(r5, (C95804uY) null, new AnonymousClass622(AnonymousClass0x9.A14(r5)), 0);
            }
        }
    }

    public final void A03(Context context, C95804uY r11, AnonymousClass59N r12, int i, long j) {
        C18270x1.A11(context, 0, r12);
        A01(context, (Uri) null, r11, r12, (String) null, i, j);
    }

    public void Bcn(C15910sA r2) {
        C89654ea r22;
        AnonymousClass495 r0;
        C162457s7.A0J(r2, 0);
        if ((r2 instanceof C89654ea) && (r22 = (C89654ea) r2) != null && (r0 = this.A00) != null) {
            r0.cancel();
            A04(r22);
            try {
                r22.BjL();
            } catch (Throwable th) {
                C57682u2.A00(th);
            }
        }
    }

    public final void A04(C89654ea r2) {
        try {
            r2.A06.A01(this);
        } catch (Throwable th) {
            C57682u2.A00(th);
        }
    }

    public NewsletterLinkLauncher(C111095hX r2, C69263Wi r3, C29441ip r4, AnonymousClass1VX r5, AnonymousClass31C r6, AnonymousClass5UP r7, C49122g1 r8, C56182rZ r9, AnonymousClass5Y8 r10, C56842se r11, AnonymousClass5YD r12, C56212rc r13, C105325Um r14, AnonymousClass4FS r15) {
        C18260x0.A0f(r5, r7, r10, r13, r11);
        C18260x0.A0g(r9, r2, r4, r14, r12);
        C18260x0.A0Y(r8, r15, r6);
        C162457s7.A0J(r3, 14);
        this.A04 = r5;
        this.A06 = r7;
        this.A09 = r10;
        this.A0C = r13;
        this.A0A = r11;
        this.A08 = r9;
        this.A01 = r2;
        this.A03 = r4;
        this.A0D = r14;
        this.A0B = r12;
        this.A07 = r8;
        this.A0E = r15;
        this.A05 = r6;
        this.A02 = r3;
    }

    public /* synthetic */ void BQu(C15910sA r1) {
    }

    public /* synthetic */ void BXj(C15910sA r1) {
    }

    public /* synthetic */ void BaY(C15910sA r1) {
    }
}
