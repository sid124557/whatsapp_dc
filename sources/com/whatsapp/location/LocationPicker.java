package com.whatsapp.location;

import X.AnonymousClass1VX;
import X.AnonymousClass33K;
import X.AnonymousClass33p;
import X.AnonymousClass487;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass5IY;
import X.AnonymousClass5OZ;
import X.AnonymousClass5U6;
import X.AnonymousClass5UX;
import X.AnonymousClass5XO;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZR;
import X.AnonymousClass68A;
import X.AnonymousClass7AD;
import X.C105895Wv;
import X.C106915aN;
import X.C107515bR;
import X.C108145cU;
import X.C108975ds;
import X.C110885hC;
import X.C111095hX;
import X.C150067Pa;
import X.C156967hV;
import X.C159027ky;
import X.C166477yk;
import X.C180298ko;
import X.C18290x4;
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
import X.C66433Lk;
import X.C69263Wi;
import X.C86604Kt;
import X.C86624Kv;
import X.C86654Ky;
import X.C86664Kz;
import X.C88534Zc;
import X.C89494d4;
import X.C95834uc;
import X.C95874ug;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class LocationPicker extends C89494d4 {
    public float A00;
    public float A01;
    public Bundle A02;
    public C110885hC A03;
    public AnonymousClass7AD A04;
    public AnonymousClass7AD A05;
    public AnonymousClass7AD A06;
    public C88534Zc A07;
    public C159027ky A08;
    public C56492s4 A09;
    public C621033m A0A;
    public AnonymousClass5UX A0B;
    public C56422rx A0C;
    public C48952fk A0D;
    public C613330g A0E;
    public AnonymousClass5U6 A0F;
    public C54292oU A0G;
    public AnonymousClass5ZR A0H;
    public C56982ss A0I;
    public AnonymousClass5IY A0J;
    public C27821ej A0K;
    public EmojiSearchProvider A0L;
    public AnonymousClass4FV A0M;
    public AnonymousClass33K A0N;
    public C95874ug A0O;
    public C108145cU A0P;
    public C621233o A0Q;
    public C28071fd A0R;
    public WhatsAppLibLoader A0S;
    public C60152y5 A0T;
    public C55832qz A0U;
    public C66433Lk A0V;
    public AnonymousClass5XO A0W;
    public boolean A0X;
    public final C180298ko A0Y = new C107515bR(this, 1);

    public static /* synthetic */ void A0C(C108975ds r3, LocationPicker locationPicker) {
        C626936e.A06(locationPicker.A03);
        C88534Zc r0 = locationPicker.A07;
        if (r0 == null) {
            C156967hV r2 = new C156967hV();
            r2.A01 = r3;
            r2.A00 = locationPicker.A04;
            C110885hC r1 = locationPicker.A03;
            C88534Zc r02 = new C88534Zc(r1, r2);
            r1.A0C(r02);
            r02.A0H = r1;
            locationPicker.A07 = r02;
            return;
        }
        r0.A0H(r3);
        locationPicker.A07.A09(true);
    }

    public void onBackPressed() {
        C108145cU r2 = this.A0P;
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
        AnonymousClass5OZ r1 = new AnonymousClass5OZ(this.A09, this.A0M, this.A0N);
        C54292oU r30 = this.A0G;
        C56612sH r55 = this.A06;
        AnonymousClass1VX r40 = this.A0D;
        C69263Wi r54 = this.A05;
        C105895Wv r50 = this.A0B;
        C55682qk r53 = this.A03;
        C56972sr r52 = this.A01;
        AnonymousClass4FS r51 = this.A04;
        C56982ss r34 = this.A0I;
        C56492s4 r29 = this.A09;
        AnonymousClass5Y0 r27 = this.A0C;
        C621033m r26 = this.A0A;
        C27821ej r24 = this.A0K;
        C111095hX r22 = this.A00;
        C28071fd r21 = this.A0R;
        AnonymousClass5UX r23 = this.A0B;
        C620633i r28 = this.A08;
        C66433Lk r20 = this.A0V;
        C620733j r19 = this.A00;
        AnonymousClass5IY r18 = this.A0J;
        C55832qz r17 = this.A0U;
        EmojiSearchProvider emojiSearchProvider = this.A0L;
        C56422rx r14 = this.A0C;
        AnonymousClass33K r13 = this.A0N;
        AnonymousClass5ZR r12 = this.A0H;
        AnonymousClass33p r11 = this.A09;
        C159027ky r10 = this.A08;
        C621233o r9 = this.A0Q;
        C60152y5 r8 = this.A0T;
        C613330g r7 = this.A0E;
        AnonymousClass487 r6 = this.A0B;
        C55832qz r48 = r17;
        C66433Lk r49 = r20;
        AnonymousClass68A r15 = new AnonymousClass68A(r22, r53, r10, r54, r52, r29, r26, r23, r14, this.A0D, r7, this.A0F, r28, r55, r30, r12, r11, r19, r34, r6, r18, r24, r27, emojiSearchProvider, r40, r13, this, r9, r21, r1, this.A0S, r8, r48, r49, r50, r51);
        this.A0P = r15;
        r15.A0L(bundle2, this);
        C18290x4.A1F(this.A0P.A0D, this, 14);
        this.A0R.A04(this);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red);
        this.A05 = C106915aN.A01(decodeResource);
        this.A06 = C106915aN.A01(decodeResource2);
        this.A04 = C106915aN.A01(this.A0P.A05);
        C150067Pa r16 = new C150067Pa();
        r16.A00 = 1;
        r16.A08 = true;
        r16.A05 = false;
        r16.A04 = "whatsapp_location_picker";
        this.A0O = new C95834uc(this, r16, this);
        C86664Kz.A0k(this, R.id.map_holder).addView(this.A0O);
        this.A0O.A0E(bundle2);
        this.A02 = bundle2;
        if (this.A03 == null) {
            this.A03 = this.A0O.A0J(this.A0Y);
        }
        this.A0P.A0S = C86664Kz.A0u(this, R.id.my_location);
        C18290x4.A1F(this.A0P.A0S, this, 15);
    }

    public Dialog onCreateDialog(int i) {
        Dialog A012 = this.A0P.A01(i);
        if (A012 == null) {
            return super.onCreateDialog(i);
        }
        return A012;
    }

    public void onDestroy() {
        this.A0P.A03();
        if (this.A03 != null) {
            SharedPreferences.Editor A002 = C60152y5.A00(this.A0T, C58152un.A0A);
            C166477yk A022 = this.A03.A02();
            C108975ds r4 = A022.A03;
            A002.putFloat("share_location_lat", (float) r4.A00);
            A002.putFloat("share_location_lon", (float) r4.A01);
            A002.putFloat("share_location_zoom", A022.A02);
            A002.apply();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A0P.A0V(menuItem) || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    public void onPause() {
        C95874ug r0 = this.A0O;
        SensorManager sensorManager = r0.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0D);
        }
        C108145cU r1 = this.A0P;
        r1.A0q = r1.A1B.A05();
        r1.A0y.A04(r1);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (this.A0P.A0t) {
            menu.findItem(R.id.menuitem_search).setVisible(false);
            findItem = menu.findItem(1);
        } else {
            if (!this.A0H.A05()) {
                findItem = menu.findItem(R.id.menuitem_search);
            }
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C110885hC r0 = this.A03;
        if (r0 != null) {
            C166477yk A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            C108975ds r3 = A022.A03;
            bundle.putDouble("camera_lat", r3.A00);
            bundle.putDouble("camera_lng", r3.A01);
            bundle.putInt("map_location_mode", this.A0O.A02);
        }
        this.A0O.A0F(bundle);
        this.A0P.A0K(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        this.A0P.A0i.A01();
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C86624Kv.A0q(menu.add(0, R.id.menuitem_search, 0, R.string.f11nameremoved), R.drawable.ic_action_search);
        C86654Ky.A12(menu.add(0, 1, 0, R.string.f11nameremoved), R.drawable.ic_action_refresh, 1);
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0O.A05();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0P.A0H(intent);
    }

    public void onResume() {
        C110885hC r1;
        super.onResume();
        if (this.A0H.A05() != this.A0P.A0q) {
            invalidateOptionsMenu();
            if (this.A0H.A05() && (r1 = this.A03) != null && !this.A0P.A0t) {
                r1.A0E(true);
            }
        }
        this.A0O.A0K();
        if (this.A03 == null) {
            this.A03 = this.A0O.A0J(this.A0Y);
        }
        this.A0P.A04();
    }
}
