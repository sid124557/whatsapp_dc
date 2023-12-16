package com.whatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass0N1;
import X.AnonymousClass1VX;
import X.AnonymousClass34G;
import X.AnonymousClass4GJ;
import X.AnonymousClass678;
import X.C116855qy;
import X.C1234468l;
import X.C132906gD;
import X.C154187ck;
import X.C154287cv;
import X.C185898uQ;
import X.C186388vE;
import X.C188718zN;
import X.C60152y5;
import X.C620633i;
import X.C64333Db;
import X.C84874Eb;
import X.C88864av;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import java.util.Map;

public class QrScannerViewV2 extends FrameLayout implements C186388vE, AnonymousClass4GJ {
    public C185898uQ A00;
    public AnonymousClass678 A01;
    public C620633i A02;
    public AnonymousClass1VX A03;
    public C60152y5 A04;
    public C84874Eb A05;
    public C116855qy A06;
    public boolean A07;
    public final Handler A08;

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A03 = C64333Db.A4B(A002);
            this.A02 = C64333Db.A2o(A002);
            this.A04 = C64333Db.A74(A002);
        }
    }

    public boolean BJ7() {
        return this.A01.BJ7();
    }

    public void Bjp() {
    }

    public void Bk5() {
    }

    public void Bpb() {
        this.A01.Bk6();
    }

    public void BqA() {
        this.A01.pause();
    }

    public boolean BqT() {
        return this.A01.BqT();
    }

    public void Bqx() {
        this.A01.Bqx();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A06;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public void setQrDecodeHints(Map map) {
        this.A01.setQrDecodeHints(map);
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A08 = AnonymousClass000.A0A();
        this.A00 = new C1234468l(this, 2);
        A01();
    }

    private void setupTapToFocus(View view) {
        view.setOnTouchListener(new C154187ck(new AnonymousClass0N1(getContext(), new C188718zN(this, 3)), 5, this));
    }

    public final void A01() {
        AnonymousClass678 r1;
        Context context = getContext();
        if (this.A03.A0X(125)) {
            r1 = C154287cv.A00(context, "createSimpleView", AnonymousClass34G.A02(this.A02, this.A04));
            if (r1 != null) {
                Log.i("QrScannerViewV2/LiteCameraView");
                this.A01 = r1;
                r1.setQrScanningEnabled(true);
                AnonymousClass678 r12 = this.A01;
                r12.setCameraCallback(this.A00);
                View view = (View) r12;
                setupTapToFocus(view);
                addView(view);
            }
        }
        Log.i("QrScannerViewV2/CameraView");
        r1 = new C132906gD(context);
        this.A01 = r1;
        r1.setQrScanningEnabled(true);
        AnonymousClass678 r122 = this.A01;
        r122.setCameraCallback(this.A00);
        View view2 = (View) r122;
        setupTapToFocus(view2);
        addView(view2);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        AnonymousClass678 r0 = this.A01;
        if (i == 0) {
            r0.Bk9();
            this.A01.Ays();
            return;
        }
        r0.pause();
    }

    public void setQrScannerCallback(C84874Eb r1) {
        this.A05 = r1;
    }

    public /* synthetic */ void setShouldUseGoogleVisionScanner(boolean z) {
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ((View) this.A01).setVisibility(i);
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A08 = AnonymousClass000.A0A();
        this.A00 = new C1234468l(this, 2);
        A01();
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public QrScannerViewV2(Context context) {
        super(context);
        A00();
        this.A08 = AnonymousClass000.A0A();
        this.A00 = new C1234468l(this, 2);
        A01();
    }
}
