package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Q1;
import X.AnonymousClass0QU;
import X.AnonymousClass0x9;
import X.AnonymousClass29a;
import X.AnonymousClass319;
import X.AnonymousClass35X;
import X.AnonymousClass3ZH;
import X.AnonymousClass3ZS;
import X.AnonymousClass4EC;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass4UC;
import X.AnonymousClass4X8;
import X.AnonymousClass5RU;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass68W;
import X.C04870Qz;
import X.C102365Io;
import X.C103725Oe;
import X.C104675Rx;
import X.C105225Ub;
import X.C105365Uq;
import X.C106405Yw;
import X.C107695bk;
import X.C114015mM;
import X.C117635sF;
import X.C18280x3;
import X.C33141sV;
import X.C34441vA;
import X.C55832qz;
import X.C56982ss;
import X.C60302yK;
import X.C613830m;
import X.C626936e;
import X.C64333Db;
import X.C64773Ex;
import X.C66543Lv;
import X.C69263Wi;
import X.C70363aN;
import X.C71573cK;
import X.C72173dI;
import X.C72303dV;
import X.C86604Kt;
import X.C86614Ku;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class StorageUsageActivity extends C89644eZ {
    public static final long A0W = C86654Ky.A09(TimeUnit.MINUTES);
    public int A00;
    public RecyclerView A01;
    public C71573cK A02;
    public AnonymousClass64J A03;
    public C64773Ex A04;
    public AnonymousClass5ZU A05;
    public C105365Uq A06;
    public C114015mM A07;
    public C56982ss A08;
    public C66543Lv A09;
    public C613830m A0A;
    public AnonymousClass319 A0B;
    public C72303dV A0C;
    public C60302yK A0D;
    public AnonymousClass4FV A0E;
    public C105225Ub A0F;
    public AnonymousClass5RU A0G;
    public AnonymousClass4X8 A0H;
    public C104675Rx A0I;
    public C103725Oe A0J;
    public C55832qz A0K;
    public C33141sV A0L;
    public C72173dI A0M;
    public C34441vA A0N;
    public String A0O;
    public String A0P;
    public ArrayList A0Q;
    public List A0R;
    public boolean A0S;
    public final AnonymousClass4EC A0T;
    public final AnonymousClass4UC A0U;
    public final Set A0V;

    public static /* synthetic */ void A0C(StorageUsageActivity storageUsageActivity, List list, List list2, boolean z) {
        C105225Ub r0;
        synchronized (storageUsageActivity) {
            char c = 2;
            if (storageUsageActivity.A0P != null && list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c = 1;
                        break;
                    }
                    C95814uZ A012 = ((AnonymousClass3ZS) list.get(((Integer) it.next()).intValue())).A01();
                    C64773Ex r02 = storageUsageActivity.A04;
                    C626936e.A06(A012);
                    AnonymousClass3ZH A072 = r02.A07(A012);
                    if (A072 != null && AnonymousClass5ZU.A04(storageUsageActivity.A05, A072, storageUsageActivity.A0R)) {
                        break;
                    }
                }
            } else if (!z) {
                c = 0;
            }
            if (list2 == null || ((r0 = storageUsageActivity.A0F) != null && C86604Kt.A1Y(r0.A04) && c == 2)) {
                if (list == null) {
                    list = AnonymousClass001.A0s();
                } else if (!TextUtils.isEmpty(storageUsageActivity.A0P)) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (int i = 0; i < list.size(); i++) {
                        C95814uZ A013 = ((AnonymousClass3ZS) list.get(i)).A01();
                        C64773Ex r03 = storageUsageActivity.A04;
                        C626936e.A06(A013);
                        AnonymousClass3ZH A073 = r03.A07(A013);
                        if (A073 != null && storageUsageActivity.A05.A0f(A073, storageUsageActivity.A0R, true)) {
                            A0s.add(list.get(i));
                        }
                    }
                    list = A0s;
                }
            }
            if (c != 1) {
                storageUsageActivity.A05.A0S(new C70363aN(storageUsageActivity, list, list2, 17));
            }
        }
    }

    public class WrappedLinearLayoutManager extends LinearLayoutManager {
        public WrappedLinearLayoutManager() {
            super(1);
        }

        public void A0v(C04870Qz r3, AnonymousClass0Q1 r4) {
            try {
                super.A0v(r3, r4);
            } catch (IndexOutOfBoundsException e) {
                Log.e("WrappedLinearLayoutManager", e);
            }
        }
    }

    public void A5r() {
        if (!this.A0S) {
            this.A0S = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r1 = A2W.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r3 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r3, this, AnonymousClass4SG.A2t(r1, r3, this));
            this.A08 = C64333Db.A39(r1);
            this.A0E = C64333Db.A4H(r1);
            this.A07 = C64333Db.A29(r1);
            this.A0N = (C34441vA) r1.AIb.get();
            this.A04 = C64333Db.A26(r1);
            this.A05 = C64333Db.A28(r1);
            this.A09 = C86614Ku.A0Z(r1);
            this.A0K = C64333Db.A8F(r1);
            this.A0B = (AnonymousClass319) r1.AJv.get();
            this.A0L = C86654Ky.A0e(r1);
            this.A0C = C86614Ku.A0a(r1);
            this.A0D = (C60302yK) r3.ABS.get();
            this.A0A = (C613830m) r1.AJa.get();
            this.A0G = A2W.AD7();
            this.A03 = C86614Ku.A0N(r1);
        }
    }

    public final void A74() {
        Log.i("storage-usage-activity/fetch media size");
        A78(new C71573cK(this, 26, new C102365Io(AnonymousClass35X.A00(this.A04, this.A0I), this.A07.A02(), this.A07.A04())));
    }

    public final void A75() {
        if (this.A0J != null) {
            Log.i("storage-usage-activity/fetch forwarded files");
            A78(new C71573cK(this, 25, this.A0J.A00(new AnonymousClass0QU(), this.A00, 1)));
        }
        if (this.A0J != null) {
            Log.i("storage-usage-activity/fetch large files");
            A78(new C71573cK(this, 28, this.A0J.A00(new AnonymousClass0QU(), this.A00, 2)));
        }
    }

    public final void A76(int i) {
        C86654Ky.A1R(this.A0V, i);
        AnonymousClass4X8 r0 = this.A0H;
        C69263Wi r3 = r0.A0E;
        Runnable runnable = r0.A0N;
        r3.A0R(runnable);
        r3.A0T(runnable, 1000);
    }

    public final void A77(int i) {
        Set set = this.A0V;
        set.remove(Integer.valueOf(i));
        AnonymousClass4X8 r4 = this.A0H;
        boolean A1S = AnonymousClass000.A1S(set.size());
        C69263Wi r3 = r4.A0E;
        Runnable runnable = r4.A0N;
        r3.A0R(runnable);
        if (A1S) {
            r3.A0T(runnable, 1000);
        } else {
            r4.A0O(2, false);
        }
    }

    public final void A78(Runnable runnable) {
        this.A05.A0S(new C71573cK(this, 27, runnable));
    }

    public void onBackPressed() {
        C105225Ub r0 = this.A0F;
        if (r0 == null || !C86604Kt.A1Y(r0.A04)) {
            super.onBackPressed();
            return;
        }
        this.A0P = null;
        this.A0R = null;
        this.A0F.A01(true);
        AnonymousClass4X8 r4 = this.A0H;
        r4.A09 = false;
        int A0L2 = r4.A0L();
        r4.A0O(1, true);
        r4.A0N();
        r4.A0O(4, true);
        r4.A0O(8, true);
        r4.A09(r4.A0G() - A0L2, A0L2);
        this.A01.A0Z(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x017e, code lost:
        if (r3.getBoolean("LIST_IS_NOT_FULL", false) != false) goto L_0x0180;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r30) {
        /*
            r29 = this;
            r2 = r29
            r3 = r30
            super.onCreate(r3)
            java.lang.String r0 = "storage-usage-activity/create"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r4 = r2.A04
            r1 = 0
            X.3dI r0 = new X.3dI
            r0.<init>(r4, r1)
            r2.A0M = r0
            X.2sH r5 = r2.A06
            X.1vA r4 = r2.A0N
            X.5Rx r0 = new X.5Rx
            r0.<init>(r5, r4)
            r2.A0I = r0
            r0 = 2131890583(0x7f121197, float:1.9415862E38)
            r2.setTitle(r0)
            r0 = 2131624067(0x7f0e0083, float:1.8875303E38)
            r2.setContentView((int) r0)
            androidx.appcompat.widget.Toolbar r6 = X.AnonymousClass1Hf.A28(r2)
            r2.setSupportActionBar(r6)
            r0 = 0
            r2.A0P = r0
            r2.A0R = r0
            X.33j r5 = r2.A00
            android.view.View r9 = X.AnonymousClass4SG.A2R(r2)
            r0 = 12
            X.5CM r4 = new X.5CM
            r4.<init>(r2, r0)
            X.5Ub r0 = new X.5Ub
            r7 = r0
            r8 = r2
            r10 = r4
            r11 = r6
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r2.A0F = r0
            X.AnonymousClass1Ha.A1z(r2)
            X.4UC r12 = r2.A0U
            r0 = 351(0x15f, float:4.92E-43)
            X.AnonymousClass6C6.A01(r2, r12, r0)
            X.5mM r4 = r2.A07
            java.lang.String r0 = "storage-usage-activity"
            X.5Uq r0 = r4.A06(r2, r0)
            r2.A06 = r0
            android.content.Intent r4 = r2.getIntent()
            java.lang.String r0 = "session_id"
            java.lang.String r26 = X.C86664Kz.A1J(r4, r0)
            android.content.Intent r4 = r2.getIntent()
            java.lang.String r0 = "entry_point"
            int r28 = X.C86664Kz.A07(r4, r0)
            r0 = 2131429115(0x7f0b06fb, float:1.8479894E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r2.A01 = r0
            com.whatsapp.storage.StorageUsageActivity$WrappedLinearLayoutManager r11 = new com.whatsapp.storage.StorageUsageActivity$WrappedLinearLayoutManager
            r11.<init>()
            android.content.Intent r4 = r2.getIntent()
            java.lang.String r0 = "search_result_key"
            java.lang.String r10 = r4.getStringExtra(r0)
            r2.A0O = r10
            X.3Wi r0 = r2.A05
            r17 = r0
            X.2qk r15 = r2.A03
            X.4FV r14 = r2.A0E
            X.3Mh r9 = r2.A06
            X.3Ex r8 = r2.A04
            X.5ZU r7 = r2.A05
            X.33j r6 = r2.A00
            X.64J r5 = r2.A03
            X.5Uq r4 = r2.A06
            r13 = 19
            X.5f0 r0 = new X.5f0
            r0.<init>((java.lang.Object) r2, (int) r13)
            X.4X8 r13 = new X.4X8
            r27 = r10
            r24 = r14
            r25 = r12
            r22 = r4
            r23 = r6
            r20 = r8
            r21 = r7
            r18 = r9
            r19 = r5
            r16 = r15
            r14 = r0
            r15 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2.A0H = r13
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            r0.setLayoutManager(r11)
            androidx.recyclerview.widget.RecyclerView r5 = r2.A01
            X.0UY r4 = r5.A0R
            boolean r0 = r4 instanceof X.AnonymousClass09N
            if (r0 == 0) goto L_0x00df
            X.09N r4 = (X.AnonymousClass09N) r4
            r4.A00 = r1
        L_0x00df:
            X.4X8 r0 = r2.A0H
            r5.setAdapter(r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r2)
            int r4 = r0.widthPixels
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r2)
            int r0 = r0.heightPixels
            int r5 = java.lang.Math.max(r4, r0)
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131168386(0x7f070c82, float:1.7951072E38)
            int r4 = r4.getDimensionPixelSize(r0)
            int r0 = r4 / 2
            int r5 = r5 + r0
            int r5 = r5 / r4
            r4 = 1
            int r0 = java.lang.Math.max(r4, r5)
            r2.A00 = r0
            X.2ss r6 = r2.A08
            X.2qz r11 = r2.A0K
            X.319 r8 = r2.A0B
            X.1sV r12 = r2.A0L
            X.3dV r9 = r2.A0C
            X.30m r7 = r2.A0A
            X.5Rx r10 = r2.A0I
            X.5Oe r5 = new X.5Oe
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.A0J = r5
            r0 = 31
            X.5sF r6 = new X.5sF
            r6.<init>(r2, r0)
            X.3dI r0 = r2.A0M
            if (r0 == 0) goto L_0x01d3
            X.1VX r5 = r2.A0D
            r0 = 6648(0x19f8, float:9.316E-42)
            boolean r0 = r5.A0X(r0)
            if (r0 == 0) goto L_0x01d3
            X.3dI r0 = r2.A0M
            r0.execute(r6)
        L_0x0139:
            r2.A76(r1)
            r0 = 2
            r2.A76(r0)
            r2.A76(r4)
            if (r30 == 0) goto L_0x0180
            java.lang.String r8 = "LIST_OF_CONTACTS"
            java.util.ArrayList r0 = r3.getParcelableArrayList(r8)
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = "SAVED_AT_TIMESTAMP"
            long r4 = r3.getLong(r0)
            long r6 = X.AnonymousClass0x9.A05(r4)
            long r4 = A0W
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0180
            java.util.ArrayList r6 = r3.getParcelableArrayList(r8)
            X.C626936e.A06(r6)
            r2.A0Q = r6
            X.4X8 r5 = r2.A0H
            java.lang.String r4 = r2.A0P
            java.util.List r0 = r2.A0R
            r5.A06 = r6
            r5.A05 = r4
            r5.A07 = r0
            r0 = 1
            r5.A08 = r0
            r5.A05()
            java.lang.String r0 = "LIST_IS_NOT_FULL"
            boolean r0 = r3.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x019c
        L_0x0180:
            X.3cK r0 = r2.A02
            if (r0 == 0) goto L_0x018c
            java.lang.Object r1 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r0 = 1
            r1.set(r0)
        L_0x018c:
            X.3cK r1 = new X.3cK
            r1.<init>(r2)
            r2.A02 = r1
            X.4FS r0 = r2.A04
            r0.BkM(r1)
            r0 = 3
            r2.A76(r0)
        L_0x019c:
            X.2yK r0 = r2.A0D
            X.4EC r1 = r2.A0T
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A0A
            r0.add(r1)
            X.2sH r6 = r2.A06
            X.4FS r5 = r2.A04
            X.3Dh r4 = r2.A04
            X.4FV r3 = r2.A0E
            X.1vA r1 = r2.A0N
            r14 = 2
            X.3cB r0 = new X.3cB
            r7 = r0
            r8 = r4
            r9 = r6
            r10 = r1
            r11 = r3
            r12 = r26
            r13 = r28
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r5.BkM(r0)
            X.5RU r4 = r2.A0G
            android.view.View r3 = r2.A00
            java.lang.String r1 = "manage_storage"
            java.lang.String r0 = r2.A0O
            boolean r0 = r4.A02(r3, r1, r0)
            if (r0 == 0) goto L_0x01d2
            r0 = 0
            r2.A0O = r0
        L_0x01d2:
            return
        L_0x01d3:
            X.4FS r0 = r2.A04
            r0.BkM(r6)
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.storage.StorageUsageActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onSearchRequested() {
        C105225Ub r1 = this.A0F;
        if (r1 == null) {
            return false;
        }
        r1.A02(false);
        AnonymousClass4X8 r6 = this.A0H;
        r6.A09 = true;
        int A0L2 = r6.A0L();
        r6.A0O(1, false);
        r6.A0O(3, false);
        r6.A0O(4, false);
        r6.A0O(8, false);
        r6.A09(r6.A0G() - 1, A0L2 + 1);
        C18280x3.A0o(this.A0F.A04.findViewById(R.id.search_back), this, 18);
        return false;
    }

    public StorageUsageActivity(int i) {
        this.A0S = false;
        AnonymousClass68W.A00(this, 109);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && intent != null && i2 == 1) {
            C95814uZ A012 = C106405Yw.A01(intent, "jid");
            int A072 = C86664Kz.A07(intent, "gallery_type");
            long longExtra = intent.getLongExtra("memory_size", -1);
            long longExtra2 = intent.getLongExtra("deleted_size", -1);
            if (longExtra >= 0) {
                if (longExtra2 > 0) {
                    C117635sF r4 = new C117635sF(this, 32);
                    if (this.A0M == null || !this.A0D.A0X(6648)) {
                        this.A04.BkM(r4);
                    } else {
                        this.A0M.execute(r4);
                    }
                }
                if (A072 == 0 && A012 != null) {
                    AnonymousClass4X8 r5 = this.A0H;
                    for (AnonymousClass3ZS r3 : r5.A06) {
                        if (r3.A01().equals(A012)) {
                            r3.A00.A0I = longExtra;
                            Collections.sort(r5.A06);
                            r5.A05();
                            return;
                        }
                    }
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C72173dI r1 = this.A0M;
        if (r1 != null) {
            r1.A02();
            this.A0M = null;
        }
        this.A01 = null;
        this.A06.A00();
        C60302yK r0 = this.A0D;
        r0.A0A.remove(this.A0T);
        this.A0V.clear();
        C71573cK r02 = this.A02;
        if (r02 != null) {
            ((AtomicBoolean) r02.A00).set(true);
        }
        AnonymousClass4X8 r2 = this.A0H;
        r2.A0E.A0R(r2.A0N);
        r2.A0O(2, false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        onSearchRequested();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.A0Q.isEmpty()) {
            bundle.putLong("SAVED_AT_TIMESTAMP", System.currentTimeMillis());
            ArrayList arrayList = this.A0Q;
            if (arrayList.size() > 200) {
                bundle.putParcelableArrayList("LIST_OF_CONTACTS", AnonymousClass002.A0J(arrayList.subList(0, 200)));
                bundle.putBoolean("LIST_IS_NOT_FULL", true);
                return;
            }
            bundle.putParcelableArrayList("LIST_OF_CONTACTS", arrayList);
        }
    }

    public StorageUsageActivity() {
        this(0);
        this.A0U = AnonymousClass0x9.A0b();
        this.A0V = AnonymousClass002.A0K();
        this.A0Q = AnonymousClass001.A0s();
        this.A0O = null;
        this.A0T = new AnonymousClass29a(this, 0);
    }
}
