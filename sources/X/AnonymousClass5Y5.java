package X;

import android.net.Uri;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.5Y5  reason: invalid class name */
public class AnonymousClass5Y5 {
    public static Pattern A0C;
    public C184418rl A00 = new AnonymousClass6BZ(this, 0);
    public C184418rl A01 = new AnonymousClass6BZ(this, 1);
    public ContactUsActivity A02;
    public C95814uZ A03;
    public boolean A04;
    public boolean A05;
    public final C69263Wi A06;
    public final C56982ss A07;
    public final AnonymousClass4FI A08 = new C1237669r(this, 7);
    public final C28891hw A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass4ER A0B = new C114615nK(this);

    public void A02(String str) {
        String str2 = str;
        C626936e.A06(this.A02);
        ContactUsActivity contactUsActivity = this.A02;
        contactUsActivity.A6f(contactUsActivity.getString(R.string.f11nameremoved));
        ContactUsActivity contactUsActivity2 = this.A02;
        String A0o = C86604Kt.A0o(contactUsActivity2.A00);
        if (!A05()) {
            str2 = null;
        }
        boolean A052 = A05();
        contactUsActivity2.A0F.A00(this.A0B, A0o, str2, A052, false);
    }

    public void A00() {
        C626936e.A06(this.A02);
        ContactUsActivity contactUsActivity = this.A02;
        String A0o = C86604Kt.A0o(contactUsActivity.A00);
        boolean A052 = A05();
        contactUsActivity.A75(3);
        contactUsActivity.A0M.A00(contactUsActivity, contactUsActivity.A0C, contactUsActivity.A0I, contactUsActivity.A0T, A0o, contactUsActivity.A0S, contactUsActivity.A0U, AnonymousClass001.A0s(), (List) null, A052);
    }

    public void A01(int i) {
        C184418rl r12;
        C626936e.A06(this.A02);
        C626936e.A06(this.A02);
        int length = A0C.matcher(C86604Kt.A0o(this.A02.A00)).replaceAll("").getBytes().length;
        if (!this.A05 && length < 10) {
            ContactUsActivity contactUsActivity = this.A02;
            contactUsActivity.A00.setBackgroundDrawable(AnonymousClass0RP.A00(contactUsActivity, R.drawable.describe_problem_edittext_bg_error));
            ContactUsActivity contactUsActivity2 = this.A02;
            int i2 = R.string.f11nameremoved;
            if (length == 0) {
                i2 = R.string.f11nameremoved;
            }
            contactUsActivity2.A01.setText(i2);
            this.A02.A01.setVisibility(0);
        } else if (A04()) {
            A00();
        } else {
            this.A02.A01.setVisibility(8);
            ContactUsActivity contactUsActivity3 = this.A02;
            contactUsActivity3.A00.setBackgroundDrawable(AnonymousClass0RP.A00(contactUsActivity3, R.drawable.description_field_background_state_list));
            ContactUsActivity contactUsActivity4 = this.A02;
            if (i == 1) {
                r12 = this.A00;
            } else {
                r12 = this.A01;
            }
            String A0o = C86604Kt.A0o(contactUsActivity4.A00);
            AnonymousClass4FS r11 = contactUsActivity4.A04;
            String str = contactUsActivity4.A0T;
            String str2 = contactUsActivity4.A0U;
            C33931tv r0 = contactUsActivity4.A0G;
            if (r0 != null && r0.A06() == 1) {
                contactUsActivity4.A0G.A0D(false);
            }
            C56492s4 r33 = contactUsActivity4.A05;
            C61072zf r15 = contactUsActivity4.A07;
            C66433Lk r14 = contactUsActivity4.A0O;
            C620733j r10 = contactUsActivity4.A08;
            C622734j r9 = contactUsActivity4.A0P;
            C56512s6 r8 = contactUsActivity4.A07;
            C53202mi r7 = contactUsActivity4.A0D;
            AnonymousClass33p r6 = contactUsActivity4.A09;
            C47362d8 r5 = contactUsActivity4.A0M;
            C631938h r3 = contactUsActivity4.A0C;
            C27991fJ r2 = contactUsActivity4.A0I;
            C620733j r17 = r10;
            C61072zf r18 = r15;
            C631938h r19 = r3;
            C53202mi r20 = r7;
            C56492s4 r142 = r33;
            C56512s6 r152 = r8;
            AnonymousClass33p r16 = r6;
            C33931tv r122 = new C33931tv(contactUsActivity4, r142, r152, r16, r17, r18, r19, r20, contactUsActivity4.A0E, r12, r2, r5, r14, r9, contactUsActivity4.A0Q, str, str2, A0o, (List) null, new Uri[0]);
            contactUsActivity4.A0G = r122;
            C18270x1.A0w(r122, r11);
        }
    }

