package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0O5;
import X.AnonymousClass0PJ;
import X.AnonymousClass0R2;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YH;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hf;
import X.AnonymousClass2z0;
import X.AnonymousClass30N;
import X.AnonymousClass30V;
import X.AnonymousClass314;
import X.AnonymousClass33O;
import X.AnonymousClass36Y;
import X.AnonymousClass4FV;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4TZ;
import X.AnonymousClass4p8;
import X.AnonymousClass5CM;
import X.AnonymousClass5DW;
import X.AnonymousClass5M7;
import X.AnonymousClass5QO;
import X.AnonymousClass5R7;
import X.AnonymousClass5RO;
import X.AnonymousClass5TZ;
import X.AnonymousClass5Ul;
import X.AnonymousClass5Y0;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass657;
import X.AnonymousClass665;
import X.AnonymousClass677;
import X.AnonymousClass679;
import X.AnonymousClass685;
import X.AnonymousClass6A8;
import X.AnonymousClass6AS;
import X.C06270Wx;
import X.C08310eF;
import X.C100235Ac;
import X.C102805Ki;
import X.C105025Tg;
import X.C106065Xm;
import X.C106405Yw;
import X.C107295b4;
import X.C107335b8;
import X.C107385bE;
import X.C107395bF;
import X.C107405bG;
import X.C107525bS;
import X.C108845de;
import X.C111075hV;
import X.C116985rC;
import X.C117615sD;
import X.C1231767k;
import X.C1236269d;
import X.C125086Fc;
import X.C135166kE;
import X.C15790rw;
import X.C15910sA;
import X.C16910uE;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C183978qy;
import X.C29431io;
import X.C45042Yl;
import X.C47052cd;
import X.C47122ck;
import X.C47912e2;
import X.C48952fk;
import X.C50222hp;
import X.C52472lX;
import X.C53202mi;
import X.C53602nM;
import X.C55832qz;
import X.C56422rx;
import X.C56532s8;
import X.C56892sj;
import X.C56982ss;
import X.C60202yA;
import X.C620633i;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import X.C626936e;
import X.C627336j;
import X.C64333Db;
import X.C64773Ex;
import X.C66433Lk;
import X.C66533Lu;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86644Kx;
import X.C86664Kz;
import X.C88834as;
import X.C89574du;
import X.C89654ea;
import X.C93664oy;
import X.C93734pD;
import X.C93774pH;
import X.C93914pY;
import X.C95814uZ;
import X.C97154xi;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MediaGalleryActivity extends C89574du implements AnonymousClass677 {
    public int A00;
    public int A01 = 1;
    public int A02 = 2;
    public int A03 = 0;
    public MenuItem A04;
    public C16910uE A05;
    public AnonymousClass0R2 A06;
    public C116985rC A07;
    public C116985rC A08;
    public AnonymousClass5DW A09;
    public AnonymousClass5Ul A0A;
    public C621033m A0B;
    public C64773Ex A0C;
    public C56422rx A0D;
    public AnonymousClass5ZU A0E;
    public C48952fk A0F;
    public C53602nM A0G;
    public AnonymousClass5R7 A0H;
    public AnonymousClass5QO A0I;
    public C47912e2 A0J;
    public AnonymousClass5ZR A0K;
    public C56982ss A0L;
    public C66533Lu A0M;
    public C56892sj A0N;
    public C60202yA A0O;
    public C29431io A0P;
    public AnonymousClass36Y A0Q;
    public AnonymousClass4FV A0R;
    public AnonymousClass30N A0S;
    public C93774pH A0T;
    public C52472lX A0U;
    public C97154xi A0V;
    public C53202mi A0W;
    public C95814uZ A0X;
    public C47052cd A0Y;
    public C50222hp A0Z;
    public C45042Yl A0a;
    public C56532s8 A0b = new C56532s8(this.A00);
    public AnonymousClass5TZ A0c;
    public AnonymousClass33O A0d;
    public C55832qz A0e;
    public C66433Lk A0f;
    public AnonymousClass30V A0g;
    public C105025Tg A0h;
    public String A0i = "";
    public ArrayList A0j;
    public boolean A0k;
    public final C15790rw A0l = new AnonymousClass6A8(this, 5);
    public final AnonymousClass0O5 A0m = new C1231767k(this, 9);
    public final AnonymousClass657 A0n = new C107525bS(this, 3);

    public void onActivityResult(int i, int i2, Intent intent) {
        C108845de r5;
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C116985rC r1 = this.A07;
                if (r1.A07()) {
                    r1.A04();
                    this.A0I.A04.values();
                    throw AnonymousClass001.A0g("handleAdvertiseForwardClick");
                }
                B3M();
                return;
            }
            if (this.A0I != null) {
                List A0r = C86604Kt.A0r(intent);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                String stringExtra = intent.getStringExtra("appended_message");
                if (AnonymousClass000.A1W(C627336j.A03(A0r))) {
                    C626936e.A06(intent);
                    r5 = this.A0c.A00(intent.getExtras());
                } else {
                    r5 = null;
                }
                this.A0B.A09(this.A0A, r5, stringExtra, AnonymousClass314.A00(this.A0I.A04.values()), A0r, booleanExtra);
                if (A0r.size() != 1 || (A0r.get(0) instanceof C135166kE)) {
                    Bqv(A0r);
                } else {
                    this.A00.A0B(this, C86604Kt.A08(this, this.A0C, C86664Kz.A1B(), A0r));
                }
            } else {
                Log.w("mediagallery/forward/failed");
                this.A05.A0H(R.string.f11nameremoved, 0);
            }
            AnonymousClass0R2 r0 = this.A06;
            if (r0 != null) {
                r0.A05();
            }
        }
    }

    public static /* synthetic */ AnonymousClass665 A0C(MediaGalleryActivity mediaGalleryActivity) {
        int i = mediaGalleryActivity.A00;
        Iterator A4M = C89654ea.A4M(mediaGalleryActivity);
        while (A4M.hasNext()) {
            C08310eF A0D2 = AnonymousClass4L0.A0D(A4M);
            if ((i == mediaGalleryActivity.A03 && (A0D2 instanceof MediaGalleryFragment)) || ((i == mediaGalleryActivity.A01 && (A0D2 instanceof DocumentsGalleryFragment)) || (i == mediaGalleryActivity.A02 && (A0D2 instanceof LinksGalleryFragment)))) {
                return (AnonymousClass665) A0D2;
            }
        }
        return null;
    }

    public void A66() {
        this.A0g.A03((C95814uZ) null, 13);
    }

    public boolean A6C() {
        return true;
    }

    public final void A74() {
        AnonymousClass5QO r1;
        AnonymousClass0R2 r2 = this.A06;
        if (r2 != null && (r1 = this.A0I) != null) {
            if (r1.A04.isEmpty()) {
                r2.A05();
                return;
            }
            C620633i r7 = this.A08;
            C620733j r6 = this.A00;
            HashMap hashMap = r1.A04;
            long size = (long) hashMap.size();
            Object[] A0L2 = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L2, hashMap.size());
            C107295b4.A00(this, r7, r6.A0L(A0L2, R.plurals.f9nameremoved, size));
            this.A06.A06();
        }
    }

    public void Awx(Drawable drawable, View view) {
    }

    public void B3M() {
        AnonymousClass0R2 r0 = this.A06;
        if (r0 != null) {
            r0.A05();
        }
    }

    public Object B5x(Class cls) {
        if (cls == AnonymousClass657.class) {
            return this.A0n;
        }
        return null;
    }

    public boolean BFW() {
        return AnonymousClass000.A1W(this.A0I);
    }

    public /* synthetic */ boolean BIA() {
        return false;
    }

    public boolean BIB(C624134x r3) {
        AnonymousClass5QO r0 = this.A0I;
        if (r0 != null) {
            if (!r0.A04.containsKey(r3.A1J)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean BIT() {
        return false;
    }

    public /* synthetic */ boolean BLE() {
        return true;
    }

    public /* synthetic */ void BZx(C624134x r1, boolean z) {
    }

    public /* synthetic */ void Bmp(C624134x r1, int i) {
    }

    public void BnL(List list, boolean z) {
        if (this.A0I != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C624134x A0T2 = C18300x5.A0T(it);
                AnonymousClass5QO r0 = this.A0I;
                AnonymousClass2z0 r1 = A0T2.A1J;
                HashMap hashMap = r0.A04;
                if (z) {
                    hashMap.put(r1, A0T2);
                } else {
                    hashMap.remove(r1);
                }
            }
            A74();
        }
    }

    public /* synthetic */ boolean BoV() {
        return false;
    }

    public /* synthetic */ boolean Bor() {
        return false;
    }

    public void Bpx(C624134x r10) {
        C69263Wi r4 = this.A05;
        C29431io r3 = this.A0P;
        AnonymousClass5QO r0 = new AnonymousClass5QO(r4, new C1236269d(this, 1), this.A0I, r3);
        this.A0I = r0;
        r0.A04.put(r10.A1J, r10);
        this.A06 = Bpz(this.A05);
        C620633i r7 = this.A08;
        C620733j r6 = this.A00;
        AnonymousClass5QO r42 = this.A0I;
        long size = (long) r42.A04.size();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, r42.A04.size());
        C107295b4.A00(this, r7, r6.A0L(objArr, R.plurals.f9nameremoved, size));
    }

    public boolean Bqw(C624134x r4) {
        AnonymousClass5QO r0 = this.A0I;
        if (r0 == null) {
            return false;
        }
        AnonymousClass2z0 r2 = r4.A1J;
        boolean containsKey = r0.A04.containsKey(r2);
        HashMap hashMap = this.A0I.A04;
        if (containsKey) {
            hashMap.remove(r2);
        } else {
            hashMap.put(r2, r4);
        }
        A74();
        return !containsKey;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A0H.A08;
    }

    public /* synthetic */ C06270Wx getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C06270Wx getLastMessageLiveData() {
        return null;
    }

    public C15910sA getLifecycleOwner() {
        return this;
    }

    public ArrayList getSearchTerms() {
        return this.A0j;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        String A012;
        List<AnonymousClass2z0> A042;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        AnonymousClass5Y0 r7 = this.A0C;
        C64773Ex r5 = this.A0C;
        AnonymousClass5ZU r4 = this.A0E;
        C620733j r3 = this.A00;
        AnonymousClass5DW r1 = this.A09;
        C88834as r0 = r1.A00.A01;
        C93734pD ABv = r0.ABv();
        C64333Db r11 = r0.A4Z;
        C64773Ex r19 = r5;
        AnonymousClass5ZU r20 = r4;
        this.A05 = new AnonymousClass685(this, r19, r20, new AnonymousClass5RO(), new C93664oy((AnonymousClass5M7) r1.A00.A01.A0T.get(), this, new C93774pH(ABv, new AnonymousClass4p8((C621033m) r11.AZL.get(), (C106065Xm) r11.A00.A6m.get()), new C93914pY((C621033m) r11.AZL.get(), (C106065Xm) r11.A00.A6m.get()))), this.A0T, r3, r7, this, 4);
        C117615sD.A01(this.A04, this.A0J);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        setSupportActionBar(A28);
        int A2I = AnonymousClass1Hf.A2I(this);
        int A043 = C86644Kx.A04(this, R.id.separator);
        AnonymousClass4SG.A3d(this);
        C107405bG.A05(this);
        C95814uZ A002 = C106405Yw.A00(this);
        C626936e.A06(A002);
        this.A0X = A002;
        if (!AnonymousClass4SG.A46(this, A002) || !C86644Kx.A1Z(this.A0D)) {
            A012 = AnonymousClass5ZU.A01(this.A0C, this.A0E, this.A0X);
        } else {
            A012 = C100235Ac.A00(this, this.A0E, this.A00, this.A0C.A0A(this.A0X));
        }
        if (A012 == null) {
            A012 = "";
        }
        A6e(A012);
        if (getIntent().getBooleanExtra("alert", false)) {
            this.A0h.A01(this);
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        this.A02 = -1;
        AnonymousClass4TZ r112 = new AnonymousClass4TZ(getSupportFragmentManager());
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass0x2.A1G(Integer.valueOf(R.string.f11nameremoved), new MediaGalleryFragment(), A0s);
        AnonymousClass0x2.A1G(Integer.valueOf(R.string.f11nameremoved), new DocumentsGalleryFragment(), A0s);
        if (this.A0O.A02.A00("links_ready", 0) != 0) {
            AnonymousClass0x2.A1G(Integer.valueOf(R.string.f11nameremoved), new LinksGalleryFragment(), A0s);
        }
        if (C102805Ki.A00(this.A00)) {
            Collections.reverse(A0s);
        }
        for (int i = 0; i < A0s.size(); i++) {
            AnonymousClass0PJ r02 = (AnonymousClass0PJ) A0s.get(i);
            Number number = (Number) r02.A00;
            Object obj = r02.A01;
            int intValue = number.intValue();
            String string = getString(intValue);
            r112.A01.add(obj);
            r112.A00.add(string);
            if (intValue == R.string.f11nameremoved) {
                this.A03 = i;
            } else if (number.intValue() == R.string.f11nameremoved) {
                this.A01 = i;
            } else if (number.intValue() == R.string.f11nameremoved) {
                this.A02 = i;
            }
        }
        viewPager.setAdapter(r112);
        List list = r112.A01;
        viewPager.setOffscreenPageLimit(list.size());
        viewPager.A0F(this.A03, false);
        this.A00 = this.A03;
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        AnonymousClass0YH.A06(tabLayout, 0);
        if (list.size() > A2I) {
            tabLayout.setTabTextColors(TabLayout.A00(AnonymousClass0Y8.A04(this, R.color.f5nameremoved), C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved)));
            tabLayout.setupWithViewPager(viewPager);
            tabLayout.setOnTabSelectedListener((C183978qy) new C111075hV(viewPager, this));
        } else {
            ((C125086Fc) A28.getLayoutParams()).A00 = 0;
            tabLayout.setVisibility(A043);
        }
        if (bundle != null && (A042 = C107395bF.A04(bundle2)) != null) {
            for (AnonymousClass2z0 r72 : A042) {
                C624134x A052 = this.A0e.A05(r72);
                if (A052 != null) {
                    AnonymousClass5QO r42 = this.A0I;
                    if (r42 == null) {
                        r42 = new AnonymousClass5QO(this.A05, new C1236269d(this, 1), (AnonymousClass5QO) null, this.A0P);
                        this.A0I = r42;
                    }
                    r42.A04.put(r72, A052);
                }
            }
            if (this.A0I != null) {
                this.A06 = Bpz(this.A05);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r1 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r47) {
        /*
            r46 = this;
            r0 = 13
            r10 = r46
            r6 = r47
            if (r6 == r0) goto L_0x0054
            r0 = 19
            if (r6 == r0) goto L_0x002d
            switch(r47) {
                case 23: goto L_0x0020;
                case 24: goto L_0x0014;
                case 25: goto L_0x0039;
                default: goto L_0x000f;
            }
        L_0x000f:
            android.app.Dialog r0 = super.onCreateDialog(r6)
            return r0
        L_0x0014:
            X.5hX r7 = r10.A00
            X.3Lk r5 = r10.A0f
            X.2nM r4 = r10.A0G
            X.4uZ r3 = r10.A0X
            X.33p r2 = r10.A09
            r13 = 0
            goto L_0x002b
        L_0x0020:
            X.5hX r7 = r10.A00
            X.3Lk r5 = r10.A0f
            X.2nM r4 = r10.A0G
            X.4uZ r3 = r10.A0X
            X.33p r2 = r10.A09
            r13 = 1
        L_0x002b:
            r1 = 1
            goto L_0x0045
        L_0x002d:
            X.5hX r7 = r10.A00
            X.3Lk r5 = r10.A0f
            X.2nM r4 = r10.A0G
            X.4uZ r3 = r10.A0X
            X.33p r2 = r10.A09
            r13 = 0
            goto L_0x0044
        L_0x0039:
            X.5hX r7 = r10.A00
            X.3Lk r5 = r10.A0f
            X.2nM r4 = r10.A0G
            X.4uZ r3 = r10.A0X
            X.33p r2 = r10.A09
            r13 = 1
        L_0x0044:
            r1 = 0
        L_0x0045:
            X.4Ha r0 = new X.4Ha
            r0.<init>(r10, r2, r6, r1)
            r8 = r10
            r9 = r0
            r10 = r4
            r11 = r3
            r12 = r5
            android.app.Dialog r0 = X.AnonymousClass59s.A00(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0054:
            X.5QO r2 = r10.A0I
            if (r2 == 0) goto L_0x010f
            java.util.HashMap r0 = r2.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x010f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediagallery/dialog/delete/"
            r1.append(r0)
            java.util.HashMap r0 = r2.A04
            int r0 = r0.size()
            X.C18260x0.A1G(r1, r0)
            X.5QO r0 = r10.A0I
            java.util.HashMap r0 = r0.A04
            java.util.Collection r0 = r0.values()
            java.util.HashSet r12 = X.AnonymousClass0x9.A15(r0)
            X.2sH r0 = r10.A06
            r45 = r0
            X.1VX r0 = r10.A0D
            r27 = r0
            X.3Wi r0 = r10.A05
            r26 = r0
            X.4FS r0 = r10.A04
            r24 = r0
            X.4FV r0 = r10.A0R
            r23 = r0
            X.5Y0 r0 = r10.A0C
            r22 = r0
            X.33m r0 = r10.A0B
            r21 = r0
            X.3Ex r11 = r10.A0C
            X.36Y r0 = r10.A0Q
            r20 = r0
            X.5ZU r9 = r10.A0E
            X.33j r0 = r10.A00
            r19 = r0
            X.2fk r0 = r10.A0F
            r25 = r0
            X.2lX r0 = r10.A0U
            r17 = r0
            X.2mi r0 = r10.A0W
            r16 = r0
            X.30N r15 = r10.A0S
            X.2rx r14 = r10.A0D
            X.33p r8 = r10.A09
            X.5rC r7 = r10.A08
            X.2sj r6 = r10.A0N
            X.2cd r5 = r10.A0Y
            X.4uZ r13 = r10.A0X
            r0 = 2
            X.6AH r4 = new X.6AH
            r4.<init>(r10, r0)
            r18 = 0
            X.2hp r3 = r10.A0Z
            X.2Yl r2 = r10.A0a
            X.2ss r1 = r10.A0L
            r44 = 1
            X.5hq r0 = new X.5hq
            r0.<init>(r10)
            java.lang.String r42 = X.AnonymousClass5ZW.A01(r10, r11, r9, r13, r12)
            r28 = r19
            r29 = r1
            r30 = r6
            r31 = r20
            r32 = r22
            r33 = r27
            r34 = r23
            r35 = r15
            r36 = r17
            r37 = r16
            r38 = r5
            r39 = r3
            r40 = r2
            r41 = r24
            r43 = r12
            r15 = r10
            r16 = r7
            r17 = r0
            r19 = r4
            r20 = r26
            r22 = r11
            r23 = r14
            r24 = r9
            r26 = r45
            r27 = r8
            android.app.Dialog r0 = X.AnonymousClass5ZW.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            return r0
        L_0x010f:
            java.lang.String r0 = "mediagallery/dialog/delete no messages"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.app.Dialog r0 = super.onCreateDialog(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryActivity.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.A0b = this.A0M.A09(this.A0X);
        if (this.A0M.A0N()) {
            SearchView searchView = new SearchView(this);
            searchView.setMaxWidth(Integer.MAX_VALUE);
            AnonymousClass5Yj.A0B(this, AnonymousClass002.A09(searchView, R.id.search_src_text), R.attr.f3nameremoved, R.color.f5nameremoved);
            searchView.setQueryHint(getString(R.string.f11nameremoved));
            searchView.A0B = new AnonymousClass5CM(this, 7);
            boolean z = false;
            MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.f11nameremoved).setIcon(C107335b8.A04(this, R.drawable.ic_action_search_teal, R.color.f5nameremoved));
            this.A04 = icon;
            icon.setActionView(searchView);
            this.A04.setShowAsAction(10);
            this.A04.setOnActionExpandListener(new AnonymousClass6AS(this, 1));
            MenuItem menuItem = this.A04;
            if (this.A00 != this.A03) {
                z = true;
            }
            menuItem.setVisible(z);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public C47122ck A5u() {
        C47122ck A5u = super.A5u();
        A5u.A05 = true;
        String A0n2 = C18310x6.A0n(this);
        A5u.A00 = 18;
        A5u.A01 = A0n2;
        A5u.A06 = true;
        return A5u;
    }

    public /* synthetic */ void B3X(C624134x r1) {
    }

    public /* synthetic */ int BAS(C624134x r2) {
        return 1;
    }

    public /* synthetic */ boolean BJC(C624134x r2) {
        return false;
    }

    public void Bdh(AnonymousClass0R2 r3) {
        super.Bdh(r3);
        if (C107385bE.A02()) {
            C107405bG.A05(this);
        } else {
            C107405bG.A07(this, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        }
    }

    public void Bdi(AnonymousClass0R2 r1) {
        super.Bdi(r1);
        C107405bG.A03(this);
        AnonymousClass4SG.A34(this);
    }

    public /* synthetic */ void Bkv(C624134x r1) {
    }

    public /* synthetic */ void Boi(C624134x r1) {
    }

    public /* synthetic */ void Brx(C624134x r1) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0H.A01(this);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass33O r0 = this.A0d;
        if (r0 != null) {
            r0.A03();
        }
        AnonymousClass5QO r02 = this.A0I;
        if (r02 != null) {
            r02.A01();
            this.A0I = null;
        }
        C117615sD.A01(this.A04, this.A0J);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass5QO r0 = this.A0I;
        if (r0 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A10 = C18290x4.A10(r0.A04);
            while (A10.hasNext()) {
                A0s.add(C86614Ku.A0h(A10));
            }
            C107395bF.A09(bundle, A0s);
        }
    }

    public void onStart() {
        super.onStart();
        this.A0V.A0B(this, this.A0l);
    }

    public void onStop() {
        super.onStop();
        this.A0V.A0C(this.A0l);
    }

    public /* synthetic */ void setQuotedMessage(C624134x r1) {
    }

    public int A5t() {
        return 78318969;
    }

    public void BpB(View view, C624134x r2, int i, boolean z) {
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        this.A0H.A01(this);
    }
}
