package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass1fU;
import X.AnonymousClass1t8;
import X.AnonymousClass2CN;
import X.AnonymousClass2ML;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass4OH;
import X.AnonymousClass4SG;
import X.AnonymousClass4WK;
import X.AnonymousClass54F;
import X.AnonymousClass5CM;
import X.AnonymousClass5KP;
import X.AnonymousClass5RC;
import X.AnonymousClass5T6;
import X.AnonymousClass5U6;
import X.AnonymousClass5UR;
import X.AnonymousClass5UX;
import X.AnonymousClass5X7;
import X.AnonymousClass5XO;
import X.AnonymousClass5Y4;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.C005205m;
import X.C06560Yg;
import X.C102805Ki;
import X.C103875Ot;
import X.C104215Qc;
import X.C105225Ub;
import X.C105365Uq;
import X.C105755Wg;
import X.C106035Xj;
import X.C106175Xx;
import X.C106405Yw;
import X.C106705a1;
import X.C107125ak;
import X.C107175ap;
import X.C107465bM;
import X.C109335eS;
import X.C110155fm;
import X.C113895mA;
import X.C114015mM;
import X.C116985rC;
import X.C1231467h;
import X.C143696zK;
import X.C148447Ik;
import X.C148467Im;
import X.C154437dA;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C183538qC;
import X.C1892190l;
import X.C1894191f;
import X.C198012s;
import X.C27981fH;
import X.C33271sj;
import X.C376923q;
import X.C44772Xk;
import X.C48852fa;
import X.C54292oU;
import X.C55302q8;
import X.C56972sr;
import X.C620433g;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import X.C627336j;
import X.C64773Ex;
import X.C69263Wi;
import X.C70203a7;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C89614eR;
import X.C95814uZ;
import X.C991254n;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PhoneContactsSelector extends C89614eR {
    public MenuItem A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public ListView A04;
    public RecyclerView A05;
    public BottomSheetBehavior A06;
    public C116985rC A07;
    public C106175Xx A08;
    public AnonymousClass2CN A09;
    public C48852fa A0A;
    public C620433g A0B;
    public C44772Xk A0C;
    public AnonymousClass5UX A0D;
    public C64773Ex A0E;
    public AnonymousClass5ZU A0F;
    public C105365Uq A0G;
    public C105365Uq A0H;
    public C114015mM A0I;
    public C33271sj A0J;
    public AnonymousClass4OH A0K;
    public C991254n A0L;
    public AnonymousClass1t8 A0M;
    public AnonymousClass5U6 A0N;
    public AnonymousClass5RC A0O;
    public C113895mA A0P;
    public C54292oU A0Q;
    public AnonymousClass5ZR A0R;
    public C620733j A0S;
    public C55302q8 A0T;
    public C95814uZ A0U;
    public C105225Ub A0V;
    public AnonymousClass2ML A0W;
    public AnonymousClass5XO A0X;
    public C183538qC A0Y;
    public C183538qC A0Z;
    public String A0a;
    public ArrayList A0b;
    public boolean A0c;
    public boolean A0d;
    public final AnonymousClass4WK A0e = new AnonymousClass4WK(this);
    public final ArrayList A0f = AnonymousClass001.A0s();
    public final ArrayList A0g = AnonymousClass001.A0s();
    public final List A0h = AnonymousClass001.A0s();

    public void onCreate(Bundle bundle) {
        ListView listView;
        int dimensionPixelSize;
        Resources resources;
        int i;
        super.onCreate(bundle);
        boolean A002 = C154437dA.A00(this.A0D);
        this.A0d = A002;
        int i2 = R.layout.f8nameremoved;
        if (A002) {
            i2 = R.layout.f8nameremoved;
        }
        setContentView(i2);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, A28);
        A2S.A0N(true);
        A2S.A0O(true);
        this.A0G = this.A0I.A06(this, "phone-contacts-selector");
        this.A0V = new C105225Ub(this, AnonymousClass4SG.A2R(this), new AnonymousClass5CM(this, 5), A28, this.A0S);
        setTitle(R.string.f11nameremoved);
        this.A0U = C106405Yw.A00(this);
        ListView listView2 = getListView();
        this.A04 = listView2;
        listView2.setFastScrollAlwaysVisible(true);
        this.A04.setScrollBarStyle(33554432);
        List list = this.A0h;
        list.clear();
        ViewStub viewStub = (ViewStub) C005205m.A00(this, R.id.selected_list_stub);
        viewStub.setLayoutResource(R.layout.f8nameremoved);
        viewStub.inflate();
        this.A05 = (RecyclerView) findViewById(R.id.selected_items);
        this.A05.A0o(new C1231467h(this, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1X(0);
        this.A05.setLayoutManager(linearLayoutManager);
        this.A05.setAdapter(this.A0e);
        this.A05.setItemAnimator(new C198012s());
        this.A04.setOnScrollListener(new C107125ak(this));
        this.A04.setFastScrollEnabled(true);
        this.A04.setScrollbarFadingEnabled(true);
        boolean A003 = C102805Ki.A00(this.A0S);
        ListView listView3 = this.A04;
        if (A003) {
            listView3.setVerticalScrollbarPosition(1);
            listView = this.A04;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            resources = getResources();
            i = R.dimen.f6nameremoved;
        } else {
            listView3.setVerticalScrollbarPosition(2);
            listView = this.A04;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            resources = getResources();
            i = R.dimen.f6nameremoved;
        }
        listView.setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i), 0);
        this.A04.setOnItemClickListener(new C1892190l(this, 1));
        A77(list.size());
        this.A02 = C005205m.A00(this, R.id.selected_list);
        if (list.isEmpty()) {
            this.A02.setVisibility(4);
        }
        C86644Kx.A0k(this, R.id.warning);
        AnonymousClass4OH r0 = new AnonymousClass4OH(this, this, this.A0f);
        this.A0K = r0;
        A74(r0);
        ImageView A0u = C86664Kz.A0u(this, R.id.next_btn);
        this.A03 = A0u;
        C18270x1.A0d(this, A0u, this.A0S, R.drawable.ic_fab_next);
        C18300x5.A13(this, this.A03, R.string.f11nameremoved);
        this.A03.setVisibility(0);
        AnonymousClass54F.A00(this.A03, this, 5);
        ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new C109335eS(this, 37));
        AnonymousClass54F.A00(findViewById(R.id.button_open_permission_settings), this, 6);
        registerForContextMenu(this.A04);
        if (bundle == null && !this.A0C.A00()) {
            RequestPermissionActivity.A0d(this, R.string.f11nameremoved, R.string.f11nameremoved, false);
        }
        if (this.A0C.A00()) {
            C18280x3.A0r(this, R.id.init_contacts_progress, 0);
        }
        if (this.A0d) {
            View A022 = C06560Yg.A02(this.A00, R.id.contact_picker_activity);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A06 = bottomSheetBehavior;
            this.A0X.A02(A022, bottomSheetBehavior, this, this.A0B);
            AnonymousClass5XO.A00(this, A2S);
        }
    }

    public void A75() {
        C991254n r1 = this.A0L;
        if (r1 != null) {
            r1.A0D(true);
            this.A0L = null;
        }
        C991254n r12 = new C991254n(this, this.A0S, this.A0b, this.A0g);
        this.A0L = r12;
        C18270x1.A0w(r12, this.A04);
    }

    public final void A76() {
        this.A02.setVisibility(4);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
        translateAnimation.setDuration(240);
        translateAnimation.setAnimationListener(new C110155fm(this, 0));
        this.A04.startAnimation(translateAnimation);
    }

    public final void A78(C104215Qc r10) {
        boolean z;
        SelectionCheckView selectionCheckView = (SelectionCheckView) this.A04.findViewWithTag(r10);
        if (r10.A03) {
            r10.A03 = false;
            z = false;
        } else if (this.A0h.size() == 257) {
            C69263Wi r5 = this.A05;
            C620733j r4 = this.A0S;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, 257, 0);
            r5.A0P(r4.A0L(objArr, R.plurals.f9nameremoved, 257), 1);
            if (selectionCheckView != null) {
                C86654Ky.A18(selectionCheckView.A0B, selectionCheckView, 4);
                return;
            }
            return;
        } else {
            TextView A092 = AnonymousClass002.A09(AnonymousClass4SG.A2R(this), R.id.search_src_text);
            if (A092 != null) {
                C86634Kw.A1I(A092);
            }
            r10.A03 = true;
            z = true;
        }
        List list = this.A0h;
        if (!z) {
            int indexOf = list.indexOf(r10);
            if (list.remove(r10)) {
                this.A0e.A08(indexOf);
            }
        } else if (list.add(r10)) {
            this.A0e.A07(AnonymousClass002.A04(list, 1));
        }
        if (selectionCheckView != null) {
            selectionCheckView.A06(r10.A03, false);
        }
        if (list.isEmpty()) {
            A76();
        } else if (this.A02.getVisibility() != 0) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            this.A02.setVisibility(0);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) dimensionPixelSize);
            translateAnimation.setDuration(240);
            translateAnimation.setAnimationListener(new C110155fm(this, dimensionPixelSize));
            this.A04.startAnimation(translateAnimation);
        } else if (r10.A03) {
            this.A05.A0Z(AnonymousClass002.A04(list, 1));
        }
        A77(list.size());
        if (r10.A02 == null) {
            C70203a7.A00(this.A04, this, r10, 28);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onBackPressed() {
        this.A0Y.get();
        if (this.A0c) {
            this.A0c = false;
            C626936e.A01();
            ArrayList arrayList = this.A0f;
            arrayList.clear();
            arrayList.addAll(this.A0g);
            this.A0K.notifyDataSetChanged();
            this.A0V.A01(true);
            return;
        }
        super.onBackPressed();
    }

    public void onResume() {
        super.onResume();
        boolean A1a = C86644Kx.A1a(this.A0M);
        C991254n r0 = this.A0L;
        if (r0 != null) {
            r0.A0D(A1a);
            this.A0L = null;
        }
        AnonymousClass1t8 r1 = new AnonymousClass1t8(this, this.A08, this.A0Q, this.A0R);
        this.A0M = r1;
        C18270x1.A0w(r1, this.A04);
        if (this.A0C.A00()) {
            this.A03.setVisibility(0);
        }
        boolean z = C86664Kz.A1G(this.A0Y).A03;
        View view = this.A00;
        if (z) {
            AnonymousClass1VX r15 = this.A0D;
            C69263Wi r13 = this.A05;
            C56972sr r12 = this.A01;
            AnonymousClass4FS r11 = this.A04;
            C114015mM r10 = this.A0I;
            C64773Ex r9 = this.A0E;
            AnonymousClass5ZU r8 = this.A0F;
            C620733j r7 = this.A0S;
            AnonymousClass5RC r6 = this.A0O;
            C113895mA r5 = this.A0P;
            C183538qC r4 = this.A0Y;
            C183538qC r3 = this.A0Z;
            View view2 = this.A01;
            C105365Uq r14 = this.A0H;
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
            Pair A002 = C107465bM.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, this.A09, r7, r15, r11, r4, r3, "phone-contacts-selector-activity");
            this.A01 = (View) A002.first;
            this.A0H = (C105365Uq) A002.second;
        } else if (C106035Xj.A01(view)) {
            C107465bM.A04(this.A00, this.A0P, this.A0Y);
        }
        C106035Xj.A00(this.A0Y);
    }

    public boolean onSearchRequested() {
        this.A0V.A02(this.A0d);
        this.A0c = true;
        return false;
    }

    public static String A0C(C106175Xx r36, C620433g r37, C64773Ex r38, C104215Qc r39, C620633i r40, C54292oU r41, C620733j r42, C55302q8 r43, AnonymousClass2ML r44) {
        Throwable th;
        AnonymousClass3ZH A042;
        String A0Z2;
        String str;
        C626936e.A00();
        C64773Ex r35 = r38;
        C620733j r34 = r42;
        AnonymousClass5Y4 r8 = new AnonymousClass5Y4(r35, r40, r41, r34);
        C104215Qc r2 = r39;
        String str2 = r2.A06;
        C106705a1 r0 = r8.A04;
        C103875Ot r6 = r0.A0A;
        r6.A01 = str2;
        String obj = Long.valueOf(r2.A04).toString();
        String str3 = "data9";
        String[] strArr = {"data2", "data3", "data5", "data4", "data6", "data7", str3};
        C620633i r33 = r8.A01;
        AnonymousClass5UR A022 = C620633i.A02(r33);
        Uri uri = ContactsContract.Data.CONTENT_URI;
        String[] A1a = C18300x5.A1a(obj, 2);
        A1a[1] = "vnd.android.cursor.item/name";
        Cursor A032 = A022.A03(uri, strArr, "contact_id = ? AND mimetype=?", A1a, (String) null);
        if (A032 != null) {
            while (A032.moveToNext()) {
                try {
                    r6.A02 = AnonymousClass0x2.A0Z(A032, "data2");
                    r6.A00 = AnonymousClass0x2.A0Z(A032, "data3");
                    r6.A03 = AnonymousClass0x2.A0Z(A032, "data5");
                    r6.A06 = AnonymousClass0x2.A0Z(A032, "data4");
                    r6.A07 = AnonymousClass0x2.A0Z(A032, "data6");
                    r6.A04 = AnonymousClass0x2.A0Z(A032, "data7");
                    r6.A05 = AnonymousClass0x2.A0Z(A032, str3);
                } catch (Throwable th2) {
                    th = th2;
                    A032.close();
                    throw th;
                }
            }
            A032.close();
        }
        Cursor A033 = C620633i.A02(r33).A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data2", "data1", "data3", "is_primary", "raw_contact_id"}, "contact_id =?", C18300x5.A1a(obj, 1), (String) null);
        try {
            Map A023 = r8.A02(obj);
            if (A033 != null) {
                while (A033.moveToNext()) {
                    r0.A04((UserJid) A023.get(AnonymousClass0x2.A0Z(A033, "raw_contact_id")), AnonymousClass0x2.A0Z(A033, "data1"), AnonymousClass0x2.A0Z(A033, "data3"), AnonymousClass0x2.A04(A033, "data2"), AnonymousClass000.A1U(AnonymousClass0x2.A04(A033, "is_primary"), 1));
                }
                r8.A07(r0);
                A033.close();
            }
            Cursor A034 = C620633i.A02(r33).A03(ContactsContract.CommonDataKinds.Email.CONTENT_URI, (String[]) null, "contact_id = ?", C18300x5.A1a(obj, 1), (String) null);
            if (A034 != null) {
                while (A034.moveToNext()) {
                    try {
                        Class<ContactsContract.CommonDataKinds.Email> cls = ContactsContract.CommonDataKinds.Email.class;
                        int A043 = AnonymousClass0x2.A04(A034, "data2");
                        String A0Z3 = AnonymousClass0x2.A0Z(A034, "data1");
                        String A0Z4 = AnonymousClass0x2.A0Z(A034, "data3");
                        boolean A1U = AnonymousClass000.A1U(AnonymousClass0x2.A04(A034, "is_primary"), 1);
                        List list = r0.A03;
                        if (list == null) {
                            list = AnonymousClass001.A0s();
                            r0.A03 = list;
                        }
                        AnonymousClass5KP r62 = new AnonymousClass5KP();
                        r62.A01 = cls;
                        r62.A00 = A043;
                        r62.A02 = A0Z3;
                        r62.A03 = A0Z4;
                        r62.A05 = A1U;
                        list.add(r62);
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th;
                    }
                }
                A034.close();
            }
            String format = String.format("%s =? AND %s =?", new Object[]{"contact_id", "mimetype"});
            AnonymousClass5UR A024 = C620633i.A02(r33);
            Uri uri2 = ContactsContract.Data.CONTENT_URI;
            Cursor A035 = A024.A03(uri2, new String[]{"data2", "data1"}, format, new String[]{obj, "vnd.android.cursor.item/website"}, (String) null);
            if (A035 != null) {
                while (A035.moveToNext()) {
                    try {
                        int A044 = AnonymousClass0x2.A04(A035, "data2");
                        String A0Z5 = AnonymousClass0x2.A0Z(A035, "data1");
                        if (r0.A07 == null) {
                            r0.A07 = AnonymousClass001.A0s();
                        }
                        C148467Im r10 = new C148467Im();
                        r10.A00 = A044;
                        C626936e.A06(A0Z5);
                        r10.A01 = A0Z5;
                        r0.A07.add(r10);
                    } catch (ParseException e) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Date string '");
                        A0o.append(A0Z2);
                        C18260x0.A15("' not in format of <MMM dd, yyyy>", A0o, e);
                    } catch (Throwable th4) {
                        th = th4;
                        A035.close();
                        throw th;
                    }
                }
                A035.close();
            }
            A035 = C620633i.A02(r33).A03(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, (String[]) null, "contact_id = ?", new String[]{obj}, (String) null);
            if (A035 != null) {
                while (A035.moveToNext()) {
                    if (r0.A03 == null) {
                        r0.A03 = AnonymousClass001.A0s();
                    }
                    AnonymousClass5KP r102 = new AnonymousClass5KP();
                    r102.A01 = ContactsContract.CommonDataKinds.StructuredPostal.class;
                    r102.A00 = AnonymousClass0x2.A04(A035, "data2");
                    r102.A02 = AnonymousClass0x2.A0Z(A035, "data1");
                    r102.A04 = new AnonymousClass5X7();
                    String A0Z6 = AnonymousClass0x2.A0Z(A035, "data4");
                    if (A0Z6 != null) {
                        r102.A04.A03 = A0Z6.replaceAll("(\r\n|\r|\n|\n\r)", " ");
                    }
                    r102.A04.A00 = AnonymousClass0x2.A0Z(A035, "data7");
                    r102.A04.A02 = AnonymousClass0x2.A0Z(A035, "data8");
                    r102.A04.A04 = AnonymousClass0x2.A0Z(A035, "data9");
                    r102.A04.A01 = AnonymousClass0x2.A0Z(A035, "data10");
                    r102.A03 = AnonymousClass0x2.A0Z(A035, "data3");
                    boolean z = true;
                    if (AnonymousClass0x2.A04(A035, "is_primary") != 1) {
                        z = false;
                    }
                    r102.A05 = z;
                    r0.A03.add(r102);
                }
                A035.close();
            }
            A035 = C620633i.A02(r33).A03(uri2, (String[]) null, "contact_id = ? AND mimetype = ?", new String[]{obj, "vnd.android.cursor.item/organization"}, (String) null);
            if (A035 != null) {
                if (A035.moveToFirst()) {
                    String A0Z7 = AnonymousClass0x2.A0Z(A035, "data1");
                    String A0Z8 = AnonymousClass0x2.A0Z(A035, "data5");
                    StringBuilder A0l = AnonymousClass000.A0l(A0Z7);
                    if (A0Z8 == null || A0Z8.length() == 0) {
                        str = "";
                    } else {
                        str = AnonymousClass000.A0V(";", A0Z8, AnonymousClass001.A0o());
                    }
                    String A0X2 = AnonymousClass000.A0X(str, A0l);
                    String A0Z9 = AnonymousClass0x2.A0Z(A035, "data4");
                    A035.getInt(A035.getColumnIndexOrThrow("is_primary"));
                    r0.A05(A0X2, A0Z9);
                }
                A035.close();
            }
            A032 = C620633i.A02(r33).A03(uri2, new String[]{"data15"}, "contact_id = ? AND mimetype = ? ", new String[]{obj, "vnd.android.cursor.item/photo"}, (String) null);
            if (A032 != null) {
                if (A032.moveToFirst()) {
                    r0.A0B = A032.getBlob(A032.getColumnIndexOrThrow("data15"));
                }
                A032.close();
            }
            String[] A1a2 = C18300x5.A1a(obj, 2);
            A1a2[1] = "vnd.android.cursor.item/nickname";
            Uri uri3 = uri2;
            A032 = C620633i.A02(r33).A03(uri3, (String[]) null, "contact_id = ? AND mimetype = ?", A1a2, (String) null);
            if (A032 != null) {
                if (A032.moveToFirst()) {
                    AnonymousClass5T6 r4 = new AnonymousClass5T6();
                    r4.A01 = "NICKNAME";
                    r4.A02 = AnonymousClass0x2.A0Z(A032, "data1");
                    r0.A06(r4);
                }
                A032.close();
            }
            String[] A1a3 = C18300x5.A1a(obj, 3);
            A1a3[1] = "vnd.android.cursor.item/contact_event";
            A1a3[2] = String.valueOf(3);
            A035 = C620633i.A02(r33).A03(uri3, (String[]) null, "contact_id = ? AND mimetype = ? AND data2 =? ", A1a3, (String) null);
            if (A035 != null) {
                if (A035.moveToFirst()) {
                    AnonymousClass5T6 r7 = new AnonymousClass5T6();
                    r7.A01 = "BDAY";
                    A0Z2 = AnonymousClass0x2.A0Z(A035, "data1");
                    if (A0Z2 == null) {
                        A0Z2 = null;
                    } else {
                        A0Z2 = ((DateFormat) C107175ap.A02.A01()).format(((DateFormat) C107175ap.A00.A01()).parse(A0Z2));
                    }
                    r7.A02 = A0Z2;
                    r0.A06(r7);
                }
                A035.close();
            }
            String[] A1a4 = C18300x5.A1a(obj, 2);
            A1a4[1] = "vnd.android.cursor.item/im";
            A032 = C620633i.A02(r33).A03(uri3, (String[]) null, "contact_id = ? AND mimetype = ? ", A1a4, (String) null);
            if (A032 != null) {
                while (A032.moveToNext()) {
                    int A045 = AnonymousClass0x2.A04(A032, "data5");
                    AnonymousClass5T6 r63 = new AnonymousClass5T6();
                    r63.A02 = AnonymousClass0x2.A0Z(A032, "data1");
                    C620733j r9 = r8.A03;
                    String A0C2 = r9.A0C(ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(A045));
                    Iterator A0u = AnonymousClass001.A0u(C106705a1.A0D);
                    while (A0u.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0u);
                        if (AnonymousClass0x9.A12(A0w).equalsIgnoreCase(A0C2)) {
                            r63.A01 = C18310x6.A0q(A0w);
                        }
                    }
                    r63.A04.add(r9.A0C(ContactsContract.CommonDataKinds.Im.getTypeLabelResource(A045)).toUpperCase());
                    r0.A06(r63);
                }
                A032.close();
            }
            r8.A04(r37);
            if (r44.A01.A0X(3790) && (A042 = r35.A04(Long.parseLong(obj))) != null) {
                C95814uZ r22 = A042.A0H;
                if (C627336j.A0L(r22)) {
                    String A002 = r43.A00((AnonymousClass1fU) r22);
                    C27981fH r23 = (C27981fH) A042.A0H;
                    if (r23 != null) {
                        C148447Ik r1 = r0.A09;
                        r1.A00 = r23;
                        r1.A01 = A002;
                    }
                }
            }
            try {
                return new C105755Wg(r36, r34).A01(r0);
            } catch (C143696zK e2) {
                Log.e("Could not create VCard", new C376923q(e2));
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            if (A033 != null) {
                A033.close();
                throw th;
            }
            throw th;
        }
    }

    public final void A77(int i) {
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        Object[] A0L2 = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L2, i);
        supportActionBar.A0I(this.A0S.A0L(A0L2, R.plurals.f9nameremoved, (long) i));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem A0L2 = C86634Kw.A0L(menu);
        this.A00 = A0L2;
        if (this.A0d) {
            A0L2.setIcon(R.drawable.ic_search_normal);
            this.A00.getIcon().setTint(AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
        }
        this.A00.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new C1894191f(this, 2));
        this.A00.setVisible(AnonymousClass0x7.A1S(this.A0g));
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C991254n r0 = this.A0L;
        if (r0 != null) {
            r0.A0D(true);
            this.A0L = null;
        }
        AnonymousClass1t8 r02 = this.A0M;
        if (r02 != null) {
            r02.A0D(true);
            this.A0M = null;
        }
        this.A0g.clear();
        this.A0f.clear();
        this.A0G.A00();
        C107465bM.A02(this.A01, this.A0P);
        C105365Uq r03 = this.A0H;
        if (r03 != null) {
            r03.A00();
            this.A0H = null;
        }
        this.A0N.A02(9);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        C107465bM.A07(this.A0P);
        AnonymousClass4SG.A3g(this, this.A0Y);
    }

    public void onStart() {
        super.onStart();
        if (this.A0d) {
            this.A0X.A03(this.A06, this);
        }
    }
}