    public boolean A03() {
        return this.A02.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from").equals("ContactUsWithAi:fallback:email");
    }

    public boolean A04() {
        C626936e.A06(this.A02);
        return "biz-directory-browsing".equals(this.A02.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from"));
    }

    public final boolean A05() {
        C626936e.A06(this.A02);
        if (this.A0A.A0X(4150) || this.A02.A76()) {
            return true;
        }
        AppCompatCheckBox appCompatCheckBox = this.A02.A02;
        if (appCompatCheckBox == null || !appCompatCheckBox.isChecked()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r0.A07.A0L(r2) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(boolean r7) {
        /*
            r6 = this;
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r6.A02
            r5 = 1
            if (r0 == 0) goto L_0x008b
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x008b
            X.1VX r1 = r6.A0A
            r0 = 819(0x333, float:1.148E-42)
            boolean r2 = r1.A0X(r0)
            if (r2 == 0) goto L_0x0055
            X.4uZ r1 = r6.A03
            if (r1 == 0) goto L_0x0055
            X.2ss r0 = r6.A07
            boolean r0 = r0.A0L(r1)
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog - opening chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r6.A02
            r0.BjL()
            com.whatsapp.inappsupport.ui.ContactUsActivity r3 = r6.A02
            X.4uZ r2 = r6.A03
            X.5Y5 r0 = r3.A0H
            if (r2 == 0) goto L_0x003a
            X.2ss r0 = r0.A07
            boolean r0 = r0.A0L(r2)
            r1 = 1
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            java.lang.String r0 = "Support group to open doesn't exist"
            X.C626936e.A0D(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactusactivity/tryopensupportchat/exists/"
            X.C18260x0.A1R(r1, r0, r2)
            android.content.Intent r0 = X.C627736r.A0O(r3, r2)
            r3.A6T(r0, r5)
        L_0x0050:
            r6.A04 = r5
        L_0x0052:
            boolean r0 = r6.A04
            return r0
        L_0x0055:
            if (r7 != 0) goto L_0x005d
            if (r2 == 0) goto L_0x005d
            X.4uZ r0 = r6.A03
            if (r0 != 0) goto L_0x0052
        L_0x005d:
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog - showing dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r6.A02
            r0.BjL()
            com.whatsapp.inappsupport.ui.ContactUsActivity r4 = r6.A02
            r1 = 2131887691(0x7f12064b, float:1.9409996E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0U()
            X.2iE r3 = com.whatsapp.LegacyMessageDialogFragment.A00(r0, r1)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 13
            X.90p r0 = new X.90p
            r0.<init>(r1)
            r3.A01(r0, r2)
            r3.A00 = r5
            androidx.fragment.app.DialogFragment r0 = r3.A00()
            X.C18270x1.A0t(r0, r4)
            goto L_0x0050
        L_0x008b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Y5.A06(boolean):boolean");
    }

    public AnonymousClass5Y5(C69263Wi r3, C56982ss r4, C28891hw r5, AnonymousClass1VX r6, ContactUsActivity contactUsActivity) {
        this.A0A = r6;
        this.A06 = r3;
        this.A07 = r4;
        this.A09 = r5;
        this.A02 = contactUsActivity;
        A0C = Pattern.compile("[^\\p{L}\\p{N}\\p{P}\\p{Z}]");
    }
}
