package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass043;
import X.AnonymousClass4CW;
import X.AnonymousClass4SG;
import X.AnonymousClass4uh;
import X.AnonymousClass4w0;
import X.AnonymousClass5MD;
import X.AnonymousClass5QV;
import X.AnonymousClass5TO;
import X.AnonymousClass5V0;
import X.AnonymousClass5V5;
import X.AnonymousClass5ZI;
import X.AnonymousClass5ZO;
import X.AnonymousClass5ZR;
import X.AnonymousClass7T4;
import X.AnonymousClass8E9;
import X.AnonymousClass8F8;
import X.AnonymousClass8F9;
import X.AnonymousClass925;
import X.AnonymousClass93E;
import X.C105085Tn;
import X.C105355Up;
import X.C105415Uv;
import X.C107695bk;
import X.C108135cT;
import X.C111525iE;
import X.C111545iG;
import X.C159027ky;
import X.C181128mC;
import X.C181968ne;
import X.C18280x3;
import X.C18290x4;
import X.C184158rL;
import X.C1891190b;
import X.C19340zH;
import X.C50382i5;
import X.C53602nM;
import X.C620733j;
import X.C621233o;
import X.C64333Db;
import X.C71593cM;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86664Kz;
import X.C89644eZ;
import X.C89654ea;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class DirectorySetLocationMapActivity extends C89644eZ implements C184158rL {
    public Bundle A00;
    public C105415Uv A01;
    public AnonymousClass5MD A02;
    public C159027ky A03;
    public C50382i5 A04;
    public C111525iE A05;
    public C111545iG A06;
    public AnonymousClass5QV A07;
    public AnonymousClass4w0 A08;
    public C105085Tn A09;
    public AnonymousClass5TO A0A;
    public C108135cT A0B;
    public C53602nM A0C;
    public AnonymousClass5ZR A0D;
    public C620733j A0E;
    public AnonymousClass4uh A0F;
    public C621233o A0G;
    public C105355Up A0H;
    public AnonymousClass8E9 A0I;
    public WhatsAppLibLoader A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final C181128mC A0N;

    public final void A74() {
        Double d;
        C108135cT r3 = this.A0B;
        Double d2 = r3.A09;
        if (d2 == null || (d = r3.A0A) == null) {
            A76();
        } else {
            this.A07.A01(C86624Kv.A0H(d, d2.doubleValue()), this, (AnonymousClass5ZI) null, r3.A0C, "pin_on_map", 10.0f);
        }
    }

    public void A7B(AnonymousClass4CW r8, Double d, Double d2) {
        AnonymousClass4CW r5 = r8;
        if (!AnonymousClass4SG.A40(this)) {
            r8.BTu(-1, -1);
        } else {
            this.A04.BkM(new C71593cM((Object) this, (Object) d, (Object) d2, (Object) r5, 21));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0167, code lost:
        r0 = r9.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0C(X.C105415Uv r8, com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r9) {
        /*
            X.5Uv r0 = r9.A01
            if (r0 != 0) goto L_0x01cc
            r9.A01 = r8
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap map is not available"
            X.C626936e.A07(r8, r0)
            X.5cT r0 = r9.A0B
            android.view.View r1 = r0.A03
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap ui.centerView is not available"
            X.C626936e.A07(r1, r0)
            X.5cT r0 = r9.A0B
            android.view.View r1 = r0.A01
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap ui.centerFillerView is not available"
            X.C626936e.A07(r1, r0)
            X.5cT r0 = r9.A0B
            android.view.View r1 = r0.A02
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap ui.centerPinView is not available"
            X.C626936e.A07(r1, r0)
            X.5Uv r0 = r9.A01
            r3 = 0
            r0.A0M(r3)
            X.5Uv r0 = r9.A01
            r0.A0K(r3)
            X.5ZR r0 = r9.A0D
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x006b
            X.5cT r0 = r9.A0B
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x006b
            X.5Uv r1 = r9.A01
            r0 = 1
            r1.A0L(r0)
        L_0x0045:
            X.5Uv r0 = r9.A01
            X.7RO r0 = r0.A01()
            r0.A00()
            X.5Uv r1 = r9.A01
            r7 = 0
            X.90z r0 = new X.90z
            r0.<init>(r9, r3)
            r1.A0H(r0)
            X.5Uv r1 = r9.A01
            X.5aI r0 = new X.5aI
            r0.<init>(r9, r3)
            r1.A0F(r0)
            X.5Uv r0 = r9.A01
            X.8B7 r1 = new X.8B7
            r1.<init>(r9)
            goto L_0x0083
        L_0x006b:
            X.5ZR r0 = r9.A0D
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0045
            X.5cT r2 = r9.A0B
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x0045
            r1 = 1
            X.90N r0 = new X.90N
            r0.<init>(r9, r1)
            r2.A02(r0)
            goto L_0x0045
        L_0x0083:
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r0.A01     // Catch:{ RemoteException -> 0x01c6 }
            X.6X9 r0 = new X.6X9     // Catch:{ RemoteException -> 0x01c6 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01c6 }
            X.7tO r2 = (X.C163177tO) r2     // Catch:{ RemoteException -> 0x01c6 }
            android.os.Parcel r1 = X.C86644Kx.A0E(r0, r2)     // Catch:{ RemoteException -> 0x01c6 }
            r0 = 42
            r2.A02(r0, r1)     // Catch:{ RemoteException -> 0x01c6 }
            X.5Uv r0 = r9.A01
            X.8B4 r1 = new X.8B4
            r1.<init>(r9)
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r0.A01     // Catch:{ RemoteException -> 0x01c0 }
            X.6XB r0 = new X.6XB     // Catch:{ RemoteException -> 0x01c0 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01c0 }
            X.7tO r2 = (X.C163177tO) r2     // Catch:{ RemoteException -> 0x01c0 }
            android.os.Parcel r1 = X.C86644Kx.A0E(r0, r2)     // Catch:{ RemoteException -> 0x01c0 }
            r0 = 98
            r2.A02(r0, r1)     // Catch:{ RemoteException -> 0x01c0 }
            X.5Uv r1 = r9.A01
            X.6B9 r0 = new X.6B9
            r0.<init>(r9, r3)
            r1.A0E(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131167258(0x7f07081a, float:1.7948785E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.5Uv r0 = r9.A01
            r0.A08(r1, r1, r1, r1)
            android.os.Bundle r0 = r9.A00
            if (r0 == 0) goto L_0x013b
            java.lang.String r1 = "camera_zoom"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0103
            android.os.Bundle r0 = r9.A00
            float r8 = r0.getFloat(r1)
            android.os.Bundle r1 = r9.A00
            java.lang.String r0 = "camera_lat"
            double r4 = r1.getDouble(r0)
            android.os.Bundle r1 = r9.A00
            java.lang.String r0 = "camera_lng"
            double r2 = r1.getDouble(r0)
            X.5cT r6 = r9.A0B
            android.os.Bundle r1 = r9.A00
            java.lang.String r0 = "should_update_address"
            boolean r0 = r1.getBoolean(r0)
            r6.A0G = r0
            X.5Uv r1 = r9.A01
            com.google.android.gms.maps.model.LatLng r0 = X.AnonymousClass4L0.A0H(r4, r2)
            X.7BU r0 = X.C106555Zl.A02(r0, r8)
            r1.A0A(r0)
        L_0x0103:
            r0 = 0
            r9.A00 = r0
        L_0x0106:
            boolean r0 = X.C107405bG.A0D(r9)
            if (r0 == 0) goto L_0x0118
            X.5Uv r1 = r9.A01
            r0 = 2132017185(0x7f140021, float:1.9672641E38)
            X.6TJ r0 = X.AnonymousClass6TJ.A00(r9, r0)
            r1.A0J(r0)
        L_0x0118:
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "country_name"
            java.lang.String r3 = r1.getStringExtra(r0)
            if (r3 == 0) goto L_0x0184
            X.5cT r1 = r9.A0B
            r0 = 0
            r1.A08 = r0
            com.whatsapp.CircularProgressBar r0 = r1.A06
            r0.setVisibility(r7)
            X.4FS r2 = r9.A04
            r1 = 14
            X.3bv r0 = new X.3bv
            r0.<init>(r1, r3, r9)
            r2.BkM(r0)
            return
        L_0x013b:
            X.5cT r1 = r9.A0B
            java.lang.Double r0 = r1.A09
            if (r0 == 0) goto L_0x015f
            java.lang.Double r2 = r1.A0A
            if (r2 == 0) goto L_0x015f
            java.lang.Float r3 = r1.A0B
            if (r3 == 0) goto L_0x015f
            double r0 = r0.doubleValue()
            com.google.android.gms.maps.model.LatLng r2 = X.C86624Kv.A0H(r2, r0)
            X.5Uv r1 = r9.A01
            float r0 = r3.floatValue()
        L_0x0157:
            X.7BU r0 = X.C106555Zl.A02(r2, r0)
            r1.A0A(r0)
            goto L_0x0106
        L_0x015f:
            X.5Tn r0 = r9.A09
            X.5ZO r2 = r0.A01()
            if (r2 != 0) goto L_0x0171
            X.5TO r0 = r9.A0A
            X.5ZO r2 = r0.A00
            if (r2 != 0) goto L_0x0171
            X.5ZO r2 = r0.A01()
        L_0x0171:
            java.lang.String r1 = r2.A09
            java.lang.String r0 = "city_default"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            com.google.android.gms.maps.model.LatLng r2 = X.AnonymousClass5ZO.A00(r2)
            X.5Uv r1 = r9.A01
            r0 = 1092616192(0x41200000, float:10.0)
            goto L_0x0157
        L_0x0184:
            java.lang.String r0 = "latitude"
            r5 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r3 = r1.getDoubleExtra(r0, r5)
            java.lang.String r0 = "longitude"
            double r1 = r1.getDoubleExtra(r0, r5)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x01cc
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x01cc
            X.5cT r5 = r9.A0B
            r5.A0F = r7
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r5.A09 = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r1)
            r5.A0A = r0
            com.google.android.gms.maps.model.LatLng r2 = X.AnonymousClass4L0.A0H(r3, r1)
            r0 = 1098907648(0x41800000, float:16.0)
            X.5Uv r1 = r9.A01
            X.C626936e.A06(r1)
            X.7BU r0 = X.C106555Zl.A02(r2, r0)
            r1.A0A(r0)
            return
        L_0x01c0:
            r0 = move-exception
            X.8RJ r0 = X.AnonymousClass4L0.A0I(r0)
            throw r0
        L_0x01c6:
            r0 = move-exception
            X.8RJ r0 = X.AnonymousClass4L0.A0I(r0)
            throw r0
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0C(X.5Uv, com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity):void");
    }

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A04 = (C50382i5) A2Y.AZG.get();
            this.A0E = C64333Db.A2t(A2Y);
            this.A0J = C86614Ku.A0d(A2Y);
            this.A0D = C64333Db.A2r(A2Y);
            this.A03 = AnonymousClass4SG.A2Z(A2Y);
            this.A0C = C18280x3.A0L(r1);
            this.A0G = C86664Kz.A1D(A2Y);
            this.A0H = C107695bk.A2l(r1);
            this.A05 = C107695bk.A0d(r1);
            this.A06 = (C111545iG) r1.A3e.get();
            this.A09 = (C105085Tn) r1.AAO.get();
            this.A08 = (AnonymousClass4w0) r1.A1g.get();
            this.A0A = (AnonymousClass5TO) r1.A3O.get();
            this.A0I = C107695bk.A2m(r1);
            this.A02 = (AnonymousClass5MD) r1.A4a.get();
        }
    }

    public final void A75() {
        C105415Uv r0 = this.A01;
        if (r0 != null && r0.A02() != null && this.A01.A02().A03 != null) {
            LatLng latLng = this.A01.A02().A03;
            C108135cT r2 = this.A0B;
            r2.A09 = Double.valueOf(latLng.A00);
            r2.A0A = Double.valueOf(latLng.A01);
        }
    }

    public final void A77() {
        C108135cT r1 = this.A0B;
        if (r1.A09 == null || r1.A0A == null) {
            A76();
            return;
        }
        r1.A08 = null;
        r1.A06.setVisibility(0);
        C108135cT r0 = this.A0B;
        A7B(new AnonymousClass925(this, 0), r0.A09, r0.A0A);
    }

    public final void A78() {
        C105415Uv r0 = this.A01;
        if (r0 != null) {
            r0.A0L(true);
            this.A0B.A01();
            View view = this.A0B.A03;
            if (view != null) {
                view.setVisibility(0);
            }
            AnonymousClass4uh r02 = this.A0F;
            r02.A03 = 1;
            r02.A0B(1);
        }
    }

    public final void A79() {
        if (RequestPermissionActivity.A0n(this, this.A0D, R.string.f11nameremoved, R.string.f11nameremoved, 34)) {
            this.A0B.A01();
            View view = this.A0B.A03;
            if (view != null) {
                view.setVisibility(0);
            }
            AnonymousClass4uh r3 = this.A0F;
            int i = r3.A03;
            if (i != 0) {
                if (i == 1) {
                    r3.setLocationMode(0);
                    return;
                } else if (i != 2) {
                    return;
                }
            }
            r3.setLocationMode(1);
        }
    }

    public final boolean A7C() {
        Double d;
        if (TextUtils.isEmpty(this.A0B.A0C)) {
            C108135cT r0 = this.A0B;
            Double d2 = r0.A09;
            if (d2 == null || (d = r0.A0A) == null) {
                A76();
            } else {
                A7B(new AnonymousClass925(this, 1), d2, d);
                return false;
            }
        }
        return true;
    }

    public void BUU(AnonymousClass7T4 r3, int i) {
        A7A(new C1891190b(this, 20), new AnonymousClass8F9(this, r3), i);
    }

    public void BUV(AnonymousClass5ZO r5) {
        this.A0B.A08 = r5;
        try {
            this.A08.A01(r5);
            BjL();
            C18290x4.A18(this);
        } catch (Exception e) {
            AnonymousClass8F8 r2 = new AnonymousClass8F8(this);
            BjL();
            C89654ea.A4X(this, R.string.f11nameremoved, R.string.f11nameremoved);
            r2.BK8();
            Log.e("DirectoryUserLocationPickerUI/onOptionsItemSelected Failed to store search location", e);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 34) {
            LocationSharingService.A04(getApplicationContext(), this.A0G);
            if (i2 == -1) {
                C108135cT r0 = this.A0B;
                r0.A0D = true;
                r0.A0J.A02(true);
                A78();
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r13 = r16
            r3 = r17
            super.onCreate(r3)
            r2 = 0
            if (r17 == 0) goto L_0x0012
            java.lang.String r0 = "zoom_to_user"
            boolean r0 = r3.getBoolean(r0, r2)
            r13.A0M = r0
        L_0x0012:
            X.5MD r4 = r13.A02
            X.5iE r1 = r13.A05
            X.8E9 r0 = r13.A0I
            X.5QV r0 = r4.A00(r0, r1)
            r13.A07 = r0
            X.2sr r10 = r13.A01
            X.33i r14 = r13.A08
            com.whatsapp.nativelibloader.WhatsAppLibLoader r15 = r13.A0J
            X.7ky r9 = r13.A03
            X.5Tn r12 = r13.A09
            X.4w0 r11 = r13.A08
            X.5cT r8 = new X.5cT
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r13.A0B = r8
            r8.A07 = r13
            r0 = 2131624779(0x7f0e034b, float:1.8876747E38)
            r13.setContentView((int) r0)
            r0 = 2131893564(0x7f121d3c, float:1.9421908E38)
            r13.setTitle(r0)
            android.view.View r1 = r13.A00
            r0 = 2131434334(0x7f0b1b5e, float:1.849048E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            X.0R8 r1 = X.AnonymousClass4SG.A2S(r13, r0)
            r0 = 1
            r1.A0O(r0)
            r1.A0N(r0)
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r8.A0M
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "DirectoryUserLocationPickerUI/onCreate: aborting due to native libraries missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0062:
            r13.finish()
        L_0x0065:
            X.5cT r4 = r13.A0B
            android.view.View r1 = r13.A00
            r0 = 2131431640(0x7f0b10d8, float:1.8485015E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0E(r1, r0)
            r4.A04 = r0
            X.C154947e0.A00(r13)
            com.google.android.gms.maps.GoogleMapOptions r4 = new com.google.android.gms.maps.GoogleMapOptions
            r4.<init>()
            r0 = 1
            r4.A00 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r4.A0C = r1
            r4.A05 = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A08 = r0
            r4.A06 = r1
            r4.A0A = r0
            r4.A09 = r0
            X.903 r0 = new X.903
            r0.<init>(r13, r4, r13, r2)
            r13.A0F = r0
            android.view.View r1 = r13.A00
            r0 = 2131431179(0x7f0b0f0b, float:1.848408E38)
            android.view.ViewGroup r1 = X.C86644Kx.A0I(r1, r0)
            X.4uh r0 = r13.A0F
            r1.addView(r0)
            X.4uh r0 = r13.A0F
            r0.A06(r3)
            r13.A00 = r3
            X.5Uv r0 = r13.A01
            if (r0 != 0) goto L_0x00bb
            X.4uh r1 = r13.A0F
            X.8mC r0 = r13.A0N
            X.5Uv r0 = r1.A09(r0)
            r13.A01 = r0
        L_0x00bb:
            X.5cT r0 = r13.A0B
            android.widget.ImageView r1 = r0.A04
            r0 = 32
            X.C18290x4.A1H(r1, r13, r0)
            X.5cT r0 = r13.A0B
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x00cd
            r0.setVisibility(r2)
        L_0x00cd:
            X.5cT r3 = r13.A0B
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x00e4
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x00e4
            int r0 = r0.getHeight()
            android.view.animation.TranslateAnimation r1 = X.C86604Kt.A0I(r0)
            android.view.View r0 = r3.A02
            r0.startAnimation(r1)
        L_0x00e4:
            X.5cT r0 = r13.A0B
            android.view.View r0 = r0.A03
            if (r0 == 0) goto L_0x00ed
            r0.setVisibility(r2)
        L_0x00ed:
            return
        L_0x00ee:
            X.2sr r0 = r8.A0I
            r0.A0P()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0062
            android.content.Intent r4 = r13.getIntent()
            java.lang.String r5 = "ARG_LATITUDE"
            boolean r0 = r4.hasExtra(r5)
            if (r0 == 0) goto L_0x0121
            java.lang.String r7 = "ARG_LONGITUDE"
            boolean r0 = r4.hasExtra(r7)
            if (r0 == 0) goto L_0x0121
            r0 = 0
            double r5 = r4.getDoubleExtra(r5, r0)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r8.A09 = r5
            double r0 = r4.getDoubleExtra(r7, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r8.A0A = r0
        L_0x0121:
            java.lang.String r1 = "ARG_ZOOM_LEVEL"
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = r4.getFloatExtra(r1, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8.A0B = r0
            java.lang.String r1 = "ARG_FULL_ADDRESS"
            boolean r0 = r4.hasExtra(r1)
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = r4.getStringExtra(r1)
            r8.A0C = r0
        L_0x013d:
            r0 = 2131432722(0x7f0b1512, float:1.848721E38)
            android.view.View r0 = X.C005205m.A00(r13, r0)
            com.whatsapp.CircularProgressBar r0 = (com.whatsapp.CircularProgressBar) r0
            r8.A06 = r0
            r0 = 2131430329(0x7f0b0bb9, float:1.8482356E38)
            android.widget.TextView r0 = X.C005205m.A01(r13, r0)
            r8.A05 = r0
            java.lang.String r0 = r8.A0C
            r8.A03(r0)
            X.5Tn r1 = r8.A0K
            boolean r0 = r1.A04()
            r8.A0D = r0
            boolean r0 = r1.A04()
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            r8.A0E = r0
            android.view.View r1 = r13.A00
            r0 = 2131431169(0x7f0b0f01, float:1.848406E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            r8.A03 = r0
            r0 = 2131431175(0x7f0b0f07, float:1.8484072E38)
            android.view.View r0 = r13.findViewById(r0)
            r8.A02 = r0
            r0 = 2131431172(0x7f0b0f04, float:1.8484066E38)
            android.view.View r0 = r13.findViewById(r0)
            r8.A01 = r0
            android.view.View r1 = r13.A00
            r0 = 2131431640(0x7f0b10d8, float:1.8485015E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0E(r1, r0)
            r8.A04 = r0
            X.4eZ r1 = r8.A07
            r0 = 2131434561(0x7f0b1c41, float:1.849094E38)
            android.view.ViewGroup r0 = X.C86664Kz.A0m(r1, r0)
            android.animation.LayoutTransition r1 = r0.getLayoutTransition()
            r0 = 4
            r1.enableTransitionType(r0)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        C108135cT r1 = this.A0B;
        if (i == 2) {
            C1891190b r2 = new C1891190b(r1, 23);
            C19340zH A002 = AnonymousClass5V0.A00(r1.A07);
            C86624Kv.A1F(A002);
            A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
            A002.A0i(true);
            A002.A0Y(r2, R.string.f11nameremoved);
            AnonymousClass043 create = A002.create();
            if (create != null) {
                return create;
            }
        }
        return super.onCreateDialog(i);
    }

    public void onDestroy() {
        this.A0F.A02();
        super.onDestroy();
    }

    public void onPause() {
        this.A0F.A04();
        AnonymousClass4uh r0 = this.A0F;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0C);
        }
        this.A0L = this.A0D.A05();
        C108135cT r1 = this.A0B;
        r1.A0H.A04(r1);
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.A01 != null) {
            bundle.putFloat("camera_zoom", this.A0B.A0B.floatValue());
            Double d = this.A0B.A09;
            if (d != null) {
                bundle.putDouble("camera_lat", d.doubleValue());
            }
            Double d2 = this.A0B.A0A;
            if (d2 != null) {
                bundle.putDouble("camera_lng", d2.doubleValue());
            }
            bundle.putBoolean("should_update_address", this.A0B.A0G);
            bundle.putInt("map_location_mode", this.A0F.A03);
        }
        bundle.putBoolean("zoom_to_user", this.A0M);
        this.A0F.A07(bundle);
        this.A0B.A03.setVisibility(0);
        super.onSaveInstanceState(bundle);
    }

    public DirectorySetLocationMapActivity(int i) {
        this.A0K = false;
        C86604Kt.A1K(this, 25);
    }

    public final void A76() {
        BjL();
        this.A0B.A06.setVisibility(8);
        this.A0B.A00();
    }

    public final void A7A(DialogInterface.OnClickListener onClickListener, C181968ne r4, int i) {
        BjL();
        if (i == -1) {
            BjL();
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0U(R.string.f11nameremoved);
            A002.A0T(R.string.f11nameremoved);
            A002.A0Y(onClickListener, R.string.f11nameremoved);
            C19340zH.A05(A002);
            A002.A0S();
        } else if (i == 1 || i == 2 || i == 3) {
            BjL();
            C89654ea.A4X(this, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (i == 4) {
            AnonymousClass5V5.A00(this, this.A04, this.A0C);
        } else {
            return;
        }
        r4.BK8();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, getString(R.string.f11nameremoved)).setShowAsAction(2);
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0F.A03();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        Bp9(R.string.f11nameremoved);
        if (!A7C()) {
            return true;
        }
        A74();
        return true;
    }

    public void onResume() {
        C105415Uv r1;
        super.onResume();
        if (this.A0D.A05() != this.A0L && this.A0D.A05() && this.A0B.A0D && (r1 = this.A01) != null) {
            r1.A0L(true);
        }
        this.A0F.A05();
        this.A0F.A0A();
        if (this.A01 == null) {
            this.A01 = this.A0F.A09(this.A0N);
        }
        C108135cT r12 = this.A0B;
        r12.A0H.A05(r12, "user-location-picker", 0.0f, 3, 5000, 1000);
    }

    public DirectorySetLocationMapActivity() {
        this(0);
        this.A0M = true;
        this.A0N = new AnonymousClass93E(this, 0);
    }
}
