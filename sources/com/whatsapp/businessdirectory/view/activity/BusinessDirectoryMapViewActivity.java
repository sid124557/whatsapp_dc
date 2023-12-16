package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass000;
import X.AnonymousClass03x;
import X.AnonymousClass043;
import X.AnonymousClass0O1;
import X.AnonymousClass0XV;
import X.AnonymousClass30R;
import X.AnonymousClass4SG;
import X.AnonymousClass4U2;
import X.AnonymousClass4W6;
import X.AnonymousClass4w0;
import X.AnonymousClass5EF;
import X.AnonymousClass5EH;
import X.AnonymousClass5U9;
import X.AnonymousClass5UV;
import X.AnonymousClass5V0;
import X.AnonymousClass5YI;
import X.AnonymousClass5ZR;
import X.AnonymousClass7AD;
import X.AnonymousClass8FC;
import X.AnonymousClass91X;
import X.C06270Wx;
import X.C103415Mu;
import X.C105085Tn;
import X.C105355Up;
import X.C107595bZ;
import X.C107695bk;
import X.C109065e1;
import X.C109705f3;
import X.C110885hC;
import X.C151167Tr;
import X.C154257cs;
import X.C162457s7;
import X.C166067y5;
import X.C166297yS;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C1891590f;
import X.C19340zH;
import X.C28071fd;
import X.C57162tC;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86754Lk;
import X.C86804Lx;
import X.C88524Zb;
import X.C88834as;
import X.C89644eZ;
import X.C95874ug;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener;
import java.util.List;
import java.util.Map;

