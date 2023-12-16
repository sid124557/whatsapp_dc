package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass33S;
import X.AnonymousClass3ZH;
import X.AnonymousClass4EF;
import X.AnonymousClass4SG;
import X.AnonymousClass5B6;
import X.AnonymousClass5QN;
import X.AnonymousClass5TS;
import X.AnonymousClass5YT;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass68W;
import X.AnonymousClass6C5;
import X.C106715a2;
import X.C107625bc;
import X.C107695bk;
import X.C116985rC;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C27991fJ;
import X.C28011fL;
import X.C28891hw;
import X.C29441ip;
import X.C41822Ls;
import X.C53782nf;
import X.C56892sj;
import X.C56942so;
import X.C56982ss;
import X.C620733j;
import X.C627336j;
import X.C64333Db;
import X.C64773Ex;
import X.C66493Lq;
import X.C66503Lr;
import X.C66663Mh;
import X.C67353Oy;
import X.C69263Wi;
import X.C71313bu;
import X.C72333dY;
import X.C73783g4;
import X.C84374Cc;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C88744aj;
import X.C88834as;
import X.C89634eX;
import X.C91974lt;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;

public class LinkExistingGroups extends C89634eX implements AnonymousClass4EF, C84374Cc {
    public View A00;
    public C116985rC A01;
    public C56942so A02;
    public MemberSuggestedGroupsManager A03;
    public C56982ss A04;
    public C28891hw A05;
    public C56892sj A06;
    public C66493Lq A07;
    public C66503Lr A08;
    public C27991fJ A09;
    public C27991fJ A0A;
    public AnonymousClass33S A0B;
    public C106715a2 A0C;
    public C183538qC A0D;
    public SortedSet A0E;
    public boolean A0F;
    public boolean A0G;

