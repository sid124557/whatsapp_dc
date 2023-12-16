package com.whatsapp.group.newgroup;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass0O1;
import X.AnonymousClass0PJ;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass11V;
import X.AnonymousClass125;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1RS;
import X.AnonymousClass1VX;
import X.AnonymousClass1YM;
import X.AnonymousClass2U1;
import X.AnonymousClass31C;
import X.AnonymousClass34R;
import X.AnonymousClass352;
import X.AnonymousClass3CX;
import X.AnonymousClass3DZ;
import X.AnonymousClass3LQ;
import X.AnonymousClass3TR;
import X.AnonymousClass3ZH;
import X.AnonymousClass487;
import X.AnonymousClass4A6;
import X.AnonymousClass4A7;
import X.AnonymousClass4CE;
import X.AnonymousClass4FI;
import X.AnonymousClass4FV;
import X.AnonymousClass4GP;
import X.AnonymousClass4GQ;
import X.AnonymousClass4HY;
import X.AnonymousClass4IC;
import X.AnonymousClass4KP;
import X.AnonymousClass52T;
import X.AnonymousClass5IY;
import X.AnonymousClass5V0;
import X.AnonymousClass5VB;
import X.AnonymousClass5Y0;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.C003403v;
import X.C005205m;
import X.C06560Yg;
import X.C105365Uq;
import X.C105895Wv;
import X.C106715a2;
import X.C107555bV;
import X.C107695bk;
import X.C109095e4;
import X.C114015mM;
import X.C15930sC;
import X.C162457s7;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C196411z;
import X.C198012s;
import X.C27601eB;
import X.C27821ej;
import X.C27991fJ;
import X.C28001fK;
import X.C28891hw;
import X.C30191m3;
import X.C47492dL;
import X.C50942j1;
import X.C51722kH;
import X.C52942mI;
import X.C55052pi;
import X.C56112rR;
import X.C56332ro;
import X.C56612sH;
import X.C56832sd;
import X.C56942so;
import X.C56952sp;
import X.C56982ss;
import X.C58422vE;
import X.C60152y5;
import X.C613330g;
import X.C620633i;
import X.C620733j;
import X.C627336j;
import X.C64333Db;
import X.C64773Ex;
import X.C66433Lk;
import X.C66493Lq;
import X.C66543Lv;
import X.C66663Mh;
import X.C70003Zm;
import X.C86364Jv;
import X.C86374Jw;
import X.C89224c7;
import X.C89364cO;
import X.C89644eZ;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.collections.AutoFitGridLayoutManager;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class NewGroup extends C89644eZ implements AnonymousClass4A7, AnonymousClass4A6 {
    public int A00;
    public int A01;
    public Bundle A02;
    public Bundle A03;
    public Bundle A04;
    public ImageView A05;
    public TextView A06;
    public AnonymousClass0PJ A07;
    public RecyclerView A08;
    public KeyboardPopupLayout A09;
    public WaEditText A0A;
    public WaEditText A0B;
    public C56942so A0C;
    public C64773Ex A0D;
    public AnonymousClass5ZU A0E;
    public C56332ro A0F;
    public C55052pi A0G;
    public C105365Uq A0H;
    public C114015mM A0I;
    public C613330g A0J;
    public C56982ss A0K;
    public C28891hw A0L;
    public C66543Lv A0M;
    public C56112rR A0N;
    public C89224c7 A0O;
    public AnonymousClass5IY A0P;
    public C27821ej A0Q;
    public EmojiSearchProvider A0R;
    public AnonymousClass4FV A0S;
    public C66493Lq A0T;
    public C196411z A0U;
    public C27991fJ A0V;
    public AnonymousClass31C A0W;
    public AnonymousClass3LQ A0X;
    public C60152y5 A0Y;
    public C30191m3 A0Z;
    public C56832sd A0a;
    public C66433Lk A0b;
    public C106715a2 A0c;
    public Integer A0d;
    public List A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public final AnonymousClass0O1 A0m;
    public final AnonymousClass4CE A0n;
    public final AnonymousClass4FI A0o;
    public final AnonymousClass3ZH A0p;
    public final AtomicReference A0q;
    public final AnonymousClass4GP A0r;
    public final AnonymousClass4GQ A0s;

    public final void A75() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A05.setImageBitmap(this.A0J.A03(this, this.A0p, 0.0f, dimensionPixelSize, false));
    }

    public static /* synthetic */ void A0C(NewGroup newGroup, C28001fK r14, String str, List list) {
        int i = newGroup.A00;
        C27991fJ r2 = newGroup.A0V;
        Log.i("newgroup/invokeCreateGroupApi");
        newGroup.A0T.A1G.add(r14);
        C47492dL r3 = new C47492dL(r14);
        r3.A03 = str;
        r3.A04 = list;
        r3.A00 = i;
        r3.A01 = r2;
        if (r2 == null) {
            r3.A05 = newGroup.A04.getBoolean("add_other_participants");
            r3.A09 = newGroup.A04.getBoolean("require_membership_approval");
            r3.A06 = newGroup.A04.getBoolean("edit_group_info", true);
            r3.A07 = newGroup.A04.getBoolean("send_messages", true);
        }
        AnonymousClass2U1 A002 = r3.A00();
        C27601eB r7 = new C27601eB(newGroup.A06, newGroup.A0L, newGroup.A0M, newGroup.A0T, A002, newGroup, newGroup.A0a);
        C56612sH r4 = newGroup.A06;
        AnonymousClass1VX r5 = newGroup.A0D;
        new AnonymousClass3TR(newGroup.A03, newGroup.A01, r4, r5, newGroup.A0T, r7, r7.A04, newGroup.A0W).A00();
        AnonymousClass1YM r32 = new AnonymousClass1YM();
        r32.A01 = newGroup.A0d;
        r32.A02 = AnonymousClass0x9.A0m(i);
        AnonymousClass1VX r22 = newGroup.A0D;
        C162457s7.A0J(r22, 0);
        boolean z = false;
        if (str == null || str.length() == 0) {
            z = C56952sp.A0K(r22, 3011, false);
        }
        r32.A00 = C18320x8.A0V(z);
        newGroup.A0S.BhB(r32);
    }

    public void A5r() {
        if (!this.A0i) {
            this.A0i = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r2 = A002.A00;
            AnonymousClass1Ha.A23(A002, r2, r2, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A0c = C18280x3.A0Q(r2);
            this.A0K = C64333Db.A39(A002);
            this.A0S = C64333Db.A4H(A002);
            this.A0Q = (C27821ej) A002.ATV.get();
            this.A0I = C64333Db.A29(A002);
            this.A0W = C64333Db.A5u(A002);
            this.A0D = C64333Db.A26(A002);
            this.A0b = C64333Db.A8X(A002);
            this.A0E = C64333Db.A28(A002);
            this.A0M = C64333Db.A3D(A002);
            this.A0T = C64333Db.A5A(A002);
            this.A0X = A002.Aog();
            this.A0F = (C56332ro) A002.A6Q.get();
            this.A0G = (C55052pi) A002.A6R.get();
            this.A0R = (EmojiSearchProvider) r2.A40.get();
            this.A0P = (AnonymousClass5IY) r2.A41.get();
            this.A0Z = (C30191m3) A002.ARj.get();
            this.A0C = C64333Db.A1k(A002);
            this.A0a = (C56832sd) A002.AY6.get();
            this.A0L = C64333Db.A3C(A002);
            this.A0Y = C64333Db.A74(A002);
            this.A0J = (C613330g) A002.A6S.get();
            this.A0N = (C56112rR) A002.A8O.get();
        }
    }

    public final File A74() {
        File A002 = this.A0F.A00(this.A0p);
        if (A002 == null || !A002.exists()) {
            return null;
        }
        return A002;
    }

    public final void A76() {
        C196411z r6 = this.A0U;
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (this.A0l) {
            A0s2.add(new C51722kH(1, new C50942j1(this.A0r)));
        }
        Iterator it = this.A0e.iterator();
        while (it.hasNext()) {
            A0s2.add(new C51722kH(2, new C52942mI(this.A0H, C18310x6.A0R(it), this.A0s, this.A0l)));
        }
        ArrayList A0o2 = C18320x8.A0o(A0s2);
        List list = r6.A00;
        C18280x3.A0s(new AnonymousClass11V(list, A0o2), r6, A0o2, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A77() {
        /*
            r6 = this;
            java.util.List r0 = r6.A0e
            int r5 = r0.size()
            if (r5 != 0) goto L_0x0023
            X.1VX r2 = r6.A0D
            r1 = 3966(0xf7e, float:5.558E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            android.widget.TextView r1 = r6.A06
            if (r0 == 0) goto L_0x001d
            r0 = 2131890962(0x7f121312, float:1.941663E38)
            r1.setText(r0)
            return
        L_0x001d:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0023:
            java.util.concurrent.atomic.AtomicReference r1 = r6.A0q
            java.lang.Object r0 = r1.get()
            r4 = 0
            if (r0 == 0) goto L_0x0067
            X.3Lq r2 = r6.A0T
            java.lang.Object r1 = r1.get()
            X.1fJ r1 = (X.C27991fJ) r1
            X.3Ex r0 = r2.A0F
            X.3ZH r0 = r0.A09(r1)
            if (r0 == 0) goto L_0x0067
            X.2sj r0 = r2.A0b
            int r0 = r0.A02(r1)
            int r3 = r0 + -1
        L_0x0044:
            r2 = 1
            if (r3 <= 0) goto L_0x005e
            r1 = 2131890961(0x7f121311, float:1.9416629E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A1P(r0, r5, r4)
            X.AnonymousClass000.A1P(r0, r3, r2)
        L_0x0054:
            java.lang.String r1 = r6.getString(r1, r0)
            android.widget.TextView r0 = r6.A06
            r0.setText(r1)
            return
        L_0x005e:
            r1 = 2131890960(0x7f121310, float:1.9416627E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.AnonymousClass000.A1P(r0, r5, r4)
            goto L_0x0054
        L_0x0067:
            r3 = 0
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.A77():void");
    }

    public final void A78(int i) {
        this.A00 = i;
        C89364cO r2 = (C89364cO) C005205m.A00(this, R.id.group_ephemeral_duration_row_view);
        int i2 = R.color.f5nameremoved;
        if (i > 0) {
            i2 = AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        }
        r2.setIconColor(AnonymousClass0Y8.A04(this, i2));
        r2.setDescription((CharSequence) AnonymousClass352.A01(this, i, false, false));
    }

    public final void A79(WaEditText waEditText, int i, int i2, int i3) {
        C107555bV.A09(waEditText, this.A00);
        waEditText.setFilters(new InputFilter[]{new C109095e4(i2)});
        AnonymousClass5Y0 r7 = this.A0C;
        C620633i r4 = this.A08;
        C620733j r5 = this.A00;
        C60152y5 r8 = this.A0Y;
        AnonymousClass487 r6 = this.A0B;
        waEditText.addTextChangedListener(new AnonymousClass52T(waEditText, C005205m.A01(this, i), r4, r5, r6, r7, r8, i2, i3, false));
    }

    public final boolean A7C() {
        int size = this.A0e.size();
        if (this.A0j || this.A0g || this.A0h || !this.A0k || size <= 0 || size > this.A0D.A0O(C58422vE.A02, 4118)) {
            return false;
        }
        return true;
    }

    public void BXH() {
        if (AnonymousClass001.A1U(this.A06.A02.compareTo(AnonymousClass0GC.CREATED))) {
            ChangeEphemeralSettingsDialog.A00(getSupportFragmentManager(), this.A00, 1);
        }
    }

    public void onBackPressed() {
        C89224c7 r0 = this.A0O;
        if (r0 == null || !r0.isShowing()) {
            super.onBackPressed();
        } else {
            this.A0O.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01ba, code lost:
        if (r2.A0V != null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r1 != false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r2 = r33
            r9 = r34
            super.onCreate(r9)
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "messages_to_forward_bundle"
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            r2.A02 = r0
            r3 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0023
            boolean r1 = r0.isEmpty()
            r16 = 1
            r0 = 2131889440(0x7f120d20, float:1.9413544E38)
            if (r1 == 0) goto L_0x0028
        L_0x0023:
            r16 = 0
            r0 = 2131890952(0x7f121308, float:1.941661E38)
        L_0x0028:
            X.0R8 r6 = X.AnonymousClass1Ha.A1l(r2, r0)
            X.C626936e.A06(r6)
            r6.A0N(r3)
            r6.A0O(r3)
            X.1VX r1 = r2.A0D
            r0 = 3011(0xbc3, float:4.22E-42)
            X.2vE r5 = X.C58422vE.A02
            boolean r0 = r1.A0Y(r5, r0)
            r2.A0k = r0
            r0 = 2131625512(0x7f0e0628, float:1.8878234E38)
            r2.setContentView((int) r0)
            X.5mM r1 = r2.A0I
            java.lang.String r0 = "new-group-activity"
            X.5Uq r0 = r1.A06(r2, r0)
            r2.A0H = r0
            r0 = 2131428685(0x7f0b054d, float:1.8479021E38)
            android.view.View r1 = r2.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2.A05 = r1
            r0 = 9
            X.C635439q.A00(r1, r2, r0)
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "optional_participants"
            boolean r0 = r1.getBooleanExtra(r0, r8)
            r2.A0l = r0
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "create_group_for_community"
            boolean r0 = r1.getBooleanExtra(r0, r8)
            r2.A0f = r0
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "create_group_for_xfamily"
            boolean r0 = r1.getBooleanExtra(r0, r8)
            r2.A0g = r0
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "prefill_group_name"
            java.lang.String r4 = r1.getStringExtra(r0)
            if (r34 != 0) goto L_0x03d2
            r2.A01 = r8
            X.2ro r0 = r2.A0F
            X.3ZH r1 = r2.A0p
            java.io.File r0 = r0.A00(r1)
            X.C626936e.A06(r0)
            r0.delete()
            X.2ro r0 = r2.A0F
            java.io.File r0 = r0.A01(r1)
            X.C626936e.A06(r0)
            r0.delete()
            android.content.Intent r9 = r2.getIntent()
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r3 = r9.getStringExtra(r0)
            java.lang.String r0 = "selected"
            java.util.ArrayList r1 = r9.getStringArrayListExtra(r0)
            java.lang.String r0 = "duplicate_ug_exists"
            r7 = 0
            boolean r0 = r9.getBooleanExtra(r0, r8)
            r2.A7B(r3, r1, r0)
        L_0x00cc:
            android.os.Bundle r0 = r2.A04
            if (r0 != 0) goto L_0x00ed
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.String r0 = "add_other_participants"
            r1 = 1
            r3.putBoolean(r0, r1)
            java.lang.String r0 = "send_messages"
            r3.putBoolean(r0, r1)
            java.lang.String r0 = "edit_group_info"
            r3.putBoolean(r0, r1)
            java.lang.String r0 = "require_membership_approval"
            r3.putBoolean(r0, r8)
            r2.A04 = r3
        L_0x00ed:
            r0 = 2131431144(0x7f0b0ee8, float:1.8484009E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.KeyboardPopupLayout r0 = (com.whatsapp.KeyboardPopupLayout) r0
            r2.A09 = r0
            r0 = 2131429681(0x7f0b0931, float:1.8481042E38)
            android.view.View r11 = r2.findViewById(r0)
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            r0 = 2131430471(0x7f0b0c47, float:1.8482644E38)
            android.view.View r10 = r2.findViewById(r0)
            com.whatsapp.WaEditText r10 = (com.whatsapp.WaEditText) r10
            r2.A0B = r10
            X.1VX r0 = r2.A0D
            r19 = r0
            X.5Wv r0 = r2.A0B
            r18 = r0
            X.2qk r0 = r2.A03
            r20 = r0
            X.5Y0 r0 = r2.A0C
            r17 = r0
            X.1ej r15 = r2.A0Q
            X.33i r14 = r2.A08
            X.33j r13 = r2.A00
            X.5IY r12 = r2.A0P
            com.whatsapp.emoji.search.EmojiSearchProvider r9 = r2.A0R
            X.33p r8 = r2.A09
            X.2y5 r3 = r2.A0Y
            com.whatsapp.KeyboardPopupLayout r0 = r2.A09
            X.4c7 r1 = new X.4c7
            r23 = r14
            r24 = r8
            r25 = r13
            r26 = r12
            r27 = r15
            r28 = r17
            r29 = r9
            r30 = r19
            r31 = r3
            r32 = r18
            r18 = r2
            r19 = r11
            r21 = r0
            r22 = r10
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r2.A0O = r1
            X.4CE r0 = r2.A0n
            r1.A0C(r0)
            r0 = 2131429717(0x7f0b0955, float:1.8481115E38)
            android.view.View r11 = r2.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r11 = (com.whatsapp.emoji.search.EmojiSearchContainer) r11
            X.4c7 r10 = r2.A0O
            X.5Y0 r9 = r2.A0C
            X.1ej r8 = r2.A0Q
            X.33j r1 = r2.A00
            X.2y5 r0 = r2.A0Y
            X.5S9 r3 = new X.5S9
            r23 = r11
            r24 = r0
            r19 = r1
            r20 = r10
            r21 = r8
            r22 = r9
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            X.3M7 r0 = new X.3M7
            r0.<init>(r2)
            r3.A00 = r0
            X.4c7 r1 = r2.A0O
            r0 = 18
            X.3Zm r0 = X.C70003Zm.A00(r3, r0)
            r1.A0E = r0
            android.widget.ImageView r1 = r2.A05
            r0 = 2131231823(0x7f08044f, float:1.8079738E38)
            r1.setImageResource(r0)
            java.io.File r0 = r2.A74()
            if (r0 == 0) goto L_0x019e
            r2.A75()
        L_0x019e:
            X.3Mh r1 = r2.A06
            X.1Ek r0 = X.C66663Mh.A1v
            int r0 = r1.A03(r0)
            r1 = 0
            int r7 = java.lang.Math.max(r7, r0)
            com.whatsapp.WaEditText r3 = r2.A0B
            r0 = 2131434074(0x7f0b1a5a, float:1.8489952E38)
            r2.A79(r3, r0, r7, r7)
            boolean r0 = r2.A0f
            if (r0 != 0) goto L_0x01bc
            X.1fJ r3 = r2.A0V
            r0 = 0
            if (r3 == 0) goto L_0x01bd
        L_0x01bc:
            r0 = 1
        L_0x01bd:
            r2.A0j = r0
            boolean r0 = r2.A7C()
            if (r0 == 0) goto L_0x03bb
            com.whatsapp.WaEditText r3 = r2.A0B
            r0 = 2131889971(0x7f120f33, float:1.941462E38)
        L_0x01ca:
            r3.setHint(r0)
        L_0x01cd:
            if (r16 == 0) goto L_0x01d5
            r0 = 2131888076(0x7f1207cc, float:1.9410777E38)
            r6.A0A(r0)
        L_0x01d5:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x01e0
            com.whatsapp.WaEditText r0 = r2.A0B
            r0.setText(r4)
        L_0x01e0:
            com.whatsapp.WaEditText r0 = r2.A0B
            r0.requestFocus()
            r0 = 2131431930(0x7f0b11fa, float:1.8485603E38)
            android.view.View r4 = X.C005205m.A00(r2, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r16 == 0) goto L_0x01f8
            X.33j r3 = r2.A00
            r0 = 2131232985(0x7f0808d9, float:1.8082095E38)
            X.C18270x1.A0d(r2, r4, r3, r0)
        L_0x01f8:
            X.2so r6 = r2.A0C
            X.1fJ r3 = r2.A0V
            if (r3 == 0) goto L_0x03b8
            X.1VX r0 = r6.A0F
            boolean r0 = X.C56952sp.A0D(r0)
            if (r0 == 0) goto L_0x03b8
            boolean r0 = r6.A0H(r3)
            r8 = r0 ^ 1
        L_0x020c:
            r6 = 8
            if (r8 == 0) goto L_0x03b4
            android.widget.TextView r0 = r2.A06
            r0.setVisibility(r6)
            r3 = 11
        L_0x0217:
            X.39q r0 = new X.39q
            r0.<init>((java.lang.Object) r2, (int) r3)
            X.C57822uG.A00(r0, r4)
            X.1hw r3 = r2.A0L
            X.4FI r0 = r2.A0o
            r3.A06(r0)
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "entry_point"
            r7 = -1
            int r3 = r3.getIntExtra(r0, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r3 != r7) goto L_0x0238
            r0 = 0
        L_0x0238:
            r2.A0d = r0
            if (r8 == 0) goto L_0x031a
            r0 = 2131430505(0x7f0b0c69, float:1.8482713E38)
            android.view.View r3 = X.C005205m.A00(r2, r0)
            X.5UY r0 = new X.5UY
            r0.<init>(r3)
            r0.A06(r1)
            r0 = 2131430506(0x7f0b0c6a, float:1.8482715E38)
            android.widget.TextView r3 = X.C005205m.A01(r2, r0)
            X.5a2 r7 = r2.A0c
            android.content.Context r8 = r3.getContext()
            r0 = 2131890039(0x7f120f77, float:1.9414759E38)
            java.lang.String r10 = r2.getString(r0)
            java.lang.String r11 = "learn-more"
            int r12 = X.AnonymousClass0x2.A05(r3)
            r0 = 19
            X.3Zm r9 = X.C70003Zm.A00(r2, r0)
            android.text.SpannableStringBuilder r0 = r7.A06(r8, r9, r10, r11, r12)
            r3.setText(r0)
            X.1VX r0 = r2.A0D
            X.AnonymousClass1Hf.A2C(r3, r2, r0)
            r0 = 2131430497(0x7f0b0c61, float:1.8482697E38)
            android.view.View r3 = X.C005205m.A00(r2, r0)
            r0 = 2131430454(0x7f0b0c36, float:1.848261E38)
            X.5UY r0 = X.C18290x4.A0X(r3, r0)
            r0.A06(r1)
            r0 = 2131429413(0x7f0b0825, float:1.8480498E38)
            android.widget.TextView r3 = X.C005205m.A01(r2, r0)
            r0 = 2131889843(0x7f120eb3, float:1.941436E38)
            r3.setHint(r0)
            r0 = 10
            X.C635439q.A00(r3, r2, r0)
            r0 = 2131430450(0x7f0b0c32, float:1.8482601E38)
            android.view.View r0 = X.C005205m.A00(r2, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r2.A0A = r0
            X.3Mh r3 = r2.A06
            X.1Ek r0 = X.C66663Mh.A1A
            int r0 = r3.A03(r0)
            int r7 = java.lang.Math.max(r1, r0)
            com.whatsapp.WaEditText r5 = r2.A0A
            r3 = 2131429411(0x7f0b0823, float:1.8480494E38)
            int r0 = r7 / 10
            r2.A79(r5, r3, r7, r0)
            android.widget.ImageView r3 = r2.A05
            r0 = 2131231013(0x7f080125, float:1.8078095E38)
            r3.setImageResource(r0)
            android.widget.ImageView r3 = r2.A05
            r0 = 13
            X.C635439q.A00(r3, r2, r0)
        L_0x02ca:
            boolean r0 = r2.A0f
            if (r0 != 0) goto L_0x02d2
            boolean r0 = r2.A0g
            if (r0 == 0) goto L_0x02e4
        L_0x02d2:
            X.33j r3 = r2.A00
            r0 = 2131232217(0x7f0805d9, float:1.8080537E38)
            X.C18270x1.A0d(r2, r4, r3, r0)
            r0 = 2131433464(0x7f0b17f8, float:1.8488714E38)
            android.view.View r0 = X.C005205m.A00(r2, r0)
            r0.setVisibility(r6)
        L_0x02e4:
            X.1fJ r0 = r2.A0V
            if (r0 != 0) goto L_0x0319
            r0 = 2131430479(0x7f0b0c4f, float:1.848266E38)
            android.view.View r5 = r2.findViewById(r0)
            com.whatsapp.ListItemWithRightIcon r5 = (com.whatsapp.ListItemWithRightIcon) r5
            r5.setVisibility(r1)
            r5.setDescriptionVisibility(r6)
            android.os.Bundle r4 = X.AnonymousClass002.A08()
            java.lang.String r0 = "add_other_participants"
            r3 = 1
            r4.putBoolean(r0, r3)
            java.lang.String r0 = "send_messages"
            r4.putBoolean(r0, r3)
            java.lang.String r0 = "edit_group_info"
            r4.putBoolean(r0, r3)
            java.lang.String r0 = "require_membership_approval"
            r4.putBoolean(r0, r1)
            r2.A04 = r4
            r0 = 14
            X.C635439q.A00(r5, r2, r0)
        L_0x0319:
            return
        L_0x031a:
            r0 = 2131430461(0x7f0b0c3d, float:1.8482624E38)
            android.view.View r3 = X.C005205m.A00(r2, r0)
            r3.setVisibility(r1)
            X.2rR r0 = r2.A0N
            int r0 = X.C56112rR.A00(r0)
            r2.A00 = r0
            r2.A78(r0)
            r0 = 42
            X.C18310x6.A18(r3, r2, r0)
            X.C107295b4.A02(r3)
            X.1fJ r7 = r2.A0V
            X.1VX r3 = r2.A0D
            r0 = 2447(0x98f, float:3.429E-42)
            boolean r0 = r3.A0Y(r5, r0)
            if (r0 == 0) goto L_0x0353
            if (r7 == 0) goto L_0x03a4
            X.2ss r0 = r2.A0K
            X.31A r0 = r0.A0A(r7, r1)
            if (r0 == 0) goto L_0x0353
            boolean r0 = r0.A0n
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03a4
        L_0x0353:
            X.1fJ r5 = r2.A0V
            if (r5 == 0) goto L_0x0399
            X.5ZU r3 = r2.A0E
            X.3Ex r0 = r2.A0D
            X.3ZH r0 = r0.A0A(r5)
            java.lang.String r7 = r3.A0H(r0)
        L_0x0363:
            if (r7 == 0) goto L_0x02ca
            boolean r0 = r2.A0k
            r5 = 1
            if (r0 == 0) goto L_0x0391
            r0 = 2131890955(0x7f12130b, float:1.9416616E38)
            java.lang.String r3 = r2.getString(r0)
            java.lang.String r0 = " "
            java.lang.String r3 = r3.concat(r0)
            r0 = 2131890954(0x7f12130a, float:1.9416614E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r2, r7, r5, r0)
            java.lang.String r3 = r3.concat(r0)
        L_0x0382:
            r0 = 2131431710(0x7f0b111e, float:1.8485157E38)
            android.widget.TextView r0 = X.C005205m.A01(r2, r0)
            r0.setVisibility(r1)
            r0.setText(r3)
            goto L_0x02ca
        L_0x0391:
            r0 = 2131890954(0x7f12130a, float:1.9416614E38)
            java.lang.String r3 = X.AnonymousClass0x2.A0X(r2, r7, r5, r0)
            goto L_0x0382
        L_0x0399:
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "community_name"
            java.lang.String r7 = r3.getStringExtra(r0)
            goto L_0x0363
        L_0x03a4:
            boolean r0 = r2.A0k
            if (r0 == 0) goto L_0x02ca
            boolean r0 = r2.A0j
            if (r0 == 0) goto L_0x02ca
            r0 = 2131890955(0x7f12130b, float:1.9416616E38)
            java.lang.String r3 = r2.getString(r0)
            goto L_0x0382
        L_0x03b4:
            r3 = 12
            goto L_0x0217
        L_0x03b8:
            r8 = 0
            goto L_0x020c
        L_0x03bb:
            boolean r0 = r2.A0k
            if (r0 != 0) goto L_0x03cb
            boolean r0 = r2.A0g
            if (r0 != 0) goto L_0x03cb
            r0 = 2131886370(0x7f120122, float:1.9407317E38)
            r6.A0A(r0)
            goto L_0x01cd
        L_0x03cb:
            com.whatsapp.WaEditText r3 = r2.A0B
            r0 = 2131888472(0x7f120958, float:1.941158E38)
            goto L_0x01ca
        L_0x03d2:
            java.lang.String r0 = "input_method"
            int r0 = r9.getInt(r0)
            r2.A01 = r0
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r3 = r9.getString(r0)
            java.lang.String r0 = "selected"
            java.util.ArrayList r1 = r9.getStringArrayList(r0)
            java.lang.String r0 = "duplicate_ug_exists"
            r7 = 0
            boolean r0 = r9.getBoolean(r0, r8)
            r2.A7B(r3, r1, r0)
            java.lang.String r0 = "setting_values"
            android.os.Bundle r0 = r9.getBundle(r0)
            r2.A04 = r0
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.onCreate(android.os.Bundle):void");
    }

    public NewGroup(int i) {
        this.A0i = false;
        AnonymousClass4HY.A00(this, 66);
    }

    public final void A7A(C27991fJ r4) {
        Intent A072 = C18320x8.A07();
        AnonymousClass0x2.A0u(A072, r4, "group_jid");
        A072.putExtra("parent_group_jid_to_link", C627336j.A07(this.A0V));
        if (this.A03 != null) {
            this.A0B.A05();
            A072.putExtra("new_group_result_bundle", this.A03);
        }
        setResult(-1, A072);
    }

    public final void A7B(String str, List list, boolean z) {
        this.A0V = AnonymousClass34R.A04(str);
        List A0B2 = C627336j.A0B(UserJid.class, list);
        this.A06 = C005205m.A01(this, R.id.selected_header);
        this.A08 = (RecyclerView) C005205m.A00(this, R.id.selected_items);
        this.A0e = AnonymousClass000.A0p(A0B2);
        if (!A0B2.isEmpty()) {
            Iterator it = A0B2.iterator();
            while (it.hasNext()) {
                this.A0e.add(this.A0D.A0A(C18300x5.A0P(it)));
            }
        }
        A77();
        C06560Yg.A0T(this.A06, true);
        this.A0U = new C196411z();
        A76();
        this.A08.setItemAnimator(new C198012s());
        RecyclerView recyclerView = this.A08;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new AutoFitGridLayoutManager(getBaseContext(), getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
        }
        this.A08.A0o(new AnonymousClass125(this));
        this.A08.setAdapter(this.A0U);
        this.A0h = z;
    }

    public final boolean A7D(String str, boolean z) {
        C19340zH A002;
        String A0Y2;
        int i;
        if (str.trim().length() == 0) {
            if (!A7C()) {
                A002 = AnonymousClass5V0.A00(this);
                if (z) {
                    i = R.string.f11nameremoved;
                } else {
                    boolean A0Y3 = this.A0D.A0Y(C58422vE.A02, 3088);
                    i = R.string.f11nameremoved;
                    if (A0Y3) {
                        i = R.string.f11nameremoved;
                    }
                }
                A0Y2 = getString(i);
            }
            return true;
        }
        int A003 = AnonymousClass5VB.A00(str);
        int A032 = this.A06.A03(C66663Mh.A1v);
        if (A003 > A032) {
            A002 = AnonymousClass5V0.A00(this);
            Resources resources = getResources();
            boolean A0Y4 = this.A0D.A0Y(C58422vE.A02, 3088);
            int i2 = R.plurals.f9nameremoved;
            if (A0Y4) {
                i2 = R.plurals.f9nameremoved;
            }
            A0Y2 = AnonymousClass0x2.A0Y(resources, A032, 0, i2);
        }
        return true;
        A002.A0g(A0Y2);
        A002.A0d(this, (C15930sC) null, R.string.f11nameremoved);
        A002.A0S();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        com.whatsapp.util.Log.i("newgroup/photopicked");
        A75();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        super.onActivityResult(r10, r11, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            java.lang.String r3 = "newgroup/photopicked"
            r2 = -1
            r5 = r9
            r4 = r12
            switch(r10) {
                case 12: goto L_0x0040;
                case 13: goto L_0x0029;
                case 14: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.onActivityResult(r10, r11, r12)
        L_0x000c:
            return
        L_0x000d:
            if (r11 != r2) goto L_0x0009
            if (r12 == 0) goto L_0x0009
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r2 = r12.getStringExtra(r0)
            java.lang.String r0 = "selected"
            java.util.ArrayList r1 = r12.getStringArrayListExtra(r0)
            java.lang.String r0 = "duplicate_ug_exists"
            boolean r0 = X.AnonymousClass0x9.A1N(r12, r0)
            r9.A7B(r2, r1, r0)
            goto L_0x0009
        L_0x0029:
            X.1m3 r1 = r9.A0Z
            X.3ZH r0 = r9.A0p
            java.io.File r0 = r1.A03(r0)
            r0.delete()
            if (r11 == r2) goto L_0x008a
            if (r11 != 0) goto L_0x000c
            if (r12 == 0) goto L_0x000c
            X.1m3 r0 = r9.A0Z
            r0.A04(r12, r9)
            return
        L_0x0040:
            if (r11 != r2) goto L_0x000c
            r1 = 0
            if (r12 == 0) goto L_0x0091
            java.lang.String r0 = "is_reset"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "newgroup/resetphoto"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2ro r0 = r9.A0F
            X.3ZH r1 = r9.A0p
            java.io.File r0 = r0.A00(r1)
            X.C626936e.A06(r0)
            r0.delete()
            X.2ro r0 = r9.A0F
            java.io.File r0 = r0.A01(r1)
            X.C626936e.A06(r0)
            r0.delete()
            android.widget.ImageView r1 = r9.A05
            r0 = 2131231823(0x7f08044f, float:1.8079738E38)
            r1.setImageResource(r0)
            return
        L_0x0076:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0091
            X.1m3 r1 = r9.A0Z
            X.3ZH r0 = r9.A0p
            java.io.File r0 = r1.A03(r0)
            r0.delete()
        L_0x008a:
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r9.A75()
            return
        L_0x0091:
            java.lang.String r0 = "newgroup/cropphoto"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1m3 r3 = r9.A0Z
            X.3ZH r7 = r9.A0p
            r8 = 13
            r6 = r9
            r3.A06(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A08;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new AutoFitGridLayoutManager(getBaseContext(), getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0L.A07(this.A0o);
        C105365Uq r0 = this.A0H;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        if (this.A0O.isShowing()) {
            i = 1;
        } else {
            i = 2;
            if (C105895Wv.A00(this.A09)) {
                i = 0;
            }
        }
        this.A01 = i;
        bundle.putInt("input_method", i);
        List A092 = AnonymousClass3ZH.A09(this.A0e);
        ArrayList A0u = C18300x5.A0u(A092);
        C627336j.A0H(A092, A0u);
        bundle.putStringArrayList("selected", A0u);
        C27991fJ r1 = this.A0V;
        if (r1 != null) {
            AnonymousClass0x2.A0v(bundle, r1, "parent_group_jid_to_link");
        }
        bundle.putBoolean("duplicate_ug_exists", this.A0h);
        bundle.putBundle("setting_values", this.A04);
    }

    public void onStart() {
        super.onStart();
        int i = this.A01;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (!this.A0O.isShowing()) {
                this.A09.post(C70003Zm.A00(this, 17));
            }
            getWindow().setSoftInputMode(2);
            return;
        }
        getWindow().setSoftInputMode(4);
    }

    public void BRx(int i) {
        A78(i);
    }

    public NewGroup() {
        this(0);
        this.A0q = new AtomicReference();
        this.A0p = new AnonymousClass1RS();
        this.A0m = Bid(new AnonymousClass4KP(this, 5), new C003403v());
        this.A0n = new AnonymousClass3CX(this);
        this.A0o = new AnonymousClass4IC(this, 9);
        this.A0r = new C86374Jw(this, 3);
        this.A0s = new C86364Jv(this, 10);
    }
}