public final class BusinessDirectoryMapViewActivity extends C89644eZ {
    public Bitmap A00;
    public Bitmap A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public ImageView A05;
    public AnonymousClass043 A06;
    public C110885hC A07;
    public AnonymousClass7AD A08;
    public BottomSheetBehavior A09;
    public AnonymousClass5EF A0A;
    public TextEmojiLabel A0B;
    public AnonymousClass4w0 A0C;
    public C105085Tn A0D;
    public AnonymousClass5U9 A0E;
    public DirectoryMapViewLocationUpdateListener A0F;
    public AnonymousClass4W6 A0G;
    public AnonymousClass5UV A0H;
    public C151167Tr A0I;
    public C103415Mu A0J;
    public C86754Lk A0K;
    public C86804Lx A0L;
    public C86804Lx A0M;
    public AnonymousClass4U2 A0N;
    public C57162tC A0O;
    public AnonymousClass5ZR A0P;
    public C95874ug A0Q;
    public C28071fd A0R;
    public C105355Up A0S;
    public Runnable A0T;
    public boolean A0U;
    public boolean A0V;
    public final Handler A0W;
    public final AnonymousClass0O1 A0X;
    public final Map A0Y;
    public final Map A0Z;

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        AnonymousClass4U2 r3 = this.A0N;
        if (r3 != null) {
            AnonymousClass0XV r2 = r3.A0T;
            r2.A06("saved-state-marker-items", r3.A0Q.A07());
            r2.A06("saved-state-selected-category", r3.A09);
            r2.A06("saved-state-search-business-chip-visible", Boolean.valueOf(r3.A0M));
            r2.A06("saved-state-should-handle-gps-location-change", Boolean.valueOf(r3.A0L));
            r2.A06("saved-state-map-view-chip-state", r3.A0P.A07());
            r2.A06("saved-state-show-request-dialog", Boolean.FALSE);
            r2.A06("saved-state-error-dialog", r3.A0N.A07());
            r2.A06("saved-state-marker_state", Integer.valueOf(r3.A00));
            r2.A06("saved-state-view_state", r3.A0D);
        }
        C95874ug r0 = this.A0Q;
        if (r0 == null) {
            throw C18270x1.A0S("facebookMapView");
        }
        r0.A0F(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void A5r() {
        if (!this.A0U) {
            this.A0U = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r4 = A2X.A4Z;
            AnonymousClass4SG.A3W(r4, this);
            C107695bk r3 = r4.A00;
            AnonymousClass4SG.A3Q(r4, r3, this, AnonymousClass4SG.A2t(r4, r3, this));
            this.A0A = (AnonymousClass5EF) A2X.A2S.get();
            this.A0R = C86614Ku.A0b(r4);
            this.A0G = new AnonymousClass4W6((AnonymousClass5EH) A2X.A2T.get());
            this.A0P = C64333Db.A2r(r4);
            this.A0S = C107695bk.A2l(r3);
            this.A0I = A2X.ABf();
            this.A0E = A2X.ABa();
            this.A0D = (C105085Tn) r3.AAO.get();
            this.A0J = A2X.ABg();
            this.A0H = A2X.ABe();
            this.A0O = C86624Kv.A0R(r4);
            this.A0C = (AnonymousClass4w0) r3.A1g.get();
            this.A0F = A2X.ABc();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A75() {
        /*
            r4 = this;
            android.view.View r2 = r4.A02
            if (r2 == 0) goto L_0x000f
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A09
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "bottomSheetBehavior"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x000f:
            android.view.View r0 = r4.A03
            if (r0 == 0) goto L_0x002f
            int r3 = r0.getHeight()
            goto L_0x0021
        L_0x0018:
            int r1 = r0.A0O
            r0 = 3
            if (r1 != r0) goto L_0x000f
            int r3 = r2.getHeight()
        L_0x0021:
            X.5hC r2 = r4.A07
            if (r2 == 0) goto L_0x002f
            r0 = 1113063424(0x42580000, float:54.0)
            int r1 = X.AnonymousClass5YI.A04(r4, r0)
            r0 = 0
            r2.A08(r1, r0, r3)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity.A75():void");
    }

    public final void A76(C166297yS r4, String str, List list, Map map, int i) {
        C151167Tr r1 = this.A0I;
        if (r1 != null) {
            r1.A00(new AnonymousClass8FC(this, r4, str, list, map, i), str, AnonymousClass5YI.A04(this, 54.0f));
            return;
        }
        throw C18270x1.A0S("directoryImageLoader");
    }

    public final void A77(C166297yS r10, List list, int i) {
        String str;
        C109065e1 r7 = r10.A03;
        if (r7 != null) {
            String str2 = r7.A0G;
            if (str2 == null || this.A0Y.get(str2) != null) {
                Map map = this.A0Z;
                if (map.get(r7.A04()) != null) {
                    C110885hC r1 = this.A07;
                    C162457s7.A0H(r1);
                    Bitmap bitmap = this.A00;
                    if (bitmap == null) {
                        throw C18270x1.A0S("defaultAvatar");
                    }
                    C88524Zb r2 = new C88524Zb(bitmap, r1, r10);
                    List list2 = r7.A0M;
                    if (list2.isEmpty()) {
                        str = "";
                    } else {
                        str = ((C166067y5) C18290x4.A0k(list2)).A02;
                    }
                    int A002 = C154257cs.A00(str);
                    C86804Lx r3 = r2.A03;
                    C86624Kv.A0k(r3.A0F.getResources(), r3.A0L, A002);
                    r3.A09 = r7.A0I;
                    r3.A03 = r7.A07;
                    Bitmap bitmap2 = (Bitmap) map.get(r7.A04());
                    if (bitmap2 != null) {
                        if (bitmap2.equals(AnonymousClass30R.A07)) {
                            Bitmap bitmap3 = this.A01;
                            if (bitmap3 == null) {
                                throw C18270x1.A0S("defaultCategoryBitmap");
                            }
                            r3.A05 = bitmap3;
                        } else {
                            r3.A05 = bitmap2;
                        }
                    }
                    Bitmap bitmap4 = (Bitmap) this.A0Y.get(str2);
                    if (bitmap4 != null) {
                        if (bitmap4.equals(AnonymousClass30R.A07)) {
                            Bitmap bitmap5 = this.A00;
                            if (bitmap5 == null) {
                                throw C18270x1.A0S("defaultAvatar");
                            }
                            r3.A02(bitmap5);
                        } else {
                            r3.A02(bitmap4);
                        }
                    }
                    r3.A01();
                    r2.A00 = new C109705f3((Object) this, 25, (Object) r2);
                    C110885hC r0 = this.A07;
                    if (r0 != null) {
                        r0.A0C(r2);
                    }
                    if (r10.A01) {
                        r2.A06(1.0f);
                        AnonymousClass4U2 r02 = this.A0N;
                        if (r02 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        r02.A07 = r2;
                    }
                    list.add(r2);
                    if (i == list.size()) {
                        AnonymousClass4U2 r03 = this.A0N;
                        if (r03 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        r03.A0F.addAll(list);
                    }
                }
            }
        }
    }

    public final void A78(boolean z) {
        LocationManager A0F2 = this.A08.A0F();
        boolean z2 = false;
        if (A0F2 != null && (A0F2.isProviderEnabled("gps") || A0F2.isProviderEnabled("network"))) {
            z2 = true;
        }
        AnonymousClass4U2 r2 = this.A0N;
        if (z) {
            if (r2 == null) {
                throw C18270x1.A0S("viewModel");
            }
            r2.A0R(z2);
        } else if (z2) {
            if (r2 == null) {
                throw C18270x1.A0S("viewModel");
            }
            r2.A0V.A01(5);
            C06270Wx.A03(r2.A0P, 1);
            C06270Wx.A03(r2.A0i, 0);
        } else if (r2 == null) {
            throw C18270x1.A0S("viewModel");
        } else {
            r2.A0V.A01(75);
            A74();
        }
    }

    public final boolean A79() {
        Object systemService = getSystemService("location");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        AnonymousClass5ZR r0 = this.A0P;
        if (r0 == null) {
            throw C18270x1.A0S("waPermissionsHelper");
        } else if (!r0.A05() || !locationManager.isProviderEnabled("gps")) {
            return false;
        } else {
            return true;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 34) {
            if (i2 == -1) {
                this.A0V = true;
                AnonymousClass4w0 r0 = this.A0C;
                if (r0 != null) {
                    r0.A02(true);
                    A78(false);
                } else {
                    throw C18270x1.A0S("businessDirectorySharedPrefs");
                }
            } else if (i2 == 0) {
                AnonymousClass4U2 r02 = this.A0N;
                if (r02 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                r02.A0H();
            }
            C110885hC r1 = this.A07;
            if (r1 != null) {
                r1.A0E(A79());
            }
        } else if (i == 35) {
            LocationManager A0F2 = this.A08.A0F();
            boolean z = false;
            if (A0F2 != null && (A0F2.isProviderEnabled("gps") || A0F2.isProviderEnabled("network"))) {
                z = true;
            }
            AnonymousClass4U2 r2 = this.A0N;
            if (z) {
                if (r2 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                r2.A0V.A01(5);
                C06270Wx.A03(r2.A0P, 1);
                C06270Wx.A03(r2.A0i, 0);
            } else if (r2 == null) {
                throw C18270x1.A0S("viewModel");
            } else {
                r2.A0H();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        AnonymousClass4U2 r0 = this.A0N;
        if (r0 == null) {
            throw C86604Kt.A0j();
        }
        r0.A0G();
    }

    public BusinessDirectoryMapViewActivity(int i) {
        this.A0U = false;
        C86604Kt.A1K(this, 23);
    }

    public final void A74() {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        C86624Kv.A1F(A002);
        A002.A0V(new C1891590f(this, 2));
        A002.A00.A0L(new AnonymousClass91X(this, 1));
        A002.A0i(true);
        C86614Ku.A1O(A002, this, 19, R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
        if (r1.A0X(2791) == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.view.View r0 = X.AnonymousClass001.A0Q(r6)
            int r0 = r0.getSystemUiVisibility()
            r1 = r0 | 1024(0x400, float:1.435E-42)
            android.view.View r0 = X.AnonymousClass001.A0Q(r6)
            r0.setSystemUiVisibility(r1)
            android.view.Window r1 = r6.getWindow()
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            X.C86634Kw.A13(r6, r1, r0)
            r0 = 2131624030(0x7f0e005e, float:1.8875228E38)
            r6.setContentView((int) r0)
            android.view.View r1 = r6.A00
            r0 = 2131428614(0x7f0b0506, float:1.8478877E38)
            android.view.View r3 = X.C06560Yg.A02(r1, r0)
            r2 = r3
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r0 = 1
            r2.setNestedScrollingEnabled(r0)
            X.4W6 r0 = r6.A0G
            if (r0 == 0) goto L_0x0152
            r2.setAdapter(r0)
            X.5Up r0 = r6.A0S
            if (r0 == 0) goto L_0x014b
            X.1VX r1 = r0.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 2791(0xae7, float:3.911E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0052
        L_0x0050:
            r0 = 8
        L_0x0052:
            r2.setVisibility(r0)
            X.C162457s7.A0D(r3)
            r6.A03 = r3
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131231938(0x7f0804c2, float:1.8079971E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            X.C162457s7.A0D(r0)
            r6.A01 = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131233433(0x7f080a99, float:1.8083003E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            X.7AD r0 = X.C106915aN.A01(r0)
            r6.A08 = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131231006(0x7f08011e, float:1.807808E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            X.C162457s7.A0D(r0)
            r6.A00 = r0
            X.4Lk r0 = new X.4Lk
            r0.<init>(r6)
            r6.A0K = r0
            r0 = 1113063424(0x42580000, float:54.0)
            int r2 = X.AnonymousClass5YI.A04(r6, r0)
            android.graphics.Bitmap r1 = r6.A00
            java.lang.String r3 = "defaultAvatar"
            if (r1 != 0) goto L_0x00a3
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x00a3:
            X.4Lx r0 = new X.4Lx
            r0.<init>(r6, r1, r2)
            r6.A0L = r0
            int r2 = X.AnonymousClass5YI.A02(r6)
            android.graphics.Bitmap r1 = r6.A00
            if (r1 != 0) goto L_0x00b7
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x00b7:
            X.4Lx r0 = new X.4Lx
            r0.<init>(r6, r1, r2)
            r6.A0M = r0
            X.1fd r0 = r6.A0R
            if (r0 == 0) goto L_0x0144
            r0.A03(r6)
            android.view.View r1 = r6.A00
            r0 = 2131431640(0x7f0b10d8, float:1.8485015E38)
            android.widget.ImageView r0 = X.C86604Kt.A0J(r1, r0)
            r6.A05 = r0
            X.7Pa r5 = new X.7Pa
            r5.<init>()
            r0 = 8
            r5.A00 = r0
            r0 = 1
            r5.A08 = r0
            r0 = 0
            r5.A05 = r0
            boolean r0 = X.C107405bG.A0D(r6)
            r5.A06 = r0
            java.lang.String r0 = "whatsapp_smb_business_discovery"
            r5.A04 = r0
            r2 = -4599168823961265218(0xc02c785271bcdbbe, double:-14.235004)
            r0 = -4590867386055929270(0xc049f66f9335d24a, double:-51.92528)
            X.5ds r4 = X.C108975ds.A00(r2, r0)
            r3 = 1082130432(0x40800000, float:4.0)
            r2 = 1119092736(0x42b40000, float:90.0)
            r1 = 0
            X.7yk r0 = new X.7yk
            r0.<init>(r4, r3, r2, r1)
            r5.A02 = r0
            X.6kK r0 = new X.6kK
            r0.<init>(r5, r6)
            r6.A0Q = r0
            android.view.View r1 = r6.A00
            r0 = 2131431188(0x7f0b0f14, float:1.8484098E38)
            android.view.ViewGroup r2 = X.C86644Kx.A0I(r1, r0)
            X.4ug r0 = r6.A0Q
            java.lang.String r1 = "facebookMapView"
            if (r0 != 0) goto L_0x011e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x011e:
            r0.A0E(r7)
            X.4ug r0 = r6.A0Q
            if (r0 != 0) goto L_0x012a
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x012a:
            r2.addView(r0)
            X.5hC r0 = r6.A07
            if (r0 != 0) goto L_0x0143
            X.4ug r2 = r6.A0Q
            if (r2 != 0) goto L_0x013a
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x013a:
            r1 = 0
            X.5ba r0 = new X.5ba
            r0.<init>(r7, r1, r6)
            r2.A0J(r0)
        L_0x0143:
            return
        L_0x0144:
            java.lang.String r0 = "locationUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x014b:
            java.lang.String r0 = "directoryGating"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0152:
            java.lang.String r0 = "filterAdapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0T;
        if (runnable != null) {
            this.A0W.removeCallbacks(runnable);
        }
        if (this.A0Q == null) {
            throw C18270x1.A0S("facebookMapView");
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        C95874ug r0 = this.A0Q;
        if (r0 == null) {
            throw C18270x1.A0S("facebookMapView");
        }
        r0.A05();
    }

    public void onPause() {
        super.onPause();
        C95874ug r2 = this.A0Q;
        if (r2 == null) {
            throw C18270x1.A0S("facebookMapView");
        }
        SensorManager sensorManager = r2.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r2.A0D);
        }
    }

    public void onResume() {
        super.onResume();
        C95874ug r1 = this.A0Q;
        if (r1 == null) {
            throw C18270x1.A0S("facebookMapView");
        }
        r1.A0K();
        C110885hC r12 = this.A07;
        if (r12 != null) {
            r12.A0E(A79());
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A0Q == null) {
            throw C18270x1.A0S("facebookMapView");
        }
    }

    public void onStop() {
        super.onStop();
        if (this.A0Q == null) {
            throw C18270x1.A0S("facebookMapView");
        }
    }

    public BusinessDirectoryMapViewActivity() {
        this(0);
        this.A0Y = C18320x8.A0r();
        this.A0Z = C18320x8.A0r();
        this.A0W = AnonymousClass000.A0A();
        this.A0X = Bid(new C107595bZ(this, 0), new AnonymousClass03x());
    }
}
