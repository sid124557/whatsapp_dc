package com.whatsapp.documentpicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R2;
import X.AnonymousClass0R8;
import X.AnonymousClass0WA;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass1fS;
import X.AnonymousClass33p;
import X.AnonymousClass34K;
import X.AnonymousClass35V;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass4UM;
import X.AnonymousClass5MZ;
import X.AnonymousClass5QG;
import X.AnonymousClass5RC;
import X.AnonymousClass5U6;
import X.AnonymousClass5V0;
import X.AnonymousClass5XO;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass5b1;
import X.AnonymousClass696;
import X.AnonymousClass69P;
import X.AnonymousClass69X;
import X.AnonymousClass6C6;
import X.C04740Ql;
import X.C06560Yg;
import X.C08270df;
import X.C08310eF;
import X.C1001059l;
import X.C105365Uq;
import X.C106035Xj;
import X.C106405Yw;
import X.C107105ah;
import X.C107295b4;
import X.C107345b9;
import X.C107385bE;
import X.C107405bG;
import X.C107465bM;
import X.C110335g4;
import X.C113895mA;
import X.C113965mH;
import X.C114015mM;
import X.C1222663s;
import X.C1235668x;
import X.C154437dA;
import X.C162457s7;
import X.C16850u7;
import X.C16910uE;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C183538qC;
import X.C184008r6;
import X.C19340zH;
import X.C27991fJ;
import X.C29441ip;
import X.C56422rx;
import X.C56512s6;
import X.C56972sr;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import X.C627736r;
import X.C633839a;
import X.C64773Ex;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C87174Oh;
import X.C87704Vf;
import X.C89624eS;
import X.C95814uZ;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WDSSearchViewFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DocumentPickerActivity extends C89624eS implements C16850u7, C184008r6 {
    public int A00 = 0;
    public MenuItem A01;
    public View A02;
    public ViewGroup A03;
    public AnonymousClass0R8 A04;
    public AnonymousClass0R2 A05;
    public BottomSheetBehavior A06;
    public WaTextView A07;
    public C64773Ex A08;
    public C56422rx A09;
    public AnonymousClass5ZU A0A;
    public C105365Uq A0B;
    public C114015mM A0C;
    public AnonymousClass5U6 A0D;
    public AnonymousClass5RC A0E;
    public C113895mA A0F;
    public C56512s6 A0G;
    public AnonymousClass5ZR A0H;
    public C620733j A0I;
    public C87174Oh A0J;
    public C113965mH A0K;
    public AnonymousClass5MZ A0L;
    public C95814uZ A0M;
    public AnonymousClass5XO A0N;
    public AnonymousClass4UM A0O;
    public C183538qC A0P;
    public C183538qC A0Q;
    public String A0R;
    public ArrayList A0S;
    public List A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;
    public final C16910uE A0X = new C110335g4(this);
    public final List A0Y = AnonymousClass001.A0s();

    public class SendDocumentsConfirmationDialogFragment extends Hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment {
        public C29441ip A00;
        public C64773Ex A01;
        public C56422rx A02;
        public AnonymousClass5ZU A03;
        public AnonymousClass5U6 A04;
        public C620633i A05;
        public AnonymousClass5Y0 A06;

        public static SendDocumentsConfirmationDialogFragment A00(C95814uZ r3, ArrayList arrayList, int i, boolean z) {
            SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = new SendDocumentsConfirmationDialogFragment();
            Bundle A08 = AnonymousClass002.A08();
            AnonymousClass0x2.A0v(A08, r3, "jid");
            A08.putParcelableArrayList("uri_list", arrayList);
            A08.putInt("dialog_type", i);
            A08.putBoolean("finish_on_cancel", z);
            sendDocumentsConfirmationDialogFragment.A0u(A08);
            return sendDocumentsConfirmationDialogFragment;
        }

        public Dialog A1J(Bundle bundle) {
            String quantityString;
            C95814uZ A022 = C106405Yw.A02(A0H(), "jid");
            C626936e.A06(A022);
            String A0H = this.A03.A0H(this.A01.A0A(A022));
            ArrayList parcelableArrayList = A0H().getParcelableArrayList("uri_list");
            C626936e.A06(parcelableArrayList);
            int i = A0H().getInt("dialog_type");
            boolean z = A0H().getBoolean("finish_on_cancel");
            C626936e.A06(Boolean.valueOf(z));
            String A023 = AnonymousClass5b1.A02((Uri) parcelableArrayList.get(0), this.A05);
            int size = parcelableArrayList.size();
            if (i == 0) {
                quantityString = C08310eF.A09(this).getString(R.string.f11nameremoved);
            } else {
                int i2 = R.string.f11nameremoved;
                int i3 = R.plurals.f9nameremoved;
                if (i == 2) {
                    i2 = R.string.f11nameremoved;
                    i3 = R.plurals.f9nameremoved;
                }
                if (size != 1 || TextUtils.isEmpty(A023)) {
                    Resources A09 = C08310eF.A09(this);
                    Object[] objArr = new Object[2];
                    AnonymousClass000.A1P(objArr, size, 0);
                    objArr[1] = A0H;
                    quantityString = A09.getQuantityString(i3, size, objArr);
                } else {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = A023;
                    quantityString = AnonymousClass0x7.A0n(this, A0H, objArr2, 1, i2);
                }
            }
            C19340zH A002 = AnonymousClass5V0.A00(A0Q());
            int i4 = R.string.f11nameremoved;
            CharSequence A052 = C107345b9.A05(A1D(), this.A06, quantityString);
            if (i == 0) {
                A002.setTitle(A052);
                String A032 = AnonymousClass35V.A03(this.A01, C107105ah.A00(this.A05, parcelableArrayList));
                int size2 = parcelableArrayList.size();
                int i5 = R.string.f11nameremoved;
                if (size2 == 1) {
                    i5 = R.string.f11nameremoved;
                }
                A002.A0Q(C18310x6.A0m(this, A032, i5));
                i4 = R.string.f11nameremoved;
            } else {
                A002.A0Q(A052);
            }
            A002.setPositiveButton(i4, new C1235668x(parcelableArrayList, A022, this, 5));
            A002.setNegativeButton(R.string.f11nameremoved, new AnonymousClass69X(3, this, z));
            return A002.create();
        }
    }

    public final void A76() {
        int A0I2 = C86664Kz.A0I(this.A0D);
        this.A0L.A00(this, this.A0M, (C27991fJ) null, (String) null, AnonymousClass001.A0s(), 39, A0I2, 0, false, false, true);
    }

    public final void A79(Uri uri) {
        startActivityForResult(C627736r.A0J(this, uri, this.A0M, getIntent().getStringExtra("caption"), getIntent().getStringExtra("mentions"), AnonymousClass0x9.A1N(getIntent(), "send")), 36);
    }

    public final int A75(C95814uZ r8, List list) {
        boolean A1X = AnonymousClass001.A1X(this.A07.A08(false), 1);
        long A002 = C107105ah.A00(this.A08, list) / SearchActionVerificationClientService.MS_TO_NS;
        if (A1X && A002 > 100) {
            return 0;
        }
        AnonymousClass3ZH A0A2 = this.A08.A0A(r8);
        if ((A0A2.A0H instanceof AnonymousClass1fS) || A0A2.A0U()) {
            return 2;
        }
        return 1;
    }

    public final void A78() {
        if (this.A0J.getCount() == 0) {
            if (this.A0T == null) {
                C18280x3.A0r(this, R.id.search_no_matches, 8);
                C18280x3.A0r(this, R.id.progress, 0);
            } else {
                ArrayList arrayList = this.A0S;
                if (arrayList == null || arrayList.isEmpty()) {
                    TextView A0L2 = C18310x6.A0L(this, R.id.search_no_matches);
                    A0L2.setVisibility(0);
                    A0L2.setText(R.string.f11nameremoved);
                } else {
                    TextView A0L3 = C18310x6.A0L(this, R.id.search_no_matches);
                    A0L3.setVisibility(0);
                    Object[] A0L4 = AnonymousClass002.A0L();
                    A0L4[0] = this.A0R;
                    AnonymousClass001.A0y(this, A0L3, A0L4, R.string.f11nameremoved);
                }
                C18280x3.A0r(this, R.id.progress, 8);
            }
            C18280x3.A0r(this, 16908292, 0);
            WaTextView waTextView = this.A07;
            if (waTextView != null) {
                waTextView.setVisibility(8);
                return;
            }
            return;
        }
        C18280x3.A0r(this, 16908292, 8);
        WaTextView waTextView2 = this.A07;
        if (waTextView2 != null) {
            waTextView2.setVisibility(0);
        }
    }

    public final void A7A(AnonymousClass5QG r10) {
        List list = this.A0Y;
        if (list.contains(r10)) {
            list.remove(r10);
            if (list.isEmpty()) {
                this.A05.A05();
            }
            this.A05.A06();
        } else {
            int A0I2 = C86664Kz.A0I(this.A0D);
            if (list.size() >= A0I2) {
                A0I2 = this.A0D.A0N(2693);
            }
            if (list.size() >= A0I2) {
                C69263Wi r2 = this.A05;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, A0I2, 0);
                r2.A0P(getString(R.string.f11nameremoved, objArr), 0);
            } else {
                list.add(r10);
                this.A05.A06();
            }
        }
        if (!list.isEmpty()) {
            C620633i r8 = this.A08;
            Resources resources = getResources();
            int size = list.size();
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1P(objArr2, list.size(), 0);
            C107295b4.A00(this, r8, resources.getQuantityString(R.plurals.f9nameremoved, size, objArr2));
        }
        this.A0J.notifyDataSetChanged();
    }

    public AnonymousClass4UM BCX() {
        return this.A0O;
    }

    public C04740Ql BQO(Bundle bundle, int i) {
        return new C87704Vf(this, this.A04, this.A0I, this.A0D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r5.isEmpty() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BVX(X.C04740Ql r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.util.List r5 = (java.util.List) r5
            r3.A0T = r5
            android.view.MenuItem r2 = r3.A01
            if (r2 == 0) goto L_0x0015
            if (r5 == 0) goto L_0x0011
            boolean r1 = r5.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.setVisible(r0)
        L_0x0015:
            java.lang.String r1 = r3.A0R
            X.4Oh r0 = r3.A0J
            android.widget.Filter r0 = r0.getFilter()
            r0.filter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.BVX(X.0Ql, java.lang.Object):void");
    }

    public void onBackPressed() {
        this.A0P.get();
        if (AnonymousClass4SG.A3z(this)) {
            A77();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        double A002;
        String str;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setTitle(R.string.f11nameremoved);
        C95814uZ A003 = C106405Yw.A00(this);
        C626936e.A07(A003, "rawJid is not a valid chat jid string");
        this.A0M = A003;
        this.A00 = AnonymousClass0x2.A0F(this.A09).getInt("document_picker_sort", this.A00);
        boolean A004 = C154437dA.A00(this.A0D);
        this.A0V = A004;
        int i = R.layout.f8nameremoved;
        if (A004) {
            i = R.layout.f8nameremoved;
        }
        setContentView(i);
        this.A03 = C86664Kz.A0m(this, R.id.search_fragment_holder);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        this.A04 = supportActionBar;
        boolean z = true;
        supportActionBar.A0N(true);
        this.A04.A0P(true);
        this.A0J = new C87174Oh(this);
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        WaTextView A0O2 = C86644Kx.A0O(inflate, R.id.recentsHeader);
        this.A07 = A0O2;
        A0O2.setText(R.string.f11nameremoved);
        if (this.A0J.getCount() == 0) {
            this.A07.setVisibility(8);
        }
        TextView A092 = AnonymousClass002.A09(inflate, R.id.subtitle);
        Object[] objArr = new Object[1];
        int i2 = this.A0K.A00;
        float f = ((float) i2) / 1024.0f;
        boolean z2 = false;
        if (f < 1.0f) {
            A002 = (double) i2;
            str = "MB";
        } else {
            A002 = ((double) C1222663s.A00(((double) f) * 10.0d)) / 10.0d;
            str = "GB";
        }
        int i3 = (int) A002;
        if (A002 == ((double) i3) * 1.0d) {
            z2 = true;
        }
        boolean z3 = !z2;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (z3) {
            A0o.append(A002);
        } else {
            A0o.append(i3);
        }
        String A0V2 = AnonymousClass000.A0V(" ", str, A0o);
        C162457s7.A0D(A0V2);
        objArr[0] = A0V2;
        AnonymousClass001.A0y(this, A092, objArr, R.string.f11nameremoved);
        C633839a.A00(inflate.findViewById(R.id.browseOtherDocs), this, 4);
        View findViewById = inflate.findViewById(R.id.chooseFromGallery);
        findViewById.setVisibility(0);
        C633839a.A00(findViewById, this, 5);
        getListView().addHeaderView(inflate);
        C86614Ku.A1H(inflate, this, 11);
        A74(this.A0J);
        AnonymousClass696.A00(getListView(), this, 6);
        getListView().setOnItemLongClickListener(new AnonymousClass69P(this, 1));
        if (bundle == null || !bundle2.getBoolean("system_picker_auto_started")) {
            z = false;
        }
        this.A0W = z;
        AnonymousClass0WA.A00(this).A03(this);
        if (this.A0V) {
            View A022 = C06560Yg.A02(this.A00, R.id.document_picker_activity);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A06 = bottomSheetBehavior;
            this.A0N.A02(A022, bottomSheetBehavior, this, this.A0B);
        }
    }

    public void onResume() {
        super.onResume();
        boolean z = C86664Kz.A1G(this.A0P).A03;
        View view = this.A00;
        if (z) {
            AnonymousClass1VX r15 = this.A0D;
            C69263Wi r13 = this.A05;
            C56972sr r12 = this.A01;
            AnonymousClass4FS r11 = this.A04;
            C114015mM r10 = this.A0C;
            C64773Ex r9 = this.A08;
            AnonymousClass5ZU r8 = this.A0A;
            C620733j r7 = this.A0I;
            AnonymousClass5RC r6 = this.A0E;
            C113895mA r5 = this.A0F;
            C183538qC r4 = this.A0P;
            C183538qC r3 = this.A0Q;
            View view2 = this.A02;
            C105365Uq r1 = this.A0B;
            AnonymousClass33p r25 = this.A09;
            C113895mA r24 = r5;
            AnonymousClass5RC r23 = r6;
            C114015mM r22 = r10;
            C105365Uq r21 = r1;
            AnonymousClass5ZU r20 = r8;
            C64773Ex r19 = r9;
            C56972sr r18 = r12;
            C69263Wi r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = C107465bM.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "document-picker-activity");
            this.A02 = (View) A002.first;
            this.A0B = (C105365Uq) A002.second;
        } else if (C106035Xj.A01(view)) {
            C107465bM.A04(this.A00, this.A0F, this.A0P);
        }
        C106035Xj.A00(this.A0P);
    }

    public final void A77() {
        int A002;
        C08270df supportFragmentManager = getSupportFragmentManager();
        if (!supportFragmentManager.A0t()) {
            WDSSearchViewFragment wDSSearchViewFragment = (WDSSearchViewFragment) supportFragmentManager.A0D("search_fragment");
            if (wDSSearchViewFragment != null) {
                wDSSearchViewFragment.A1I();
            }
            getSupportFragmentManager().A0m("search_fragment", 1);
            C86604Kt.A1A(this.A03);
            AnonymousClass0R8 r0 = this.A04;
            if (r0 != null) {
                r0.A07();
            }
            this.A0S = null;
            A78();
            if (C107385bE.A02() || !C1001059l.A03) {
                A002 = AnonymousClass34K.A00(this);
            } else {
                A002 = R.color.f5nameremoved;
            }
            C107405bG.A07(this, A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7B(java.util.ArrayList r5) {
        /*
            r4 = this;
            r4.A7C(r5)
            X.4uZ r0 = r4.A0M
            int r3 = r4.A75(r0, r5)
            X.4uZ r2 = r4.A0M
            java.util.List r0 = r4.A0T
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            com.whatsapp.documentpicker.DocumentPickerActivity$SendDocumentsConfirmationDialogFragment r0 = com.whatsapp.documentpicker.DocumentPickerActivity.SendDocumentsConfirmationDialogFragment.A00(r2, r5, r3, r0)
            X.C18270x1.A0t(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.A7B(java.util.ArrayList):void");
    }

    public final void A7C(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                grantUriPermission("com.whatsapp", C86664Kz.A0c(it), 1);
            } catch (SecurityException e) {
                Log.w("docpicker/permission ", e);
            }
        }
    }

    public final void A7D(Collection collection) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0s.add(Uri.fromFile(((AnonymousClass5QG) it.next()).A02));
        }
        int A75 = A75(this.A0M, A0s);
        if (A75 != 0) {
            if (AnonymousClass5b1.A05(this.A09, this.A0M, A0s.size())) {
                A79((Uri) A0s.get(0));
                return;
            }
        }
        C18270x1.A0t(SendDocumentsConfirmationDialogFragment.A00(this.A0M, A0s, A75, false), this);
    }

    public void BVf(C04740Ql r1) {
    }

    public void Bdh(AnonymousClass0R2 r3) {
        int A002;
        super.Bdh(r3);
        if (!C107385bE.A02() && C1001059l.A03) {
            A002 = R.color.f5nameremoved;
        } else if (AnonymousClass4SG.A3z(this)) {
            C107405bG.A07(this, R.color.f5nameremoved);
            C107405bG.A0C(getWindow(), true);
            return;
        } else {
            A002 = AnonymousClass34K.A00(this);
        }
        C107405bG.A07(this, A002);
    }

    public void Bdi(AnonymousClass0R2 r2) {
        super.Bdi(r2);
        if (AnonymousClass4SG.A3z(this)) {
            C107405bG.A03(this);
        }
        AnonymousClass4SG.A34(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r8 == -1) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 1
            r1 = -1
            if (r7 == r0) goto L_0x004a
            r0 = 2
            if (r7 == r0) goto L_0x0034
            r0 = 22
            if (r7 == r0) goto L_0x0017
            r0 = 36
            if (r7 == r0) goto L_0x002d
            r0 = 90
            if (r7 == r0) goto L_0x0017
        L_0x0016:
            return
        L_0x0017:
            if (r8 != r1) goto L_0x00a8
            if (r9 == 0) goto L_0x0016
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r1 = r9.getParcelableArrayListExtra(r0)
            if (r1 == 0) goto L_0x002f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x002f
            r6.A7B(r1)
            return
        L_0x002d:
            if (r8 != r1) goto L_0x0017
        L_0x002f:
            r6.setResult(r8, r9)
            goto L_0x00b4
        L_0x0034:
            boolean r0 = X.C107385bE.A0B()
            if (r0 == 0) goto L_0x0016
            if (r8 != 0) goto L_0x0016
            X.5ZR r0 = r6.A0H
            X.57z r1 = r0.A04()
            X.57z r0 = X.C997357z.PARTIAL
            if (r1 != r0) goto L_0x0016
            r6.A76()
            return
        L_0x004a:
            if (r8 != r1) goto L_0x00a8
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            android.content.ClipData r2 = r9.getClipData()
            r4 = 0
            if (r2 == 0) goto L_0x0070
            r1 = 0
        L_0x0058:
            int r0 = r2.getItemCount()
            if (r1 >= r0) goto L_0x0070
            android.content.ClipData$Item r0 = r2.getItemAt(r1)
            if (r0 == 0) goto L_0x006d
            android.net.Uri r0 = r0.getUri()
            if (r0 == 0) goto L_0x006d
            r5.add(r0)
        L_0x006d:
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0070:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x007f
            android.net.Uri r0 = r9.getData()
            if (r0 == 0) goto L_0x007f
            r5.add(r0)
        L_0x007f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0016
            r6.A7C(r5)
            X.4uZ r0 = r6.A0M
            int r3 = r6.A75(r0, r5)
            if (r3 == 0) goto L_0x00b8
            X.2rx r2 = r6.A09
            int r1 = r5.size()
            X.4uZ r0 = r6.A0M
            boolean r0 = X.AnonymousClass5b1.A05(r2, r0, r1)
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r5.get(r4)
            android.net.Uri r0 = (android.net.Uri) r0
            r6.A79(r0)
            return
        L_0x00a8:
            if (r8 != 0) goto L_0x0016
            java.util.List r0 = r6.A0T
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0016
        L_0x00b4:
            r6.finish()
            return
        L_0x00b8:
            X.4uZ r1 = r6.A0M
            java.util.List r0 = r6.A0T
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c5
        L_0x00c4:
            r4 = 1
        L_0x00c5:
            com.whatsapp.documentpicker.DocumentPickerActivity$SendDocumentsConfirmationDialogFragment r0 = com.whatsapp.documentpicker.DocumentPickerActivity.SendDocumentsConfirmationDialogFragment.A00(r1, r5, r3, r4)
            X.C18270x1.A0t(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            android.view.MenuInflater r1 = r3.getMenuInflater()
            r0 = 2131820557(0x7f11000d, float:1.9273832E38)
            r1.inflate(r0, r4)
            r0 = 2131431467(0x7f0b102b, float:1.8484664E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            r3.A01 = r2
            java.util.List r0 = r3.A0T
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r2.setVisible(r0)
            boolean r0 = super.onCreateOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public void onDestroy() {
        super.onDestroy();
        C107465bM.A02(this.A02, this.A0F);
        C105365Uq r0 = this.A0B;
        if (r0 != null) {
            r0.A00();
            this.A0B = null;
        }
        this.A0D.A02(2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor putInt;
        if (menuItem.getItemId() == R.id.menuitem_sort_by_name) {
            this.A00 = 0;
            putInt = AnonymousClass4SG.A2P(this).putInt("document_picker_sort", 0);
        } else if (menuItem.getItemId() == R.id.menuitem_sort_by_date) {
            this.A00 = 1;
            putInt = AnonymousClass4SG.A2P(this).putInt("document_picker_sort", 1);
        } else if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else {
            if (menuItem.getItemId() == R.id.menuitem_search) {
                AnonymousClass0R8 r0 = this.A04;
                if (r0 != null) {
                    r0.A06();
                }
                if (this.A0O == null) {
                    AnonymousClass4UM r2 = (AnonymousClass4UM) AnonymousClass0x9.A0H(this).A01(AnonymousClass4UM.class);
                    this.A0O = r2;
                    r2.A00.A0B(this, AnonymousClass6C6.A00(this, 234));
                    AnonymousClass4UM r22 = this.A0O;
                    r22.A01.A0B(this, AnonymousClass6C6.A00(this, 235));
                }
                ViewGroup viewGroup = this.A03;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                C08270df supportFragmentManager = getSupportFragmentManager();
                WDSSearchViewFragment wDSSearchViewFragment = (WDSSearchViewFragment) supportFragmentManager.A0D("search_fragment");
                if (wDSSearchViewFragment == null) {
                    wDSSearchViewFragment = new WDSSearchViewFragment();
                    C86614Ku.A1M(wDSSearchViewFragment, supportFragmentManager, "search_fragment");
                }
                WDSConversationSearchView wDSConversationSearchView = wDSSearchViewFragment.A00;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A00();
                    return true;
                }
            }
            return true;
        }
        putInt.apply();
        invalidateOptionsMenu();
        this.A0J.getFilter().filter(this.A0R);
        return true;
    }

    public void onPause() {
        super.onPause();
        C107465bM.A07(this.A0F);
        AnonymousClass4SG.A3g(this, this.A0P);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menuitem_sort_by_name);
        MenuItem findItem2 = menu.findItem(R.id.menuitem_sort_by_date);
        if (this.A00 == 0) {
            findItem.setChecked(true);
            return true;
        }
        findItem2.setChecked(true);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("system_picker_auto_started", this.A0W);
    }

    public void onStart() {
        super.onStart();
        if (this.A0V) {
            this.A0N.A03(this.A06, this);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        try {
            super.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.e("docpicker/pick-from-doc-provider ", e);
            C86654Ky.A1J(this.A05);
        }
    }
}
