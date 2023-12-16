package com.whatsapp.location;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass33K;
import X.AnonymousClass33p;
import X.AnonymousClass487;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass4uh;
import X.AnonymousClass5CV;
import X.AnonymousClass5IY;
import X.AnonymousClass5OZ;
import X.AnonymousClass5RC;
import X.AnonymousClass5U6;
import X.AnonymousClass5UX;
import X.AnonymousClass5XO;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass68A;
import X.AnonymousClass7BV;
import X.AnonymousClass7E1;
import X.AnonymousClass903;
import X.C06560Yg;
import X.C105345Uo;
import X.C105365Uq;
import X.C105415Uv;
import X.C105895Wv;
import X.C106035Xj;
import X.C106095Xp;
import X.C107335b8;
import X.C107465bM;
import X.C107495bP;
import X.C108145cU;
import X.C111095hX;
import X.C113895mA;
import X.C114015mM;
import X.C127776Tg;
import X.C154437dA;
import X.C154947e0;
import X.C159027ky;
import X.C181128mC;
import X.C18260x0;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C27821ej;
import X.C28071fd;
import X.C48952fk;
import X.C54292oU;
import X.C55682qk;
import X.C55832qz;
import X.C56422rx;
import X.C56492s4;
import X.C56612sH;
import X.C56972sr;
import X.C56982ss;
import X.C58152un;
import X.C60152y5;
import X.C613330g;
import X.C620633i;
import X.C620733j;
import X.C621033m;
import X.C621233o;
import X.C626936e;
import X.C64773Ex;
import X.C66433Lk;
import X.C69263Wi;
import X.C86604Kt;
import X.C86634Kw;
import X.C86664Kz;
import X.C89484d3;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class LocationPicker2 extends C89484d3 {
    public Bundle A00;
    public View A01;
    public C105415Uv A02;
    public AnonymousClass7BV A03;
    public AnonymousClass7BV A04;
    public AnonymousClass7BV A05;
    public C105345Uo A06;
    public BottomSheetBehavior A07;
    public C159027ky A08;
    public C56492s4 A09;
    public C621033m A0A;
    public AnonymousClass5UX A0B;
    public C64773Ex A0C;
    public C56422rx A0D;
    public AnonymousClass5ZU A0E;
    public C48952fk A0F;
    public C105365Uq A0G;
    public C114015mM A0H;
    public C613330g A0I;
    public AnonymousClass5U6 A0J;
    public AnonymousClass5RC A0K;
    public C113895mA A0L;
    public C54292oU A0M;
    public AnonymousClass5ZR A0N;
    public C56982ss A0O;
    public AnonymousClass5IY A0P;
    public C27821ej A0Q;
    public EmojiSearchProvider A0R;
    public AnonymousClass4FV A0S;
    public C106095Xp A0T;
    public AnonymousClass33K A0U;
    public AnonymousClass7E1 A0V;
    public AnonymousClass4uh A0W;
    public C108145cU A0X;
    public C621233o A0Y;
    public C28071fd A0Z;
    public WhatsAppLibLoader A0a;
    public C60152y5 A0b;
    public C55832qz A0c;
    public C66433Lk A0d;
    public AnonymousClass5XO A0e;
    public C183538qC A0f;
    public C183538qC A0g;
    public boolean A0h;
    public final C181128mC A0i = new C107495bP(this, 1);

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem A0L2 = C86634Kw.A0L(menu);
        if (this.A0h) {
            A0L2.setIcon(R.drawable.ic_search_normal);
        }
        A0L2.setShowAsAction(2);
        MenuItem icon = menu.add(0, 1, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_action_refresh);
        if (this.A0h) {
            icon.setIcon(C107335b8.A07(this, C18310x6.A0G(this, R.drawable.ic_action_refresh_bottom_sheet), R.color.f5nameremoved));
        }
        icon.setShowAsAction(1);
        return true;
    }

    public static /* synthetic */ void A0C(LatLng latLng, LocationPicker2 locationPicker2) {
        C626936e.A06(locationPicker2.A02);
        C105345Uo r0 = locationPicker2.A06;
        if (r0 == null) {
            C127776Tg r1 = new C127776Tg();
            r1.A08 = latLng;
            r1.A07 = locationPicker2.A03;
            locationPicker2.A06 = locationPicker2.A02.A03(r1);
            return;
        }
        r0.A06(latLng);
        locationPicker2.A06.A09(true);
    }

    public void onBackPressed() {
        this.A0f.get();
        C108145cU r2 = this.A0X;
        if (C86604Kt.A1Y(r2.A0i.A07)) {
            r2.A0i.A02(true);
            return;
        }
        r2.A0a.A05.dismiss();
        if (r2.A0t) {
            r2.A06();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setTitle(R.string.f11nameremoved);
        AnonymousClass5OZ r1 = new AnonymousClass5OZ(this.A09, this.A0S, this.A0U);
        C54292oU r30 = this.A0M;
        C56612sH r55 = this.A06;
        AnonymousClass1VX r40 = this.A0D;
        C69263Wi r54 = this.A05;
        C105895Wv r50 = this.A0B;
        C55682qk r53 = this.A03;
        C56972sr r52 = this.A01;
        AnonymousClass4FS r51 = this.A04;
        C56982ss r34 = this.A0O;
        C56492s4 r29 = this.A09;
        AnonymousClass5Y0 r27 = this.A0C;
        C621033m r26 = this.A0A;
        C27821ej r24 = this.A0Q;
        C111095hX r22 = this.A00;
        C28071fd r21 = this.A0Z;
        AnonymousClass5UX r23 = this.A0B;
        C620633i r28 = this.A08;
        C66433Lk r20 = this.A0d;
        C620733j r19 = this.A00;
        AnonymousClass5IY r18 = this.A0P;
        C55832qz r17 = this.A0c;
        EmojiSearchProvider emojiSearchProvider = this.A0R;
        C56422rx r14 = this.A0D;
        AnonymousClass33K r13 = this.A0U;
        AnonymousClass5ZR r12 = this.A0N;
        AnonymousClass33p r11 = this.A09;
        C159027ky r10 = this.A08;
        C621233o r9 = this.A0Y;
        C60152y5 r8 = this.A0b;
        C613330g r7 = this.A0I;
        AnonymousClass487 r6 = this.A0B;
        C55832qz r48 = r17;
        C66433Lk r49 = r20;
        AnonymousClass68A r15 = new AnonymousClass68A(r22, r53, r10, r54, r52, r29, r26, r23, r14, this.A0F, r7, this.A0J, r28, r55, r30, r12, r11, r19, r34, r6, r18, r24, r27, emojiSearchProvider, r40, r13, this, r9, r21, r1, this.A0a, r8, r48, r49, r50, r51);
        this.A0X = r15;
        r15.A0L(bundle2, this);
        C18290x4.A1F(this.A0X.A0D, this, 16);
        C18260x0.A0w("LocationPicker2/onCreate MapsInitializer init:", AnonymousClass001.A0o(), C154947e0.A00(this));
        this.A04 = AnonymousClass5CV.A00(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green));
        this.A05 = AnonymousClass5CV.A00(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red));
        this.A03 = AnonymousClass5CV.A00(this.A0X.A05);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        Boolean A0U2 = C18320x8.A0U();
        googleMapOptions.A0C = A0U2;
        googleMapOptions.A05 = A0U2;
        googleMapOptions.A08 = true;
        googleMapOptions.A06 = A0U2;
        googleMapOptions.A0A = true;
        googleMapOptions.A09 = true;
        this.A0W = new AnonymousClass903(this, googleMapOptions, this, 2);
        C86664Kz.A0k(this, R.id.map_holder).addView(this.A0W);
        this.A0W.A06(bundle2);
        this.A00 = bundle2;
        if (this.A02 == null) {
            this.A02 = this.A0W.A09(this.A0i);
        }
        this.A0X.A0S = C86664Kz.A0u(this, R.id.my_location);
        C18290x4.A1F(this.A0X.A0S, this, 17);
        boolean A002 = C154437dA.A00(this.A0D);
        this.A0h = A002;
        if (A002) {
            View A022 = C06560Yg.A02(this.A00, R.id.main);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A07 = bottomSheetBehavior;
            this.A0e.A02(A022, bottomSheetBehavior, this, this.A0B);
        }
    }

    public Dialog onCreateDialog(int i) {
        Dialog A012 = this.A0X.A01(i);
        if (A012 == null) {
            return super.onCreateDialog(i);
        }
        return A012;
    }

    public void onDestroy() {
        this.A0W.A02();
        this.A0X.A03();
        if (this.A02 != null) {
            SharedPreferences.Editor A002 = C60152y5.A00(this.A0b, C58152un.A0A);
            CameraPosition A022 = this.A02.A02();
            LatLng latLng = A022.A03;
            A002.putFloat("share_location_lat", (float) latLng.A00);
            A002.putFloat("share_location_lon", (float) latLng.A01);
            A002.putFloat("share_location_zoom", A022.A02);
            A002.apply();
        }
        C107465bM.A02(this.A01, this.A0L);
        C105365Uq r0 = this.A0G;
        if (r0 != null) {
            r0.A00();
            this.A0G = null;
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A0X.A0V(menuItem) || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    public void onPause() {
        this.A0W.A04();
        AnonymousClass4uh r0 = this.A0W;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0C);
        }
        C108145cU r1 = this.A0X;
        r1.A0q = r1.A1B.A05();
        r1.A0y.A04(r1);
        C107465bM.A07(this.A0L);
        AnonymousClass4SG.A3g(this, this.A0f);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (this.A0X.A0t) {
            menu.findItem(R.id.menuitem_search).setVisible(false);
            findItem = menu.findItem(1);
        } else {
            if (!this.A0N.A05()) {
                findItem = menu.findItem(R.id.menuitem_search);
            }
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    public void onResume() {
        C105415Uv r1;
        super.onResume();
        if (this.A0N.A05() != this.A0X.A0q) {
            invalidateOptionsMenu();
            if (this.A0N.A05() && (r1 = this.A02) != null && !this.A0X.A0t) {
                r1.A0L(true);
            }
        }
        this.A0W.A05();
        this.A0W.A0A();
        if (this.A02 == null) {
            this.A02 = this.A0W.A09(this.A0i);
        }
        this.A0X.A04();
        boolean z = C86664Kz.A1G(this.A0f).A03;
        View view = this.A00;
        if (z) {
            AnonymousClass1VX r15 = this.A0D;
            C69263Wi r13 = this.A05;
            C56972sr r12 = this.A01;
            AnonymousClass4FS r11 = this.A04;
            C114015mM r10 = this.A0H;
            C64773Ex r9 = this.A0C;
            AnonymousClass5ZU r8 = this.A0E;
            C620733j r7 = this.A00;
            AnonymousClass5RC r6 = this.A0K;
            C113895mA r5 = this.A0L;
            C183538qC r4 = this.A0f;
            C183538qC r3 = this.A0g;
            View view2 = this.A01;
            C105365Uq r14 = this.A0G;
            AnonymousClass33p r25 = this.A09;
            C113895mA r24 = r5;
            AnonymousClass5RC r23 = r6;
            C114015mM r22 = r10;
            C105365Uq r21 = r14;
            AnonymousClass5ZU r20 = r8;
            C64773Ex r19 = r9;
            C56972sr r18 = r12;
            C69263Wi r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = C107465bM.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "location-picker-activity");
            this.A01 = (View) A002.first;
            this.A0G = (C105365Uq) A002.second;
        } else if (C106035Xj.A01(view)) {
            C107465bM.A04(this.A00, this.A0L, this.A0f);
        }
        C106035Xj.A00(this.A0f);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C105415Uv r0 = this.A02;
        if (r0 != null) {
            CameraPosition A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0W.A03);
        }
        this.A0W.A07(bundle);
        this.A0X.A0K(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        this.A0X.A0i.A01();
        return false;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0W.A03();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0X.A0H(intent);
    }

    public void onStart() {
        super.onStart();
        if (this.A0h) {
            this.A0e.A03(this.A07, this);
        }
    }
}
