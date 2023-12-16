package com.whatsapp.companionmode.registration;

import X.AnonymousClass0Y8;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2FV;
import X.AnonymousClass3DZ;
import X.AnonymousClass4H8;
import X.AnonymousClass4HY;
import X.AnonymousClass5Yj;
import X.C107385bE;
import X.C107695bk;
import X.C28721hf;
import X.C47872dy;
import X.C52282lE;
import X.C54552ou;
import X.C56242rf;
import X.C64333Db;
import X.C89644eZ;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.whatsapp.R;

public class CompanionBootstrapActivity extends C89644eZ {
    public ProgressBar A00;
    public C28721hf A01;
    public C47872dy A02;
    public C52282lE A03;
    public C54552ou A04;
    public boolean A05;
    public final C56242rf A06;
    public final AnonymousClass2FV A07;

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A03 = (C52282lE) A002.A5z.get();
            this.A01 = (C28721hf) A002.A5i.get();
            this.A02 = (C47872dy) A002.A5w.get();
            this.A04 = (C54552ou) A002.A5k.get();
        }
    }

    public CompanionBootstrapActivity(int i) {
        this.A05 = false;
        AnonymousClass4HY.A00(this, 45);
    }

    public final void A74(int i) {
        boolean A032 = C107385bE.A03();
        ProgressBar progressBar = this.A00;
        if (A032) {
            progressBar.setProgress(i, true);
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", new int[]{progressBar.getProgress(), i});
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C47872dy r0 = this.A02;
        r0.A00().A0D(this.A06);
        setContentView((int) R.layout.f8nameremoved);
        if (this.A04.A01()) {
            ((ImageView) findViewById(R.id.header_image)).setImageResource(R.drawable.ic_linked_android_phone);
        }
        this.A00 = (ProgressBar) findViewById(R.id.progress_indicator);
        AnonymousClass0Y8.A04(this, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        A74((this.A01.A0A.get() * 100) / 3);
        this.A01.A06(this.A07);
    }

    public void onDestroy() {
        super.onDestroy();
        C47872dy r0 = this.A02;
        r0.A00().A0E(this.A06);
        this.A01.A07(this.A07);
    }

    public CompanionBootstrapActivity() {
        this(0);
        this.A06 = new AnonymousClass4H8(this, 0);
        this.A07 = new AnonymousClass2FV(this);
    }
}
