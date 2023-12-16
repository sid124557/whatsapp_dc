package com.whatsapp.profile;

import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5VY;
import X.AnonymousClass5ZR;
import X.AnonymousClass68W;
import X.C003203q;
import X.C116865qz;
import X.C17190ui;
import X.C18320x8;
import X.C51072jE;
import X.C69263Wi;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;

public class CapturePhoto extends C003203q implements AnonymousClass4GJ {
    public C69263Wi A00;
    public AnonymousClass5ZR A01;
    public AnonymousClass1VX A02;
    public C51072jE A03;
    public boolean A04;
    public final Object A05;
    public volatile C116865qz A06;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (getIntent() != null && getIntent().getBooleanExtra("should_return_photo_source", false)) {
                if (intent == null) {
                    intent = C18320x8.A07();
                }
                intent.putExtra("photo_source", 1);
            }
            setResult(i2, intent);
        } else if (i != 30) {
            super.onActivityResult(i, i2, intent);
            return;
        } else if (i2 == -1) {
            A5e();
            return;
        }
        finish();
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C116865qz(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public CapturePhoto(int i) {
        this.A05 = AnonymousClass002.A0D();
        this.A04 = false;
        AnonymousClass68W.A00(this, 73);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r9.A01.A0E() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A5e() {
        /*
            r9 = this;
            boolean r0 = X.C107385bE.A08()
            r3 = 0
            r7 = 1
            if (r0 != 0) goto L_0x0011
            X.5ZR r0 = r9.A01
            boolean r0 = r0.A0E()
            r8 = 1
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r8 = 0
        L_0x0012:
            X.5ZR r1 = r9.A01
            java.lang.String[] r0 = X.C107035aa.A01()
            int r0 = r1.A03(r0)
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r1 = r0 ^ 1
            r2 = 30
            java.util.Map r0 = com.whatsapp.RequestPermissionActivity.A0C
            java.lang.Object r4 = X.AnonymousClass001.A0i(r0, r2)
            int[] r4 = (int[]) r4
            if (r4 != 0) goto L_0x0042
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RequestPermissionActivity/buildCameraProfileIntent/camera/storage/permissions/unexpected request code "
            X.C18260x0.A0x(r0, r1, r2)
        L_0x0037:
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "target_file_uri"
            android.os.Parcelable r2 = r1.getParcelableExtra(r0)
            goto L_0x00a6
        L_0x0042:
            r6 = 2
            r5 = 3
            if (r1 == 0) goto L_0x0076
            if (r8 == 0) goto L_0x0076
            X.5UF r1 = new X.5UF
            r1.<init>(r9)
            int[] r5 = new int[r5]
            r0 = 2131233421(0x7f080a8d, float:1.808298E38)
            r5[r3] = r0
            r0 = 2131233415(0x7f080a87, float:1.8082967E38)
            r5[r7] = r0
            r0 = 2131233403(0x7f080a7b, float:1.8082943E38)
            r5[r6] = r0
            r1.A0A = r5
            java.lang.String[] r0 = X.C107035aa.A00()
            r1.A0D = r0
            r0 = r4[r3]
            r1.A02 = r0
            r0 = r4[r7]
            r1.A03 = r0
        L_0x006e:
            android.content.Intent r0 = X.AnonymousClass5UF.A00(r1, r3)
        L_0x0072:
            r9.startActivityForResult(r0, r2)
            return
        L_0x0076:
            boolean r0 = X.C107385bE.A08()
            if (r0 != 0) goto L_0x0087
            if (r8 == 0) goto L_0x0087
            r1 = r4[r6]
            r0 = r4[r5]
            android.content.Intent r0 = com.whatsapp.RequestPermissionActivity.A0C(r9, r1, r0, r3)
            goto L_0x0072
        L_0x0087:
            if (r1 == 0) goto L_0x0037
            X.5UF r1 = new X.5UF
            r1.<init>(r9)
            r0 = 2131233403(0x7f080a7b, float:1.8082943E38)
            r1.A01 = r0
            r0 = 4
            r0 = r4[r0]
            r1.A02 = r0
            r0 = 5
            r0 = r4[r0]
            r1.A03 = r0
            java.lang.String r0 = "android.permission.CAMERA"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.A0D = r0
            goto L_0x006e
        L_0x00a6:
            java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)     // Catch:{ ActivityNotFoundException -> 0x00bb }
            java.lang.String r0 = "output"
            android.content.Intent r1 = r1.putExtra(r0, r2)     // Catch:{ ActivityNotFoundException -> 0x00bb }
            r0 = 2
            android.content.Intent r0 = r1.setFlags(r0)     // Catch:{ ActivityNotFoundException -> 0x00bb }
            r9.startActivityForResult(r0, r7)     // Catch:{ ActivityNotFoundException -> 0x00bb }
            return
        L_0x00bb:
            r1 = move-exception
            java.lang.String r0 = "capturephoto/start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            X.3Wi r1 = r9.A00
            r0 = 2131886316(0x7f1200ec, float:1.9407207E38)
            r1.A0H(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.CapturePhoto.A5e():void");
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        if (getCallingPackage() == null || !getCallingPackage().equals(getPackageName())) {
            finish();
        } else if (bundle == null) {
            A5e();
        }
    }

    public CapturePhoto() {
        this(0);
    }
}
