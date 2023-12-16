package com.whatsapp.report;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass1W5;
import X.AnonymousClass1t2;
import X.AnonymousClass31C;
import X.AnonymousClass33T;
import X.AnonymousClass36K;
import X.AnonymousClass39V;
import X.AnonymousClass3T6;
import X.AnonymousClass3UL;
import X.AnonymousClass4FV;
import X.AnonymousClass4FW;
import X.C06270Wx;
import X.C102115Hn;
import X.C107695bk;
import X.C109745f7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C183538qC;
import X.C29431io;
import X.C32291q7;
import X.C32301q8;
import X.C33771tf;
import X.C33781tg;
import X.C369320h;
import X.C373221u;
import X.C54292oU;
import X.C55102pn;
import X.C55402qI;
import X.C56612sH;
import X.C56972sr;
import X.C58422vE;
import X.C620733j;
import X.C634339f;
import X.C64333Db;
import X.C66433Lk;
import X.C66453Lm;
import X.C72343dZ;
import X.C84894Ed;
import X.C85244Fm;
import X.C86164Jb;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.File;

public class ReportActivity extends C89644eZ implements C84894Ed {
    public C85244Fm A00;
    public AnonymousClass33T A01;
    public C620733j A02;
    public C29431io A03;
    public AnonymousClass4FV A04;
    public BusinessActivityReportViewModel A05;
    public C102115Hn A06;
    public C55102pn A07;
    public C55102pn A08;
    public C55102pn A09;
    public C33771tf A0A;
    public AnonymousClass1t2 A0B;
    public C33781tg A0C;
    public C66433Lk A0D;
    public C183538qC A0E;
    public C183538qC A0F;
    public boolean A0G;
    public final AnonymousClass4FW A0H;

    public final void A75(C66453Lm r7, C369320h r8) {
        File A0A2;
        synchronized (r7) {
            if (r7.A04().value >= C373221u.NONE.value) {
                int i = r7.A04().value;
                C373221u r2 = C373221u.DOWNLOAD_FAILED;
                if (i <= r2.value) {
                    if (r7.A04().value == C373221u.DOWNLOADED.value) {
                        if (r7 instanceof C32301q8) {
                            A0A2 = AnonymousClass002.A0A(C54292oU.A01(((C32301q8) r7).A00), "channels_gdpr.zip");
                        } else {
                            A0A2 = AnonymousClass002.A0A(C54292oU.A01(((C32291q7) r7).A00), "gdpr.zip");
                        }
                        if (!A0A2.exists()) {
                            Log.e("gdpr/validate-state/report-media-file-missing");
                            r7.A09(C373221u.AVAILABLE.value);
                        }
                    }
                    C373221u A042 = r7.A04();
                    C373221u r1 = C373221u.AVAILABLE;
                    if (A042 == r1 && r7.A02() == null) {
                        Log.e("gdpr/validate-state/report-message-missing");
                        r7.A06();
                    }
                    if (r7.A04() == r1 || r7.A04() == r2) {
                        C56612sH r5 = r7.A06;
                        if (r5.A0H() > r7.A00()) {
                            long A0H2 = r5.A0H();
                            long A002 = r7.A00();
                            if (A0H2 > A002) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("gdpr/validate-state/report-too-old current:");
                                A0o.append(A0H2);
                                C18260x0.A12(" expired:", A0o, A002);
                                r7.A06();
                            }
                        }
                    }
                }
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("gdpr/validate-state/wrong-state ");
            C18260x0.A0n(r7.A04(), A0o2);
        }
        if (r7.A04().value < C373221u.DOWNLOADED.value) {
            AnonymousClass1t2 r12 = new AnonymousClass1t2(this, this, r8);
            this.A0B = r12;
            C18270x1.A0w(r12, this.A04);
        }
        BiY(r8);
    }

