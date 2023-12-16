package com.whatsapp.location;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass3ZH;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4uh;
import X.AnonymousClass5Q9;
import X.AnonymousClass5RL;
import X.AnonymousClass5UX;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass689;
import X.AnonymousClass6TF;
import X.AnonymousClass903;
import X.AnonymousClass91Q;
import X.C105345Uo;
import X.C105415Uv;
import X.C105735We;
import X.C106405Yw;
import X.C106555Zl;
import X.C107345b9;
import X.C107495bP;
import X.C107695bk;
import X.C110975hL;
import X.C111095hX;
import X.C111445i6;
import X.C114015mM;
import X.C1230066r;
import X.C154947e0;
import X.C159027ky;
import X.C181128mC;
import X.C18290x4;
import X.C18320x8;
import X.C183968qx;
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
import X.C71533cG;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C89644eZ;
import X.C95814uZ;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity2 extends C89644eZ {
    public float A00;
    public int A01;
    public Bundle A02;
    public MenuItem A03;
    public ImageView A04;
    public C183968qx A05;
    public C105415Uv A06;
    public C159027ky A07;
    public AnonymousClass64J A08;
    public C29411im A09;
    public C1230066r A0A;
    public C29301ib A0B;
    public AnonymousClass5UX A0C;
    public C64773Ex A0D;
    public C29421in A0E;
    public AnonymousClass5ZU A0F;
    public C114015mM A0G;
    public C613330g A0H;
    public AnonymousClass5ZR A0I;
    public C66473Lo A0J;
    public C56892sj A0K;
    public C29431io A0L;
    public C29241iV A0M;
    public AnonymousClass4uh A0N;
    public C111445i6 A0O;
    public C621233o A0P;
    public C28071fd A0Q;
    public C61222zu A0R;
    public C60152y5 A0S;
    public Map A0T;
    public Set A0U;
    public boolean A0V;
    public final C181128mC A0W;
    public volatile boolean A0X;
    public volatile boolean A0Y;

    public final float A74(float f, float f2) {
        if (f <= 0.0f) {
            return f2;
        }
        C626936e.A06(this.A06);
        AnonymousClass6TF A022 = this.A06.A00().A02();
        Location location = new Location("");
        C86624Kv.A0o(location, A022.A02);
        Location location2 = new Location("");
        C86624Kv.A0o(location2, A022.A03);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return f2;
        }
        float log = (float) (((double) this.A06.A02().A02) + (Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)));
        if (log > 16.0f) {
            return 16.0f;
        }
        return log;
    }

    public void A5r() {
        if (!this.A0V) {
            this.A0V = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r2 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r2, this, AnonymousClass4SG.A2t(A2Y, r2, this));
            this.A0A = C86644Kx.A0Q(A2Y);
            this.A0G = C64333Db.A29(A2Y);
            this.A0Q = C86614Ku.A0b(A2Y);
            this.A0C = C86614Ku.A0R(A2Y);
            this.A0D = C64333Db.A26(A2Y);
            this.A0F = C64333Db.A28(A2Y);
            this.A0E = C86614Ku.A0S(A2Y);
            this.A0L = C64333Db.A3K(A2Y);
            this.A0B = C86624Kv.A0N(A2Y);
            this.A0I = C64333Db.A2r(A2Y);
            this.A07 = AnonymousClass4SG.A2Z(A2Y);
            this.A0P = C86664Kz.A1D(A2Y);
            this.A0K = C64333Db.A3G(A2Y);
            this.A0S = C64333Db.A74(A2Y);
            this.A0J = C86634Kw.A0f(A2Y);
            this.A0H = C86624Kv.A0P(A2Y);
            this.A0M = C86624Kv.A0T(A2Y);
            this.A08 = C86614Ku.A0N(A2Y);
            this.A0R = (C61222zu) A2Y.AJD.get();
            this.A09 = (C29411im) A2Y.AcJ.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A76() {
        /*
            r12 = this;
            X.5Uv r2 = r12.A06
            if (r2 == 0) goto L_0x0147
            X.5i6 r1 = r12.A0O
            X.2pX r0 = r1.A0n
            r4 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0116
            X.2pX r0 = r1.A0m
            if (r0 != 0) goto L_0x0116
            X.5ZR r0 = r12.A0I
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001d
            X.5Uv r0 = r12.A06
            r0.A0L(r6)
        L_0x001d:
            X.4uh r0 = r12.A0N
            int r1 = r0.getWidth()
            X.4uh r0 = r12.A0N
            int r0 = r0.getHeight()
            if (r1 == 0) goto L_0x0147
            if (r0 == 0) goto L_0x0147
            java.util.Set r3 = r12.A0U
            java.util.ArrayList r11 = X.AnonymousClass002.A0J(r3)
            r3.clear()
            X.5Uv r0 = r12.A06
            X.5RL r2 = r0.A00()
            X.5i6 r1 = r12.A0O
            X.5Uv r0 = r12.A06
            r0.A02()
            X.5Ww r0 = new X.5Ww
            r0.<init>((X.AnonymousClass5RL) r2)
            r1.A0T(r0)
            X.5i6 r0 = r12.A0O
            java.util.List r0 = r0.A1Q
            java.util.Iterator r10 = r0.iterator()
        L_0x0053:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.Object r5 = r10.next()
            X.5We r5 = (X.C105735We) r5
            java.util.Map r9 = r12.A0T
            java.lang.String r8 = r5.A03
            java.lang.Object r2 = r9.get(r8)
            X.5Uo r2 = (X.C105345Uo) r2
            com.google.android.gms.maps.model.LatLng r1 = r5.A00()
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r7 = r2.A01()
            boolean r0 = r7 instanceof X.C105735We
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r2.A0A()
            if (r0 != 0) goto L_0x0080
            r2.A09(r6)
        L_0x0080:
            r2.A06(r1)
            X.5We r7 = (X.C105735We) r7
            int r1 = r7.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0091
            int r1 = r7.A01
            int r0 = r5.A01
            if (r1 == r0) goto L_0x00a7
        L_0x0091:
            X.5i6 r0 = r12.A0O
            android.graphics.Bitmap r1 = r0.A06(r5)
            X.5i6 r0 = r12.A0O
            java.lang.String r0 = r0.A0B(r5)
            r2.A08(r0)
            X.7BV r0 = X.AnonymousClass5CV.A00(r1)
            r2.A05(r0)
        L_0x00a7:
            int r0 = r5.A00
            if (r0 != r6) goto L_0x00ae
            r8 = 1120403456(0x42c80000, float:100.0)
            goto L_0x00ba
        L_0x00ae:
            java.util.List r0 = r5.A04
            int r0 = r0.size()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r6) goto L_0x00ba
            r8 = 1112014848(0x42480000, float:50.0)
        L_0x00ba:
            X.8wa r7 = r2.A00     // Catch:{ RemoteException -> 0x011b }
            X.7tO r7 = (X.C163177tO) r7     // Catch:{ RemoteException -> 0x011b }
            android.os.Parcel r1 = r7.A00()     // Catch:{ RemoteException -> 0x011b }
            r1.writeFloat(r8)     // Catch:{ RemoteException -> 0x011b }
            r0 = 27
            r7.A02(r0, r1)     // Catch:{ RemoteException -> 0x011b }
            r2.A07(r5)
            X.2pX r1 = r5.A02
            X.5i6 r0 = r12.A0O
            X.2pX r0 = r0.A0o
            if (r1 != r0) goto L_0x00dd
            r2.A04()
        L_0x00d8:
            r3.add(r2)
            goto L_0x0053
        L_0x00dd:
            r2.A03()
            goto L_0x00d8
        L_0x00e1:
            com.google.android.gms.maps.model.LatLng r7 = r5.A00()
            X.5i6 r0 = r12.A0O
            android.graphics.Bitmap r0 = r0.A06(r5)
            X.6Tg r2 = new X.6Tg
            r2.<init>()
            X.7BV r0 = X.AnonymousClass5CV.A00(r0)
            r2.A07 = r0
            X.5i6 r0 = r12.A0O
            java.lang.String r0 = r0.A0B(r5)
            r2.A09 = r0
            r1 = 1063172178(0x3f5eb852, float:0.87)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.A00 = r0
            r2.A01 = r1
            X.5Uv r0 = r12.A06
            X.C626936e.A06(r0)
            r2.A08 = r7
            X.5Uo r2 = r0.A03(r2)
            r9.put(r8, r2)
            goto L_0x00a7
        L_0x0116:
            r2.A0L(r4)
            goto L_0x001d
        L_0x011b:
            r0 = move-exception
            X.8RJ r0 = X.AnonymousClass4L0.A0I(r0)
            throw r0
        L_0x0121:
            java.util.Iterator r2 = r11.iterator()
        L_0x0125:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r1 = r2.next()
            X.5Uo r1 = (X.C105345Uo) r1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0125
            java.lang.Object r0 = r1.A01()
            if (r0 == 0) goto L_0x0125
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0125
            r1.A09(r4)
            goto L_0x0125
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity2.A76():void");
    }

    public final void A77(AnonymousClass5Q9 r6, boolean z) {
        C626936e.A06(this.A06);
        LatLngBounds A002 = r6.A00();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int i = dimensionPixelSize * 2;
        if (this.A0N.getHeight() > i && this.A0N.getWidth() > i) {
            if (!z) {
                this.A06.A05();
                this.A06.A0A(C106555Zl.A03(A002, dimensionPixelSize));
                this.A0N.postDelayed(new C71533cG((Object) this, 7), 500);
            } else if (!this.A0X) {
                this.A0X = true;
                this.A06.A05();
                this.A06.A0B(C106555Zl.A03(A002, dimensionPixelSize), this.A05);
            }
        }
    }

    public final void A78(List list, boolean z) {
        C626936e.A06(this.A06);
        if (list.size() != 1) {
            AnonymousClass5Q9 r5 = new AnonymousClass5Q9();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C54942pX r0 = (C54942pX) it.next();
                r5.A01(AnonymousClass4L0.A0H(r0.A00, r0.A01));
            }
            A77(r5, z);
        } else if (!z) {
            this.A06.A0A(C106555Zl.A02(AnonymousClass4L0.A0H(((C54942pX) list.get(0)).A00, ((C54942pX) list.get(0)).A01), 16.0f));
        } else if (!this.A0X) {
            this.A0X = true;
            this.A06.A0B(C106555Zl.A02(AnonymousClass4L0.A0H(((C54942pX) list.get(0)).A00, ((C54942pX) list.get(0)).A01), 16.0f), this.A05);
        }
    }

    public final void A79(boolean z) {
        if (this.A06 != null && !this.A0O.A0u) {
            Set set = this.A0U;
            if (set.isEmpty()) {
                return;
            }
            if (this.A0N.getWidth() <= 0 || this.A0N.getHeight() <= 0) {
                C86614Ku.A1J(this.A0N.getViewTreeObserver(), this, 9);
            } else if (!z || !this.A0X) {
                ArrayList A0J2 = AnonymousClass002.A0J(set);
                C626936e.A06(this.A06);
                if (!A0J2.isEmpty()) {
                    LatLng A072 = this.A0O.A07();
                    if (A072 != null) {
                        Collections.sort(A0J2, new AnonymousClass91Q(A072.A00, A072.A01, 1));
                    }
                    AnonymousClass5Q9 r7 = new AnonymousClass5Q9();
                    AnonymousClass5Q9 r6 = new AnonymousClass5Q9();
                    r6.A01(((C105345Uo) A0J2.get(0)).A00());
                    r7.A01(((C105345Uo) A0J2.get(0)).A00());
                    int i = 1;
                    while (i < A0J2.size()) {
                        C105345Uo r1 = (C105345Uo) A0J2.get(i);
                        r6.A01(r1.A00());
                        if (!C111445i6.A04(r6.A00())) {
                            break;
                        }
                        r7.A01(r1.A00());
                        i++;
                    }
                    if (i == 1) {
                        Object A012 = ((C105345Uo) A0J2.get(0)).A01();
                        C626936e.A06(A012);
                        A78(((C105735We) A012).A04, z);
                        return;
                    }
                    A77(r7, z);
                }
            } else {
                this.A0Y = true;
            }
        }
    }

    public final boolean A7A(LatLng latLng) {
        C626936e.A06(this.A06);
        AnonymousClass5RL A002 = this.A06.A00();
        if (A002.A02().A04.A00(latLng)) {
            return false;
        }
        if (latLng.A00 >= A002.A02().A04.A01.A00) {
            return true;
        }
        Point A003 = A002.A00(A002.A02().A04.A01);
        A003.offset(0, this.A0O.A0A);
        return !new LatLngBounds(A002.A01(A003), A002.A02().A04.A00).A00(latLng);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A0O.A0Z(i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        C56612sH r25 = this.A06;
        C69263Wi r37 = this.A05;
        C56972sr r36 = this.A01;
        C111095hX r35 = this.A00;
        C114015mM r18 = this.A0G;
        C28071fd r17 = this.A0Q;
        AnonymousClass5UX r19 = this.A0C;
        AnonymousClass5ZU r15 = this.A0F;
        C620733j r14 = this.A00;
        C29421in r13 = this.A0E;
        C29431io r12 = this.A0L;
        C29411im r11 = this.A09;
        C29301ib r10 = this.A0B;
        AnonymousClass5ZR r9 = this.A0I;
        C159027ky r8 = this.A07;
        C621233o r7 = this.A0P;
        C613330g r6 = this.A0H;
        C29241iV r4 = this.A0M;
        C620733j r27 = r14;
        C111095hX r132 = r35;
        C159027ky r142 = r8;
        C69263Wi r152 = r37;
        C56972sr r16 = r36;
        C29411im r172 = r11;
        C29301ib r182 = r10;
        this.A0O = new AnonymousClass689(r132, r142, r152, r16, r172, r182, r19, this.A0D, r13, r15, r18, r6, r25, r9, r27, r12, r4, r7, r17, this.A0R, this, 1);
        getSupportActionBar().A0N(true);
        setContentView((int) R.layout.f8nameremoved);
        C66473Lo r1 = this.A0J;
        C95814uZ A002 = C106405Yw.A00(this);
        C626936e.A06(A002);
        AnonymousClass3ZH A012 = r1.A01(A002);
        getSupportActionBar().A0J(C107345b9.A05(this, this.A0C, this.A0F.A0H(A012)));
        this.A0O.A0O(this, bundle2);
        C154947e0.A00(this);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        googleMapOptions.A05 = C18320x8.A0U();
        googleMapOptions.A08 = true;
        googleMapOptions.A06 = true;
        googleMapOptions.A0A = true;
        googleMapOptions.A09 = true;
        this.A0N = new AnonymousClass903(this, googleMapOptions, this, 1);
        C86664Kz.A0k(this, R.id.map_holder).addView(this.A0N);
        this.A0N.A06(bundle2);
        ImageView A0u = C86664Kz.A0u(this, R.id.my_location);
        this.A04 = A0u;
        C18290x4.A1F(A0u, this, 12);
        this.A02 = bundle2;
        A75();
    }

    public Dialog onCreateDialog(int i) {
        Dialog A052 = this.A0O.A05(i);
        if (A052 == null) {
            return super.onCreateDialog(i);
        }
        return A052;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor putBoolean;
        C105415Uv r0;
        int i;
        if (this.A06 != null) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.map_type_normal) {
                this.A06.A07(1);
                putBoolean = C60152y5.A00(this.A0S, C58152un.A0A).putInt("live_location_map_type", 1);
            } else {
                if (itemId == R.id.map_type_satellite) {
                    r0 = this.A06;
                    i = 4;
                } else if (itemId == R.id.map_type_terrain) {
                    r0 = this.A06;
                    i = 3;
                } else if (itemId == R.id.map_traffic) {
                    boolean z = !this.A06.A0N();
                    this.A06.A0M(z);
                    this.A03.setChecked(z);
                    putBoolean = C60152y5.A00(this.A0S, C58152un.A0A).putBoolean("live_location_show_traffic", z);
                } else if (itemId == 16908332) {
                    finish();
                    return true;
                }
                r0.A07(i);
                putBoolean = C60152y5.A00(this.A0S, C58152un.A0A).putInt("live_location_map_type", i);
            }
            putBoolean.apply();
            return true;
        }
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C105415Uv r0 = this.A06;
        if (r0 != null) {
            CameraPosition A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0N.A03);
        }
        this.A0N.A07(bundle);
        this.A0O.A0P(bundle);
        super.onSaveInstanceState(bundle);
    }

    public GroupChatLiveLocationsActivity2(int i) {
        this.A0V = false;
        C86604Kt.A1K(this, 55);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r3.A0I.A05() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A75() {
        /*
            r3 = this;
            X.C626936e.A01()
            X.5Uv r0 = r3.A06
            if (r0 != 0) goto L_0x0011
            X.4uh r1 = r3.A0N
            X.8mC r0 = r3.A0W
            X.5Uv r0 = r1.A09(r0)
            r3.A06 = r0
        L_0x0011:
            android.widget.ImageView r2 = r3.A04
            X.5i6 r0 = r3.A0O
            X.2pX r0 = r0.A0m
            if (r0 != 0) goto L_0x0022
            X.5ZR r0 = r3.A0I
            boolean r1 = r0.A05()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity2.A75():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C105415Uv r0;
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.map_traffic);
        this.A03 = findItem;
        if (findItem == null || (r0 = this.A06) == null) {
            return true;
        }
        findItem.setChecked(r0.A0N());
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0N.A02();
        this.A0O.A0D();
        if (this.A06 != null) {
            SharedPreferences.Editor A002 = C60152y5.A00(this.A0S, C58152un.A0A);
            CameraPosition A022 = this.A06.A02();
            LatLng latLng = A022.A03;
            A002.putFloat("live_location_lat", (float) latLng.A00);
            A002.putFloat("live_location_lng", (float) latLng.A01);
            A002.putFloat("live_location_zoom", A022.A02);
            A002.apply();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0N.A03();
    }

    public void onPause() {
        super.onPause();
        this.A0N.A04();
        AnonymousClass4uh r0 = this.A0N;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0C);
        }
        this.A0O.A0E();
    }

    public void onResume() {
        super.onResume();
        this.A0N.A05();
        this.A0N.A0A();
        this.A0O.A0F();
        A75();
    }

    public GroupChatLiveLocationsActivity2() {
        this(0);
        this.A0U = AnonymousClass002.A0K();
        this.A0T = AnonymousClass001.A0t();
        this.A01 = 0;
        this.A00 = -1.0f;
        this.A0Y = false;
        this.A05 = new C110975hL(this);
        this.A0W = new C107495bP(this, 0);
    }
}
