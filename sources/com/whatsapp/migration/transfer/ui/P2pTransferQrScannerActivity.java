package com.whatsapp.migration.transfer.ui;

import X.AnonymousClass002;
import X.AnonymousClass0Y9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5TW;
import X.C106715a2;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C32241pq;
import X.C53602nM;
import X.C64333Db;
import X.C70113Zy;
import X.C835848z;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class P2pTransferQrScannerActivity extends C32241pq implements C835848z {
    public C53602nM A00;
    public C106715a2 A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A03 = (AnonymousClass5TW) A002.ASQ.get();
            this.A04 = C64333Db.A2r(A002);
            this.A01 = C18280x3.A0Q(r1);
            this.A00 = C18280x3.A0L(r1);
        }
    }

    public boolean BbZ() {
        Log.i("fpm/P2pTransferQrScannerActivity/logout received from the server");
        return false;
    }

    public P2pTransferQrScannerActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 82);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getIntent().getExtras().getInt("hint");
        C106715a2 r5 = this.A01;
        C53602nM r4 = this.A00;
        SpannableStringBuilder A05 = r5.A05(this, new C70113Zy(r4, 27, this), AnonymousClass002.A0F(this, "learn-more", AnonymousClass002.A0L(), 0, i), "learn-more");
        AnonymousClass0Y9.A06(this.A02, R.style.f12nameremoved);
        this.A02.setBackgroundColor(getResources().getColor(R.color.f5nameremoved));
        this.A02.setGravity(8388611);
        this.A02.setText(A05);
        this.A02.setVisibility(0);
        C18270x1.A0q(this.A02, this.A0D);
    }

    public P2pTransferQrScannerActivity() {
        this(0);
    }
}