    public void A5r() {
        if (!this.A0G) {
            this.A0G = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A0E = C72343dZ.A00(r1.AG2);
            this.A0F = C72343dZ.A00(r1.ANi);
            this.A04 = C64333Db.A4H(r1);
            this.A00 = C64333Db.A05(r1);
            this.A0D = C64333Db.A8X(r1);
            this.A02 = C64333Db.A2t(r1);
            this.A06 = A0I.AD5();
            this.A03 = C64333Db.A3K(r1);
            this.A01 = (AnonymousClass33T) r1.Aaf.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0076, code lost:
        if (r4 == r3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A74(com.whatsapp.TextEmojiLabel r17, X.C369320h r18, int r19) {
        /*
            r16 = this;
            r11 = r16
            X.1VX r0 = r11.A0D
            r6 = r17
            X.AnonymousClass0x2.A14(r0, r6)
            X.33i r0 = r11.A08
            X.AnonymousClass0x2.A12(r6, r0)
            X.20h r3 = X.C369320h.NEWSLETTER
            X.3Lk r1 = r11.A0D
            r4 = r18
            if (r4 != r3) goto L_0x0069
            java.lang.String r0 = "6480469855345352"
            android.net.Uri r0 = r1.A03(r0)
            java.lang.String r2 = r0.toString()
        L_0x0020:
            r1 = 2131891112(0x7f1213a8, float:1.9416935E38)
        L_0x0023:
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            r8 = 0
            r0[r8] = r2
            android.text.Spanned r0 = X.C107575bX.A00(r11, r0, r1)
            android.text.SpannableStringBuilder r7 = X.C18330xA.A00(r0)
            android.text.style.URLSpan[] r5 = X.C18310x6.A1Z(r7)
            if (r5 == 0) goto L_0x0083
            int r4 = r5.length
            r9 = 0
        L_0x003a:
            if (r9 >= r4) goto L_0x0079
            r0 = r5[r9]
            int r3 = r7.getSpanStart(r0)
            int r2 = r7.getSpanEnd(r0)
            int r1 = r7.getSpanFlags(r0)
            X.3Wi r13 = r11.A05
            X.33i r14 = r11.A08
            X.4Fm r12 = r11.A00
            java.lang.String r15 = r0.getURL()
            X.4b3 r10 = new X.4b3
            r10.<init>(r11, r12, r13, r14, r15)
            r7.setSpan(r10, r3, r2, r1)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r10 = r19
            r0.<init>(r11, r10)
            r7.setSpan(r0, r3, r2, r1)
            int r9 = r9 + 1
            goto L_0x003a
        L_0x0069:
            java.lang.String r0 = "26000110"
            android.net.Uri r0 = X.C66433Lk.A00(r1, r0)
            java.lang.String r2 = r0.toString()
            r1 = 2131889541(0x7f120d85, float:1.9413748E38)
            if (r4 != r3) goto L_0x0023
            goto L_0x0020
        L_0x0079:
            if (r8 >= r4) goto L_0x0083
            r0 = r5[r8]
            r7.removeSpan(r0)
            int r8 = r8 + 1
            goto L_0x0079
        L_0x0083:
            r6.setText(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.report.ReportActivity.A74(com.whatsapp.TextEmojiLabel, X.20h, int):void");
    }

    public final void A76(C369320h r3) {
        if (this.A05.A0Y()) {
            if (this.A0A != null) {
                this.A0A = null;
            }
            C33771tf r1 = new C33771tf(this, this.A05, this, r3);
            this.A0A = r1;
            C18270x1.A0w(r1, this.A04);
        }
    }

    public final void A77(C369320h r3) {
        if (this.A05.A0Y()) {
            if (this.A0C != null) {
                this.A0C = null;
            }
            C33781tg r1 = new C33781tg(this, this.A05, this, r3);
            this.A0C = r1;
            C18270x1.A0w(r1, this.A04);
            A78(r3, 1);
        }
    }

    public final void A78(C369320h r3, int i) {
        if (r3 == C369320h.NEWSLETTER) {
            AnonymousClass1W5 r1 = new AnonymousClass1W5();
            r1.A00 = Integer.valueOf(i);
            this.A04.BhD(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        if (r0 != false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiY(X.C369320h r24) {
        /*
            r23 = this;
            X.20h r5 = X.C369320h.ACCOUNT
            r3 = r23
            r4 = r24
            if (r4 != r5) goto L_0x00af
            X.8qC r0 = r3.A0E
            java.lang.Object r0 = r0.get()
            X.3Lm r0 = (X.C66453Lm) r0
            X.2pn r12 = r3.A08
            r8 = 2131755126(0x7f100076, float:1.9141122E38)
        L_0x0015:
            if (r12 == 0) goto L_0x004c
            X.21u r11 = r0.A04()
            int r2 = r11.ordinal()
            r9 = 3
            r7 = 2
            r10 = 1
            r6 = 0
            if (r2 == r6) goto L_0x0050
            if (r2 == r10) goto L_0x00f9
            if (r2 == r7) goto L_0x00be
            r1 = 4
            if (r2 == r1) goto L_0x00be
            if (r2 != r9) goto L_0x004c
            X.1nF r1 = r0.A02()
            if (r1 == 0) goto L_0x004d
            X.1nF r1 = r0.A02()
            long r14 = r1.A00
        L_0x003a:
            r1 = 25
            X.3a1 r13 = new X.3a1
            r13.<init>(r3, r1, r4)
            long r16 = r0.A01()
            long r18 = r0.A00()
            r12.A02(r13, r14, r16, r18)
        L_0x004c:
            return
        L_0x004d:
            r14 = -1
            goto L_0x003a
        L_0x0050:
            X.20h r0 = X.C369320h.NEWSLETTER
            if (r4 != r0) goto L_0x0092
            r2 = 2131891113(0x7f1213a9, float:1.9416937E38)
        L_0x0057:
            r1 = 23
            X.3a1 r0 = new X.3a1
            r0.<init>(r3, r1, r4)
            r12.A00(r0, r2)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131755126(0x7f100076, float:1.9141122E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0Y(r1, r9, r6, r0)
            X.C162457s7.A0J(r1, r6)
            android.widget.TextView r0 = r12.A05
            r0.setText(r1)
            if (r4 != r5) goto L_0x004c
            X.1VX r1 = r3.A0D
            r0 = 455(0x1c7, float:6.38E-43)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r1.A0Y(r2, r0)
            if (r0 != 0) goto L_0x008c
            X.1VX r1 = r3.A0D
            r0 = 4635(0x121b, float:6.495E-42)
            boolean r0 = r1.A0Y(r2, r0)
            if (r0 == 0) goto L_0x004c
        L_0x008c:
            com.whatsapp.TextEmojiLabel r0 = r12.A09
            r0.setVisibility(r6)
            return
        L_0x0092:
            X.1VX r1 = r3.A0D
            r0 = 455(0x1c7, float:6.38E-43)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r1.A0Y(r2, r0)
            if (r0 != 0) goto L_0x00ab
            X.1VX r1 = r3.A0D
            r0 = 4635(0x121b, float:6.495E-42)
            boolean r0 = r1.A0Y(r2, r0)
            r2 = 2131889543(0x7f120d87, float:1.9413753E38)
            if (r0 == 0) goto L_0x0057
        L_0x00ab:
            r2 = 2131889544(0x7f120d88, float:1.9413755E38)
            goto L_0x0057
        L_0x00af:
            X.8qC r0 = r3.A0F
            java.lang.Object r0 = r0.get()
            X.3Lm r0 = (X.C66453Lm) r0
            X.2pn r12 = r3.A09
            r8 = 2131755223(0x7f1000d7, float:1.914132E38)
            goto L_0x0015
        L_0x00be:
            X.21u r1 = X.C373221u.DOWNLOAD_FAILED
            boolean r22 = X.AnonymousClass000.A1Y(r11, r1)
            X.1nF r1 = r0.A02()
            if (r1 == 0) goto L_0x00f7
            X.33C r1 = X.C30471mV.A00(r1)
            boolean r2 = r1.A0c
        L_0x00d0:
            X.1nF r1 = r0.A02()
            if (r1 == 0) goto L_0x00f4
            X.1nF r1 = r0.A02()
            long r15 = r1.A00
        L_0x00dc:
            r14 = 2131889535(0x7f120d7f, float:1.9413736E38)
            r1 = 24
            X.3a1 r13 = new X.3a1
            r13.<init>(r3, r1, r0)
            long r17 = r0.A01()
            long r19 = r0.A00()
            r21 = r2
            r12.A01(r13, r14, r15, r17, r19, r21, r22)
            return
        L_0x00f4:
            r15 = -1
            goto L_0x00dc
        L_0x00f7:
            r2 = 0
            goto L_0x00d0
        L_0x00f9:
            long r4 = r0.A01()
            X.2sH r1 = r3.A06
            long r1 = r1.A0H()
            long r4 = r4 - r1
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 / r1
            r1 = 1
            long r1 = java.lang.Math.max(r1, r4)
            int r4 = (int) r1
            r9 = 2131889548(0x7f120d8c, float:1.9413763E38)
            java.lang.Object[] r5 = new java.lang.Object[r10]
            X.33j r2 = r3.A02
            long r0 = r0.A01()
            java.lang.String r0 = X.C100575Bl.A00(r2, r7, r0)
            java.lang.String r1 = X.AnonymousClass002.A0F(r3, r0, r5, r6, r9)
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r0, r4, r6, r8)
            r12.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.report.ReportActivity.BiY(X.20h):void");
    }

    public final void initNewsletterViews(View view) {
        if (!this.A0D.A0Y(C58422vE.A02, 4635)) {
            AnonymousClass1Ha.A20(this, R.id.request_newsletter_report_container);
            return;
        }
        C55102pn r4 = new C55102pn(getApplicationContext(), view, this.A02);
        this.A09 = r4;
        r4.A08.setText(R.string.f11nameremoved);
        r4.A07.setText(R.string.f11nameremoved);
        TextEmojiLabel textEmojiLabel = r4.A09;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(R.string.f11nameremoved);
        this.A09.A03.setVisibility(8);
        C55102pn r2 = this.A09;
        r2.A02.setOnClickListener(new C109745f7((Object) this, 27));
        A74(AnonymousClass0x7.A0K(view, R.id.report_item_header), C369320h.NEWSLETTER, R.style.f12nameremoved);
    }

    public final void initP2BViews(View view) {
        if (!this.A0D.A0Y(C58422vE.A02, 455)) {
            AnonymousClass1Ha.A20(this, R.id.request_p2b_report_container);
            return;
        }
        C55102pn r4 = new C55102pn(getApplicationContext(), view, this.A02);
        this.A07 = r4;
        r4.A08.setText(R.string.f11nameremoved);
        r4.A07.setText(R.string.f11nameremoved);
        TextEmojiLabel textEmojiLabel = r4.A09;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(R.string.f11nameremoved);
        this.A07.A03.setVisibility(8);
        DeleteReportConfirmationDialogFragment deleteReportConfirmationDialogFragment = new DeleteReportConfirmationDialogFragment();
        deleteReportConfirmationDialogFragment.A00 = new AnonymousClass3UL(this);
        C55102pn r2 = this.A07;
        r2.A02.setOnClickListener(new C634339f(this, 21, deleteReportConfirmationDialogFragment));
    }

    public ReportActivity(int i) {
        this.A0G = false;
        AnonymousClass1Hf.A2D(this, 91);
    }

    public final void initGdprViews(View view) {
        C55102pn r2 = new C55102pn(getApplicationContext(), view, this.A02);
        this.A08 = r2;
        r2.A02.setOnClickListener(new C109745f7((Object) this, 26));
        A74(AnonymousClass0x7.A0K(view, R.id.report_item_header), C369320h.ACCOUNT, R.style.f12nameremoved);
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass1Ha.A1z(this);
        AnonymousClass1VX r1 = this.A0D;
        C58422vE r3 = C58422vE.A02;
        if (r1.A0Y(r3, 455) || this.A0D.A0Y(r3, 4635)) {
            findViewById(R.id.report_header).setVisibility(8);
            C18280x3.A0r(this, R.id.report_header_divider, 8);
        } else {
            C18270x1.A0d(this, (ImageView) findViewById(R.id.gdpr_report_logo), this.A02, R.drawable.settings_account_info);
            A74((TextEmojiLabel) findViewById(R.id.gdpr_report_header), C369320h.ACCOUNT, R.style.f12nameremoved);
        }
        initGdprViews(findViewById(R.id.request_gdpr_report_container));
        initP2BViews(findViewById(R.id.request_p2b_report_container));
        initNewsletterViews(findViewById(R.id.request_newsletter_report_container));
        this.A03.A06(this.A0H);
        A75((C66453Lm) this.A0E.get(), C369320h.ACCOUNT);
        A75((C66453Lm) this.A0F.get(), C369320h.NEWSLETTER);
        if (this.A0D.A0Y(r3, 455)) {
            BusinessActivityReportViewModel businessActivityReportViewModel = (BusinessActivityReportViewModel) AnonymousClass0x9.A0H(this).A01(BusinessActivityReportViewModel.class);
            this.A05 = businessActivityReportViewModel;
            AnonymousClass1Ha.A21(this, businessActivityReportViewModel.A02, 186);
            AnonymousClass1Ha.A21(this, this.A05.A00, 187);
            AnonymousClass1Ha.A22(this, this.A05.A01, 289);
            BusinessActivityReportViewModel businessActivityReportViewModel2 = this.A05;
            C55402qI r6 = businessActivityReportViewModel2.A05;
            synchronized (r6) {
                int A002 = r6.A00();
                if (A002 < 0 || A002 > 4) {
                    C18260x0.A0x("BusinessActivityReportManager/validate-state/wrong-state ", AnonymousClass001.A0o(), A002);
                    r6.A03.A0s();
                } else {
                    if (A002 == 4) {
                        if (!r6.A01.A09().exists()) {
                            Log.e("BusinessActivityReportManager/validate-state/report-media-file-missing");
                            C18270x1.A0h(C18270x1.A03(r6.A03), "business_activity_report_state", 2);
                        }
                    } else if (A002 != 2 ? A002 == 3 && r6.A01() == null : r6.A01() == null) {
                        Log.e("BusinessActivityReportManager/validate-state/report-message-missing");
                        r6.A03.A0s();
                    }
                    long A0B2 = AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(r6.A03), "business_activity_report_expiration_timestamp");
                    if (A002 == 2) {
                        C56612sH r12 = r6.A02;
                        if (r12.A0H() > A0B2) {
                            long A0H2 = r12.A0H();
                            if (A0H2 > A0B2) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("BusinessActivityReportManager/validate-state/report-too-old current:");
                                A0o.append(A0H2);
                                C18260x0.A12(" expired:", A0o, A0B2);
                                r6.A02();
                            }
                        }
                    }
                }
            }
            C06270Wx.A03(businessActivityReportViewModel2.A02, r6.A00());
            BusinessActivityReportViewModel businessActivityReportViewModel3 = this.A05;
            AnonymousClass08M r13 = businessActivityReportViewModel3.A02;
            if (r13.A07() != null && AnonymousClass001.A0K(r13.A07()) != 4) {
                AnonymousClass3T6 r7 = businessActivityReportViewModel3.A0C;
                if (r7.A04.A0F()) {
                    AnonymousClass31C r62 = r7.A06;
                    String A032 = r62.A03();
                    AnonymousClass39V[] r2 = new AnonymousClass39V[1];
                    boolean A0F2 = AnonymousClass39V.A0F("action", "status", r2);
                    AnonymousClass36K A0I = AnonymousClass36K.A0I("p2b", r2);
                    AnonymousClass39V[] r22 = new AnonymousClass39V[6];
                    AnonymousClass39V.A0E(r22, A0F2 ? 1 : 0);
                    AnonymousClass39V.A0B("from", C56972sr.A06(r7.A03), r22, 1);
                    AnonymousClass39V.A06("xmlns", "w:biz:p2b_report", r22);
                    AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22);
                    AnonymousClass39V.A0B("smax_id", "34", r22, 4);
                    r22[5] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032);
                    r62.A0E(r7, AnonymousClass36K.A0G(A0I, r22), A032, 265, 32000);
                    z = true;
                } else {
                    z = false;
                }
                C18260x0.A1E("app/sendGetReport success:", AnonymousClass001.A0o(), z);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1t2 r0 = this.A0B;
        if (r0 != null) {
            r0.A0D(true);
        }
        C33781tg r02 = this.A0C;
        if (r02 != null) {
            r02.A0D(true);
        }
        C33771tf r03 = this.A0A;
        if (r03 != null) {
            r03.A0D(true);
        }
        this.A03.A07(this.A0H);
        this.A08 = null;
        this.A07 = null;
        this.A09 = null;
    }

    public void onStart() {
        super.onStart();
        this.A01.A05(16, "GdprReport");
        this.A01.A05(32, "BusinessActivityReport");
    }

    public ReportActivity() {
        this(0);
        this.A0H = new C86164Jb(this, 9);
    }
}
