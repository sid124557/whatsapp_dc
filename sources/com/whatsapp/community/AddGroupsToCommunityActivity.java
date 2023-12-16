package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0XL;
import X.AnonymousClass0x9;
import X.AnonymousClass10d;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass2FF;
import X.AnonymousClass2YG;
import X.AnonymousClass31C;
import X.AnonymousClass33U;
import X.AnonymousClass34R;
import X.AnonymousClass3B4;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FI;
import X.AnonymousClass4HU;
import X.AnonymousClass4HY;
import X.AnonymousClass4IC;
import X.AnonymousClass4IO;
import X.AnonymousClass4J4;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.C005205m;
import X.C105365Uq;
import X.C107575bX;
import X.C107695bk;
import X.C114015mM;
import X.C15940sD;
import X.C161497pn;
import X.C17190ui;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C27991fJ;
import X.C28001fK;
import X.C28891hw;
import X.C29331ie;
import X.C30191m3;
import X.C39532Ci;
import X.C41802Lq;
import X.C41822Ls;
import X.C46352bU;
import X.C54182oJ;
import X.C55682qk;
import X.C56332ro;
import X.C56612sH;
import X.C56892sj;
import X.C56942so;
import X.C56972sr;
import X.C56982ss;
import X.C58422vE;
import X.C59822xY;
import X.C59862xc;
import X.C620733j;
import X.C626936e;
import X.C627536m;
import X.C64333Db;
import X.C64653Ej;
import X.C64773Ex;
import X.C66493Lq;
import X.C69263Wi;
import X.C71703cX;
import X.C85884Hz;
import X.C87764Wa;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class AddGroupsToCommunityActivity extends C89644eZ {
    public AnonymousClass0R8 A00;
    public C39532Ci A01;
    public AnonymousClass64J A02;
    public AnonymousClass10d A03;
    public C56942so A04;
    public C64653Ej A05;
    public C87764Wa A06;
    public C46352bU A07;
    public AnonymousClass33U A08;
    public C64773Ex A09;
    public AnonymousClass5ZU A0A;
    public C56332ro A0B;
    public C105365Uq A0C;
    public C114015mM A0D;
    public C620733j A0E;
    public C56982ss A0F;
    public C28891hw A0G;
    public C56892sj A0H;
    public C59862xc A0I;
    public C66493Lq A0J;
    public C29331ie A0K;
    public AnonymousClass2YG A0L;
    public AnonymousClass31C A0M;
    public C30191m3 A0N;
    public C54182oJ A0O;
    public boolean A0P;
    public final AnonymousClass4FI A0Q;
    public final AtomicReference A0R;

    public final void A74() {
        A78(false);
        if (C161497pn.filter((Collection) this.A03.A07.A07(), new AnonymousClass3B4(false)).size() == 0 && !this.A0D.A0Y(C58422vE.A02, 3167)) {
            A78(true);
            Toast.makeText(this, R.string.f11nameremoved, 0).show();
        } else if (!this.A07.A0F()) {
            A76();
        } else {
            Bp9(R.string.f11nameremoved);
            String stringExtra = getIntent().getStringExtra("extra_community_name");
            C626936e.A06(stringExtra);
            String stringExtra2 = getIntent().getStringExtra("extra_community_description");
            Set set = (Set) this.A03.A08.A07();
            Set set2 = (Set) this.A03.A09.A07();
            C56612sH r18 = this.A06;
            AnonymousClass1VX r17 = this.A0D;
            C69263Wi r19 = this.A05;
            C55682qk r15 = this.A03;
            C56972sr r14 = this.A01;
            AnonymousClass31C r13 = this.A0M;
            C64773Ex r8 = this.A09;
            C66493Lq r7 = this.A0J;
            C54182oJ r6 = this.A0O;
            C56332ro r5 = this.A0B;
            C30191m3 r4 = this.A0N;
            C29331ie r3 = this.A0K;
            AnonymousClass2YG r2 = this.A0L;
            C56972sr r20 = r14;
            AnonymousClass4IO r21 = new AnonymousClass4IO(this, 0);
            C64773Ex r22 = r8;
            C56332ro r23 = r5;
            C55682qk r182 = r15;
            C59822xY r16 = new C59822xY(this, r182, r19, r20, r21, r22, r23, r18, r17, r7, r3, r2, r13, r4, r6);
            this.A08.A02(set2.size(), set.size(), 5);
            r16.A01((Uri) getIntent().getParcelableExtra("extra_community_photo_uri"), stringExtra, stringExtra2, set, set2, false);
        }
    }

    public final void A76() {
        A78(true);
        A6Y(new C85884Hz(this, 2), 0, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A07.A04 = true;
        setContentView((int) R.layout.f8nameremoved);
        this.A0C = this.A0D.A06(this, "add-groups-to-community");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_groups_to_be_added");
        HashSet A0K2 = AnonymousClass002.A0K();
        if (stringArrayListExtra != null) {
            Iterator<String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                C27991fJ A042 = AnonymousClass34R.A04(AnonymousClass001.A0m(it));
                if (A042 != null) {
                    A0K2.add(A042);
                }
            }
        }
        this.A03 = (AnonymousClass10d) new AnonymousClass0XL((C17190ui) new AnonymousClass4J4(A0K2, 1, this.A01), (C15940sD) this).A01(AnonymousClass10d.class);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        C626936e.A06(supportActionBar);
        this.A00 = supportActionBar;
        this.A0G.A06(this.A0Q);
        this.A00.A0Q(true);
        this.A00.A0N(true);
        this.A00.A0B(R.string.f11nameremoved);
        C18320x8.A13(C005205m.A00(this, R.id.add_groups_new_group), this, 22);
        C18320x8.A13(C005205m.A00(this, R.id.add_groups_link_existing_groups), this, 23);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.added_groups);
        C18320x8.A19(recyclerView, 1);
        AnonymousClass5ZU r8 = this.A0A;
        C620733j r10 = this.A0E;
        C59862xc r12 = this.A0I;
        C87764Wa r4 = new C87764Wa(this, this.A02, new AnonymousClass2FF(this), r8, this.A0C, r10, this.A0H, r12);
        this.A06 = r4;
        recyclerView.setAdapter(r4);
        ImageView imageView = (ImageView) C005205m.A00(this, R.id.community_add_groups_done_button);
        A78(true);
        C18320x8.A13(imageView, this, 24);
        C18290x4.A1A(this, imageView, R.drawable.ic_fab_check);
        AnonymousClass10d r42 = this.A03;
        String stringExtra = getIntent().getStringExtra("extra_community_name");
        C626936e.A06(stringExtra);
        AnonymousClass3ZH r3 = new AnonymousClass3ZH(r42.A05.A05());
        r3.A0P = stringExtra;
        r3.A0J = new C41822Ls((C27991fJ) null, 3);
        r42.A00 = r3;
        r42.A0D();
        AnonymousClass1Ha.A21(this, this.A03.A07, 27);
    }

    public void A5r() {
        if (!this.A0P) {
            this.A0P = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r4 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r4, this);
            C107695bk r0 = r4.A00;
            AnonymousClass1Ha.A23(r4, r0, r0, this);
            AnonymousClass1Ha.A24(r4, this);
            this.A0F = C64333Db.A39(r4);
            this.A0D = C64333Db.A29(r4);
            this.A0M = C64333Db.A5u(r4);
            this.A09 = C64333Db.A26(r4);
            this.A0A = C64333Db.A28(r4);
            this.A0E = C64333Db.A2t(r4);
            this.A0J = C64333Db.A5A(r4);
            this.A05 = (C64653Ej) r4.A5c.get();
            this.A0B = (C56332ro) r4.A6Q.get();
            this.A0I = (C59862xc) r4.APF.get();
            this.A0N = (C30191m3) r4.ARj.get();
            this.A0O = r4.ArS();
            this.A04 = C64333Db.A1k(r4);
            this.A07 = (C46352bU) r4.A5Y.get();
            this.A0K = (C29331ie) r4.AP8.get();
            this.A0G = C64333Db.A3C(r4);
            this.A08 = (AnonymousClass33U) r4.A5h.get();
            this.A0H = C64333Db.A3G(r4);
            this.A0L = new AnonymousClass2YG((C55682qk) r4.A75.get(), (AnonymousClass31C) r4.AKw.get());
            this.A02 = (AnonymousClass64J) r4.AEN.get();
            this.A01 = (C39532Ci) A0I2.A3O.get();
        }
    }

    public final void A75() {
        if (((Set) this.A03.A07.A07()).size() < this.A04.A0F.A0O(C58422vE.A02, 1990) + 1) {
            String stringExtra = getIntent().getStringExtra("extra_community_name");
            C626936e.A06(stringExtra);
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.group.newgroup.NewGroup");
            A072.putExtra("create_group_for_community", true);
            A072.putExtra("community_name", stringExtra);
            BpY(A072, 11);
            return;
        }
        A77();
    }

    public final void A77() {
        AnonymousClass1VX r0 = this.A04.A0F;
        C58422vE r5 = C58422vE.A02;
        int A0O2 = r0.A0O(r5, 1990);
        Resources resources = getResources();
        int A0O3 = this.A04.A0F.A0O(r5, 1990);
        int A0O4 = this.A04.A0F.A0O(r5, 1238);
        int i = R.plurals.f9nameremoved;
        if (A0O3 < A0O4) {
            i = R.plurals.f9nameremoved;
        }
        Object[] A0L2 = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L2, A0O2);
        Bov("", resources.getQuantityString(i, A0O2, A0L2));
    }

    public final void A78(boolean z) {
        this.A05.A0S(new C71703cX(18, (Object) this, z));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        BaseBundle baseBundle;
        Uri uri;
        if (i != 10) {
            if (i != 11) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1 && intent != null && intent.getExtras() != null && (baseBundle = (BaseBundle) intent.getExtras().getParcelable("group_created")) != null) {
                AnonymousClass10d r4 = this.A03;
                C28001fK A002 = C28001fK.A00(baseBundle.getString("key_raw_jid"));
                if (A002 != null) {
                    String string = baseBundle.getString("key_group_name");
                    if (!C107575bX.A0F(string)) {
                        String string2 = baseBundle.getString("key_raw_photo_uri");
                        if (string2 != null) {
                            uri = Uri.parse(string2);
                        } else {
                            uri = null;
                        }
                        int i3 = baseBundle.getInt("key_ephemeral_duration");
                        AnonymousClass3ZH r3 = new AnonymousClass3ZH(A002);
                        r3.A0P = string;
                        r3.A02 = i3;
                        if (uri != null) {
                            File A0a = C18310x6.A0a(uri);
                            if (A0a.exists()) {
                                try {
                                    C41802Lq A0D2 = r4.A06.A0D(C627536m.A0U(A0a));
                                    r4.A03.A01(r3, A0D2.A00, A0D2.A01);
                                } catch (IOException e) {
                                    Log.e("newgroup/failed to update photo", e);
                                }
                            }
                        }
                        Set set = r4.A0C;
                        if (set.add(r3)) {
                            r4.A09.A0G(set);
                            r4.A0D();
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass001.A0e("Group name missing");
                }
                throw AnonymousClass001.A0e("Pending group raw jid missing or invalid");
            }
        } else if (i2 == -1) {
            if (intent != null && intent.getExtras() != null) {
                if (intent.getExtras().getBoolean("should_open_new_group")) {
                    Intent A072 = C18320x8.A07();
                    A072.setClassName(getPackageName(), "com.whatsapp.group.newgroup.NewGroup");
                    A072.putExtra("create_group_for_community", true);
                    BpY(A072, 11);
                    return;
                }
                ArrayList<String> stringArrayList = intent.getExtras().getStringArrayList("selected_jids");
                if (stringArrayList != null) {
                    AnonymousClass10d r42 = this.A03;
                    r42.A0A.BkL(new AnonymousClass4HU(AnonymousClass0x9.A15(stringArrayList), 0, r42), new String[0]);
                }
            }
        } else if (i2 == -10) {
            Bot(R.string.f11nameremoved);
        }
    }

    public void onBackPressed() {
        C46352bU r2 = this.A07;
        int size = ((Set) this.A03.A08.A07()).size();
        int size2 = ((Set) this.A03.A09.A07()).size();
        r2.A00 = size;
        r2.A01 = size2;
        super.onBackPressed();
    }

    public void onDestroy() {
        C105365Uq r0 = this.A0C;
        if (r0 != null) {
            r0.A00();
            this.A0C = null;
        }
        this.A0G.A07(this.A0Q);
        super.onDestroy();
    }

    public AddGroupsToCommunityActivity(int i) {
        this.A0P = false;
        AnonymousClass4HY.A00(this, 33);
    }

    public AddGroupsToCommunityActivity() {
        this(0);
        this.A0R = new AtomicReference();
        this.A0Q = new AnonymousClass4IC(this, 2);
    }
}
