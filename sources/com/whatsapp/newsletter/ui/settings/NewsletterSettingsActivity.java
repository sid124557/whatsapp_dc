package com.whatsapp.newsletter.ui.settings;

import X.AnonymousClass1RL;
import X.AnonymousClass31A;
import X.AnonymousClass4SG;
import X.AnonymousClass599;
import X.AnonymousClass5UP;
import X.AnonymousClass5YD;
import X.AnonymousClass66R;
import X.AnonymousClass68W;
import X.C102685Jw;
import X.C107695bk;
import X.C120005xt;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18320x8;
import X.C371421c;
import X.C371621e;
import X.C372321l;
import X.C372821q;
import X.C372921r;
import X.C56982ss;
import X.C64333Db;
import X.C86634Kw;
import X.C86654Ky;
import X.C89644eZ;
import X.C95804uY;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;

public final class NewsletterSettingsActivity extends C89644eZ {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioGroup A03;
    public RadioGroup A04;
    public WaTextView A05;
    public WaTextView A06;
    public C56982ss A07;
    public C95804uY A08;
    public AnonymousClass5UP A09;
    public C102685Jw A0A;
    public AnonymousClass5YD A0B;
    public boolean A0C;
    public final AnonymousClass66R A0D;

    public void A5r() {
        if (!this.A0C) {
            this.A0C = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A0A = (C102685Jw) r1.A87.get();
            this.A09 = C86634Kw.A0n(A2Y);
            this.A0B = (AnonymousClass5YD) A2Y.ANq.get();
            this.A07 = C64333Db.A39(A2Y);
        }
    }

