package com.whatsapp.gallerypicker;

import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5VY;
import X.AnonymousClass5ZR;
import X.AnonymousClass68W;
import X.C003203q;
import X.C116865qz;
import X.C17190ui;
import X.C18270x1;
import X.C18320x8;
import X.C30191m3;
import X.C997357z;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

public final class GalleryPickerLauncher extends C003203q implements AnonymousClass4GJ {
    public AnonymousClass5ZR A00;
    public AnonymousClass1VX A01;
    public C30191m3 A02;
    public boolean A03;
    public final Object A04;
    public volatile C116865qz A05;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0.A04() != X.C997357z.DENIED) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r3) goto L_0x002d
            r0 = 151(0x97, float:2.12E-43)
            if (r5 == r0) goto L_0x000b
            super.onActivityResult(r5, r6, r7)
            return
        L_0x000b:
            r0 = -1
            if (r6 == r0) goto L_0x0022
            boolean r0 = X.C107385bE.A0B()
            if (r0 == 0) goto L_0x004b
            if (r6 != 0) goto L_0x004b
            X.5ZR r0 = r4.A00
            if (r0 == 0) goto L_0x0026
            X.57z r1 = r0.A04()
            X.57z r0 = X.C997357z.DENIED
            if (r1 == r0) goto L_0x004b
        L_0x0022:
            r4.A5e()
            return
        L_0x0026:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x002d:
            android.content.Intent r1 = r4.getIntent()
            r2 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "should_return_photo_source"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 != r3) goto L_0x004f
            if (r7 != 0) goto L_0x0042
            android.content.Intent r7 = X.C18320x8.A07()
        L_0x0042:
            java.lang.String r1 = "photo_source"
            r0 = 2
            r7.putExtra(r1, r0)
            r4.setResult(r6, r7)
        L_0x004b:
            r4.finish()
            return
        L_0x004f:
            r4.setResult(r6, r7)
            if (r7 == 0) goto L_0x004b
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "chat_jid"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.putExtra(r1, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "is_using_global_wallpaper"
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r7.putExtra(r1, r0)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.GalleryPickerLauncher.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void A5e() {
        AnonymousClass5ZR r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("waPermissionsHelper");
        } else if (r0.A04() != C997357z.DENIED) {
            int intExtra = getIntent().getIntExtra("max_items", 1);
            boolean booleanExtra = getIntent().getBooleanExtra("skip_max_items_new_limit", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("is_in_multi_select_mode_only", false);
            C30191m3 r02 = this.A02;
            if (r02 != null) {
                Uri fromFile = Uri.fromFile(r02.A02());
                Intent A07 = C18320x8.A07();
                A07.setClassName(getPackageName(), "com.whatsapp.gallerypicker.GalleryPicker");
                A07.putExtra("include_media", 1);
                A07.putExtra("max_items", intExtra);
                A07.putExtra("skip_max_items_new_limit", booleanExtra);
                A07.putExtra("is_in_multi_select_mode_only", booleanExtra2);
                A07.putExtra("preview", false);
                A07.putExtra("output", fromFile);
                startActivityForResult(A07, 1);
                return;
            }
            throw C18270x1.A0S("profilePhotoUpdater");
        } else {
            AnonymousClass1VX r1 = this.A01;
            if (r1 != null) {
                RequestPermissionActivity.A0i(this, r1, 151);
                return;
            }
            throw C18270x1.A0R();
        }
    }

    public final Object generatedComponent() {
        if (this.A05 == null) {
            synchronized (this.A04) {
                if (this.A05 == null) {
                    this.A05 = new C116865qz(this);
                }
            }
        }
        return this.A05.generatedComponent();
    }

    public GalleryPickerLauncher(int i) {
        this.A04 = AnonymousClass002.A0D();
        this.A03 = false;
        AnonymousClass68W.A00(this, 58);
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        if (bundle == null) {
            A5e();
        }
    }

    public GalleryPickerLauncher() {
        this(0);
    }
}
