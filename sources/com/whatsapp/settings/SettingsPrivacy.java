package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass1kG;
import X.AnonymousClass1kH;
import X.AnonymousClass1kI;
import X.AnonymousClass1kJ;
import X.AnonymousClass2ES;
import X.AnonymousClass2KY;
import X.AnonymousClass2QE;
import X.AnonymousClass2z0;
import X.AnonymousClass33S;
import X.AnonymousClass33Y;
import X.AnonymousClass34P;
import X.AnonymousClass352;
import X.AnonymousClass35B;
import X.AnonymousClass492;
import X.AnonymousClass4D8;
import X.AnonymousClass4FV;
import X.AnonymousClass5RU;
import X.AnonymousClass5RV;
import X.AnonymousClass5YX;
import X.AnonymousClass64I;
import X.AnonymousClass681;
import X.AnonymousClass9U4;
import X.C005205m;
import X.C06560Yg;
import X.C104745Se;
import X.C106545Zk;
import X.C107385bE;
import X.C107555bV;
import X.C107635bd;
import X.C111405i2;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C183538qC;
import X.C1906899l;
import X.C1907099n;
import X.C194619Tt;
import X.C29421in;
import X.C32491qk;
import X.C46982cW;
import X.C47402dC;
import X.C49522gf;
import X.C55262q4;
import X.C55602qc;
import X.C55912r7;
import X.C56042rK;
import X.C56112rR;
import X.C56602sG;
import X.C56612sH;
import X.C56962sq;
import X.C620233e;
import X.C620733j;
import X.C621233o;
import X.C634139d;
import X.C69263Wi;
import X.C71293bs;
import X.C88834as;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SettingsPrivacy extends C32491qk implements AnonymousClass64I {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public ProgressBar A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public SwitchCompat A0P;
    public SwitchCompat A0Q;
    public C55912r7 A0R;
    public C56962sq A0S;
    public C29421in A0T;
    public C55262q4 A0U;
    public AnonymousClass2KY A0V;
    public C620233e A0W;
    public C47402dC A0X;
    public C49522gf A0Y;
    public C46982cW A0Z;
    public C56112rR A0a;
    public AnonymousClass4FV A0b;
    public C621233o A0c;
    public AnonymousClass34P A0d;
    public AnonymousClass33Y A0e;
    public AnonymousClass33S A0f;
    public C1906899l A0g;
    public C1907099n A0h;
    public AnonymousClass9U4 A0i;
    public C55602qc A0j;
    public AnonymousClass1kG A0k;
    public AnonymousClass1kH A0l;
    public AnonymousClass1kI A0m;
    public AnonymousClass1kJ A0n;
    public SettingsPrivacyCameraEffectsViewModel A0o;
    public SettingsRowPrivacyLinearLayout A0p;
    public AnonymousClass5RU A0q;
    public AnonymousClass5RV A0r;
    public C56042rK A0s;
    public C104745Se A0t;
    public C183538qC A0u;
    public String A0v;
    public boolean A0w;
    public final AnonymousClass492 A0x;
    public final C56602sG A0y;
    public final AnonymousClass4D8 A0z;
    public final Map A10;
    public final Set A11;
    public volatile boolean A12;

    public static final int A0C(int i, boolean z) {
        if (i == -1) {
            return C18310x6.A02(z ? 1 : 0);
        }
        return i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7C(java.lang.String r10) {
        /*
            r9 = this;
            r4 = r9
            r7 = r10
            android.widget.TextView r0 = r9.A76(r10)
            if (r0 == 0) goto L_0x0050
            int r0 = r10.hashCode()
            switch(r0) {
                case -892481550: goto L_0x0073;
                case -309425751: goto L_0x0067;
                case 3314326: goto L_0x005c;
                case 506363330: goto L_0x0051;
                default: goto L_0x000f;
            }
        L_0x000f:
            r5 = 0
        L_0x0010:
            X.2r7 r0 = r9.A0R
            int r3 = r0.A01(r10)
            r0 = 3
            if (r3 != r0) goto L_0x007f
            if (r5 == 0) goto L_0x007f
            X.8qC r0 = r9.A0u
            java.lang.Object r0 = r0.get()
            X.5Gw r0 = (X.C101945Gw) r0
            java.util.Map r8 = r0.A00
            boolean r0 = r8.containsKey(r10)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C18310x6.A0o(r10, r8)
            if (r0 == 0) goto L_0x0034
            r9.A7E(r10, r0)
        L_0x0034:
            X.1tA r3 = new X.1tA
            r6 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            X.4UC r2 = r5.A00()
            X.0iE r0 = r2.A02
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0047
            r2.A0A(r9)
        L_0x0047:
            r1 = 4
            X.4K4 r0 = new X.4K4
            r0.<init>(r3, r9, r2, r1)
            r2.A0B(r9, r0)
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r0 = "groupadd"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.1kH r5 = r9.A0l
            goto L_0x0010
        L_0x005c:
            java.lang.String r0 = "last"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.1kI r5 = r9.A0m
            goto L_0x0010
        L_0x0067:
            java.lang.String r0 = "profile"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.1kJ r5 = r9.A0n
            goto L_0x0010
        L_0x0073:
            java.lang.String r0 = "status"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.1kG r5 = r9.A0k
            goto L_0x0010
        L_0x007f:
            int[] r2 = X.AnonymousClass35B.A00
            int r0 = r2.length
            if (r3 < r0) goto L_0x0096
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Received privacy value "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " with no available single-setting text"
            X.C18260x0.A1M(r1, r0)
            r3 = 0
        L_0x0096:
            r0 = r2[r3]
            java.lang.String r0 = r9.getString(r0)
            r9.A7E(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.A7C(java.lang.String):void");
    }

    public void Bbh(int i, int i2) {
        String str;
        if (i == 2) {
            str = "privacy_profile_photo";
        } else if (i == 3) {
            str = "privacy_status";
        } else {
            return;
        }
        A7D(str, i2);
    }

    public void A5r() {
        if (!this.A0w) {
            this.A0w = true;
            ((C88834as) AnonymousClass0x9.A0K(this)).ADp(this);
        }
    }

    public final View A75() {
        View view = this.A0B;
        if (view != null) {
            return view;
        }
        ViewStub viewStub = (ViewStub) findViewById(R.id.privacy_carrot_entry_stub);
        viewStub.setInflatedId(R.id.privacy_carrot_entry);
        boolean A022 = C106545Zk.A02(this.A0D);
        int i = R.layout.f8nameremoved;
        if (A022) {
            i = R.layout.f8nameremoved;
        }
        viewStub.setLayoutResource(i);
        View inflate = viewStub.inflate();
        this.A0B = inflate;
        return inflate;
    }

    public final String A77(long j) {
        C620733j r4;
        int i;
        Object[] objArr;
        long j2;
        if (j != 0) {
            if (j == 60000) {
                r4 = this.A00;
                i = R.plurals.f9nameremoved;
                objArr = new Object[1];
                AnonymousClass000.A1P(objArr, 1, 0);
                j2 = 1;
            } else if (j == 1800000) {
                r4 = this.A00;
                i = R.plurals.f9nameremoved;
                objArr = new Object[1];
                AnonymousClass000.A1P(objArr, 30, 0);
                j2 = 30;
            }
            return r4.A0L(objArr, i, j2);
        }
        return getString(R.string.f11nameremoved);
    }

    public void A78() {
        boolean A2G;
        C71293bs.A00(this.A04, this, 8);
        A7C("groupadd");
        A7C("last");
        A7C("status");
        A7C("profile");
        AnonymousClass2ES r4 = (AnonymousClass2ES) this.A0R.A07.get("readreceipts");
        if (r4 != null) {
            A2G = "all".contentEquals(r4.A00);
        } else {
            A2G = this.A09.A2G();
        }
        int i = 0;
        this.A0p.setEnabled(AnonymousClass000.A1X(r4));
        ProgressBar progressBar = this.A0F;
        int i2 = 4;
        if (r4 != null) {
            i2 = 0;
        }
        progressBar.setVisibility(i2);
        SwitchCompat switchCompat = this.A0Q;
        if (r4 != null) {
            i = 4;
        }
        switchCompat.setVisibility(i);
        if (r4 == null) {
            this.A0Q.setChecked(A2G);
        }
        int i3 = R.string.f11nameremoved;
        if (A2G) {
            i3 = R.string.f11nameremoved;
        }
        if (C107385bE.A08()) {
            C06560Yg.A0S(this.A0Q, getResources().getString(i3));
        }
        C55912r7 r0 = this.A0R;
        r0.A08.add(this.A0x);
    }

    public final void A79() {
        String str;
        int i;
        boolean z;
        C194619Tt B64;
        if (this.A0S.A0M()) {
            C56962sq r1 = this.A0S;
            synchronized (r1) {
                z = r1.A01;
            }
            if (z) {
                int size = this.A11.size();
                if (this.A0h.A02() && this.A0g.A0E() && (B64 = this.A0i.A0G().B64()) != null && B64.A05()) {
                    size += B64.A00();
                }
                if (size > 0) {
                    str = String.valueOf(size);
                    this.A0J.setText(str);
                }
                i = R.string.f11nameremoved;
                str = getString(i);
                this.A0J.setText(str);
            }
        }
        i = R.string.f11nameremoved;
        str = getString(i);
        this.A0J.setText(str);
    }

    public final void A7A() {
        ArrayList A0z2;
        String string;
        C621233o r9 = this.A0c;
        synchronized (r9.A0R) {
            Map A0C2 = r9.A0C();
            A0z2 = C18290x4.A0z(A0C2);
            long A082 = C56612sH.A08(r9);
            Iterator A0v2 = AnonymousClass001.A0v(A0C2);
            while (A0v2.hasNext()) {
                AnonymousClass2QE r5 = (AnonymousClass2QE) A0v2.next();
                if (C621233o.A02(r5.A01, A082)) {
                    A0z2.add(r9.A0A.A07(AnonymousClass2z0.A01(r5.A02)));
                }
            }
        }
        if (A0z2.size() > 0) {
            C620733j r52 = this.A00;
            long size = (long) A0z2.size();
            Object[] A0L2 = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L2, A0z2.size());
            string = r52.A0L(A0L2, R.plurals.f9nameremoved, size);
        } else {
            string = getString(R.string.f11nameremoved);
        }
        TextView textView = this.A0M;
        if (textView != null) {
            textView.setText(string);
        }
    }

    public final void updateDmSetting(View view) {
        this.A0G.setText(AnonymousClass352.A01(this, C56112rR.A00(this.A0a), false, true));
        AnonymousClass1Ha.A22(this, this.A0Z.A04.A00, 340);
        View A022 = C06560Yg.A02(view, R.id.dm_privacy_preference_header);
        TextView A0G2 = C18300x5.A0G(view, R.id.dm_privacy_preference_title);
        TextView A0G3 = C18300x5.A0G(view, R.id.dm_privacy_preference_subtitle);
        View A002 = C005205m.A00(this, R.id.dm_privacy_divider);
        A022.setVisibility(0);
        this.A0G.setVisibility(0);
        A002.setVisibility(0);
        A0G2.setText(R.string.f11nameremoved);
        A0G3.setText(R.string.f11nameremoved);
    }

    public SettingsPrivacy(int i) {
        this.A0w = false;
        AnonymousClass1Hf.A2D(this, 99);
    }

    public final TextView A76(String str) {
        switch (str.hashCode()) {
            case -892481550:
                if (str.equals("status")) {
                    return this.A0H;
                }
                return null;
            case -309425751:
                if (str.equals("profile")) {
                    return this.A0N;
                }
                return null;
            case 3314326:
                if (str.equals("last")) {
                    return this.A0L;
                }
                return null;
            case 506363330:
                if (str.equals("groupadd")) {
                    return this.A0K;
                }
                return null;
            default:
                return null;
        }
    }

    public final void A7B() {
        int dimension = (int) getResources().getDimension(R.dimen.f6nameremoved);
        View A002 = C005205m.A00(this, R.id.content);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A002.getLayoutParams();
        C107555bV.A06(A002, this.A00, marginLayoutParams.leftMargin, dimension, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    public final void A7D(String str, int i) {
        String A022 = AnonymousClass35B.A02(str);
        String A032 = AnonymousClass35B.A03(A022, Math.max(0, i));
        this.A0j.A04(true);
        this.A0R.A05(A022, A032);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7E(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            android.widget.TextView r3 = r4.A76(r5)
            if (r3 != 0) goto L_0x0018
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Tried to put text for privacy category "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " with no subtitle text view"
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0018:
            java.util.Map r0 = r4.A10
            java.lang.String r1 = X.C18310x6.A0o(r5, r0)
            if (r1 == 0) goto L_0x0049
            X.2r7 r0 = r4.A0R
            int r2 = r0.A01(r1)
            if (r2 < 0) goto L_0x0047
            int[] r1 = X.AnonymousClass35B.A00
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0047
            r0 = r1[r2]
            java.lang.String r2 = r4.getString(r0)
        L_0x0033:
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L_0x0049
            r1 = 2131893713(0x7f121dd1, float:1.942221E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A16(r6, r2, r0)
            X.AnonymousClass001.A0y(r4, r3, r0, r1)
            return
        L_0x0047:
            r2 = r6
            goto L_0x0033
        L_0x0049:
            r3.setText(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.A7E(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        A7C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r6 != -1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        r1 = X.C18320x8.A01(r7, "groupadd");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r1 != 3) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        A7C("groupadd");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        r0 = "privacy_profile_photo";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        r0 = "privacy_groupadd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0080, code lost:
        A7D(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r6 != -1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r1 = X.C18320x8.A01(r7, "profile_photo");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r1 != 3) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = "profile";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            r0 = -1
            switch(r5) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0058;
                case 2: goto L_0x0055;
                case 3: goto L_0x002e;
                case 4: goto L_0x000b;
                case 5: goto L_0x001d;
                case 6: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            r4.finish()
        L_0x000b:
            if (r6 != r0) goto L_0x0007
            if (r7 == 0) goto L_0x0007
            java.lang.String r0 = "profile_photo"
            int r1 = X.C18320x8.A01(r7, r0)
            r0 = 3
            if (r1 != r0) goto L_0x0071
            java.lang.String r0 = "profile"
            goto L_0x0051
        L_0x001d:
            if (r6 != r0) goto L_0x0007
            if (r7 == 0) goto L_0x0007
            java.lang.String r0 = "about"
            int r1 = X.C18320x8.A01(r7, r0)
            r0 = 3
            if (r1 != r0) goto L_0x0075
            java.lang.String r0 = "status"
            goto L_0x0051
        L_0x002e:
            if (r6 != r0) goto L_0x0007
            if (r7 == 0) goto L_0x0007
            java.lang.String r3 = "online"
            boolean r0 = r7.hasExtra(r3)
            r2 = 0
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "privacy_online"
            int r0 = r7.getIntExtra(r3, r2)
            r4.A7D(r1, r0)
        L_0x0046:
            java.lang.String r0 = "last_seen"
            int r1 = r7.getIntExtra(r0, r2)
            r0 = 3
            if (r1 != r0) goto L_0x0079
            java.lang.String r0 = "last"
        L_0x0051:
            r4.A7C(r0)
            return
        L_0x0055:
            r4.finish()
        L_0x0058:
            if (r6 != r0) goto L_0x0007
            if (r7 == 0) goto L_0x0007
            java.lang.String r2 = "groupadd"
            int r1 = X.C18320x8.A01(r7, r2)
            r0 = 3
            if (r1 != r0) goto L_0x007d
            r4.A7C(r2)
            return
        L_0x0069:
            X.4FS r1 = r4.A04
            r0 = 8
            X.C71293bs.A00(r1, r4, r0)
            return
        L_0x0071:
            java.lang.String r0 = "privacy_profile_photo"
            goto L_0x0080
        L_0x0075:
            java.lang.String r0 = "privacy_status"
            goto L_0x0080
        L_0x0079:
            java.lang.String r0 = "privacy_last_seen"
            goto L_0x0080
        L_0x007d:
            java.lang.String r0 = "privacy_groupadd"
        L_0x0080:
            r4.A7D(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x047c, code lost:
        if (r3 > 180) goto L_0x038d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r0 = 2131896334(0x7f12280e, float:1.9427526E38)
            r9.setTitle(r0)
            r0 = 2131625815(0x7f0e0757, float:1.8878849E38)
            r9.setContentView((int) r0)
            X.AnonymousClass1Ha.A1z(r9)
            X.0XL r1 = X.AnonymousClass0x9.A0H(r9)
            java.lang.Class<com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel> r0 = com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel.class
            X.0Ty r0 = r1.A01(r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = (com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel) r0
            r9.A0o = r0
            X.107 r1 = r0.A06
            r0 = 341(0x155, float:4.78E-43)
            X.AnonymousClass1Ha.A22(r9, r1, r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = r9.A0o
            X.107 r1 = r0.A07
            r0 = 342(0x156, float:4.79E-43)
            X.AnonymousClass1Ha.A22(r9, r1, r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = r9.A0o
            X.4UC r1 = r0.A08
            r0 = 193(0xc1, float:2.7E-43)
            X.AnonymousClass1Ha.A21(r9, r1, r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = r9.A0o
            X.4UC r1 = r0.A09
            r0 = 194(0xc2, float:2.72E-43)
            X.AnonymousClass1Ha.A21(r9, r1, r0)
            X.2r7 r0 = r9.A0R
            X.492 r1 = r9.A0x
            java.util.Set r0 = r0.A08
            r0.add(r1)
            r0 = 2131430939(0x7f0b0e1b, float:1.8483593E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A09 = r0
            r4 = 2131433652(0x7f0b18b4, float:1.8489096E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r4)
            r0 = 2131893757(0x7f121dfd, float:1.94223E38)
            r1.setText(r0)
            android.view.View r0 = r9.A09
            r3 = 2131433651(0x7f0b18b3, float:1.8489094E38)
            android.widget.TextView r0 = X.C18300x5.A0G(r0, r3)
            r9.A0L = r0
            java.util.Map r2 = r9.A10
            java.lang.String r1 = "last"
            java.lang.String r0 = "online"
            r2.put(r1, r0)
            r0 = 2131432707(0x7f0b1503, float:1.848718E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A0C = r0
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r4)
            r0 = 2131893721(0x7f121dd9, float:1.9422227E38)
            r1.setText(r0)
            android.view.View r0 = r9.A0C
            android.widget.TextView r0 = X.C18300x5.A0G(r0, r3)
            r9.A0N = r0
            r0 = 2131427356(0x7f0b001c, float:1.8476326E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A01 = r0
            android.widget.TextView r2 = X.C18300x5.A0G(r0, r4)
            X.1VX r0 = r9.A0D
            boolean r1 = X.C56952sp.A0F(r0)
            r0 = 2131893719(0x7f121dd7, float:1.9422222E38)
            if (r1 == 0) goto L_0x00ac
            r0 = 2131894331(0x7f12203b, float:1.9423464E38)
        L_0x00ac:
            r2.setText(r0)
            android.view.View r0 = r9.A01
            android.widget.TextView r0 = X.C18300x5.A0G(r0, r3)
            r9.A0H = r0
            r0 = 2131433926(0x7f0b19c6, float:1.8489651E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A0E = r0
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r4)
            r0 = 2131893726(0x7f121dde, float:1.9422237E38)
            r1.setText(r0)
            android.view.View r0 = r9.A0E
            android.widget.TextView r0 = X.C18300x5.A0G(r0, r3)
            r9.A0O = r0
            X.2sr r0 = r9.A01
            boolean r0 = r0.A0Y()
            r5 = 8
            if (r0 == 0) goto L_0x00fc
            X.2q4 r0 = r9.A0U
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x00f7
            X.1VX r2 = r9.A0D
            r1 = 4905(0x1329, float:6.873E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x00fc
        L_0x00f7:
            android.view.View r0 = r9.A0E
            r0.setVisibility(r5)
        L_0x00fc:
            r0 = 2131431068(0x7f0b0e9c, float:1.8483855E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A0A = r0
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r4)
            r0 = 2131893720(0x7f121dd8, float:1.9422224E38)
            r1.setText(r0)
            android.view.View r0 = r9.A0A
            android.widget.TextView r0 = X.C18300x5.A0G(r0, r3)
            r9.A0M = r0
            android.view.View r6 = r9.A0A
            X.2sr r0 = r9.A01
            boolean r1 = r0.A0Y()
            r2 = 0
            r0 = 0
            if (r1 == 0) goto L_0x0125
            r0 = 8
        L_0x0125:
            r6.setVisibility(r0)
            r0 = 2131428489(0x7f0b0489, float:1.8478624E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A05 = r0
            r0 = 2131428490(0x7f0b048a, float:1.8478626E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r9.A0P = r0
            android.view.View r0 = r9.A05
            r9.setUpCameraEffectsPreferenceTexts(r0)
            r0 = 2131429518(0x7f0b088e, float:1.848071E38)
            android.view.View r1 = X.C005205m.A00(r9, r0)
            r9.A07 = r1
            r0 = 2131429522(0x7f0b0892, float:1.848072E38)
            android.widget.TextView r0 = X.C18300x5.A0G(r1, r0)
            r9.A0G = r0
            android.view.View r1 = r9.A07
            X.2gf r0 = r9.A0Y
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x015e
            r5 = 0
        L_0x015e:
            r1.setVisibility(r5)
            r0 = 2131430444(0x7f0b0c2c, float:1.848259E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A08 = r0
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r4)
            r0 = 2131893716(0x7f121dd4, float:1.9422216E38)
            r1.setText(r0)
            android.view.View r0 = r9.A08
            android.widget.TextView r0 = X.C18300x5.A0G(r0, r3)
            r9.A0K = r0
            r0 = 2131428033(0x7f0b02c1, float:1.84777E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A03 = r0
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r4)
            r0 = 2131886816(0x7f1202e0, float:1.9408222E38)
            r1.setText(r0)
            android.view.View r0 = r9.A03
            android.widget.TextView r0 = X.C18300x5.A0G(r0, r3)
            r9.A0J = r0
            X.4FS r1 = r9.A04
            r0 = 11
            X.C71293bs.A00(r1, r9, r0)
            r0 = 2131432891(0x7f0b15bb, float:1.8487552E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            com.whatsapp.settings.SettingsRowPrivacyLinearLayout r0 = (com.whatsapp.settings.SettingsRowPrivacyLinearLayout) r0
            r9.A0p = r0
            r0 = 2131432892(0x7f0b15bc, float:1.8487554E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r9.A0Q = r0
            r0 = 2131432893(0x7f0b15bd, float:1.8487556E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r9.A0F = r0
            r0 = 2131432890(0x7f0b15ba, float:1.848755E38)
            X.C005205m.A00(r9, r0)
            r0 = 2131433411(0x7f0b17c3, float:1.8488607E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A0D = r0
            android.widget.TextView r0 = X.C18300x5.A0G(r0, r4)
            r7 = 2131893725(0x7f121ddd, float:1.9422235E38)
            r0.setText(r7)
            android.view.View r0 = r9.A0D
            android.widget.TextView r6 = X.C18300x5.A0G(r0, r3)
            r9.A0I = r6
            X.5Ug r0 = r9.A04
            X.1VX r1 = r0.A05
            r0 = 266(0x10a, float:3.73E-43)
            X.2vE r5 = X.C58422vE.A02
            boolean r0 = r1.A0Y(r5, r0)
            if (r0 == 0) goto L_0x01f1
            r7 = 2131893724(0x7f121ddc, float:1.9422233E38)
        L_0x01f1:
            r6.setText(r7)
            X.1VX r1 = r9.A0D
            r0 = 5854(0x16de, float:8.203E-42)
            boolean r0 = r1.A0Y(r5, r0)
            if (r0 == 0) goto L_0x0222
            r0 = 2131428724(0x7f0b0574, float:1.84791E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A06 = r0
            r0.setVisibility(r2)
            android.view.View r0 = r9.A06
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r4)
            r0 = 2131887660(0x7f12062c, float:1.9409933E38)
            r1.setText(r0)
            android.view.View r0 = r9.A06
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r3)
            r0 = 2131895745(0x7f1225c1, float:1.9426332E38)
            r1.setText(r0)
        L_0x0222:
            r0 = 2131428469(0x7f0b0475, float:1.8478583E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A04 = r0
            X.1VX r1 = r9.A0D
            r0 = 1972(0x7b4, float:2.763E-42)
            boolean r0 = r1.A0Y(r5, r0)
            if (r0 == 0) goto L_0x0252
            android.view.View r0 = r9.A04
            r0.setVisibility(r2)
            android.view.View r0 = r9.A04
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r4)
            r0 = 2131895725(0x7f1225ad, float:1.9426291E38)
            r1.setText(r0)
            android.view.View r0 = r9.A04
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r3)
            r0 = 2131896342(0x7f122816, float:1.9427543E38)
            r1.setText(r0)
        L_0x0252:
            r0 = 2131427647(0x7f0b013f, float:1.8476916E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r9.A02 = r0
            X.1VX r1 = r9.A0D
            r0 = 3436(0xd6c, float:4.815E-42)
            boolean r0 = r1.A0Y(r5, r0)
            if (r0 == 0) goto L_0x0282
            android.view.View r0 = r9.A02
            r0.setVisibility(r2)
            android.view.View r0 = r9.A02
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r4)
            r0 = 2131895658(0x7f12256a, float:1.9426155E38)
            r1.setText(r0)
            android.view.View r0 = r9.A02
            android.widget.TextView r1 = X.C18300x5.A0G(r0, r3)
            r0 = 2131895724(0x7f1225ac, float:1.942629E38)
            r1.setText(r0)
        L_0x0282:
            r9.A78()
            android.content.Intent r3 = r9.getIntent()
            java.lang.String r1 = "entry_point"
            r0 = -1
            int r0 = r3.getIntExtra(r1, r0)
            r9.A00 = r0
            android.view.View r1 = r9.A09
            r0 = 24
            X.C634139d.A00(r1, r9, r0)
            android.view.View r1 = r9.A0C
            r0 = 14
            X.C634139d.A00(r1, r9, r0)
            android.view.View r1 = r9.A01
            r0 = 15
            X.C634139d.A00(r1, r9, r0)
            android.view.View r1 = r9.A0E
            r0 = 16
            X.C634139d.A00(r1, r9, r0)
            android.view.View r1 = r9.A0A
            r0 = 17
            X.C634139d.A00(r1, r9, r0)
            X.1VX r1 = r9.A0D
            r0 = 5854(0x16de, float:8.203E-42)
            boolean r0 = r1.A0Y(r5, r0)
            if (r0 == 0) goto L_0x02c8
            android.view.View r1 = r9.A06
            if (r1 == 0) goto L_0x02c8
            r0 = 18
            X.C634139d.A00(r1, r9, r0)
        L_0x02c8:
            android.view.View r1 = r9.A05
            r0 = 19
            X.C634139d.A00(r1, r9, r0)
            android.view.View r1 = r9.A04
            r0 = 20
            X.C634139d.A00(r1, r9, r0)
            android.view.View r1 = r9.A02
            r0 = 21
            X.C634139d.A00(r1, r9, r0)
            android.view.View r1 = r9.A08
            r0 = 22
            X.C634139d.A00(r1, r9, r0)
            X.2gf r0 = r9.A0Y
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x02fd
            android.view.View r0 = r9.A07
            r0.setVisibility(r2)
            android.view.View r1 = r9.A07
            r0 = 25
            X.C634139d.A00(r1, r9, r0)
            android.view.View r0 = r9.A07
            r9.updateDmSetting(r0)
        L_0x02fd:
            android.view.View r1 = r9.A03
            r0 = 12
            X.C634139d.A00(r1, r9, r0)
            com.whatsapp.settings.SettingsRowPrivacyLinearLayout r1 = r9.A0p
            r0 = 13
            X.C634139d.A00(r1, r9, r0)
            X.33p r2 = r9.A09
            X.2sH r1 = r9.A06
            X.1VX r0 = r9.A0D
            X.5Ij r6 = new X.5Ij
            r6.<init>(r1, r2, r0)
            X.33p r4 = r6.A01
            java.lang.String r1 = "privacy_checkup_banner_last_seen_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r4)
            long r2 = X.AnonymousClass0x2.A0A(r0, r1)
            r7 = -1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0467
            r4.A1Y(r1)
        L_0x032c:
            X.8qC r2 = r4.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r2)
            java.lang.String r0 = "privacy_checkup_banner_dismiss"
            int r1 = X.C18280x3.A02(r1, r0)
            r0 = 3
            if (r1 >= r0) goto L_0x038d
            X.1VX r1 = r6.A02
            r0 = 3815(0xee7, float:5.346E-42)
            boolean r0 = r1.A0Y(r5, r0)
            if (r0 == 0) goto L_0x038d
            android.content.SharedPreferences r2 = X.C18300x5.A0B(r2)
            java.lang.String r1 = "privacy_checkup_banner_max_cool_off_days"
            r0 = -1
            r2.getInt(r1, r0)
            r0 = 7
            long r1 = X.AnonymousClass0x7.A0D(r0)
            java.lang.String r0 = "privacy_checkup_banner_cool_off_timestamp"
            boolean r0 = r4.A2P(r0, r1)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x038d
            X.5RV r1 = r9.A0r
            r0 = 1
            r1.A01(r0)
            r0 = 45
            X.39f r5 = new X.39f
            r5.<init>(r9, r0, r6)
            r0 = 46
            X.39f r4 = new X.39f
            r4.<init>(r9, r0, r6)
            android.view.View r3 = r9.A75()
            boolean r0 = r3 instanceof com.whatsapp.settings.SettingsRowBanner
            if (r0 == 0) goto L_0x0425
            com.whatsapp.settings.SettingsRowBanner r3 = (com.whatsapp.settings.SettingsRowBanner) r3
            r0 = 2131232405(0x7f080695, float:1.8080918E38)
            r3.setIcon(r0)
            r3.setOnClickListener(r4)
            r3.setOnCloseClickListener(r5)
        L_0x038d:
            X.2r7 r1 = r9.A0R
            r0 = 0
            r1.A02(r0)
            X.2cW r0 = r9.A0Z
            r0.A00()
            X.1in r1 = r9.A0T
            X.2sG r0 = r9.A0y
            r1.A06(r0)
            X.33o r1 = r9.A0c
            X.4D8 r0 = r9.A0z
            r1.A0V(r0)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "target_setting"
            java.lang.String r2 = r1.getStringExtra(r0)
            java.lang.String r0 = "read_receipts_enabled"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03cf
            com.whatsapp.settings.SettingsRowPrivacyLinearLayout r0 = r9.A0p
            r0.A00()
            r1 = 8
            android.view.View r0 = r9.A0B
            if (r0 == 0) goto L_0x03cf
            android.view.View r0 = r9.A75()
            r0.setVisibility(r1)
            r9.A7B()
        L_0x03cf:
            java.lang.String r0 = "privacy_groupadd"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03f0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAddPrivacyActivity"
            r2.setClassName(r1, r0)
            r0 = 2
        L_0x03e6:
            r9.startActivityForResult(r2, r0)
        L_0x03e9:
            java.lang.String r0 = X.AnonymousClass1Ha.A1q(r9)
            r9.A0v = r0
            return
        L_0x03f0:
            java.lang.String r0 = "privacy_profile_photo"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0405
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoPrivacyActivity"
            android.content.Intent r2 = r1.setClassName(r9, r0)
            r0 = 6
            goto L_0x03e6
        L_0x0405:
            java.lang.String r0 = "privacy_checkup"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03e9
            r3 = 5
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "com.whatsapp.privacy.checkup.PrivacyCheckupHomeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "ENTRY_POINT"
            r2.putExtra(r0, r3)
            r9.startActivity(r2)
            goto L_0x03e9
        L_0x0425:
            boolean r0 = r3 instanceof com.whatsapp.wds.components.banners.WDSBanner
            if (r0 == 0) goto L_0x038d
            com.whatsapp.wds.components.banners.WDSBanner r3 = (com.whatsapp.wds.components.banners.WDSBanner) r3
            X.5OR r2 = new X.5OR
            r2.<init>()
            r0 = 2131232405(0x7f080695, float:1.8080918E38)
            X.56h r1 = new X.56h
            r1.<init>(r0)
            X.56b r0 = new X.56b
            r0.<init>(r1)
            r2.A02 = r0
            r0 = 2131892721(0x7f1219f1, float:1.9420198E38)
            r2.A01 = r0
            r0 = 2131892720(0x7f1219f0, float:1.9420196E38)
            android.text.Spanned r0 = X.AnonymousClass5VU.A00(r9, r0)
            r2.A03 = r0
            X.5KM r0 = r2.A00()
            r3.setState(r0)
            boolean r0 = X.C1001059l.A03
            if (r0 != 0) goto L_0x0463
            r3.A06()
        L_0x045b:
            r3.setOnClickListener(r4)
            r3.setOnDismissListener((android.view.View.OnClickListener) r5)
            goto L_0x038d
        L_0x0463:
            r3.A05()
            goto L_0x045b
        L_0x0467:
            long r0 = java.lang.System.currentTimeMillis()
            int r3 = X.C107175ap.A00(r0, r2)
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r4)
            java.lang.String r1 = "privacy_checkup_banner_max_display_days"
            r0 = -1
            r2.getInt(r1, r0)
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 <= r0) goto L_0x032c
            goto L_0x038d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C621233o r0 = this.A0c;
        r0.A0V.remove(this.A0z);
        this.A0T.A07(this.A0y);
        C55912r7 r02 = this.A0R;
        r02.A08.remove(this.A0x);
    }

    public void onRestart() {
        super.onRestart();
        this.A0v = null;
    }

    public void onResume() {
        String string;
        super.onResume();
        if (!this.A12) {
            A79();
        }
        A7A();
        boolean A062 = this.A04.A06();
        View view = this.A0D;
        if (A062) {
            view.setVisibility(0);
            if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A09), "privacy_fingerprint_enabled")) {
                string = A77(AnonymousClass0x2.A0F(this.A09).getLong("privacy_fingerprint_timeout", 60000));
            } else {
                string = getString(R.string.f11nameremoved);
            }
            this.A0I.setText(string);
            C634139d.A00(this.A0D, this, 23);
        } else {
            view.setVisibility(8);
        }
        A78();
        this.A0q.A02(this.A00, "privacy", this.A0v);
        this.A0o.A0D();
    }

    public final void setUpCameraEffectsPreferenceTexts(View view) {
        C18300x5.A0G(view, R.id.camera_effects_privacy_title).setText(R.string.f11nameremoved);
        String A0F2 = AnonymousClass002.A0F(this, "learn-more", AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(view, R.id.camera_effects_privacy_description);
        AnonymousClass1VX r9 = this.A0D;
        C69263Wi r6 = this.A05;
        C107635bd.A0E(this, Uri.parse("https://faq.whatsapp.com/603175068451715/"), this.A00, r6, A0K2, this.A08, r9, A0F2, "learn-more");
    }

    public SettingsPrivacy() {
        this(0);
        this.A0y = new AnonymousClass681(this, 41);
        this.A0z = new AnonymousClass5YX(this, 3);
        this.A0x = new C111405i2(this);
        this.A10 = AnonymousClass001.A0t();
        this.A11 = AnonymousClass002.A0K();
        this.A12 = false;
    }
}