    public final AnonymousClass1RL A74() {
        C56982ss r1 = this.A07;
        if (r1 != null) {
            C95804uY r0 = this.A08;
            if (r0 == null) {
                throw C18270x1.A0S("jid");
            }
            AnonymousClass31A A002 = C56982ss.A00(r1, r0);
            C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
            return (AnonymousClass1RL) A002;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public NewsletterSettingsActivity(int i) {
        this.A0C = false;
        AnonymousClass68W.A00(this, 65);
    }

    public static final int A0C(int i) {
        AnonymousClass599 r0;
        if (i == R.id.newsletter_media_cache_day) {
            r0 = AnonymousClass599.DAY;
        } else if (i == R.id.newsletter_media_cache_week) {
            r0 = AnonymousClass599.WEEK;
        } else if (i == R.id.newsletter_media_cache_month) {
            r0 = AnonymousClass599.MONTH;
        } else if (i == R.id.newsletter_media_cache_never) {
            r0 = AnonymousClass599.NEVER;
        } else if (i != R.id.newsletter_media_cache_default) {
            return Integer.MIN_VALUE;
        } else {
            r0 = AnonymousClass599.DEFAULT;
        }
        return r0.value;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (A74().A0K() == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            X.5Yx r1 = X.C95804uY.A03
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "jid"
            java.lang.String r0 = r0.getStringExtra(r2)
            X.4uY r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0019
            r7.finish()
        L_0x0018:
            return
        L_0x0019:
            r7.A08 = r0
            r0 = 2131624052(0x7f0e0074, float:1.8875273E38)
            r7.setContentView((int) r0)
            X.0R8 r1 = r7.getSupportActionBar()
            if (r1 == 0) goto L_0x0031
            r0 = 1
            r1.A0N(r0)
            r0 = 2131891131(0x7f1213bb, float:1.9416973E38)
            r1.A0B(r0)
        L_0x0031:
            X.5UP r0 = r7.A09
            if (r0 == 0) goto L_0x02c1
            X.1VX r1 = r0.A01
            r0 = 4887(0x1317, float:6.848E-42)
            boolean r0 = r1.A0X(r0)
            r3 = 0
            if (r0 == 0) goto L_0x004b
            X.1RL r0 = r7.A74()
            boolean r0 = r0.A0K()
            r1 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            r0 = 2131431716(0x7f0b1124, float:1.848517E38)
            android.view.View r0 = X.C18290x4.A0N(r7, r0)
            if (r1 != 0) goto L_0x0057
            r3 = 8
        L_0x0057:
            r0.setVisibility(r3)
            if (r1 == 0) goto L_0x01b3
            r0 = 2131431779(0x7f0b1163, float:1.8485297E38)
            android.view.View r0 = X.C18290x4.A0N(r7, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A06 = r0
            r0 = 2131431780(0x7f0b1164, float:1.8485299E38)
            android.view.View r0 = X.C18290x4.A0N(r7, r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r7.A04 = r0
            r0 = 2131432848(0x7f0b1590, float:1.8487465E38)
            android.view.View r0 = X.C18290x4.A0N(r7, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r7.A00 = r0
            r0 = 2131432872(0x7f0b15a8, float:1.8487514E38)
            android.view.View r0 = X.C18290x4.A0N(r7, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r7.A01 = r0
            r0 = 2131432874(0x7f0b15aa, float:1.8487518E38)
            android.view.View r3 = X.C18290x4.A0N(r7, r0)
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            r7.A02 = r3
            if (r3 != 0) goto L_0x009c
            java.lang.String r0 = "noneButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x009c:
            X.5UP r0 = r7.A09
            if (r0 == 0) goto L_0x02ae
            X.1VX r1 = r0.A01
            r0 = 5274(0x149a, float:7.39E-42)
            boolean r0 = r1.A0X(r0)
            int r0 = X.AnonymousClass001.A08(r0)
            r3.setVisibility(r0)
            r0 = 2131431779(0x7f0b1163, float:1.8485297E38)
            android.widget.TextView r1 = X.C18310x6.A0L(r7, r0)
            if (r1 == 0) goto L_0x00be
            r0 = 2131891105(0x7f1213a1, float:1.941692E38)
            r1.setText(r0)
        L_0x00be:
            android.widget.RadioButton r1 = r7.A00
            if (r1 != 0) goto L_0x00c9
            java.lang.String r0 = "anyButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00c9:
            r0 = 2131891106(0x7f1213a2, float:1.9416923E38)
            r1.setText(r0)
            android.widget.RadioButton r1 = r7.A02
            if (r1 != 0) goto L_0x00da
            java.lang.String r0 = "noneButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00da:
            r0 = 2131891108(0x7f1213a4, float:1.9416927E38)
            r1.setText(r0)
            android.widget.RadioButton r6 = r7.A01
            if (r6 != 0) goto L_0x00eb
            java.lang.String r0 = "defaultButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00eb:
            r5 = 2131891107(0x7f1213a3, float:1.9416925E38)
            java.lang.Object[] r4 = X.AnonymousClass002.A0L()
            r3 = 0
            java.util.List r1 = X.AnonymousClass2B2.A00
            X.C162457s7.A0F(r1)
            java.lang.String r0 = " "
            java.lang.String r0 = X.C73723fy.A09(r0, r1)
            java.lang.String r0 = X.AnonymousClass2AB.A00(r0)
            r4[r3] = r0
            X.AnonymousClass001.A0y(r7, r6, r4, r5)
            android.widget.RadioButton r1 = r7.A00
            if (r1 != 0) goto L_0x0112
            java.lang.String r0 = "anyButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0112:
            r0 = 38
            X.C18300x5.A19(r1, r7, r0)
            android.widget.RadioButton r1 = r7.A02
            if (r1 != 0) goto L_0x0122
            java.lang.String r0 = "noneButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0122:
            r0 = 39
            X.C18300x5.A19(r1, r7, r0)
            android.widget.RadioButton r1 = r7.A01
            if (r1 != 0) goto L_0x0132
            java.lang.String r0 = "defaultButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0132:
            r0 = 40
            X.C18300x5.A19(r1, r7, r0)
            android.widget.RadioButton r0 = r7.A01
            java.lang.String r6 = "defaultButton"
            if (r0 != 0) goto L_0x0142
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0142:
            r0.setChecked(r3)
            android.widget.RadioButton r0 = r7.A02
            java.lang.String r5 = "noneButton"
            if (r0 != 0) goto L_0x0150
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0150:
            r0.setChecked(r3)
            android.widget.RadioButton r0 = r7.A00
            java.lang.String r4 = "anyButton"
            if (r0 != 0) goto L_0x015e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x015e:
            r0.setChecked(r3)
            X.5Jw r0 = r7.A0A
            if (r0 == 0) goto L_0x02a7
            X.4uY r1 = r7.A08
            if (r1 != 0) goto L_0x016e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x016e:
            X.2ss r0 = r0.A03
            X.31A r1 = X.C56982ss.A00(r0, r1)
            boolean r0 = r1 instanceof X.AnonymousClass1RL
            if (r0 == 0) goto L_0x0194
            X.1RL r1 = (X.AnonymousClass1RL) r1
            if (r1 == 0) goto L_0x0194
            X.21r r0 = r1.A09
        L_0x017e:
            int r3 = r0.ordinal()
            r2 = 1
            if (r3 == r2) goto L_0x01a7
            r0 = 0
            if (r3 == r0) goto L_0x019e
            r1 = 2
            android.widget.RadioButton r0 = r7.A02
            if (r3 == r1) goto L_0x0197
            if (r0 != 0) goto L_0x01b0
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0194:
            X.21r r0 = X.C372921r.DEFAULT
            goto L_0x017e
        L_0x0197:
            if (r0 != 0) goto L_0x01b0
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x019e:
            android.widget.RadioButton r0 = r7.A01
            if (r0 != 0) goto L_0x01b0
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x01a7:
            android.widget.RadioButton r0 = r7.A00
            if (r0 != 0) goto L_0x01b0
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x01b0:
            r0.setChecked(r2)
        L_0x01b3:
            r0 = 2131431766(0x7f0b1156, float:1.848527E38)
            android.view.View r0 = X.C18290x4.A0N(r7, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A05 = r0
            r0 = 2131431765(0x7f0b1155, float:1.8485268E38)
            android.view.View r0 = X.C18290x4.A0N(r7, r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r7.A03 = r0
            com.whatsapp.WaTextView r1 = r7.A05
            if (r1 != 0) goto L_0x01d4
            java.lang.String r0 = "mediaCacheHeader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01d4:
            X.66R r3 = r7.A0D
            boolean r0 = X.C18270x1.A1V(r3)
            r2 = 0
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            android.widget.RadioGroup r1 = r7.A03
            if (r1 != 0) goto L_0x01ed
            java.lang.String r0 = "mediaCacheSettings"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01ed:
            boolean r0 = X.C18270x1.A1V(r3)
            if (r0 != 0) goto L_0x01f5
            r2 = 8
        L_0x01f5:
            r1.setVisibility(r2)
            boolean r0 = X.C18270x1.A1V(r3)
            if (r0 == 0) goto L_0x0018
            r0 = 5
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r0 = 2131431760(0x7f0b1150, float:1.8485258E38)
            X.AnonymousClass000.A1L(r1, r0)
            r0 = 2131431768(0x7f0b1158, float:1.8485275E38)
            X.AnonymousClass000.A1M(r1, r0)
            r0 = 2131431762(0x7f0b1152, float:1.8485262E38)
            X.AnonymousClass000.A1N(r1, r0)
            r0 = 2131431763(0x7f0b1153, float:1.8485264E38)
            X.AnonymousClass000.A1O(r1, r0)
            r0 = 2131431761(0x7f0b1151, float:1.848526E38)
            X.C18280x3.A1P(r1, r0)
            java.util.List r0 = X.AnonymousClass8UF.A0o(r1)
            java.util.Iterator r4 = r0.iterator()
        L_0x0227:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0250
            int r3 = X.C18280x3.A05(r4)
            int r1 = A0C(r3)
            X.1RL r0 = r7.A74()
            X.599 r0 = r0.A08
            int r0 = r0.value
            boolean r2 = X.AnonymousClass000.A1U(r0, r1)
            android.view.View r1 = r7.findViewById(r3)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 41
            X.C18300x5.A19(r1, r7, r0)
            r1.setChecked(r2)
            goto L_0x0227
        L_0x0250:
            X.5Jw r0 = r7.A0A
            if (r0 == 0) goto L_0x02ba
            X.33p r0 = r0.A02
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "newsletter_media_cache_purge_after"
            r5 = 0
            int r4 = r1.getInt(r0, r5)
            X.599[] r3 = X.AnonymousClass599.values()
            int r2 = r3.length
        L_0x0266:
            if (r5 >= r2) goto L_0x02b5
            r1 = r3[r5]
            int r0 = r1.value
            if (r0 != r4) goto L_0x02a4
            int r2 = r1.ordinal()
            r5 = 1
            r0 = 2
            r1 = 2131896173(0x7f12276d, float:1.94272E38)
            if (r2 == r0) goto L_0x0287
            r0 = 3
            r1 = 2131896177(0x7f122771, float:1.9427208E38)
            if (r2 == r0) goto L_0x0287
            r0 = 4
            if (r2 == r0) goto L_0x02a0
            if (r2 != r5) goto L_0x0018
            r1 = 2131896176(0x7f122770, float:1.9427206E38)
        L_0x0287:
            java.lang.String r4 = X.C18290x4.A0l(r7, r1)
            r0 = 2131431761(0x7f0b1151, float:1.848526E38)
            android.widget.TextView r3 = X.C18310x6.A0L(r7, r0)
            if (r3 == 0) goto L_0x0018
            r2 = 2131896174(0x7f12276e, float:1.9427202E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 0
            r1[r0] = r4
            X.AnonymousClass001.A0y(r7, r3, r1, r2)
            return
        L_0x02a0:
            r1 = 2131896175(0x7f12276f, float:1.9427204E38)
            goto L_0x0287
        L_0x02a4:
            int r5 = r5 + 1
            goto L_0x0266
        L_0x02a7:
            java.lang.String r0 = "settingsManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02ae:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02b5:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()
            throw r0
        L_0x02ba:
            java.lang.String r0 = "settingsManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02c1:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity.onCreate(android.os.Bundle):void");
    }

    public final void onMediaCacheSettingClicked(View view) {
        AnonymousClass1RL r13;
        int A0C2 = A0C(view.getId());
        if (A0C2 != Integer.MIN_VALUE) {
            C102685Jw r1 = this.A0A;
            if (r1 != null) {
                C95804uY r15 = this.A08;
                if (r15 == null) {
                    throw C18270x1.A0S("jid");
                }
                C56982ss r14 = r1.A03;
                AnonymousClass31A A0A2 = r14.A0A(r15, false);
                if ((A0A2 instanceof AnonymousClass1RL) && (r13 = (AnonymousClass1RL) A0A2) != null) {
                    for (AnonymousClass599 r12 : AnonymousClass599.values()) {
                        if (r12.value == A0C2) {
                            long j = r13.A00;
                            AnonymousClass31A r53 = r13.A0P;
                            String str = r13.A0H;
                            long j2 = r13.A02;
                            String str2 = r13.A0E;
                            long j3 = r13.A01;
                            String str3 = r13.A0J;
                            long j4 = r13.A03;
                            String str4 = r13.A0I;
                            long j5 = r13.A04;
                            long j6 = r13.A0O;
                            String str5 = r13.A0F;
                            String str6 = r13.A0G;
                            long j7 = r13.A05;
                            C372821q r11 = r13.A07;
                            C371421c r22 = r13.A0A;
                            C371621e r24 = r13.A0C;
                            boolean z = r13.A0L;
                            List list = r13.A0Q;
                            boolean z2 = r13.A0M;
                            C372321l r10 = r13.A0B;
                            boolean z3 = r13.A0K;
                            C372921r r16 = r13.A09;
                            boolean z4 = r13.A0N;
                            C86654Ky.A1P(r11, r10, r16);
                            r14.A0H(new AnonymousClass1RL(r13.A06, r53, r11, r12, r16, r22, r10, r24, r13.A0D, str, str2, str3, str4, str5, str6, list, j, j2, j3, j4, j5, j6, j7, z, z2, z3, z4), r15);
                            return;
                        }
                    }
                    throw C18320x8.A0t();
                }
                return;
            }
            throw C18270x1.A0S("settingsManager");
        }
    }

    public NewsletterSettingsActivity() {
        this(0);
        this.A0D = C154517dI.A01(new C120005xt(this));
    }
}
