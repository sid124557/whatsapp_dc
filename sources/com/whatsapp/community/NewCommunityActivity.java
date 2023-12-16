package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Fk;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1Np;
import X.AnonymousClass1PB;
import X.AnonymousClass1VX;
import X.AnonymousClass25M;
import X.AnonymousClass2YG;
import X.AnonymousClass30V;
import X.AnonymousClass31C;
import X.AnonymousClass33U;
import X.AnonymousClass34R;
import X.AnonymousClass3DZ;
import X.AnonymousClass4FI;
import X.AnonymousClass4HY;
import X.AnonymousClass4IC;
import X.AnonymousClass5UY;
import X.AnonymousClass5ZU;
import X.AnonymousClass922;
import X.C005205m;
import X.C103095Ln;
import X.C106715a2;
import X.C106905aM;
import X.C107695bk;
import X.C114015mM;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C27991fJ;
import X.C28891hw;
import X.C29331ie;
import X.C370220q;
import X.C46352bU;
import X.C53232ml;
import X.C53602nM;
import X.C54182oJ;
import X.C55682qk;
import X.C56892sj;
import X.C56982ss;
import X.C58422vE;
import X.C59862xc;
import X.C626936e;
import X.C64333Db;
import X.C64653Ej;
import X.C64773Ex;
import X.C66433Lk;
import X.C66473Lo;
import X.C66493Lq;
import X.C71313bu;
import X.C84374Cc;
import X.C95814uZ;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public class NewCommunityActivity extends AnonymousClass1Np implements C84374Cc {
    public static final int[] A0R = {127979, 127969, 129716, 127800, 127912, 128218, 127916, 128054, 128049, 127918, 128663, 128247, 128241, 127958, 9917, 127936, 127955, 127944, 128512, 127828, 127922, 9992, 10084};
    public ImageView A00;
    public C64653Ej A01;
    public C64773Ex A02;
    public AnonymousClass1PB A03;
    public AnonymousClass5ZU A04;
    public C114015mM A05;
    public C53602nM A06;
    public C56982ss A07;
    public C66473Lo A08;
    public C28891hw A09;
    public C56892sj A0A;
    public C66493Lq A0B;
    public C103095Ln A0C;
    public C29331ie A0D;
    public AnonymousClass2YG A0E;
    public C27991fJ A0F;
    public AnonymousClass31C A0G;
    public C53232ml A0H;
    public C66433Lk A0I;
    public AnonymousClass30V A0J;
    public C54182oJ A0K;
    public C106715a2 A0L;
    public boolean A0M;
    public int[] A0N;
    public final AnonymousClass4FI A0O;
    public final Runnable A0P;
    public final AtomicReference A0Q;

    public final void A77() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        Bitmap A032 = this.A0C.A03(this, this.A03, 0.0f, dimensionPixelSize, false);
        if (A032 != null) {
            this.A03.setImageDrawable(this.A0D.A01(getResources(), A032, new AnonymousClass922(1)));
        } else {
            this.A0B.A04(this.A03);
        }
    }

    public void A5r() {
        if (!this.A0M) {
            this.A0M = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r3 = A002.A00;
            AnonymousClass1Ha.A23(A002, r3, r3, this);
            AnonymousClass1Ha.A24(A002, this);
            AnonymousClass1Fk.A0C(A002, this);
            this.A0L = C18280x3.A0Q(r3);
            this.A07 = C64333Db.A39(A002);
            this.A0H = (C53232ml) A002.AOY.get();
            this.A05 = C64333Db.A29(A002);
            this.A0G = C64333Db.A5u(A002);
            this.A0I = C64333Db.A8X(A002);
            this.A04 = C64333Db.A28(A002);
            this.A02 = C64333Db.A26(A002);
            this.A0B = C64333Db.A5A(A002);
            this.A0K = A002.ArS();
            this.A01 = (C64653Ej) A002.A5c.get();
            this.A0D = (C29331ie) A002.AP8.get();
            this.A06 = C18280x3.A0L(r3);
            this.A09 = C64333Db.A3C(A002);
            this.A0A = C64333Db.A3G(A002);
            this.A08 = (C66473Lo) A002.A6p.get();
            this.A0J = (AnonymousClass30V) A002.ANL.get();
            this.A0E = new AnonymousClass2YG((C55682qk) A002.A75.get(), (AnonymousClass31C) A002.AKw.get());
            this.A0C = (C103095Ln) r3.A5n.get();
        }
    }

    public void A66() {
        this.A0J.A03((C95814uZ) null, 11);
    }

    public final void A76() {
        String rawString;
        Collection A0s;
        Editable text = this.A08.getText();
        if (text == null) {
            text = "";
        }
        String trim = text.toString().trim();
        Editable text2 = this.A07.getText();
        if (text2 == null) {
            text2 = "";
        }
        String trim2 = text2.toString().trim();
        C27991fJ r0 = this.A0F;
        Uri uri = null;
        if (r0 == null) {
            rawString = null;
        } else {
            rawString = r0.getRawString();
        }
        File A002 = this.A0B.A00(this.A03);
        if (A002 != null) {
            uri = Uri.fromFile(A002);
        }
        AnonymousClass33U r7 = this.A0A;
        int i = 1;
        if (rawString == null) {
            i = 0;
        }
        r7.A02(0, i, 4);
        if (this.A0D.A0Y(C58422vE.A02, 3246)) {
            C27991fJ r02 = this.A0F;
            if (r02 == null) {
                A78(uri, trim, trim2, rawString);
                return;
            }
            AnonymousClass25M.A00(C370220q.GROUP_UPGRADE, Collections.singletonList(r02)).A1S(getSupportFragmentManager(), (String) null);
            return;
        }
        String A003 = this.A09.A00();
        Integer num = this.A09.A02;
        AnonymousClass33U r72 = this.A0A;
        Integer A0b = C18290x4.A0b();
        r72.A08(A0b, A0b, num, (Long) null, A003);
        if (rawString != null) {
            A0s = Collections.singletonList(rawString);
        } else {
            A0s = AnonymousClass001.A0s();
        }
        Intent A072 = C18320x8.A07();
        A072.setClassName(getPackageName(), "com.whatsapp.community.AddGroupsToCommunityActivity");
        A072.putExtra("extra_community_name", trim);
        A072.putExtra("extra_community_description", trim2);
        A072.putExtra("extra_community_photo_uri", uri);
        A072.putExtra("extra_groups_to_be_added", AnonymousClass002.A0J(A0s));
        BpY(A072, 16436756);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ad, code lost:
        if (r3.A0D.A0Y(X.C58422vE.A02, 5453) == false) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A78(android.net.Uri r31, java.lang.String r32, java.lang.String r33, java.lang.String r34) {
        /*
            r30 = this;
            r3 = r30
            X.1ip r0 = r3.A07
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0035
            X.33U r4 = r3.A0A
            X.2bU r0 = r4.A01
            java.lang.String r9 = r0.A00()
            java.lang.Integer r7 = r0.A02
            java.lang.Integer r5 = X.C18300x5.A0Z()
            java.lang.Integer r6 = X.C18290x4.A0b()
            r8 = 0
            r4.A08(r5, r6, r7, r8, r9)
            r5 = 0
            r6 = 2131888341(0x7f1208d5, float:1.9411315E38)
            r7 = 2131888342(0x7f1208d6, float:1.9411317E38)
            r8 = 2131888340(0x7f1208d4, float:1.9411313E38)
            r1 = 3
            X.4Hz r0 = new X.4Hz
            r0.<init>(r3, r1)
            r4 = r0
            r3.A6Y(r4, r5, r6, r7, r8)
            return
        L_0x0035:
            r0 = 2131888361(0x7f1208e9, float:1.9411355E38)
            r3.Bp9(r0)
            X.2sH r15 = r3.A06
            X.1VX r13 = r3.A0D
            X.3Wi r12 = r3.A05
            X.2qk r11 = r3.A03
            X.2sr r10 = r3.A01
            X.31C r9 = r3.A0G
            X.3Ex r8 = r3.A02
            X.3Lq r7 = r3.A0B
            X.2oJ r6 = r3.A0K
            X.2ro r5 = r3.A0B
            X.1m3 r4 = r3.A0F
            X.1ie r2 = r3.A0D
            X.2YG r1 = r3.A0E
            r14 = 1
            X.4IO r0 = new X.4IO
            r0.<init>(r3, r14)
            X.2xY r14 = new X.2xY
            r27 = r9
            r28 = r4
            r29 = r6
            r26 = r1
            r25 = r2
            r24 = r7
            r23 = r13
            r22 = r15
            r21 = r5
            r20 = r8
            r19 = r0
            r18 = r10
            r17 = r12
            r16 = r11
            r15 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            if (r34 == 0) goto L_0x00a2
            X.1fJ r1 = X.AnonymousClass34R.A04(r34)
            if (r1 == 0) goto L_0x0092
            X.3Lo r0 = r3.A08
            X.3ZH r0 = r0.A01(r1)
            r4.add(r0)
        L_0x0092:
            r6 = 0
        L_0x0093:
            java.util.Set r5 = java.util.Collections.emptySet()
            r1 = r31
            r2 = r32
            r3 = r33
            r0 = r14
            r0.A01(r1, r2, r3, r4, r5, r6)
            return
        L_0x00a2:
            X.1VX r2 = r3.A0D
            r1 = 5453(0x154d, float:7.641E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r6 = 1
            if (r0 != 0) goto L_0x0093
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.NewCommunityActivity.A78(android.net.Uri, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void BOO() {
        AnonymousClass33U r1 = this.A0A;
        C46352bU r0 = r1.A01;
        String A002 = r0.A00();
        r1.A08(C18320x8.A0W(), C18300x5.A0Y(), r0.A02, (Long) null, A002);
    }

    public void BPh() {
        AnonymousClass33U r1 = this.A0A;
        C46352bU r0 = r1.A01;
        String A002 = r0.A00();
        String str = null;
        r1.A08(13, C18300x5.A0Y(), r0.A02, (Long) null, A002);
        Editable text = this.A08.getText();
        if (text == null) {
            text = "";
        }
        String trim = text.toString().trim();
        Editable text2 = this.A07.getText();
        if (text2 == null) {
            text2 = "";
        }
        String trim2 = text2.toString().trim();
        C27991fJ r02 = this.A0F;
        Uri uri = null;
        if (r02 != null) {
            str = r02.getRawString();
        }
        File A003 = this.A0B.A00(this.A03);
        if (A003 != null) {
            uri = Uri.fromFile(A003);
        }
        A78(uri, trim, trim2, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r0 > 0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        if (r0 > 0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        if (r2 > 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        r15.A0A.A08(X.C18290x4.A0d(), 5, r6, X.AnonymousClass0x9.A0m(r2), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        r3 = r15.A0A;
        r4 = X.C18310x6.A0e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (r15.A09.A04 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r3.A08(r4, java.lang.Integer.valueOf(r1), r6, (java.lang.Long) null, r8);
        super.onBackPressed();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r15 = this;
            X.2bU r0 = r15.A09
            java.lang.String r8 = r0.A00()
            X.2bU r0 = r15.A09
            java.lang.Integer r6 = r0.A02
            int r2 = r0.A00
            int r0 = r0.A01
            r1 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            if (r2 > 0) goto L_0x004c
            if (r0 <= 0) goto L_0x0033
        L_0x0017:
            X.33U r3 = r15.A0A
            java.lang.Long r7 = X.AnonymousClass0x9.A0m(r0)
            r5 = r4
            r3.A08(r4, r5, r6, r7, r8)
            if (r2 <= 0) goto L_0x0033
        L_0x0023:
            X.33U r9 = r15.A0A
            java.lang.Integer r10 = X.C18290x4.A0d()
            java.lang.Long r13 = X.AnonymousClass0x9.A0m(r2)
            r11 = r4
            r12 = r6
            r14 = r8
            r9.A08(r10, r11, r12, r13, r14)
        L_0x0033:
            X.33U r3 = r15.A0A
            java.lang.Integer r4 = X.C18310x6.A0e()
            X.2bU r0 = r15.A09
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0040
            r1 = 4
        L_0x0040:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r7 = 0
            r3.A08(r4, r5, r6, r7, r8)
            super.onBackPressed()
            return
        L_0x004c:
            if (r0 <= 0) goto L_0x0023
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.NewCommunityActivity.onBackPressed():void");
    }

    public NewCommunityActivity(int i) {
        this.A0M = false;
        AnonymousClass4HY.A00(this, 38);
    }

    public boolean A6C() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (i != 64206) {
            if (i == 16436755) {
                this.A0F.A03(this.A03).delete();
                if (i2 != -1) {
                    if (i2 == 0 && intent != null) {
                        this.A0F.A04(intent, this);
                        return;
                    }
                    return;
                }
            } else if (i == 16436756 && i2 == -1) {
                finish();
                return;
            } else {
                super.onActivityResult(i, i2, intent);
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    Log.i("newcommunity/resetphoto");
                    File A002 = this.A0B.A00(this.A03);
                    C626936e.A06(A002);
                    A002.delete();
                    File A012 = this.A0B.A01(this.A03);
                    C626936e.A06(A012);
                    A012.delete();
                    ImageView imageView = this.A03;
                    C59862xc r6 = this.A0D;
                    imageView.setImageDrawable(C59862xc.A00(getTheme(), getResources(), new AnonymousClass922(1), r6.A00, R.drawable.vec_ic_avatar_community));
                    this.A05.A0H(R.string.f11nameremoved, 0);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    this.A0F.A03(this.A03).delete();
                }
            }
            Log.i("newcommunity/cropphoto");
            this.A0F.A06(intent2, this, this, this.A03, 16436755);
            return;
        } else {
            return;
        }
        Log.i("newcommunity/photopicked");
        A77();
    }

    public void onCreate(Bundle bundle) {
        String string;
        String string2;
        super.onCreate(bundle);
        if (bundle == null || (string2 = bundle.getString("dummy_community_photo_id", (String) null)) == null) {
            this.A03 = new AnonymousClass1PB(this.A03, this.A0B.A05().getRawString());
        } else {
            this.A03 = new AnonymousClass1PB(this.A03, string2);
        }
        A77();
        this.A09.A06(this.A0O);
        String stringExtra = getIntent().getStringExtra("NewCommunityActivity_group_to_be_added");
        if (stringExtra != null) {
            this.A0F = AnonymousClass34R.A04(stringExtra);
        }
        int intExtra = getIntent().getIntExtra("NewCommunityActivity_current_screen", -1);
        if (!this.A0H.A02((Object) null, "community") && intExtra != 3 && !BHW()) {
            C27991fJ r3 = this.A0F;
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.community.CommunityNUXActivity");
            if (r3 != null) {
                AnonymousClass0x2.A0u(A072, r3, "CommunityNUXActivity_group_to_be_added");
            }
            startActivity(A072);
            finish();
        }
        AnonymousClass1VX r0 = this.A0D;
        C58422vE r4 = C58422vE.A02;
        if (r0.A0Y(r4, 3246)) {
            C005205m.A00(this, R.id.camera_icon).setVisibility(8);
            AnonymousClass5UY r02 = new AnonymousClass5UY(C005205m.A00(this, R.id.new_community_icon_randomizer));
            r02.A06(0);
            AnonymousClass0x2.A0z(r02.A04(), this, 34);
            TextView A012 = C005205m.A01(this, R.id.new_community_change_photo);
            C106905aM.A04(A012);
            A012.setOnClickListener(this.A01);
            A012.setVisibility(0);
            this.A07.setText(R.string.f11nameremoved);
        }
        if (this.A0F != null && this.A0D.A0Y(r4, 3246)) {
            AnonymousClass5UY r2 = new AnonymousClass5UY(C005205m.A00(this, R.id.link_group_row_container));
            r2.A06(0);
            getWindow().setSoftInputMode(2);
            View A002 = C005205m.A00(this, R.id.added_subgroup_row_remove_button);
            C18300x5.A13(this, A002, R.string.f11nameremoved);
            C18290x4.A1I(A002, this, r2, 18);
            TextView A013 = C005205m.A01(this, R.id.added_subgroup_row_group_name);
            C106905aM.A04(A013);
            A013.setText(this.A07.A0D(this.A0F));
            this.A05.A04(this, this, "new-community").A08((ImageView) C005205m.A00(this, R.id.added_subgroup_row_group_icon), this.A02.A0A(this.A0F));
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C005205m.A00(this, R.id.added_subgroup_row_group_status);
            if (C56892sj.A01(this.A0A, this.A0F).A0O(this.A01)) {
                string = this.A04.A0U(this.A0F, 1, true);
            } else {
                string = getResources().getString(R.string.f11nameremoved);
            }
            textEmojiLabel.A0I(string);
        }
        if (this.A0D.A0Y(r4, 3246)) {
            this.A0N = getResources().getIntArray(R.array.f2nameremoved);
            this.A00 = (ImageView) AnonymousClass001.A0R(LayoutInflater.from(this), (ViewGroup) this.A00, R.layout.f8nameremoved);
        }
        new AnonymousClass5UY(C005205m.A00(this, R.id.see_community_examples_with_divider)).A06(0);
        TextView A014 = C005205m.A01(this, R.id.see_examples_of_different_communities);
        String A0F2 = AnonymousClass002.A0F(this, "learn-more", AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        A014.setText(this.A0L.A06(A014.getContext(), new C71313bu(this, 16), A0F2, "learn-more", AnonymousClass0x2.A05(A014)));
        AnonymousClass1Hf.A2C(A014, this, this.A0D);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.A07(this.A0O);
        if (this.A0D.A0Y(C58422vE.A02, 3246)) {
            this.A04.BjN(this.A0P);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass33U r1 = this.A0A;
        C46352bU r0 = r1.A01;
        String A002 = r0.A00();
        r1.A08(12, C18290x4.A0b(), r0.A02, (Long) null, A002);
        this.A06.A01(this, "community-examples-article");
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass1PB r0 = this.A03;
        if (r0 != null) {
            bundle.putString("dummy_community_photo_id", r0.A00);
        }
    }

    public NewCommunityActivity() {
        this(0);
        this.A0Q = new AtomicReference();
        this.A0O = new AnonymousClass4IC(this, 6);
        this.A0P = new C71313bu(this, 17);
        this.A0F = null;
    }
}