    public void A5r() {
        if (!this.A0G) {
            this.A0G = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r2 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r2, this, AnonymousClass4SG.A2t(r1, r2, this));
            AnonymousClass4SG.A3T(r1, r2, this);
            AnonymousClass4SG.A3M(A2X, r1, this, r1.A6O.get());
            this.A0C = C18280x3.A0Q(r2);
            this.A01 = C88744aj.A00;
            this.A04 = C64333Db.A39(r1);
            this.A0B = (AnonymousClass33S) r1.AUY.get();
            this.A07 = C64333Db.A5A(r1);
            this.A08 = (C66503Lr) r1.AGs.get();
            this.A02 = C64333Db.A1k(r1);
            this.A03 = (MemberSuggestedGroupsManager) r1.AKB.get();
            this.A05 = C86614Ku.A0Y(r1);
            this.A06 = C64333Db.A3G(r1);
        }
    }

    public void A7O(AnonymousClass5QN r6, AnonymousClass3ZH r7) {
        String str;
        SortedSet<C53782nf> sortedSet;
        TextEmojiLabel textEmojiLabel = r6.A02;
        C86654Ky.A1F(textEmojiLabel);
        C41822Ls r2 = r7.A0J;
        if (!r7.A0U() || r2 == null) {
            super.A7O(r6, r7);
            return;
        }
        int i = r2.A00;
        if (i == 0) {
            Jid A042 = AnonymousClass3ZH.A04(r7);
            if (AnonymousClass001.A1Z(this.A0D.get()) && (sortedSet = this.A0E) != null) {
                for (C53782nf r0 : sortedSet) {
                    if (r0.A02.equals(A042)) {
                        str = getString(R.string.f11nameremoved);
                    }
                }
            }
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0K((List) null, C18320x8.A0e(r7.A0I(C28011fL.class), this.A0D.A0D));
            r6.A01(r7.A0y);
            return;
        } else if (i == 2 || i == 6) {
            C27991fJ r1 = r2.A01;
            if (r1 != null) {
                AnonymousClass3ZH A0A2 = this.A0B.A0A(r1);
                str = AnonymousClass002.A0F(this, C18300x5.A0h(this.A0D, A0A2), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
            } else {
                str = null;
            }
        } else {
            return;
        }
        r6.A00(str, false);
    }

    public final List A7c() {
        List<Object> unmodifiableList = Collections.unmodifiableList(this.A0f);
        AnonymousClass6C5 r3 = new AnonymousClass6C5(0);
        C162457s7.A0J(unmodifiableList, 0);
        ArrayList A0c = C73783g4.A0c(unmodifiableList);
        for (Object invoke : unmodifiableList) {
            A0c.add(r3.invoke(invoke));
        }
        return A0c;
    }

    public void Ayk(AnonymousClass3ZH r3) {
        if (AnonymousClass5YT.A00(r3, this.A0D)) {
            C27991fJ r0 = (C27991fJ) AnonymousClass3ZH.A04(r3);
            Objects.requireNonNull(r0);
            this.A0A = r0;
            AnonymousClass5B6.A00(this, 1, R.string.f11nameremoved);
            return;
        }
        this.A0A = null;
        super.Ayk(r3);
    }

    public void BOO() {
    }

    public void BRm(int i, String str) {
        C27991fJ r1 = this.A0A;
        if (r1 != null) {
            AnonymousClass3ZH A0A2 = this.A0B.A0A(r1);
            AnonymousClass1VX r14 = this.A0D;
            C27991fJ r11 = this.A0A;
            C69263Wi r10 = this.A05;
            AnonymousClass33S r9 = this.A0B;
            C66663Mh r8 = this.A06;
            C620733j r7 = this.A0N;
            AnonymousClass5ZU r6 = this.A0D;
            C64773Ex r5 = this.A0B;
            C66493Lq r4 = this.A07;
            C66503Lr r3 = this.A08;
            C29441ip r2 = this.A07;
            C28891hw r12 = this.A05;
            C66493Lq r27 = r4;
            AnonymousClass1VX r26 = r14;
            C56892sj r25 = this.A06;
            C28891hw r24 = r12;
            C620733j r23 = r7;
            AnonymousClass5ZU r22 = r6;
            C64773Ex r21 = r5;
            C29441ip r20 = r2;
            C66663Mh r19 = r8;
            C69263Wi r18 = r10;
            AnonymousClass5TS r15 = new AnonymousClass5TS((View) null, this, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r3, r11, r9);
            r15.A00 = new C67353Oy(this, A0A2);
            r15.A00(str);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("LinkExistingGroups/permissions denied");
            finish();
        }
    }

    public LinkExistingGroups(int i) {
        this.A0G = false;
        AnonymousClass68W.A00(this, 29);
    }

    public void A7K(int i) {
        String A0L;
        if (getSupportActionBar() == null) {
            Log.e("LinkExistingGroups/updateTitle/getSupportActionBar is null");
            return;
        }
        int A78 = A78();
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (A78 == Integer.MAX_VALUE) {
            A0L = C86604Kt.A0q(this.A0N, i, 0, R.plurals.f9nameremoved);
        } else {
            Object[] A0M = AnonymousClass002.A0M();
            C86604Kt.A1X(A0M, i, 0, A78, 1);
            A0L = this.A0N.A0L(A0M, R.plurals.f9nameremoved, (long) i);
        }
        supportActionBar.A0I(A0L);
    }

    public void A7Y(List list) {
        boolean z;
        if (list.isEmpty()) {
            setResult(-10);
            finish();
            return;
        }
        super.A7Y(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C41822Ls r0 = C18310x6.A0R(it).A0J;
            if (r0 != null && r0.A00 == 0) {
                z = true;
                break;
            }
        }
        this.A0F = z;
        if (!z) {
            TextView A0G2 = C18300x5.A0G(A7D(), R.id.disclaimer_warning_text);
            A0G2.setText(this.A0C.A06(A0G2.getContext(), new C71313bu((Object) this, 10), getString(R.string.f11nameremoved), "create_new_group", AnonymousClass5Yj.A04(A0G2)));
            C18270x1.A0q(A0G2, this.A0D);
        }
    }

    public void A7Z(List list) {
        ArrayList A0J = AnonymousClass002.A0J(list);
        A0J.add(0, new C91974lt(getString(R.string.f11nameremoved)));
        super.A7Z(A0J);
    }

    public void BNi(String str) {
    }

    public /* synthetic */ void BOP(int i) {
    }

    public void BPh() {
        Intent A072 = C18320x8.A07();
        A072.putStringArrayListExtra("selected_jids", C627336j.A0A(A7c()));
        A072.putExtra("is_suggest_mode", (Serializable) this.A0D.get());
        AnonymousClass0x2.A0m(this, A072);
    }

    public void onCreate(Bundle bundle) {
        this.A09 = C86634Kw.A0k(getIntent(), "parent_group_jid");
        super.onCreate(bundle);
        if (bundle == null && !this.A0A.A00()) {
            RequestPermissionActivity.A0d(this, R.string.f11nameremoved, R.string.f11nameremoved, false);
        }
        if (AnonymousClass001.A1Z(this.A0D.get())) {
            this.A04.BkM(new C71313bu((Object) this, 11));
        }
    }

    public LinkExistingGroups() {
        this(0);
        this.A0D = C72333dY.A06(new C107625bc(this, 1));
    }
}
