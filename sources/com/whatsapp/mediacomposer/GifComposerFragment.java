package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass565;
import X.AnonymousClass5NV;
import X.AnonymousClass5YF;
import X.AnonymousClass5YG;
import X.C104315Qm;
import X.C106105Xq;
import X.C106985aV;
import X.C107535bT;
import X.C114825nf;
import X.C138066pi;
import X.C153387bE;
import X.C172218Kd;
import X.C186068uh;
import X.C54292oU;
import X.C620633i;
import X.C626936e;
import X.C69263Wi;
import X.C86644Kx;
import X.C86664Kz;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public class GifComposerFragment extends Hilt_GifComposerFragment {
    public AnonymousClass5YG A00;

    public void A0w(Bundle bundle, View view) {
        AnonymousClass5YG r1;
        String str;
        int i;
        int i2;
        View view2 = view;
        super.A0w(bundle, view2);
        C626936e.A0C(AnonymousClass000.A1X(this.A00));
        C186068uh A1E = C86664Kz.A1E(this);
        Uri uri = this.A00;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1E;
        C106105Xq r11 = mediaComposerActivity.A1n;
        File A07 = r11.A00(uri).A07();
        C626936e.A06(A07);
        if (bundle == null) {
            String A0A = r11.A00(this.A00).A0A();
            AnonymousClass5YF A2l = AnonymousClass4SG.A2l(this.A00, mediaComposerActivity);
            synchronized (A2l) {
                str = A2l.A0B;
            }
            if (A0A == null) {
                C104315Qm A04 = r11.A00(this.A00).A04();
                if (A04 == null) {
                    try {
                        A04 = new C104315Qm(A07);
                    } catch (C138066pi e) {
                        Log.e("GifComposerFragment/bad video", e);
                    }
                }
                boolean A02 = A04.A02();
                if (A02) {
                    i = A04.A01;
                } else {
                    i = A04.A03;
                }
                float f = (float) i;
                if (A02) {
                    i2 = A04.A03;
                } else {
                    i2 = A04.A01;
                }
                RectF rectF = new RectF(0.0f, 0.0f, f, (float) i2);
                C114825nf r12 = this.A0E;
                r12.A0N.A06 = rectF;
                r12.A0M.A00 = 0.0f;
                r12.A07(rectF);
            } else {
                C106985aV A03 = C106985aV.A03(A0G(), this.A08, this.A09, this.A0J, A0A);
                if (A03 != null) {
                    C114825nf r13 = this.A0E;
                    r13.A0M.setDoodle(A03);
                    r13.A0T.A05(str);
                }
            }
        }
        try {
            C172218Kd.A04(A07);
            try {
                r1 = new AnonymousClass565(A0R(), A07);
                this.A00 = r1;
                r1.A0Z(true);
                AnonymousClass5YG.A03(C86644Kx.A0J(view2, R.id.video_player), this.A00);
                if (this.A00.equals(A1E.B4X())) {
                    this.A00.A09().setAlpha(0.0f);
                    A0R().A5V();
                }
            } catch (IOException e2) {
                Log.e("GifComposerFragment/onViewCreated videoPlayer initialization", e2);
                this.A03.A0H(R.string.f11nameremoved, 0);
                A0R().finish();
            }
        } catch (IOException unused) {
            AnonymousClass1VX r10 = this.A0A;
            C69263Wi r15 = this.A03;
            C620633i r9 = this.A05;
            Context A0G = A0G();
            C54292oU r5 = this.A06;
            AnonymousClass5YF A002 = r11.A00(this.A00);
            synchronized (A002) {
                C620633i r16 = r9;
                C54292oU r17 = r5;
                AnonymousClass1VX r18 = r10;
                r1 = AnonymousClass5YG.A02(A0G, r15, r16, r17, r18, (AnonymousClass5NV) null, (AnonymousClass4FS) null, (C153387bE) null, A07, true, A002.A0D, C107535bT.A01(), false);
            }
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0c() {
        super.A0c();
        AnonymousClass5YG r0 = this.A00;
        if (r0 != null) {
            r0.A0G();
            this.A00 = null;
        }
    }

    public void A1J() {
        super.A1J();
        A1M();
    }
}
