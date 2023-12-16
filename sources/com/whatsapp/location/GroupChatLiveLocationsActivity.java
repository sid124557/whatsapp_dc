package com.whatsapp.location;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass3ZH;
import X.AnonymousClass4SG;
import X.AnonymousClass5UX;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass689;
import X.AnonymousClass7UM;
import X.AnonymousClass7ZW;
import X.AnonymousClass91Q;
import X.C105735We;
import X.C106405Yw;
import X.C107345b9;
import X.C107515bR;
import X.C107695bk;
import X.C108975ds;
import X.C108995du;
import X.C110825h6;
import X.C110885hC;
import X.C111095hX;
import X.C111445i6;
import X.C114015mM;
import X.C1230066r;
import X.C150067Pa;
import X.C153847c7;
import X.C158137jU;
import X.C159027ky;
import X.C166477yk;
import X.C180298ko;
import X.C18290x4;
import X.C183698qT;
import X.C28071fd;
import X.C29241iV;
import X.C29301ib;
import X.C29411im;
import X.C29421in;
import X.C29431io;
import X.C54942pX;
import X.C56612sH;
import X.C56892sj;
import X.C56972sr;
import X.C58152un;
import X.C60152y5;
import X.C61222zu;
import X.C613330g;
import X.C620733j;
import X.C621233o;
import X.C626936e;
import X.C64333Db;
import X.C64773Ex;
import X.C66473Lo;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C88534Zc;
import X.C89644eZ;
import X.C95814uZ;
import X.C95824ub;
import X.C95874ug;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity extends C89644eZ {
    public float A00;
    public int A01;
    public Bundle A02;
    public ImageView A03;
    public C183698qT A04;
    public C110885hC A05;
    public C159027ky A06;
    public AnonymousClass64J A07;
    public C29411im A08;
    public C1230066r A09;
    public C29301ib A0A;
    public AnonymousClass5UX A0B;
    public C64773Ex A0C;
    public C29421in A0D;
    public AnonymousClass5ZU A0E;
    public C114015mM A0F;
    public C613330g A0G;
    public AnonymousClass5ZR A0H;
    public C66473Lo A0I;
    public C56892sj A0J;
    public C29431io A0K;
    public C29241iV A0L;
    public C95874ug A0M;
    public C111445i6 A0N;
    public C621233o A0O;
    public C28071fd A0P;
    public C61222zu A0Q;
    public C60152y5 A0R;
    public Map A0S;
    public Set A0T;
    public boolean A0U;
    public final C180298ko A0V;
    public volatile boolean A0W;
    public volatile boolean A0X;

    public final float A74(float f, float f2) {
        if (f <= 0.0f) {
            return f2;
        }
        C626936e.A06(this.A05);
        AnonymousClass7ZW A062 = this.A05.A0S.A06();
        Location location = new Location("");
        C108975ds r2 = A062.A02;
        location.setLatitude(r2.A00);
        location.setLongitude(r2.A01);
        Location location2 = new Location("");
        C108975ds r22 = A062.A03;
        location2.setLatitude(r22.A00);
        location2.setLongitude(r22.A01);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return f2;
        }
        float log = (float) (((double) this.A05.A02().A02) + (Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)));
        if (log > 16.0f) {
            return 16.0f;
        }
        return log;
    }

    public void A5r() {
        if (!this.A0U) {
            this.A0U = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r2 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r2, this, AnonymousClass4SG.A2t(A2Y, r2, this));
            this.A09 = C86644Kx.A0Q(A2Y);
            this.A0F = C64333Db.A29(A2Y);
            this.A0P = C86614Ku.A0b(A2Y);
            this.A0B = C86614Ku.A0R(A2Y);
            this.A0C = C64333Db.A26(A2Y);
            this.A0E = C64333Db.A28(A2Y);
            this.A0D = C86614Ku.A0S(A2Y);
            this.A0K = C64333Db.A3K(A2Y);
            this.A08 = (C29411im) A2Y.AcJ.get();
            this.A0A = C86624Kv.A0N(A2Y);
            this.A0H = C64333Db.A2r(A2Y);
            this.A06 = AnonymousClass4SG.A2Z(A2Y);
            this.A0O = C86664Kz.A1D(A2Y);
            this.A0J = C64333Db.A3G(A2Y);
            this.A0R = C64333Db.A74(A2Y);
            this.A0I = C86634Kw.A0f(A2Y);
            this.A0G = C86624Kv.A0P(A2Y);
            this.A0L = C86624Kv.A0T(A2Y);
            this.A07 = C86614Ku.A0N(A2Y);
            this.A0Q = (C61222zu) A2Y.AJD.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A76() {
        /*
            r15 = this;
            X.5hC r2 = r15.A05
            if (r2 == 0) goto L_0x018d
            X.5i6 r1 = r15.A0N
            X.2pX r0 = r1.A0n
            r4 = 0
            r8 = 1
            if (r0 != 0) goto L_0x0166
            X.2pX r0 = r1.A0m
            if (r0 != 0) goto L_0x0166
            X.5ZR r0 = r15.A0H
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001d
            X.5hC r0 = r15.A05
            r0.A0E(r8)
        L_0x001d:
            X.4ug r0 = r15.A0M
            int r1 = r0.getWidth()
            X.4ug r0 = r15.A0M
            int r0 = r0.getHeight()
            if (r1 == 0) goto L_0x018d
            if (r0 == 0) goto L_0x018d
            java.util.Set r3 = r15.A0T
            java.util.ArrayList r14 = X.AnonymousClass002.A0J(r3)
            r3.clear()
            X.5hC r0 = r15.A05
            X.5a3 r7 = r0.A0S
            X.5i6 r1 = r15.A0N
            r0.A02()
            X.5Ww r0 = new X.5Ww
            r0.<init>((X.C106725a3) r7)
            r1.A0T(r0)
            X.5i6 r0 = r15.A0N
            java.util.List r0 = r0.A1Q
            java.util.Iterator r13 = r0.iterator()
        L_0x004f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r6 = r13.next()
            X.5We r6 = (X.C105735We) r6
            java.util.Map r11 = r15.A0S
            java.lang.String r10 = r6.A03
            java.lang.Object r5 = r11.get(r10)
            X.4Zc r5 = (X.C88534Zc) r5
            com.google.android.gms.maps.model.LatLng r0 = r6.A00()
            X.5ds r2 = X.C108975ds.A02(r0)
            if (r5 == 0) goto L_0x00f3
            java.lang.Object r9 = r5.A0K
            boolean r0 = r9 instanceof X.C105735We
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x007c
            r5.A09(r8)
        L_0x007c:
            r5.A0H(r2)
            X.5We r9 = (X.C105735We) r9
            int r1 = r9.A00
            int r0 = r6.A00
            if (r1 != r0) goto L_0x008d
            int r1 = r9.A01
            int r0 = r6.A01
            if (r1 == r0) goto L_0x00a5
        L_0x008d:
            X.5i6 r0 = r15.A0N
            android.graphics.Bitmap r0 = r0.A06(r6)
            X.7AD r0 = X.C106915aN.A01(r0)
            r5.A0G(r0)
            X.5i6 r0 = r15.A0N
            java.lang.String r0 = r0.A0B(r6)
            r5.A0M = r0
            r5.A0E()
        L_0x00a5:
            int r0 = r6.A00
            if (r0 != r8) goto L_0x00e6
            r1 = 1120403456(0x42c80000, float:100.0)
        L_0x00ab:
            r5.A06(r1)
            r5.A0K = r6
            android.graphics.Point r2 = r7.A04(r2)
            X.2pX r1 = r6.A02
            X.5i6 r0 = r15.A0N
            X.2pX r0 = r0.A0o
            if (r1 == r0) goto L_0x00da
            if (r0 != 0) goto L_0x00e2
            boolean r0 = r5.A0P
            if (r0 == 0) goto L_0x00e2
            int r1 = r2.x
            if (r1 < 0) goto L_0x00e2
            X.4ug r0 = r15.A0M
            int r0 = r0.getWidth()
            if (r1 > r0) goto L_0x00e2
            int r1 = r2.y
            if (r1 < 0) goto L_0x00e2
            X.4ug r0 = r15.A0M
            int r0 = r0.getHeight()
            if (r1 > r0) goto L_0x00e2
        L_0x00da:
            r5.A0D()
        L_0x00dd:
            r3.add(r5)
            goto L_0x004f
        L_0x00e2:
            r5.A0C()
            goto L_0x00dd
        L_0x00e6:
            java.util.List r0 = r6.A04
            int r0 = r0.size()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r8) goto L_0x00ab
            r1 = 1112014848(0x42480000, float:50.0)
            goto L_0x00ab
        L_0x00f3:
            X.5hC r0 = r15.A05
            X.C626936e.A06(r0)
            com.google.android.gms.maps.model.LatLng r0 = r6.A00()
            X.5ds r5 = X.C108975ds.A02(r0)
            X.5i6 r0 = r15.A0N
            android.graphics.Bitmap r0 = r0.A06(r6)
            X.7hV r9 = new X.7hV
            r9.<init>()
            X.7AD r0 = X.C106915aN.A01(r0)
            r9.A00 = r0
            X.5i6 r0 = r15.A0N
            java.lang.String r0 = r0.A0B(r6)
            r9.A03 = r0
            r12 = 1063172178(0x3f5eb852, float:0.87)
            r1 = 1056964608(0x3f000000, float:0.5)
            float[] r0 = r9.A06
            r0[r4] = r1
            r0[r8] = r12
            X.2sr r12 = r15.A01
            X.2pX r0 = r6.A02
            com.whatsapp.jid.UserJid r1 = r0.A06
            boolean r0 = r12.A0a(r1)
            if (r0 == 0) goto L_0x0159
            X.1VX r1 = r15.A0D
            r0 = 3088(0xc10, float:4.327E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 2131890034(0x7f120f72, float:1.9414748E38)
            if (r1 == 0) goto L_0x0140
            r0 = 2131889968(0x7f120f30, float:1.9414615E38)
        L_0x0140:
            java.lang.String r0 = r15.getString(r0)
        L_0x0144:
            r9.A03 = r0
            X.5hC r0 = r15.A05
            r9.A01 = r5
            X.4Zc r5 = new X.4Zc
            r5.<init>(r0, r9)
            r0.A0C(r5)
            r5.A0H = r0
            r11.put(r10, r5)
            goto L_0x00a5
        L_0x0159:
            X.3Ex r0 = r15.A0C
            X.3ZH r1 = r0.A0A(r1)
            X.5ZU r0 = r15.A0E
            java.lang.String r0 = r0.A0H(r1)
            goto L_0x0144
        L_0x0166:
            r2.A0E(r4)
            goto L_0x001d
        L_0x016b:
            java.util.Iterator r2 = r14.iterator()
        L_0x016f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r1 = r2.next()
            X.4Zc r1 = (X.C88534Zc) r1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x016f
            java.lang.Object r0 = r1.A0K
            if (r0 == 0) goto L_0x016f
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x016f
            r1.A09(r4)
            goto L_0x016f
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity.A76():void");
    }

    public final void A77(C158137jU r16, boolean z) {
        AnonymousClass7UM r2;
        C626936e.A06(this.A05);
        C108995du A002 = r16.A00();
        C108975ds A003 = A002.A00();
        int width = this.A0M.getWidth();
        int height = this.A0M.getHeight();
        LatLngBounds latLngBounds = new LatLngBounds(C108975ds.A04(A002.A01), C108975ds.A04(A002.A00));
        LatLng latLng = latLngBounds.A00;
        double A004 = C111445i6.A00(latLng.A00);
        LatLng latLng2 = latLngBounds.A01;
        double A005 = (A004 - C111445i6.A00(latLng2.A00)) / 3.141592653589793d;
        double d = latLng.A01 - latLng2.A01;
        if (d < 0.0d) {
            d += 360.0d;
        }
        float min = (float) Math.min(Math.log((((double) height) / 256.0d) / A005) / 0.6931471805599453d, Math.log((((double) width) / 256.0d) / (d / 360.0d)) / 0.6931471805599453d);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int i = dimensionPixelSize * 2;
        if (this.A0M.getHeight() > i && this.A0M.getWidth() > i) {
            if (z) {
                this.A0W = true;
                int i2 = (min > 21.0f ? 1 : (min == 21.0f ? 0 : -1));
                C110885hC r3 = this.A05;
                if (i2 > 0) {
                    r2 = C153847c7.A01(A003, 19.0f);
                } else {
                    r2 = new AnonymousClass7UM();
                    r2.A07 = A002;
                    r2.A05 = dimensionPixelSize;
                }
                r3.A0B(r2, this.A04, 1500);
                return;
            }
            this.A05.A0A(C153847c7.A01(A003, Math.min(19.0f, min)));
        }
    }

    public final void A78(List list, boolean z) {
        C626936e.A06(this.A05);
        if (list.size() != 1) {
            C158137jU r5 = new C158137jU();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C54942pX r0 = (C54942pX) it.next();
                r5.A01(C108975ds.A00(r0.A00, r0.A01));
            }
            A77(r5, z);
        } else if (z) {
            this.A0W = true;
            this.A05.A09(C153847c7.A01(C108975ds.A00(((C54942pX) list.get(0)).A00, ((C54942pX) list.get(0)).A01), 16.0f));
        } else {
            this.A05.A0A(C153847c7.A01(C108975ds.A00(((C54942pX) list.get(0)).A00, ((C54942pX) list.get(0)).A01), 16.0f));
        }
    }

    public final void A79(boolean z) {
        if (this.A05 != null && !this.A0N.A0u) {
            Set set = this.A0T;
            if (set.isEmpty()) {
                return;
            }
            if (this.A0M.getWidth() <= 0 || this.A0M.getHeight() <= 0) {
                C86614Ku.A1J(this.A0M.getViewTreeObserver(), this, 8);
            } else if (!z || !this.A0W) {
                ArrayList A0J2 = AnonymousClass002.A0J(set);
                C626936e.A06(this.A05);
                if (this.A0N.A07() != null) {
                    LatLng A072 = this.A0N.A07();
                    Collections.sort(A0J2, new AnonymousClass91Q(A072.A00, A072.A01, 0));
                }
                C158137jU r6 = new C158137jU();
                C158137jU r7 = new C158137jU();
                int i = 0;
                while (i < A0J2.size()) {
                    C88534Zc r8 = (C88534Zc) A0J2.get(i);
                    r7.A01(r8.A0J);
                    C108995du A002 = r7.A00();
                    if (!C111445i6.A04(new LatLngBounds(C108975ds.A04(A002.A01), C108975ds.A04(A002.A00)))) {
                        break;
                    }
                    r6.A01(r8.A0J);
                    i++;
                }
                if (i == 1) {
                    A78(((C105735We) ((C88534Zc) A0J2.get(0)).A0K).A04, z);
                } else {
                    A77(r6, z);
                }
            } else {
                this.A0X = true;
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A0N.A0Z(i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        C56612sH r21 = this.A06;
        C69263Wi r20 = this.A05;
        C56972sr r19 = this.A01;
        C111095hX r38 = this.A00;
        C114015mM r18 = this.A0F;
        C28071fd r17 = this.A0P;
        C64773Ex r15 = this.A0C;
        AnonymousClass5ZU r12 = this.A0E;
        C620733j r11 = this.A00;
        C29421in r10 = this.A0D;
        C29431io r9 = this.A0K;
        C29411im r8 = this.A08;
        C29301ib r7 = this.A0A;
        AnonymousClass5ZR r6 = this.A0H;
        C159027ky r5 = this.A06;
        C621233o r4 = this.A0O;
        C613330g r3 = this.A0G;
        C29241iV r2 = this.A0L;
        C159027ky r172 = r5;
        C69263Wi r182 = r20;
        C29411im r202 = r8;
        C29301ib r212 = r7;
        AnonymousClass5UX r22 = this.A0B;
        C64773Ex r23 = r15;
        C111095hX r16 = r38;
        this.A0N = new AnonymousClass689(r16, r172, r182, r19, r202, r212, r22, r23, r10, r12, r18, r3, r21, r6, r11, r9, r2, r4, r17, this.A0Q, this, 0);
        getSupportActionBar().A0N(true);
        setContentView((int) R.layout.f8nameremoved);
        C66473Lo r1 = this.A0I;
        C95814uZ A002 = C106405Yw.A00(this);
        C626936e.A06(A002);
        AnonymousClass3ZH A012 = r1.A01(A002);
        getSupportActionBar().A0J(C107345b9.A05(this, this.A0C, this.A0E.A0H(A012)));
        this.A0N.A0O(this, bundle2);
        this.A0P.A04(this);
        C150067Pa r13 = new C150067Pa();
        r13.A00 = 1;
        r13.A08 = true;
        r13.A05 = true;
        r13.A04 = "whatsapp_group_chat";
        this.A0M = new C95824ub(this, r13, this);
        C86664Kz.A0k(this, R.id.map_holder).addView(this.A0M);
        this.A0M.A0E(bundle2);
        ImageView A0u = C86664Kz.A0u(this, R.id.my_location);
        this.A03 = A0u;
        C18290x4.A1F(A0u, this, 11);
        this.A02 = bundle2;
        A75();
    }

    public Dialog onCreateDialog(int i) {
        Dialog A052 = this.A0N.A05(i);
        if (A052 == null) {
            return super.onCreateDialog(i);
        }
        return A052;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C626936e.A06(this.A05);
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C110885hC r0 = this.A05;
        if (r0 != null) {
            C166477yk A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            C108975ds r3 = A022.A03;
            bundle.putDouble("camera_lat", r3.A00);
            bundle.putDouble("camera_lng", r3.A01);
            bundle.putInt("map_location_mode", this.A0M.A02);
        }
        this.A0M.A0F(bundle);
        this.A0N.A0P(bundle);
        super.onSaveInstanceState(bundle);
    }

    public GroupChatLiveLocationsActivity(int i) {
        this.A0U = false;
        C86604Kt.A1K(this, 54);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r3.A0H.A05() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A75() {
        /*
            r3 = this;
            X.C626936e.A01()
            X.5hC r0 = r3.A05
            if (r0 != 0) goto L_0x0011
            X.4ug r1 = r3.A0M
            X.8ko r0 = r3.A0V
            X.5hC r0 = r1.A0J(r0)
            r3.A05 = r0
        L_0x0011:
            android.widget.ImageView r2 = r3.A03
            X.5i6 r0 = r3.A0N
            X.2pX r0 = r0.A0m
            if (r0 != 0) goto L_0x0022
            X.5ZR r0 = r3.A0H
            boolean r1 = r0.A05()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity.A75():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        menu.removeGroup(R.id.map_setting);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0N.A0D();
        if (this.A05 != null) {
            SharedPreferences.Editor A002 = C60152y5.A00(this.A0R, C58152un.A0A);
            C166477yk A022 = this.A05.A02();
            C108975ds r4 = A022.A03;
            A002.putFloat("live_location_lat", (float) r4.A00);
            A002.putFloat("live_location_lng", (float) r4.A01);
            A002.putFloat("live_location_zoom", A022.A02);
            A002.apply();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0M.A05();
    }

    public void onPause() {
        super.onPause();
        C95874ug r0 = this.A0M;
        SensorManager sensorManager = r0.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0D);
        }
        this.A0N.A0E();
    }

    public void onResume() {
        super.onResume();
        this.A0M.A0K();
        this.A0N.A0F();
        A75();
    }

    public GroupChatLiveLocationsActivity() {
        this(0);
        this.A0T = AnonymousClass002.A0K();
        this.A0S = AnonymousClass001.A0t();
        this.A01 = 0;
        this.A0V = new C107515bR(this, 0);
        this.A00 = -1.0f;
        this.A0X = false;
        this.A04 = new C110825h6(this);
    }
}
