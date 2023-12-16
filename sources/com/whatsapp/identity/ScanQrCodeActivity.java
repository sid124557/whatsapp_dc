package com.whatsapp.identity;

import X.AnonymousClass002;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2NZ;
import X.AnonymousClass34K;
import X.AnonymousClass3ZH;
import X.AnonymousClass4D4;
import X.AnonymousClass4HY;
import X.AnonymousClass58H;
import X.AnonymousClass5O5;
import X.AnonymousClass5TW;
import X.AnonymousClass5ZU;
import X.AnonymousClass66R;
import X.AnonymousClass79X;
import X.C100235Ac;
import X.C107335b8;
import X.C107695bk;
import X.C131666dx;
import X.C151137To;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C34061uA;
import X.C43622Sv;
import X.C54172oI;
import X.C56972sr;
import X.C58422vE;
import X.C635439q;
import X.C64333Db;
import X.C64773Ex;
import X.C67403Pd;
import X.C72173dI;
import X.C78763vX;
import X.C80773ym;
import X.C86504Kj;
import X.C86584Kr;
import X.C88834as;
import X.C89644eZ;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;
import java.nio.charset.Charset;

public final class ScanQrCodeActivity extends C89644eZ {
    public View A00;
    public ProgressBar A01;
    public C151137To A02;
    public WaTextView A03;
    public AnonymousClass5TW A04;
    public AnonymousClass5O5 A05;
    public C64773Ex A06;
    public AnonymousClass5ZU A07;
    public AnonymousClass2NZ A08;
    public C43622Sv A09;
    public C54172oI A0A;
    public QrScannerOverlay A0B;
    public WaQrScannerView A0C;
    public boolean A0D;
    public final AnonymousClass4D4 A0E;
    public final Charset A0F;
    public final AnonymousClass66R A0G;
    public final AnonymousClass66R A0H;

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass1Ha.A23(r2, r1, r1, this);
            AnonymousClass1Ha.A24(r2, this);
            this.A06 = C64333Db.A26(r2);
            this.A07 = C64333Db.A28(r2);
            this.A09 = (C43622Sv) r1.A5C.get();
            this.A04 = (AnonymousClass5TW) r2.ASQ.get();
            this.A05 = (AnonymousClass5O5) r1.A2G.get();
            this.A0A = A0I.ACY();
        }
    }

    public void finish() {
        WaQrScannerView waQrScannerView = this.A0C;
        if (waQrScannerView == null) {
            throw C18270x1.A0S("qrScannerView");
        }
        if (waQrScannerView.getVisibility() == 0) {
            View view = this.A00;
            if (view == null) {
                throw C18270x1.A0S("mainLayout");
            } else if (view.getVisibility() == 8) {
                C54172oI r1 = this.A0A;
                if (r1 != null) {
                    r1.A02((Runnable) null);
                    return;
                }
                throw C18270x1.A0S("qrCodeValidationUtil");
            }
        }
        super.finish();
    }

    public ScanQrCodeActivity(int i) {
        this.A0D = false;
        AnonymousClass4HY.A00(this, 68);
    }

    public void onCreate(Bundle bundle) {
        String A0F2;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        Toolbar toolbar = (Toolbar) C18290x4.A0L(this, R.id.toolbar);
        toolbar.setNavigationIcon((Drawable) new C131666dx(C107335b8.A04(getBaseContext(), R.drawable.ic_back, R.color.f5nameremoved), this.A00));
        toolbar.setTitle((int) R.string.f11nameremoved);
        C56972sr r1 = this.A01;
        AnonymousClass66R r5 = this.A0G;
        if (!C56972sr.A08(r1, (AnonymousClass3ZH) r5.getValue()) || !this.A0D.A0Y(C58422vE.A02, 1967)) {
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass5ZU r12 = this.A07;
            if (r12 != null) {
                A0F2 = AnonymousClass002.A0F(this, C18300x5.A0h(r12, (AnonymousClass3ZH) r5.getValue()), A0L, 0, R.string.f11nameremoved);
            } else {
                throw C18270x1.A0S("waContactNames");
            }
        } else {
            AnonymousClass5ZU r2 = this.A07;
            if (r2 != null) {
                A0F2 = C100235Ac.A00(this, r2, this.A00, (AnonymousClass3ZH) r5.getValue());
            } else {
                throw C18270x1.A0S("waContactNames");
            }
        }
        toolbar.setSubtitle((CharSequence) A0F2);
        toolbar.setBackgroundResource(AnonymousClass34K.A00(C18290x4.A0F(toolbar)));
        toolbar.A0J(this, R.style.f12nameremoved);
        toolbar.setNavigationOnClickListener(new C635439q((Object) this, 25));
        setSupportActionBar(toolbar);
        this.A01 = (ProgressBar) C18290x4.A0N(this, R.id.progress_bar);
        C43622Sv r4 = this.A09;
        if (r4 != null) {
            UserJid A072 = AnonymousClass3ZH.A07((AnonymousClass3ZH) r5.getValue());
            AnonymousClass4D4 r0 = this.A0E;
            C72173dI r3 = r4.A06;
            r3.A02();
            new C34061uA(r0, r4, A072).A02.executeOnExecutor(r3, new Void[0]);
            this.A00 = C18290x4.A0N(this, R.id.main_layout);
            this.A0C = (WaQrScannerView) C18290x4.A0N(this, R.id.qr_scanner_view);
            this.A0B = (QrScannerOverlay) C18290x4.A0N(this, R.id.overlay);
            this.A03 = (WaTextView) C18290x4.A0N(this, R.id.error_indicator);
            C54172oI r42 = this.A0A;
            if (r42 != null) {
                View view = this.A00;
                C162457s7.A0D(view);
                r42.A01(view, new C86504Kj(this, 1), (UserJid) this.A0H.getValue());
                C54172oI r32 = this.A0A;
                if (r32 != null) {
                    WaQrScannerView waQrScannerView = r32.A0G;
                    if (waQrScannerView != null) {
                        waQrScannerView.setQrDecodeHints(r32.A0I);
                        waQrScannerView.setQrScannerCallback(new C86584Kr(r32, 0));
                    }
                    C635439q.A00(C18290x4.A0N(this, R.id.scan_code_button), this, 26);
                    return;
                }
                throw C18270x1.A0S("qrCodeValidationUtil");
            }
            throw C18270x1.A0S("qrCodeValidationUtil");
        }
        throw C18270x1.A0S("fingerprintUtil");
    }

    public void onDestroy() {
        super.onDestroy();
        C54172oI r1 = this.A0A;
        if (r1 != null) {
            r1.A02 = null;
            r1.A0G = null;
            r1.A0F = null;
            r1.A01 = null;
            r1.A06 = null;
            r1.A05 = null;
            return;
        }
        throw C18270x1.A0S("qrCodeValidationUtil");
    }

    public static final void A0C(ScanQrCodeActivity scanQrCodeActivity) {
        super.finish();
    }

    public ScanQrCodeActivity() {
        this(0);
        this.A0F = AnonymousClass79X.A00;
        this.A0H = C154517dI.A00(AnonymousClass58H.NONE, new C80773ym(this));
        this.A0G = C154517dI.A01(new C78763vX(this));
        this.A0E = new C67403Pd(this);
    }
}
