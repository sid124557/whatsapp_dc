package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.30o  reason: invalid class name and case insensitive filesystem */
public final class C614030o {
    public final C69263Wi A00;
    public final C620633i A01;
    public final C56612sH A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass2HY A05;
    public final C55042ph A06;
    public final AnonymousClass2HZ A07;
    public final C56572sD A08;
    public final AnonymousClass4FS A09;

    public final void A03(Context context, C624134x r13) {
        int i;
        C162457s7.A0J(context, 0);
        if (this.A05.A00.A0Y(C58422vE.A02, 3176)) {
            C624134x r4 = r13;
            C58932w3 A002 = A00(r13);
            if (A002 != null && A09(A002)) {
                C55042ph r3 = this.A06;
                r3.A02(r4, (Integer) null, (Integer) null, (Long) null, (String) null, 11, 8);
                C58932w3 A003 = A00(r13);
                if (A003 != null) {
                    String str = A003.A02;
                    if (str == null) {
                        str = Uri.parse(A003.A01).getQueryParameter("package_name");
                    }
                    String A022 = A02(A003);
                    if (!(str == null || A022 == null)) {
                        Intent A072 = C18320x8.A07();
                        A072.setPackage(str);
                        A072.setAction("com.whatsapp.otp.OTP_RETRIEVED");
                        A072.putExtra("code", A022);
                        C385027w.A00(context, A072);
                        context.sendBroadcast(A072);
                        i = 3;
                        r3.A02(r4, (Integer) null, (Integer) null, (Long) null, (String) null, i, 8);
                    }
                }
                i = 13;
                r3.A02(r4, (Integer) null, (Integer) null, (Long) null, (String) null, i, 8);
            }
        }
    }

    public final void A04(Context context, AnonymousClass1p5 r13, int i) {
        AnonymousClass1p5 r4 = r13;
        boolean A1U = C18270x1.A1U(r13, context);
        UserJid A0o = r13.A0o();
        if (A0o != null) {
            this.A08.A07(A0o, A1U);
        }
        C55042ph r3 = this.A06;
        Integer valueOf = Integer.valueOf(A1U ? 1 : 0);
        int i2 = i;
        r3.A02(r4, valueOf, (Integer) null, (Long) null, (String) null, 0, i2);
        Intent A012 = A01(context, r13);
        if (A012 != null) {
            context.startActivity(A012);
            r3.A02(r4, valueOf, (Integer) null, (Long) null, (String) null, 3, i2);
        }
    }

    public final boolean A06(C624134x r4) {
        C162457s7.A0J(r4, 0);
        if (A00(r4) == null || this.A05.A00.A0Y(C58422vE.A02, 1023)) {
            return false;
        }
        return true;
    }

    public final boolean A07(C58932w3 r5) {
        C162457s7.A0J(r5, 0);
        if (r5.A0A.get() != 1 || this.A05.A00.A0Y(C58422vE.A02, 1023)) {
            return false;
        }
        return true;
    }

    public final boolean A09(C58932w3 r4) {
        C162457s7.A0J(r4, 0);
        if (r4.A0A.get() != 3 || this.A05.A00.A0Y(C58422vE.A02, 1023)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.2w3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.2w3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.2w3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.2w3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C58932w3 A00(X.C624134x r4) {
        /*
            boolean r0 = r4 instanceof X.AnonymousClass1p5
            r3 = 0
            if (r0 == 0) goto L_0x0029
            X.1p5 r4 = (X.AnonymousClass1p5) r4
            X.2cm r0 = r4.A00
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x0029
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2w3 r0 = (X.C58932w3) r0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0A
            int r0 = r0.get()
            if (r0 == 0) goto L_0x0011
            r3 = r1
        L_0x0027:
            X.2w3 r3 = (X.C58932w3) r3
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614030o.A00(X.34x):X.2w3");
    }

    public final String A02(C58932w3 r5) {
        String queryParameter;
        AnonymousClass1VX r3 = this.A04;
        if (C625135j.A01(r3, r5)) {
            String A0R = r3.A0R(C58422vE.A02, 3827);
            if (A0R == null) {
                return null;
            }
            String str = r5.A01;
            C162457s7.A0C(str);
            return C175738Zn.A0U(str, A0R, "", false);
        } else if (!C625135j.A02(r3, r5) || (queryParameter = Uri.parse(r5.A01).getQueryParameter("code")) == null) {
            return null;
        } else {
            return C175738Zn.A0U(queryParameter, "otp", "", true);
        }
    }

    public final void A05(AnonymousClass1p5 r6, int i) {
        String str;
        C162457s7.A0J(r6, 0);
        C58932w3 A002 = A00(r6);
        UserJid A0o = r6.A0o();
        if (A0o != null) {
            this.A08.A07(A0o, 1);
        }
        if (A002 != null) {
            str = A02(A002);
        } else {
            str = null;
        }
        try {
            ClipData newPlainText = ClipData.newPlainText(str, str);
            ClipboardManager A0C = this.A01.A0C();
            if (A0C != null) {
                A0C.setPrimaryClip(newPlainText);
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("OTP: code: ");
            A0o2.append(str);
            C18260x0.A1J(A0o2, " copied to clipboard");
            this.A00.A0I(R.string.f11nameremoved, 1);
        } catch (NullPointerException | SecurityException e) {
            Log.e("OtpMessageService/copycode", e);
        }
        C71713cY.A00(this.A09, this, r6, i, 7);
    }

    public final boolean A08(C58932w3 r4) {
        if (r4.A0A.get() != 2 || this.A05.A00.A0Y(C58422vE.A02, 1023)) {
            return false;
        }
        return true;
    }

    public C614030o(C69263Wi r1, C620633i r2, C56612sH r3, AnonymousClass33p r4, AnonymousClass1VX r5, AnonymousClass2HY r6, C55042ph r7, AnonymousClass2HZ r8, C56572sD r9, AnonymousClass4FS r10) {
        C18260x0.A0f(r5, r1, r10, r8, r9);
        C18260x0.A0g(r7, r2, r6, r4, r3);
        this.A04 = r5;
        this.A00 = r1;
        this.A09 = r10;
        this.A07 = r8;
        this.A08 = r9;
        this.A06 = r7;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final Intent A01(Context context, C624134x r9) {
        String str;
        String A022;
        C58932w3 A002 = A00(r9);
        if (A002 == null || (((str = A002.A02) == null && (str = Uri.parse(A002.A01).getQueryParameter("package_name")) == null) || (A022 = A02(A002)) == null)) {
            return null;
        }
        String queryParameter = Uri.parse(A002.A01).getQueryParameter("cta_display_name");
        Intent A072 = C18320x8.A07();
        A072.setPackage(str);
        A072.setAction("com.whatsapp.otp.OTP_RETRIEVED");
        A072.putExtra("code", A022);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A072, 0);
        C162457s7.A0D(queryIntentActivities);
        if (queryIntentActivities.isEmpty()) {
            C18260x0.A0r("OtpClient/autofill: no activity for ", queryParameter, AnonymousClass001.A0o());
            return null;
        }
        A072.setClassName(str, queryIntentActivities.get(0).activityInfo.name);
        A072.setFlags(268435456);
        C385027w.A00(context, A072);
        return A072;
    }
}
