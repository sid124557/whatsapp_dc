package com.whatsapp.qrcode;

import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.C111685iW;
import X.C116855qy;
import X.C186388vE;
import X.C64333Db;
import X.C84874Eb;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;

public class WaQrScannerView extends FrameLayout implements C186388vE, AnonymousClass4GJ {
    public AnonymousClass1VX A00;
    public C186388vE A01;
    public C116855qy A02;
    public boolean A03;

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C64333Db.A4B(((C88864av) ((C111685iW) generatedComponent())).A0K);
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.whatsapp.qrcode.QrScannerViewV2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r2 = this;
            X.1VX r1 = r2.A00
            r0 = 349(0x15d, float:4.89E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "waqrscannerview/qrscannerviewv2"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.Context r0 = r2.getContext()
            com.whatsapp.qrcode.QrScannerViewV2 r1 = new com.whatsapp.qrcode.QrScannerViewV2
            r1.<init>(r0)
        L_0x0018:
            r2.addView(r1)
            r2.A01 = r1
            return
        L_0x001e:
            java.lang.String r0 = "waqrscannerview/qrscannerview"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.Context r0 = r2.getContext()
            X.6EW r1 = new X.6EW
            r1.<init>(r0)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.WaQrScannerView.A01():void");
    }

    public boolean BJ7() {
        return this.A01.BJ7();
    }

    public void Bjp() {
        this.A01.Bjp();
    }

    public void Bk5() {
        this.A01.Bk5();
    }

    public void Bpb() {
        this.A01.Bpb();
    }

    public void BqA() {
        this.A01.BqA();
    }

    public boolean BqT() {
        return this.A01.BqT();
    }

    public void Bqx() {
        this.A01.Bqx();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setQrDecodeHints(Map map) {
        this.A01.setQrDecodeHints(map);
    }

    public void setQrScannerCallback(C84874Eb r2) {
        this.A01.setQrScannerCallback(r2);
    }

    public void setShouldUseGoogleVisionScanner(boolean z) {
        this.A01.setShouldUseGoogleVisionScanner(z);
    }

    public WaQrScannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ((View) this.A01).setVisibility(i);
    }

    public WaQrScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A00();
        A01();
    }

    public WaQrScannerView(Context context) {
        super(context);
        A00();
        A01();
    }
}
